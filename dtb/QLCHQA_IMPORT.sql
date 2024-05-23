*==============================================================*/
/*INSERT VALUE                                                  */
/*==============================================================*/
-- NHANVIEN
INSERT INTO NHANVIEN (manv, hoten, diachi, sdt, email) VALUES 
('NV1', N'Phạm Thuỵ Thảo Như','Long An','0365398625','22521055@gm.uit.edu.vn');
INSERT INTO NHANVIEN (manv, hoten, diachi, sdt, email) VALUES 
('NV2', N'Huỳnh Yến Nhi', N'Huế', '0935471926', '22521034@gm.uit.edu.vn');
INSERT INTO NHANVIEN (manv, hoten, diachi, sdt, email)  VALUES 
('NV3', N'Võ Thanh Nhàn', N'Phú Yên', '0702562318', '22521008@gm.uit.edu.vn');
INSERT INTO NHANVIEN (manv, hoten, diachi, sdt, email)  VALUES 
('NV4', N'Huỳnh Ngọc Diễm Phúc', N'Phú Yên', '0899231556', '22521113@gm.uit.edu.vn');

-- TTDANGNHAP 
INSERT INTO TTDANGNHAP (manv, tendn, matkhau, email, vaitro) VALUES 
('NV1', 'tnhu', '123456','22521055@gm.uit.edu.vn',N'Nhân viên quản lý');
INSERT INTO TTDANGNHAP (manv, tendn, matkhau, email, vaitro) VALUES 
('NV2', 'ynhi', '654321', '22521034@gm.uit.edu.vn', N'Nhân viên quản lý');
INSERT INTO TTDANGNHAP (manv, tendn, matkhau, email, vaitro) VALUES 
('NV3', 'tnhan', '78910', '22521008@gm.uit.edu.vn', N'Nhân viên bán hàng');
INSERT INTO TTDANGNHAP (manv, tendn, matkhau, email, vaitro) VALUES 
('NV4', 'dphuc', '10987', '22521113@gm.uit.edu.vn', N'Nhân viên nhập hàng');


-- NHAPCUNGCAP
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES 
('NCC1', 'Coolmate', N'165 Trần Trọng Cung, Tân Thuận Đông, Quận 7, Thành phố Hồ Chí Minh', '0374527184', 'coolmate@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES 
('NCC2', 'Fashionista', N'123 Điện Biên Phủ, Quận 1, Thành phố Hồ Chí Minh', '0987654321', 'fashionista@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC3', 'Style Zone', N'456 Lê Lai, Quận 3, Thành phố Hồ Chí Minh', '0123456789', 'stylezone@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC4', 'Trendy Wear', N'789 Nguyễn Trãi, Quận 5, Thành phố Hồ Chí Minh', '0321654987', 'trendywear@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC5', 'Chic Boutique', N'321 Nam Kỳ Khởi Nghĩa, Quận 3, Thành phố Hồ Chí Minh', '0765432198', 'chicboutique@gmail.com');
INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES
('NCC6', 'Moda Mania', N'234 Lý Tự Trọng, Quận 1, Thành phố Hồ Chí Minh', '0543216789', 'modamania@gmail.com');



-- SANPHAM
delete from SANPHAM;

INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA1', N'Áo thun nam', 150000, 100000, 50, 'M', N'Cotton', 'NCC1', N'Việt Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA2', N'Áo sơ mi nữ', 200000, 150000, 50, 'S', N'Vải mềm', 'NCC2', N'Việt Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA3', N'Áo khoác dù', 300000, 250000, 50, 'L', N'Dù cao cấp', 'NCC3', N'Việt Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA4', 'Áo len nữ', 180000, 120000, 50, 'M', 'Len tự nhiên', 'NCC4', N'Việt Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA5', N'Áo phông nam', 120000, 80000, 50, 'L', N'Vải cotton', 'NCC5', N'Việt Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA6', N'Áo dài cách tân', 350000, 300000, 50, 'XL', N'Vải lụa', 'NCC6', N'Việt Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA7', N'Áo khoác da nam', 400000, 350000, 50, 'L', N'Da cao cấp', 'NCC5', N'Việt Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA8', N'Áo khoác kaki nữ', 250000, 200000, 50, 'M', N'Kaki', 'NCC4', N'Việt Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA9', N'Áo len nam', 200000, 150000, 50, 'XL', N'Len tự nhiên', 'NCC3', N'Việt Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES
('QA10', N'Áo sơ mi nam', 180000, 130000, 50, 'L', N'Vải mềm', 'NCC2', N'Việt Nam');


--HOADON
delete from HOADON;
DELETE FROM CTHD;

INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, ghichu) VALUES 
('HDBH1', 'NV1', N'Trần Văn Hùng', '0323456789', TO_DATE('2024-04-18', 'YYYY-MM-DD'), N'Đã thanh toán, chuyển khoản');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, ghichu) VALUES 
('HDBH2', 'NV2', N'Nguyễn Thị Mai', '0987654321', TO_DATE('2024-04-18', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, ghichu) VALUES  
('HDBH3', 'NV3', N'Lê Minh Tuấn', '0365897412', TO_DATE('2024-04-19', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, ghichu) VALUES 
('HDBH4', 'NV2', N'Phạm Thị Ngọc', '0904123785', TO_DATE('2024-05-19', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, ghichu) VALUES 
('HDBH5', 'NV2', N'Trần Đức Anh', '0978451236', TO_DATE('2024-05-20', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, ghichu) VALUES 
('HDBH6', 'NV1', N'Nguyễn Văn Đức', '0398745612', TO_DATE('2024-05-20', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặtn');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, ghichu) VALUES  
('HDBH7', 'NV3', N'Lê Thị Lan', '0356987412', TO_DATE('2024-03-21', 'YYYY-MM-DD'), N'Đã thanh toán, chuyển khoảng');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, ghichu) VALUES 
('HDBH8', 'NV2', N'Trần Văn Tâm', '0912345678', TO_DATE('2024-03-21', 'YYYY-MM-DD'), N'Đã thanh toán, chuyển khoản');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, ghichu) VALUES  
('HDBH9', 'NV3', N'Phạm Thị Hà', '0387456123', TO_DATE('2024-03-22', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, ghichu) VALUES  
('HDBH10', 'NV3', N'Nguyễn Văn Nam', '0963214789', TO_DATE('2024-03-22', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, ghichu) VALUES  
('HDBH11', 'NV3', N'Trần Văn Hùng', '0323456789', TO_DATE('2024-03-23', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');

--CTHD
delete from CTHD;

INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH1', 'QA1', 20, 150000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH1', 'QA2', 10, 200000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH2', 'QA2', 13, 200000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH2', 'QA2', 11, 200000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH3', 'QA1', 14, 150000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH4', 'QA5', 17, 120000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH5', 'QA3', 14, 300000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH6', 'QA7', 7, 4000000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH6', 'QA8', 8, 250000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH7', 'QA6', 10, 350000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH7', 'QA7', 14, 400000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH8', 'QA4', 12, 180000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH9', 'QA9', 16, 200000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH10', 'QA9', 17, 200000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES  
('HDBH10', 'QA5', 14, 120000);
INSERT INTO CTHD (mahd, masp, soluong, dongia) VALUES 
('HDBH11', 'QA8', 20, 250000);

--PHIEUNHAPHANG
delete from PHIEUNHAPHANG;
DELETE FROM CTNHAP;

INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, ghichu) VALUES
 ('HDNH1', 'NV4', 'NCC1', TO_DATE('2024-04-15', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, ghichu) VALUES
('HDNH2', 'NV2', 'NCC2', TO_DATE('2024-04-16', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, ghichu) VALUES
('HDNH3', 'NV3', 'NCC3', TO_DATE('2024-04-17', 'YYYY-MM-DD'), N'Đã thanh toán, chuyển khoản');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, ghichu) VALUES
('HDNH4', 'NV2', 'NCC4', TO_DATE('2024-03-18', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, ghichu) VALUES
('HDNH5', 'NV3', 'NCC5', TO_DATE('2024-03-19', 'YYYY-MM-DD'), N'Đã thanh toán, chuyển khoản');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, ghichu) VALUES
('HDNH6', 'NV4', 'NCC6', TO_DATE('2024-03-20', 'YYYY-MM-DD'), N'Đã thanh toán, chuyển khoản');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, ghichu) VALUES
('HDNH7', 'NV1', 'NCC5', TO_DATE('2024-05-21', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, ghichu) VALUES
('HDNH8', 'NV1', 'NCC2', TO_DATE('2024-05-22', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, ghichu) VALUES
('HDNH9', 'NV2', 'NCC1', TO_DATE('2024-05-23', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, ghichu) VALUES
('HDNH10', 'NV3', 'NCC2', TO_DATE('2024-05-24', 'YYYY-MM-DD'), N'Đã thanh toán, chuyển khoản');
INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, ghichu) VALUES
('HDNH11', 'NV4', 'NCC4', TO_DATE('2024-05-25', 'YYYY-MM-DD'), N'Đã thanh toán, tiền mặt');


--CTNHAP
delete from CTNHAP;
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH1', 'QA1', 1, 100000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH1', 'QA6', 3, 170000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH1', 'QA6', 5, 170000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH2', 'QA2', 7, 150000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH2', 'QA7', 1, 50000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH3', 'QA3', 4, 250000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH4', 'QA4', 3, 120000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH4', 'QA8', 6, 90000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH5', 'QA5', 7, 80000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH5', 'QA9', 12, 450000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH6', 'QA6', 3, 180000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH7', 'QA7', 5, 320000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH8', 'QA8', 6, 200000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH8', 'QA3', 7, 240000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH9', 'QA9', 2, 150000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH9', 'QA1', 5, 150000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH10', 'QA10', 7, 130000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH10', 'QA2', 7, 60000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH10', 'QA4', 8, 65000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH11', 'QA1', 1, 140000);
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) VALUES 
('HDNH11', 'QA4', 8, 80000);

