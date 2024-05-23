/*==============================================================*/
/* TRIGGER                                                      */
/*==============================================================*/
set serveroutput on;

/*Email của nhân viên không được trùng với email của nhân viên khác*/ --
CREATE OR REPLACE TRIGGER EMAIL_NV
BEFORE INSERT OR UPDATE OF email                
ON NHANVIEN
FOR EACH ROW
DECLARE 
    dem int := 0;
BEGIN

    SELECT COUNT(*) INTO dem
    FROM NHANVIEN 
    WHERE email =:NEW.email;
    
    IF dem > 0 then
        RAISE_APPLICATION_ERROR(-20001,'Email khong duoc trung voi email nhan vien khac.');
    END IF;
END;


CREATE OR REPLACE TRIGGER UPDATE_EMAIL_NV
AFTER UPDATE OF email
ON NHANVIEN
FOR EACH ROW
DECLARE 
    email_1 NVARCHAR2(40);
BEGIN
    SELECT email INTO email_1
    FROM NHANVIEN
    WHERE manv = :NEW.manv;

    :NEW.email := email_1;
END;

/*Tự động thêm email khi tạo thông tin đăng nhập cho nhân viên*/--
CREATE OR REPLACE TRIGGER INSERT_TAIKHOAN
BEFORE INSERT ON TTDANGNHAP
FOR EACH ROW
DECLARE 
    email_1 NVARCHAR2(40);
BEGIN
    SELECT email INTO email_1
    FROM NHANVIEN
    WHERE manv = :NEW.manv;

    :NEW.email := email_1;
END;

/*Giá bán phải cao hơn giá nhập*/--
CREATE OR REPLACE TRIGGER GB_GN
BEFORE UPDATE OF giaban
ON SANPHAM
FOR EACH ROW
DECLARE 
    PRAGMA AUTONOMOUS_TRANSACTION;
    gia_nhap number(20,8);
BEGIN
    SELECT gianhap INTO gia_nhap
    FROM SANPHAM
    WHERE masp=:NEW.masp;
    
    IF :NEW.giaban < gia_nhap THEN
        RAISE_APPLICATION_ERROR(-20002,'Gia ban phai cao hon gia nhap');
    END IF;
    
    COMMIT;
END;

/*Ngày in của hóa đơn bằng ngày tạo hiện tại*/--
CREATE OR REPLACE TRIGGER NGAYIN
BEFORE INSERT
ON HOADON
FOR EACH ROW
BEGIN
    :NEW.ngayin := SYSDATE();
END;

/*Số lượng của SANPHAM được cập nhật khi thêm, sửa hoặc xóa CTHD*/--
CREATE OR REPLACE TRIGGER SL_SP_HD
AFTER INSERT OR DELETE OR UPDATE OF soluong
ON CTHD
FOR EACH ROW
DECLARE 
    sl int;
BEGIN
    IF INSERTING THEN
        UPDATE SANPHAM
        SET soluong=soluong-:NEW.soluong
        WHERE masp=:NEW.masp;
        
        SELECT soluong INTO sl
        FROM SANPHAM
        WHERE masp=:NEW.masp;
        
        IF sl <0 THEN
            RAISE_APPLICATION_ERROR(-20003,'San pham khong du!');
        END IF;
    ELSIF DELETING THEN
        UPDATE SANPHAM
        SET soluong=soluong+:OLD.soluong
        WHERE masp=:OLD.masp;
    ELSIF UPDATING THEN
         IF(:OLD.soluong >= :NEW.soluong) THEN
            UPDATE SANPHAM
            SET soluong=soluong-(:OLD.soluong-:NEW.soluong)
            WHERE masp=:OLD.masp;
        ELSE
            UPDATE SANPHAM
            SET soluong=soluong +(:NEW.soluong-:OLD.soluong)
            WHERE masp=:OLD.masp;
        END IF;
    END IF;
END;

/* Khi thêm, sửa hay xóa một chi tiết hóa đơn thì cập nhật lại tổng tiền của hóa đơn đó trong bảng HOADON*/
CREATE OR REPLACE TRIGGER TONGTIEN_HD
FOR INSERT OR DELETE OR UPDATE OF soluong
ON CTHD
COMPOUND TRIGGER
    ma_hd varchar2(10);
    v_tong number(20,8):=0;
    AFTER EACH ROW IS
    BEGIN
        IF INSERTING OR UPDATING THEN
            ma_hd:=:NEW.mahd;
        ELSIF DELETING THEN
            ma_hd:=:OLD.mahd;
        END IF;
    END AFTER EACH ROW;

    AFTER STATEMENT IS
    BEGIN
        SELECT SUM(tongtien) INTO v_tong
        FROM CTHD
        WHERE mahd = ma_hd;
            
        UPDATE HOADON
        SET tongtien = v_tong
        WHERE mahd =ma_hd;
    END AFTER STATEMENT;
END;

/* Đơn giá trong CTHD sẽ tự động được thêm vào và tongtien=soluong*giaban*/--
CREATE OR REPLACE TRIGGER CTHD_DG_TT
BEFORE INSERT OR UPDATE OF soluong
ON CTHD
FOR EACH ROW
DECLARE
     gia_ban number(20,8);
BEGIN
    SELECT giaban INTO gia_ban
    FROM SANPHAM
    WHERE masp=:NEW.masp;
    
    :NEW.dongia:=gia_ban;
    :NEW.tongtien:=:NEW.soluong*gia_ban;
END;

/*Ngày tạo PHIEUNHAPHANG là ngày hiện tại*/--
CREATE OR REPLACE TRIGGER NGAYTAO
BEFORE INSERT
ON PHIEUNHAPHANG
FOR EACH ROW
BEGIN
    :NEW.ngaytao := SYSDATE();
END;

/*Cập nhật là NCC khi có thay đổi trong nhập hàng sản phẩm*/--
CREATE OR REPLACE TRIGGER NCC_SP
AFTER INSERT 
ON CTNHAP
FOR EACH ROW
DECLARE 
    ncc_cu varchar2(10);
    ncc_moi varchar2(10);
BEGIN
    SELECT mancc INTO ncc_cu
    FROM SANPHAM
    WHERE masp=:NEW.masp;
    
    SELECT mancc INTO ncc_moi
    FROM PHIEUNHAPHANG
    WHERE mapnh=:NEW.mapnh;
    
    IF(ncc_cu <> ncc_moi) THEN
        UPDATE SANPHAM
        SET mancc=ncc_moi
        WHERE masp=:NEW.masp;
    END IF;
END;

/*Giá nhập của sản phẩm sẽ được tự động cập nhập khi có phiếu CTNHAP*/--
CREATE OR REPLACE TRIGGER GIANHAP
AFTER INSERT 
ON CTNHAP
FOR EACH ROW
DECLARE
    gia_nhap NUMBER(20,8);
BEGIN
    SELECT gianhap INTO gia_nhap
    FROM SANPHAM
    WHERE masp=:NEW.masp;
    
    IF(gia_nhap <> :NEW.gianhap OR gia_nhap IS NULL) THEN
        UPDATE SANPHAM
        SET gianhap=:NEW.gianhap
        WHERE masp=:NEW.masp;
    END IF;
END;

/* Khi thêm, sửa hoặc xóa một chi tiết nhập thì cập nhật lại số lượng hiện có của sản phẩm.*/--
CREATE OR REPLACE TRIGGER SL_SP_NHAP
AFTER INSERT OR DELETE OR UPDATE OF soluong
ON CTNHAP
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        UPDATE SANPHAM
        SET soluong=soluong+:NEW.soluong
        WHERE masp=:NEW.masp;
    ELSIF DELETING THEN
        UPDATE SANPHAM
        SET soluong=soluong-:OLD.soluong
        WHERE masp=:OLD.masp;
    ELSIF UPDATING THEN
        IF(:OLD.soluong >= :NEW.soluong) THEN
            UPDATE SANPHAM
            SET soluong=soluong-(:OLD.soluong-:NEW.soluong)
            WHERE masp=:OLD.masp;
        ELSE
            UPDATE SANPHAM
            SET soluong=soluong +(:NEW.soluong-:OLD.soluong)
            WHERE masp=:OLD.masp;
        END IF;
    END IF;
END;

/*Khi thêm, sửa hay xóa một chi tiết nhập thì cập nhật lại tổng tiền của phiếu nhập đó trong bảng PHIEUNHAPHANG*/
CREATE OR REPLACE TRIGGER TONGTIEN_PNH
FOR INSERT OR DELETE OR UPDATE OF soluong ON CTNHAP
COMPOUND TRIGGER
    v_tong number(20,8) :=0;
    ma_pnh varchar2(10);
    AFTER EACH ROW IS
    BEGIN
        IF INSERTING OR UPDATING THEN
            ma_pnh:=:NEW.mapnh;
        ELSIF DELETING THEN
            ma_pnh:=:OLD.mapnh;
        END IF;
    END AFTER EACH ROW;
    
    AFTER STATEMENT IS
    BEGIN
        SELECT SUM(tongtien) INTO v_tong
        FROM CTNHAP
        WHERE mapnh=ma_pnh;
        
        UPDATE PHIEUNHAPHANG
        SET tongtien = v_tong
        WHERE mapnh = ma_pnh;
    END AFTER STATEMENT;
END;

/*Tổng tiền trong CTNHAP là soluong*gianhap */--
CREATE OR REPLACE TRIGGER TONGTIEN_CTNHAP
BEFORE INSERT OR UPDATE OF soluong
ON CTNHAP
FOR EACH ROW
BEGIN
    :NEW.tongtien := :NEW.soluong*:NEW.gianhap;
END;


