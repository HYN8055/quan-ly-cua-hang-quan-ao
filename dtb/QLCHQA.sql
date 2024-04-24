set serveroutput on;
/*==============================================================*/
/* DROP                                                         */
/*==============================================================*/
DROP TABLE CTHD
go; 
DROP TABLE HOADON
go;
DROP TABLE CTNHAP
go;
DROP TABLE PHIEUNHAPHANG
go;
DROP TABLE NHACUNGCAP
go;
DROP TABLE NHANVIEN
go;
DROP TABLE TTDANGNHAP
go;
DROP TABLE SANPHAM

-- Drop t? d??i l�n



/*==============================================================*/
/* Table: NHANVIEN                                              */
/*==============================================================*/
create table NHANVIEN (
   manv                 varchar2(10)          not null,
   hoten                nvarchar2(50)         null,
   diachi               nvarchar2(100)        null,
   sdt                  char(10)              null,
   email                varchar2(40)          null,
   constraint PK_NHANVIEN primary key  (manv)
);

/*==============================================================*/
/* Table: TTDANGNHAP                                            */
/*==============================================================*/
create table TTDANGNHAP (
   manv  		varchar2(10)	      not null,
   tendn                varchar2(30)          not null,
   matkhau              varchar2(30)          null,
   email                varchar2(40)          null,
   vaitro               nvarchar2(20)         null,
   constraint PK_TTDANGNHAP primary key  (tendn)
);

/*==============================================================*/
/* Table: NHACUNGCAP                                            */
/*==============================================================*/
create table NHACUNGCAP (
   mancc                varchar2(10)         not null,
   tenncc               nvarchar2(100)       null,
   diachi               nvarchar2(100)       null,
   sdt                  char(10)             null,
   email                varchar2(40)         null,
   constraint PK_NHACUNGCAP primary key (mancc)
);

/*==============================================================*/
/* Table: SANPHAM                                               */
/*==============================================================*/
create table SANPHAM (
   masp                 varchar2(10)            not null,
   tensp                nvarchar2(100)        null,
   giaban               number(20,8)         null,
   gianhap              number(20,8)         null,
   soluong              int                   null,
   kichthuoc            varchar(5)             null,
   chatlieu             nvarchar2(50)        null, 
   mancc                varchar2(10)          not null,
   xuatxu               nvarchar2(50)        null,
   constraint PK_SANPHAM primary key  (masp)
);

/*==============================================================*/
/* Table: HOADON                                                */
/*==============================================================*/
create table HOADON (
   mahd                 varchar2(10)         not null,
   manv                 varchar2(10)         not null,
   tenkh                nvarchar2(50)        null,
   sdt                  char(10)             null,
   ngayin               date                 null,
   tongtien             number(20,8)         null,
   ghichu               nvarchar2(100)       null,
   constraint PK_HOADON primary key (mahd)
);

/*==============================================================*/
/* Table: CTHD                                                  */
/*==============================================================*/
create table CTHD (
   mahd                 varchar2(10)        not null,
   masp                 varchar2(10)        not null,
   soluong              int                 null,
   dongia               number(20,8)        null,
   tongtien             number(20,8)        null,
   constraint PK_CTHD primary key (mahd, masp)
);

/*==============================================================*/
/* Table: PHIEUNHAPHANG                                         */
/*==============================================================*/
create table PHIEUNHAPHANG (
   mapnh                varchar2(10)         not null,
   manv                 varchar2(10)         not null,
   mancc                varchar2(10)         not null,
   ngaytao              date                 null,
   tongtien             number(20,8)         null,
   ghichu               varchar2(100)          null,
   constraint PK_PHIEUNHAPHANG primary key  (mapnh)
);

/*==============================================================*/
/* Table: CTNHAP                                                */
/*==============================================================*/
create table CTNHAP (
   mapnh                varchar2(10)        not null,
   masp                 varchar2(10)        not null,
   soluong              int                 null,
   gianhap              number(20,8)        null,
   tongtien             number(20,8)        null,
   constraint PK_CTNHAP primary key (mapnh, masp)
);


/*==============================================================*/
/* FOREIGN KEY                                                  */
/*==============================================================*/

alter table CTHD
   add constraint FK_CTHD_CTHD_HOADON foreign key (mahd)
      references HOADON (mahd);

alter table CTHD
   add constraint FK_CTHD_CTHD2_SANPHAM foreign key (masp)
      references SANPHAM (masp);

alter table CTNHAP
   add constraint FK_CTNHAP_CTNHAP_PHIEUNHA foreign key (mapnh)
      references PHIEUNHAPHANG (mapnh);

alter table CTNHAP
   add constraint FK_CTNHAP_CTNHAP2_SANPHAM foreign key (masp)
      references SANPHAM (masp);


alter table HOADON
   add constraint FK_HOADON_CUANV_NHANVIEN foreign key (manv)
      references NHANVIEN (manv);

alter table TTDANGNHAP
   add constraint FK_NHANVIEN_TTDANGNH foreign key (manv)
      references NHANVIEN (manv);

alter table PHIEUNHAPHANG
   add constraint FK_PHIEUNHA_CUANCC_NHACUNGC foreign key (mancc)
      references NHACUNGCAP (mancc);

alter table PHIEUNHAPHANG
   add constraint FK_PHIEUNHA_PNH_NV_NHANVIEN foreign key (manv)
      references NHANVIEN (manv);


alter table SANPHAM
   add constraint FK_SANPHAM_TNCC_NHACUNGC foreign key (mancc)
      references NHACUNGCAP (mancc);

 *==============================================================*/
/*INSERT VALUE                                                  */
/*==============================================================*/
-- NHANVIEN
INSERT INTO NHANVIEN (manv, hoten, diachi, sdt, email) VALUES 
('NV1', 'Ph?m Thu? Th?o Nh?','Long An','0365398625','22521055@gm.uit.edu.vn');
INSERT INTO NHANVIEN (manv, hoten, diachi, sdt, email) VALUES 
('NV2', 'Hu?nh Y?n Nhi', 'Hu?', '0935471926', '22521034@gm.uit.edu.vn');
INSERT INTO NHANVIEN (manv, hoten, diachi, sdt, email)  VALUES 
('NV3', 'V� Thanh Nh�n', 'Ph� Y�n', '0702562318', '22521008@gm.uit.edu.vn');
INSERT INTO NHANVIEN (manv, hoten, diachi, sdt, email)  VALUES 
('NV4', 'Hu?nh Ng?c Di?m Ph�c', 'Ph� Y�n', '0899231556', '22521113@gm.uit.edu.vn');

-- TTDANGNHAP 
INSERT INTO TTDANGNHAP (manv, tendn, matkhau, email, vaitro) VALUES 
('NV1', 'tnhu', '123456','22521055@gm.uit.edu.vn','Nh�n vi�n qu?n l�');
INSERT INTO TTDANGNHAP (manv, tendn, matkhau, email, vaitro) VALUES 
('NV2', 'ynhi', '654321', '22521034@gm.uit.edu.vn', 'Nh�n vi�n qu?n l�');
INSERT INTO TTDANGNHAP (manv, tendn, matkhau, email, vaitro) VALUES 
('NV3', 'tnhan', '78910', '22521008@gm.uit.edu.vn', 'Nh�n vi�n b�n h�ng');
INSERT INTO TTDANGNHAP (manv, tendn, matkhau, email, vaitro) VALUES 
('NV4', 'dphuc', '10987', '22521113@gm.uit.edu.vn', 'Nh�n vi�n nh?p h�ng');


-- NHAPCUNGCAP
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES 
('NCC1', 'Coolmate', '165 Tr?n Tr?ng Cung, T�n Thu?n ?�ng, Qu?n 7, Th�nh ph? H? Ch� Minh', '0374527184', 'coolmate@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES 
('NCC2', 'Fashionista', '123 ?i?n Bi�n Ph?, Qu?n 1, Th�nh ph? H? Ch� Minh', '0987654321', 'fashionista@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC3', 'Style Zone', '456 L� Lai, Qu?n 3, Th�nh ph? H? Ch� Minh', '0123456789', 'stylezone@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC4', 'Trendy Wear', '789 Nguy?n Tr�i, Qu?n 5, Th�nh ph? H? Ch� Minh', '0321654987', 'trendywear@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC5', 'Chic Boutique', '321 Nam K? Kh?i Ngh?a, Qu?n 3, Th�nh ph? H? Ch� Minh', '0765432198', 'chicboutique@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC6', 'Moda Mania', '234 L� T? Tr?ng, Qu?n 1, Th�nh ph? H? Ch� Minh', '0543216789', 'modamania@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC7', 'Urban Style', '567 C�ch M?ng Th�ng T�m, Qu?n 10, Th�nh ph? H? Ch� Minh', '0321876543', 'urbanstyle@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC8', 'Couture Corner', '890 Hai B� Tr?ng, Qu?n 1, Th�nh ph? H? Ch� Minh', '0976543210', 'couturecorner@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC9', 'Glamour Galore', '543 Nguy?n ?�nh Ch�nh, Qu?n Ph� Nhu?n, Th�nh ph? H? Ch� Minh', '0321987654', 'glamourgalore@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC10', 'Style Statement', '876 Hu?nh V?n B�nh, Qu?n Ph� Nhu?n, Th�nh ph? H? Ch� Minh', '0987654321', 'stylestatement@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC11', 'Vogue Vibes', '654 Nguy?n ?�nh Ch�nh, Qu?n Ph� Nhu?n, Th�nh ph? H? Ch� Minh', '0765432198', 'voguevibes@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC12', 'Trendsetter Trends', '234B Nguy?n V?n C?, Qu?n 1, Th�nh ph? H? Ch� Minh', '0321654987', 'trendsettrends@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC13', 'Style Savvy', '789C L� V?n S?, Qu?n 3, Th�nh ph? H? Ch� Minh', '0543216789', 'stylesavvy@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC14', 'Fashion Forward', '987 Phan X�ch Long, Ph??ng 1, Qu?n Ph� Nhu?n, Th�nh ph? H? Ch� Minh', '0321876543', 'fashionforward@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC15', 'Chic Chic', '456B Nguy?n Th? Minh Khai, Qu?n 3, Th�nh ph? H? Ch� Minh', '0976543210', 'chicchic@gmail.com');

-- SANPHAM
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA1', '�o thun nam', 150000, 100000, 50, 'M', 'Cotton', 'NCC1', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA2', '�o s? mi n?', 200000, 150000, 50, 'S', 'V?i m?m', 'NCC2', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA3', '�o kho�c d�', 300000, 250000, 50, 'L', 'D� cao c?p', 'NCC3', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA4', '�o len n?', 180000, 120000, 50, 'M', 'Len t? nhi�n', 'NCC4', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA5', '�o ph�ng nam', 120000, 80000, 50, 'L', 'V?i cotton', 'NCC5', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA6', '�o d�i c�ch t�n', 350000, 300000, 50, 'XL', 'V?i l?a', 'NCC6', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA7', '�o kho�c da nam', 400000, 350000, 50, 'L', 'Da cao c?p', 'NCC7', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA8', '�o kho�c kaki n?', 250000, 200000, 50, 'M', 'Kaki', 'NCC8', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA9', '�o len nam', 200000, 150000, 50, 'XL', 'Len t? nhi�n', 'NCC9', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA10', '�o s? mi nam', 180000, 130000, 50, 'L', 'V?i m?m', 'NCC10', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA11', '�o thun n?', 100000, 70000, 50, 'S', 'Cotton', 'NCC11', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA12', '�o kho�c n?', 220000, 170000, 50, 'M', 'N?', 'NCC12', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA13', '�o kho�c jean', 280000, 230000, 50, 'L', 'Jean', 'NCC13', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA14', '�o d? nam', 450000, 400000, 50, 'XL', 'V?i d?', 'NCC14', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA15', '�o len c? l?', 190000, 140000, 50, 'M', 'Len t? nhi�n', 'NCC15', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA16', '�o kho�c len n?', 220000, 170000, 50, 'M', 'Len t? nhi�n', 'NCC1', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA17', '�o ba l? n?', 80000, 50000, 50, 'S', 'V?i thun', 'NCC2', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA18', '�o ki?u n?', 120000, 90000, 50, 'M', 'V?i m?m', 'NCC3', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA19', '�o thun c? tr�n', 70000, 45000, 50, 'L', 'Cotton', 'NCC4', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA20', '�o s? mi c�ng s?', 160000, 120000, gianhap, 'XL', 'V?i m?m', 'NCC5', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA21', '�o len n? d�ng d�i', 250000, 200000, 50, 'M', 'Len t? nhi�n', 'NCC6', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA22', '�o kho�c da n?', 350000, 300000, 50, 'L', 'Da cao c?p', 'NCC7', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA23', '�o kho�c kaki nam', 180000, 140000, 50, 'M', 'Kaki', 'NCC8', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA24', '�o hoodie n?', 190000, 150000, 50, 'L', 'V?i thun', 'NCC9', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA25', '�o thun c? tim', 90000, 60000, 50, 'XL', 'Cotton', 'NCC10', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA26', '�o len n? c? l?', 210000, 170000, 50, 'M', 'Len t? nhi�n', 'NCC11', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA27', '�o kho�c n? nam', 200000, 150000, 50, 'L', 'N?', 'NCC12', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA28', '�o kho�c jean n?', 260000, 210000, 50, 'XL', 'Jean', 'NCC13', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA29', '�o len n? c? V', 180000, 140000, 50, 'M', 'Len t? nhi�n', 'NCC14', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA30', '�o d�i tay n?', 100000, 70000, 50, 'S', 'Cotton', 'NCC15', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA31', '�o thun c? d�y', 85000, 60000, 50, 'M', 'Cotton', 'NCC1', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA32', '�o len c? ch? V', 175000, 130000, 50, 'M', 'Len t? nhi�n', 'NCC2', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA33', '�o kho�c n? n?', 185000, 140000, 50, 'M', 'N?', 'NCC3', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA34', '�o thun c? b?', 95000, 70000, 50, 'L', 'Cotton', 'NCC4', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA35', '�o s? mi n? d�ng d�i', 210000, 160000, 50, 'XL', 'V?i m?m', 'NCC5', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA36', '�o len n? c? cao', 220000, 180000, 50, 'M', 'Len t? nhi�n', 'NCC6', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA37', '�o kho�c da n? d�ng d�i', 380000, 320000, 50, 'L', 'Da cao c?p', 'NCC7', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA38', '�o kho�c kaki n? d�ng d�i', 280000, 230000, 50, 'M', 'Kaki', 'NCC8', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA39', '�o hoodie nam', 200000, 160000, 50, 'XL', 'V?i thun', 'NCC9', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA40', '�o thun c? tr?', 90000, 65000, 50, 'L', 'Cotton', 'NCC10', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA41', '�o len n? d�ng d�i c? ch? V', 240000, 200000, 50, 'M', 'Len t? nhi�n', 'NCC11', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA42', '�o kho�c n? nam d�ng d�i', 240000, 190000, 50, 'L', 'N?', 'NCC12', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA43', '�o kho�c jean n? d�ng d�i', 300000, 250000, 50, 'XL', 'Jean', 'NCC13', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA44', '�o len n? d�ng su�ng', 190000, 150000, 50, 'M', 'Len t? nhi�n', 'NCC14', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA45', '�o d�i tay nam', 110000, 80000, 50, 'L', 'Cotton', 'NCC15', 'Vi?t Nam');

--HOADON
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES 
('HDBH1', 'NV1', 'Tr?n V?n H�ng', '0323456789', TO_DATE('2024-04-18', 'YYYY-MM-DD'), 500000, '?� thanh to�n, chuy?n kho?n');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES 
('HDBH2', 'NV2', 'Nguy?n Th? Mai', '0987654321', TO_DATE('2024-04-18', 'YYYY-MM-DD'), 700000, '?� thanh to�n, ti?n m?t');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES 
('HDBH3', 'NV3', 'L� Minh Tu?n', '0365897412', TO_DATE('2024-04-19', 'YYYY-MM-DD'), 80000, '?� thanh to�n, ti?n m?t');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES 
('HDBH4', 'NV2', 'Ph?m Th? Ng?c', '0904123785', TO_DATE('2024-04-19', 'YYYY-MM-DD'), 110000, '?� thanh to�n, ti?n m?t');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES 
('HDBH5', 'NV2', 'Tr?n ??c Anh', '0978451236', TO_DATE('2024-04-20', 'YYYY-MM-DD'), 900000, '?� thanh to�n, ti?n m?t');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES 
('HDBH6', 'NV1', 'Nguy?n V?n ??c', '0398745612', TO_DATE('2024-04-20', 'YYYY-MM-DD'), 650000, '?� thanh to�n, ti?n m?tn');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES 
('HDBH7', 'NV3', 'L� Th? Lan', '0356987412', TO_DATE('2024-04-21', 'YYYY-MM-DD'), 750000, '?� thanh to�n, chuy?n kho?ng');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES 
('HDBH8', 'NV2', 'Tr?n V?n T�m', '0912345678', TO_DATE('2024-04-21', 'YYYY-MM-DD'), 1900000, '?� thanh to�n, chuy?n kho?n');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES 
('HDBH9', 'NV3', 'Ph?m Th? H�', '0387456123', TO_DATE('2024-04-22', 'YYYY-MM-DD'), 200000, '?� thanh to�n, ti?n m?t');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES 
('HDBH10', 'NV3', 'Nguy?n V?n Nam', '0963214789', TO_DATE('2024-04-22', 'YYYY-MM-DD'), 800000, '?� thanh to�n, ti?n m?t');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES 
('HDBH11', 'NV3', 'Tr?n V?n H�ng', '0323456789', TO_DATE('2024-04-23', 'YYYY-MM-DD'), 520000, '?� thanh to�n, ti?n m?t');

--CTHD
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH1', 'QA1', 2, 150000, 3000000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH1', 'QA2', 1, 200000, 2000000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH2', 'QA', 2, 250000, 500000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH2', 'QA27', 1, 200000, 200000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH3', 'QA17', 1, 80000, 80000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH4', 'SP45', 1, 110000, 480000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH5', 'QA3', 3, 300000, 900000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH6', 'QA7', 1, 400000, 400000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH6', 'QA8', 1, 250000, 250000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH7', 'QA6', 1, 350000, 350000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH7', 'AQ7', 1, 400000, 400000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH8', 'QA44', 1, 190000, 190000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH9', 'QA39', 1, 200000, 200000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH10', 'QA19', 5, 70000, 350000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH10', 'QA25', 5, 90000, 450000);
INSERT INTO CTHD (mahd, masp, soluong, dongia, tongtien) VALUES 
('HDBH11', 'QA28', 2, 260000, 520000);

--PHIEUNHAPHANG
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES
 ('HDNH1', 'NV4', 'NCC1', TO_DATE('2024-04-15', 'YYYY-MM-DD'), 2700000, '?� thanh to�n, ti?n m?t');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES 
('HDNH2', 'NV5', 'NCC2', TO_DATE('2024-04-16', 'YYYY-MM-DD'), 20000000, '?� thanh to�n, ti?n m?t');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES
('HDNH3', 'NV6', 'NCC3', TO_DATE('2024-04-17', 'YYYY-MM-DD'), 25000000, '?� thanh to�n, chuy?n kho?n');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES
('HDNH4', 'NV7', 'NCC4', TO_DATE('2024-04-18', 'YYYY-MM-DD'), 6900000, '?� thanh to�n, ti?n m?t');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES
('HDNH5', 'NV8', 'NCC5', TO_DATE('2024-04-19', 'YYYY-MM-DD'), 49000000, '?� thanh to�n, chuy?n kho?n');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES
('HDNH6', 'NV9', 'NCC6', TO_DATE('2024-04-20', 'YYYY-MM-DD'), 18000000, '?� thanh to�n, chuy?n kho?n');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES
('HDNH7', 'NV10', 'NCC7', TO_DATE('2024-04-21', 'YYYY-MM-DD'), 32000000, '?� thanh to�n, ti?n m?t');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES
('HDNH8', 'NV1', 'NCC8', TO_DATE('2024-04-22', 'YYYY-MM-DD'), 44000000, '?� thanh to�n, ti?n m?t');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES
('HDNH9', 'NV2', 'NCC9', TO_DATE('2024-04-23', 'YYYY-MM-DD'), 30000000, '?� thanh to�n, ti?n m?t');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES
('HDNH10', 'NV3', 'NCC10', TO_DATE('2024-04-24', 'YYYY-MM-DD'), 84000000, '?� thanh to�n, chuy?n kho?n');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES
('HDNH11', 'NV4', 'NCC15', TO_DATE('2024-04-25', 'YYYY-MM-DD'), 22000000, '?� thanh to�n, ti?n m?t');

--CTNHAP
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES 
('HDNH1', 'QA1', 10, 100000, 1000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH1', 'QA16', 10, 170000, 1700000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH2', 'QA2', 100, 150000, 1500000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH2', 'QA17', 10, 50000, 500000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH3', 'QA3', 100, 250000, 25000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH4', 'QA4', 50, 120000, 6000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH4', 'QA18', 100, 90000, 900000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH5', 'QA5', 50, 80000, 4000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH5', 'QA19', 100, 450000, 45000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH6', 'QA36', 100, 180000, 18000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH7', 'QA37', 100, 320000, 32000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH8', 'QA8', 100, 200000, 20000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH8', 'QA23', 100, 240000, 24000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH9', 'QA9', 100, 150000, 15000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH9', 'QA1', 100, 150000, 15000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH10', 'QA10', 100, 130000, 13000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH10', 'QA25', 100, 60000, 6000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH10', 'QA40', 100, 65000, 65000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH11', 'QA15', 100, 140000, 14000000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap, tongtien) VALUES
('HDNH11', 'QA45', 100, 80000, 8000000);

/*==============================================================*/
/*CHECK                                                   */
/*==============================================================*/
alter table NHANVIEN
   add constraint EMAIL_NV CHECK (INSTR(email, '@gmail.com') > 0);


alter table NHACUNGCAP
    add constraint EMAIL_NCC CHECK (INSTR(email, '@gmail.com') > 0);

/*==============================================================*/
/* TRIGGER                                                      */
/*==============================================================*/

/*Kiem tra so luong con du de ban hay khong.*/
/*tongtiensp b?ng soluong * giaban c?a SANPHAM.*/
create or replace trigger INSERT_CTHD_BEFORE
before insert 
on CTHD
for each row
declare
    sl int;
    giaban1 number(20,8);
begin
    select soluong into sl
    from SANPHAM
    where masp=:NEW.masp;
    
    if(:NEW.soluong > sl ) then
        raise_application_error(-20001, 'So luong san pham khong du');
    end if;
    
    select giaban into giaban1
    from SANPHAM
    where masp=:NEW.masp;
    
    :NEW.tongtiensp := :NEW.soluong * giaban1;
end;

/*sau khi t?o CTHD th� ph?i c?p nh?t l?i soluong trong SANPHAM.*/

create or replace trigger AFTER_INSERT_CTHD
after insert
on CTHD
for each row
declare
 sl int;
begin
    select soluong into sl
    from SANPHAM
    where masp=:NEW.masp;
    
    update SANPHAM
    set soluong=sl-:NEW.soluong
    where masp=:NEW.masp;
end;