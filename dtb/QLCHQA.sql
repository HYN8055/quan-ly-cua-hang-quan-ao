set serveroutput on;
/*==============================================================*/
/* DROP                                                         */
/*==============================================================*/
/*DROP TABLE CTHD
go; 
DROP TABLE HOADON
go;
DROP TABLE CTNHAP
go;
DROP TABLE PHIEUNHAPHANG
go;
DROP TABLE SANPHAM
go;
DROP TABLE NHACUNGCAP
go;
DROP TABLE TTDANGNHAP
go;
DROP TABLE NHANVIEN
go;*/
-- Drop từ trên xuống



/*==============================================================*/
/* Table: NHANVIEN                                              */
/*==============================================================*/
create table NHANVIEN (
   manv                 varchar2(10)           not null,
   hoten                nvarchar2(500)         not null,
   diachi               nvarchar2(1000)        null,
   sdt                  char(10)               not null,
   email                varchar2(400)          not null,
   constraint PK_NHANVIEN primary key  (manv)
);
go;
/*==============================================================*/
/* Table: TTDANGNHAP                                            */
/*==============================================================*/
create table TTDANGNHAP (
   manv  		varchar2(10)	      not null,
   tendn                varchar2(30)          not null,
   matkhau              varchar2(30)          null,
   email                varchar2(400)         null,
   vaitro               nvarchar2(200)        not null,
   constraint PK_TTDANGNHAP primary key  (tendn)
);
go;
/*==============================================================*/
/* Table: NHACUNGCAP                                            */
/*==============================================================*/
create table NHACUNGCAP (
   mancc                varchar2(10)         not null,
   tenncc               nvarchar2(1000)      not null,
   diachi               nvarchar2(1000)      null,
   sdt                  char(10)             not null,
   email                varchar2(400)        not null,
   constraint PK_NHACUNGCAP primary key (mancc)
);
go;
/*==============================================================*/
/* Table: SANPHAM                                               */
/*==============================================================*/
create table SANPHAM (
   masp                 varchar2(10)         not null,
   tensp                nvarchar2(2000)      not null,
   giaban               number(20,8)         null,
   gianhap              number(20,8)         null,
   soluong              int                  not null,
   kichthuoc            varchar2(5)          not null,
   chatlieu             nvarchar2(500)       null, 
   mancc                varchar2(10)         not null,
   xuatxu               nvarchar2(500)       null,
   constraint PK_SANPHAM primary key  (masp)
);
go;
/*==============================================================*/
/* Table: HOADON                                                */
/*==============================================================*/
create table HOADON (
   mahd                 varchar2(10)         not null,
   manv                 varchar2(10)         not null,
   tenkh                nvarchar2(500)       not null,
   sdt                  char(10)             not null,
   ngayin               timestamp            null,
   tongtien             number(20,8)         null,
   ghichu               nvarchar2(2000)      null,
   constraint PK_HOADON primary key (mahd)
);
go;
/*==============================================================*/
/* Table: CTHD                                                  */
/*==============================================================*/
create table CTHD (
   mahd                 varchar2(10)        not null,
   masp                 varchar2(10)        not null,
   soluong              int                 not null,
   dongia               number(20,8)        null,
   tongtien             number(20,8)        null,
   constraint PK_CTHD primary key (mahd, masp)
);
go;
/*==============================================================*/
/* Table: PHIEUNHAPHANG                                         */
/*==============================================================*/
create table PHIEUNHAPHANG (
   mapnh                varchar2(10)         not null,
   manv                 varchar2(10)         not null,
   mancc                varchar2(10)         not null,
   ngaytao              timestamp            null,
   tongtien             number(20,8)         null,
   ghichu               nvarchar2(2000)       null,
   constraint PK_PHIEUNHAPHANG primary key  (mapnh)
);
go;
/*==============================================================*/
/* Table: CTNHAP                                                */
/*==============================================================*/
 create table CTNHAP (
   mapnh                varchar2(10)        not null,
   masp                 varchar2(10)        not null,
   soluong              int                 not null,
   gianhap              number(20,8)        not null,
   tongtien             number(20,8)        null,
   constraint PK_CTNHAP primary key (mapnh, masp)
);

go;
/*==============================================================*/
/* FOREIGN KEY                                                  */
/*==============================================================*/
alter table TTDANGNHAP
   add constraint FK_NHANVIEN_TTDANGNH foreign key (manv)
      references NHANVIEN (manv);
go;

alter table SANPHAM
   add constraint FK_SANPHAM_TNCC_NHACUNGC foreign key (mancc)
      references NHACUNGCAP (mancc);

alter table HOADON
   add constraint FK_HOADON_CUANV_NHANVIEN foreign key (manv)
      references NHANVIEN (manv);
go;

alter table CTHD
   add constraint FK_CTHD_CTHD_HOADON foreign key (mahd)
      references HOADON (mahd);
go;

alter table CTHD
   add constraint FK_CTHD_CTHD2_SANPHAM foreign key (masp)
      references SANPHAM (masp);
go;

alter table PHIEUNHAPHANG
   add constraint FK_PHIEUNHA_CUANCC_NHACUNGC foreign key (mancc)
      references NHACUNGCAP (mancc);
go;

alter table PHIEUNHAPHANG
   add constraint FK_PHIEUNHA_PNH_NV_NHANVIEN foreign key (manv)
      references NHANVIEN (manv);
go;

alter table CTNHAP
   add constraint FK_CTNHAP_CTNHAP_PHIEUNHA foreign key (mapnh)
      references PHIEUNHAPHANG (mapnh);
go;

alter table CTNHAP
   add constraint FK_CTNHAP_CTNHAP2_SANPHAM foreign key (masp)
      references SANPHAM (masp);
go;

/*==============================================================*/
/*CHECK                                                   */
/*==============================================================*/
alter table NHANVIEN
   add constraint EMAIL_NV CHECK (INSTR(email, '@gmail.com') > 0);
go;

alter table NHACUNGCAP
    add constraint EMAIL_NCC CHECK (INSTR(email, '@gmail.com') > 0);
go;

SELECT mapnh as ma, manv, ngaytao as ngay, tongtien
FROM PHIEUNHAPHANG
WHERE manv='NV1'
UNION
SELECT mahd as ma, manv, ngayin as ngay, tongtien
FROM HOADON
WHERE manv='NV1'
ORDER BY ngay DESC;


