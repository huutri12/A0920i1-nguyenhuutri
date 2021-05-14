drop database if exists CaseStudy;
create database CaseStudy;
use CaseStudy;

create table Loaidichvu(
IDloaidichvu int primary key not null,
Tenloaidichvu varchar(45)
);

INSERT INTO `casestudy`.`loaidichvu` (`IDloaidichvu`, `Tenloaidichvu`) VALUES ('1', 'villa');
INSERT INTO `casestudy`.`loaidichvu` (`IDloaidichvu`, `Tenloaidichvu`) VALUES ('2', 'house');
INSERT INTO `casestudy`.`loaidichvu` (`IDloaidichvu`, `Tenloaidichvu`) VALUES ('3', 'room');


create table Kieuthue(
IDkieuthue int primary key not null,
Tenkieuthue varchar(45),
Gia int
);

INSERT INTO `casestudy`.`kieuthue` (`IDkieuthue`, `Tenkieuthue`, `Gia`) VALUES ('1', 'vip', '5000');
INSERT INTO `casestudy`.`kieuthue` (`IDkieuthue`, `Tenkieuthue`, `Gia`) VALUES ('2', 'normal', '3000');
INSERT INTO `casestudy`.`kieuthue` (`IDkieuthue`, `Tenkieuthue`, `Gia`) VALUES ('3', 'bro', '3000');


create table Vitri(
IDvitri int primary key not null,
TenVitri varchar(45) not null
);

INSERT INTO `casestudy`.`vitri` (`IDvitri`, `TenVitri`) VALUES ('1', 'Lễ Tân');
INSERT INTO `casestudy`.`vitri` (`IDvitri`, `TenVitri`) VALUES ('2', 'Phục vụ');
INSERT INTO `casestudy`.`vitri` (`IDvitri`, `TenVitri`) VALUES ('3', 'Chuyên viên');
INSERT INTO `casestudy`.`vitri` (`IDvitri`, `TenVitri`) VALUES ('4', 'Giám sát');
INSERT INTO `casestudy`.`vitri` (`IDvitri`, `TenVitri`) VALUES ('5', 'Quản lý');
INSERT INTO `casestudy`.`vitri` (`IDvitri`, `TenVitri`) VALUES ('6', 'Giám đốc');

create table Trinhdo(
IDtrinhdo int primary key not null,
Trinhdo varchar(45) not null
);

INSERT INTO `casestudy`.`trinhdo` (`IDtrinhdo`, `Trinhdo`) VALUES ('1', 'Trung cấp');
INSERT INTO `casestudy`.`trinhdo` (`IDtrinhdo`, `Trinhdo`) VALUES ('2', 'Cao đẳng');
INSERT INTO `casestudy`.`trinhdo` (`IDtrinhdo`, `Trinhdo`) VALUES ('3', 'Đại học');
INSERT INTO `casestudy`.`trinhdo` (`IDtrinhdo`, `Trinhdo`) VALUES ('4', 'Sau đại học');


create table Bophan(
IDbophan int primary key not null,
Tenbophan varchar(45) not null
);

INSERT INTO `casestudy`.`bophan` (`IDbophan`, `Tenbophan`) VALUES ('1', 'cskh');
INSERT INTO `casestudy`.`bophan` (`IDbophan`, `Tenbophan`) VALUES ('2', 'letan');
INSERT INTO `casestudy`.`bophan` (`IDbophan`, `Tenbophan`) VALUES ('3', 'ckc');


create table Dichvudikem(
IDdichvudikem int primary key not null,
Tendichvudikem varchar(45),
Gia int,
Donvi int,
Trangthaikhadung varchar(45)
);

INSERT INTO Dichvudikem VALUES ('1', 'Buffet', '10', '5', 'on');
INSERT INTO Dichvudikem VALUES ('2', 'Rent Car', '50', '25', 'on');
INSERT INTO Dichvudikem VALUES ('3', 'Party', '100', '50', 'on');

create table Loaikhach(
IDloaikhach int primary key not null,
Tenloaikhach varchar(45)
);

INSERT INTO LoaiKhach VALUES ('1', 'Vip');
INSERT INTO LoaiKhach VALUES ('2', 'Normal');
INSERT INTO LoaiKhach VALUES ('3', 'Bro');

create table Nhanvien(
Idnhanvien int primary key not null,
Hoten varchar(45) ,
IDvitri int ,
IDtrinhdo int ,
IDbophan int ,
Ngaysinh date ,
SoCMND varchar(45) ,
Luong varchar(45) ,
SDT varchar(45) ,
Email varchar(45) ,
Diachi varchar(45),
foreign key (IDvitri) references Vitri(IDvitri),
foreign key (IDtrinhdo) references Trinhdo(IDtrinhdo),
foreign key (IDbophan) references Bophan(IDbophan)
);

INSERT INTO Nhanvien VALUES ('1', 'Tran Thi K', '1', '1', '1', '2000-10-19', '123132', '2500', '0123456', 'K@gmail.com', 'Da Nang');
INSERT INTO Nhanvien VALUES ('2', 'Tran Thi T', '2', '2', '2', '2000-10-19', '125552', '1500', '0123456', 'T@gmail.com', 'Nghe An');
INSERT INTO Nhanvien VALUES ('3', 'Tran Thi H', '3', '3', '3', '2000-10-19', '128932', '3000', '0123456', 'H@gmail.com', 'Ha Noi');

create table Dichvu(
IDdichvu int primary key not null,
Tendichvu varchar(45),
Dientich int,
Sotang int,
Songuoitoida varchar(45),
Chiphithue varchar(45),
IDkieuthue int,
IDloaidichvu int,
Trangthai varchar(45),
foreign key (IDkieuthue) references Kieuthue(IDkieuthue),
foreign key (IDloaidichvu) references Loaidichvu(IDloaidichvu)
);

INSERT INTO Dichvu VALUES (1, 'Villa', '500', '5', '10', 1000, 1, 1, 'on');
INSERT INTO Dichvu VALUES (2, 'Home', '300', '3', '5', 500, 2, 2, 'on');
INSERT INTO Dichvu VALUES (3, 'House', '200', '2', '3', 200, 3, 3, 'on');


create table Khachhang(
IDkhachhang int primary key not null,
IDloaikhach int not null,
Hoten varchar(45) not null,
Ngaysinh date not null,
SoCMND varchar(45) not null,
SDT varchar(45) not null,
Email varchar(45) not null,
Diachi varchar(45) not null,
foreign key (IDloaikhach) references Loaikhach(IDloaikhach)
);

INSERT INTO KhachHang VALUES ('1', '1', 'Le Tuan Anh', '2000-10-19', '123456789','123456', 'anht@gmail.com', 'Da Nang');
INSERT INTO KhachHang VALUES ('2', '2', 'Nguyen Huu Tri', '2000-10-19', '123136','123456789', 'anh@gmail.com', 'HCM');
INSERT INTO KhachHang VALUES ('3','3','Doan An Nhien','2000-10-19', '123135','123456789', 'anh@gmail.com', 'Quang Tri');


create table Hopdong(
IDhopdong int primary key not null,
IDnhanvien int,
IDkhachhang int,
IDdichvu int,
Ngaylamhopdong date,
Ngayketthuc date,
Tiendatcoc int,
Tongtien int,
foreign key (IDnhanvien) references Nhanvien(IDnhanvien),
foreign key (IDkhachhang) references Khachhang(IDkhachhang),
foreign key (IDdichvu) references Dichvu(IDdichvu)
);

INSERT INTO Hopdong VALUES ('1', '1', '1', '1', '2021-03-06', '2021-03-10', '100', '500');
INSERT INTO Hopdong VALUES ('2', '2', '2', '2', '2021-03-05', '2021-03-09', '100', '200');
INSERT INTO Hopdong VALUES ('3', '3', '3', '3', '2021-03-04', '2021-03-08', '100', '300');


create table Hopdongchitiet(
IDhopdongchitiet int primary key not null,
IDhopdong int,
IDdichvudikem int,
Soluong int,
foreign key (IDhopdong) references Hopdong(IDhopdong),
foreign key (IDdichvudikem) references Dichvudikem(IDdichvudikem)
);

INSERT INTO Hopdongchitiet VALUES ('1', '1', '1', '10');
INSERT INTO Hopdongchitiet VALUES ('2', '2', '2', '01');
INSERT INTO Hopdongchitiet VALUES ('3', '3', '3', '19');

-- 2.hiển thị thông tin tất cả các nhân  viên trong hệ thống:
-- select * from nhanvien
-- where Hoten like "H%" or Hoten like "T%" or Hoten like "K%"
-- group by Idnhanvien
-- having length(Hoten)

-- 3.hiển thị thông tin tất cả khách hàng có độ tuổi...
-- select * from khachhang
-- where Diachi like "Da Nang" or Diachi like "Quang Tri"
-- group by IDkhachhang
-- having ((year(curdate()) - year(ngaysinh)) >= 18) and (year(curdate()) - year(ngaysinh) < 50);

-- 4.
 



