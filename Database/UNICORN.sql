Create database DUAN
go 
use DUAN
go

 Create table NHANVIEN
( MaNV nvarchar(10) ,
  Tennv nvarchar(50) ,
  GioiTinh nvarchar(10) ,
  DiaChi nvarchar(50) ,
  DienThoai nvarchar(10),
  Email nvarchar(20),
  Luong money ,
  ChucVu nvarchar(20)
  primary key (MaNV)
  
)

Create table TAIKHOAN
(TenDangNhap nvarchar(10) ,
 MatKhau nvarchar(20)
 primary key (TenDangNhap)
 foreign key (TenDangNhap) references NHANVIEN(MaNV)
 )

Create table KHACHHANG
( MaKH nvarchar(10) ,
  TenKH nvarchar(50) ,
  GioiTinh nvarchar(10) ,
  DiaChi nvarchar(50) ,
  SDT nvarchar(10) ,
  Loai nvarchar(50) ,
  TongChiTieu money 
  primary key (MaKH)
)


Create table KHUYENMAI
( MaKM nvarchar(10) ,
   TiLeKM float,
  TenChuongTrinh nvarchar(50) ,
  DieuKien nvarchar(100) ,
  NgayBatDau nvarchar(10) ,
  NgayKetThuc nvarchar(10)
  primary key (MaKM)
  
)

Create table THUONGHIEU
( Mathuonghieu nvarchar(10) ,
  Tenthuonghieu nvarchar(50) ,
  Email nvarchar(50)
  primary key (Mathuonghieu)

)

Create table XUATXU
( MaXX nvarchar(10) ,
  Tennuoc nvarchar(10) 
  primary key (MaXX)

)

Create table KHOILUONG
( MaKhoiLuong nvarchar(10) ,
  KhoiLuong Nvarchar(10) 
   primary key (MaKhoiLuong)

)

Create table SANPHAM
( MaSP nvarchar(10) ,
  TenSP nvarchar(50) ,
  Soluong int ,
  Gia money ,
  MaKhoiLuong nvarchar(10) ,
  MaXX nvarchar(10),
  Mathuonghieu nvarchar(10) 
  primary key (MaSP)
  foreign key (MaKhoiLuong) references KHOILUONG(MaKhoiLuong),
  foreign key (MaXX) references XUATXU(MaXX),
  foreign key (Mathuonghieu) references THUONGHIEU(Mathuonghieu)
)

Create table HOADON
( MaHD int IDENTITY(1,1),
  MaNV nvarchar(10) ,
  MaKH nvarchar(10) ,
  MaKM nvarchar(10) ,
  NgayBan nvarchar(10) ,
  TongTien money
  primary key (MaHD) 
  foreign key (MaNV) references NHANVIEN(MaNV),
  foreign key (MaKH) references KHACHHANG(MaKH),
  foreign key (MaKM) references KHUYENMAI(MaKM)
)

CREATE TABLE DOANHTHU(
MaDoanhThu nvarchar (10),
MaHD int IDENTITY(1,1),
TongDoanhThu money
primary key (MaDoanhThu)
foreign key (MaHD) references HOADON(MaHD)
)

Create table CHITIETHOADON
( MaSP nvarchar(10) ,
  MaHD int IDENTITY(1,1) ,
  SoLuong int ,
  GiaBan money 
  primary key (MaHD,MaSP)
  foreign key (MaSP) references SANPHAM(MaSP),
  foreign key (MaHD) references HOADON(MaHD)
)



Create table NHACUNGCAP
(  MaNCC nvarchar(10) ,
  TenNCC nvarchar(50) ,
  DiaChi nvarchar(50) ,
  Email nvarchar(50) 
  primary key (MaNCC)
)
 
Create table KHOHANG
(   MaPN nvarchar(10) ,
  MaNCC nvarchar(10) ,
  MaNV nvarchar(10) ,
  NgayNhap nvarchar(10) ,
  TongTien money
  primary key (MaPN)
  foreign key (MaNCC) references NHACUNGCAP(MaNCC),
  foreign key (MaNV) references NHANVIEN(MaNV)
)

create table NHAPHANG(
MaPN nvarchar(10) not null primary key,
MaSP nvarchar(10) not null ,
MaNCC nvarchar(10) not null,
SoLuong int not null,
GiaNhap money null,
TongTien money null,
NgayNhap nvarchar(10) null,
 foreign key (MaSP)  references SANPHAM(MaSP),
 foreign key (MaPN)  references KHOHANG(MaPN)
)

insert into NHANVIEN values 
('NV01' , N'Lê Văn Huỳnh' , N'Nam', N'Hà Nội' ,'0865656296', N'Huynhlv@gmail.com', 10000000 , N'Quản lý'),
('NV02' , N'Nguyễn Tiểu Ngư' , N'Nam', N'Bắc Ninh' ,'0976656296', N'NguNt@gmail.com', 9000000 , N'Quản lý'),
('NV03' , N'Chu Quang Triều' , N'Nam', N'Thái Bình' ,'083328344', N'TrieuCq@gmail.com', 8000000 , N'Nhân Viên'),
('NV04' , N'Ngô Thùy Linh' , N'Nữ', N'Hà Nội' ,'055656296', N'Linhnt@gmail.com', 7000000 , N'Nhân Viên'),
('NV05' , N'Nguyễn Ngọc Tú' , N'Nam', N'Bắc Giang' ,'0865435536', N'TuNt@gmail.com', 7000000 , N'Nhân Viên')

insert into KHACHHANG values
('KH01' , 'Lê Quang Thủy' ,  N'Nam' , N'Hà Nội' , '0834234221' , N'Khách thường',  13000000 ),
('KH02' , 'Nguyễn Phương Thảo' ,  N'Nữ' , N'Hà Nội' , '0838977222' , N'Khách VIP',  100000000 ),
('KH03' , 'Hoàng Thị Vân' ,  N'Nữ' , N'Thanh Hóa' , '0976236221' , N'Khách thường',  10000000 ),
('KH04' , 'Lưu Thị Nhã Linh' ,  N'Nữ' , N'Bắc Giang' , '0864542341' , N'Khách VIP',  120000000 ),
('KH05' , 'Lê Hiếu Kiên' ,  N'Nữ' , N'Hà Nội' , '0834547222' , N'Khách thường',  23000000 )


insert into NHACUNGCAP values
(  'NCC01' ,N'Mỹ Phẩm Lady' , N'Hà Nội',N'ladybeauty@gmail.com' ),
(  'NCC02' ,N'Beauty and Wonmen' , N'TP Hồ Chí Minh',N'BeautyandWonmen@gmail.com' ),
(  'NCC03' ,N'Mỹ Phẩm Anh' , N'Nha Trang',N'myphamanh@gmail.com' ),
(  'NCC04' ,N'Golden Serum' , N'Hà Nội',N'goldenserum@gmail.com' ),
(  'NCC05' ,N'Natural Cosmetics' , N'Bắc Ninh',N'NaturalCosmetics@gmail.com' )

insert into SANPHAM values
('Sp01' ,N'Serum dưỡng da' , 100, 150000 ,'KL01' ,'CT01','TT01'),
('Sp02' ,N'Kem dưỡng da' , 200, 350000 ,'KL02' ,'CT02','TT02'),
('Sp03' ,N'Mặt nạ' , 500, 120000 ,'KL03' ,'CT03','TT03'),
('Sp04' ,N'Viên uống Colagen' , 1000, 250000 ,'KL04' ,'CT04','TT04'),
('Sp05' ,N'Sữa tắm Trắng' , 50, 170000 ,'KL05' ,'CT05','TT05')

insert into THUONGHIEU values
('TT01' , 'Biore' , N'biore@gmail.com'),
('TT02' , 'Jonh & Wonmen' , N'Jonh&Wonmen@gmail.com'),
('TT03' , 'Shiseido' , N'Shiseido@gmail.com'),
('TT04' , ' Lancôme' , N'Lancôme@gmail.com'),
('TT05' , 'Neutrogena' , N'Neutrogena@gmail.com')


insert into XUATXU values
('CT01' ,N'Anh'),
('CT02' ,N'Mỹ'),
('CT03' ,N'Nhật Bản'),
('CT04' ,N'Pháp'),
('CT05' ,N'Mỹ')
 
 insert into KHOILUONG values
 ( 'KL01' , '250g' ),
 ( 'KL02' , '500g' ),
 ( 'KL03' , '550g' ),
 ( 'KL04' , '350g' ),
 ( 'KL05' , '100g' )

 
 insert into TAIKHOAN values
('NV01',N'abc123'),
('NV02',N'abc123'),
('NV03',N'abc123'),
('NV04',N'abc123'),
('NV05',N'abc123')



insert into KHUYENMAI values
('KM01' ,0.1,N'KM đặc biệt chào mừng 8/3',  N'Hóa đơn thanh toàn trên 1 triệu', '01/06/2023' , '10/08/2023'),
('KM02' , 0.15,N'Tri ân khách hàng',  N'Hóa đơn thanh toàn trên 500000', '13/9/2023' , '15/09/2023'),
('KM03', 0.2 ,N'KM sinh nhật công ty',  N'Mua  sản phẩm bất kì', '01/11/2023' , '10/11/2023')



 insert into HOADON values
( 'NV01' , 'KH01' , 'KM01' ,  '12/06/2023',  1350000),
( 'NV02' , 'KH02' , 'KM02' ,  '02/07/2023',  1480000),
( 'NV03' , 'KH03' , 'KM01' ,  '22/06/2023',  1080000),
( 'NV04' , 'KH04' , 'KM03' ,  '10/11/2023',  4000000),
( 'NV05' , 'KH05', null ,  '12/09/2023',  340000)

insert into CHITIETHOADON values
 ('Sp01' ,10 , 150000 ),
 ('Sp02'  ,5 , 350000 ),
 ('Sp03'  ,10 , 120000 ),
 ('Sp04'  ,20 , 250000 ),
 ('Sp05'  ,2 , 170000 )

 insert into DOANHTHU values
 ('DT01',1350000),
 ('DT02',1480000),
 ('DT03',1080000),
 ('DT04',4000000),
 ('DT05',340000)

  insert into KHOHANG values
    ('PN01' ,'NCC01','NV01' ,'12/04/2023' ,15000000),
	('PN02' ,'NCC02','NV02' ,'10/04/2023' ,70000000),
	('PN03' ,'NCC03','NV03' ,'07/02/2023' ,70000000),
	('PN04' ,'NCC04','NV04' ,'17/03/2023' ,250000000),
	('PN05' ,'NCC05','NV05' ,'23/05/2023' ,8500000)

	select * from CHITIETHOADON
	select * from NHAPHANG
	select * from DOANHTHU
	select * from HOADON
	select * from TAIKHOAN
	select * from NHANVIEN
	select * from SANPHAM
	select * from KHOILUONG
	select * from KHUYENMAI
	select * from TAIKHOAN
	select * from NHACUNGCAP
	select * from THUONGHIEU
	select * from XUATXU
	select * from KHOHANG