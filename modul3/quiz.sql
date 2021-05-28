customercustomer
drop database if exists quiz;
CREATE DATABASE quiz;

use quiz;

create table qlsp ( 
namesp varchar(120) NOT NULL,
 gia int NOT NULL,
 mucgiamgia int,
 tonkho varchar(120)
 );


create table qlnv(
	namenv varchar(40) not null,
    date_nv date,
    diachi_nv varchar(120)
);



create table qlkh(
	name_kh varchar(40) NOT NULL,
    date_kh date,
    sdt int,
    diachi_kh varchar(120) NOT NULL,
    email varchar(220) NOT NULL
);


create table qldh(
	thanhtoan varchar(40) NOT NULL,
    dathang varchar(40) NOT NULL,
    nv_donhang varchar(40) NOT NULL,
    ngaydathang date,
    ngaygiaohang date,
    diachigiaohang varchar(120) NOT NULL
);
insert into qldh(thanhtoan,dathang, nv_donhang ,   ngaydathang, ngaygiaohang,diachigiaohang) values('The','dienthoai','hai', '2-3-2020','7-3-2020','NgheAn');
insert into qldh(thanhtoan,dathang, nv_donhang ,   ngaydathang, ngaygiaohang,diachigiaohang) values('The','laptop','hung', '2-3-2020','7-3-2020','NgheAn');
insert into qldh(thanhtoan,dathang, nv_donhang ,   ngaydathang, ngaygiaohang,diachigiaohang) values('The','tivi','hoang', '2-3-2020','7-3-2020','NgheAn');
insert into qldh(thanhtoan,dathang, nv_donhang ,   ngaydathang, ngaygiaohang,diachigiaohang) values('The','DieuHoa','hai', '2-3-2020','7-3-2020','NgheAn');
insert into qldh(thanhtoan,dathang, nv_donhang ,   ngaydathang, ngaygiaohang,diachigiaohang) values('The','nonglanh','hai', '2-3-2020','7-3-2020','NgheAn');
insert into qldh(thanhtoan,dathang, nv_donhang ,   ngaydathang, ngaygiaohang,diachigiaohang) values('The','noicom','hai', '2-3-2020','7-3-2020','NgheAn');
insert into qldh(thanhtoan,dathang, nv_donhang ,   ngaydathang, ngaygiaohang,diachigiaohang) values('The','phone','hai', '2-3-2020','7-3-2020','NgheAn');
insert into qldh(thanhtoan,dathang, nv_donhang ,   ngaydathang, ngaygiaohang,diachigiaohang) values('The','oto','hai', '2-3-2020','7-3-2020','NgheAn');
insert into qldh(thanhtoan,dathang, nv_donhang ,   ngaydathang, ngaygiaohang,diachigiaohang) values('The','xemay','hai', '2-3-2020','7-3-2020','NgheAn');
insert into qldh(thanhtoan,dathang, nv_donhang ,   ngaydathang, ngaygiaohang,diachigiaohang) values('The','dien','hai', '2-3-2020','7-3-2020','NgheAn');

 insert into qlsp(namesp, gia, mucgiamgia, tonkho) values('iphone','100000','10',100);
 insert into qlsp(namesp, gia, mucgiamgia, tonkho) values('samsung','200000','20',1000);
 insert into qlsp(namesp, gia, mucgiamgia, tonkho) values('xiaomi','300000','30',110);
 insert into qlsp(namesp, gia, mucgiamgia, tonkho) values('asus','400000','10',120);
 insert into qlsp(namesp, gia, mucgiamgia, tonkho) values('acer','500000','40',130);
 insert into qlsp(namesp, gia, mucgiamgia, tonkho) values('sony','2200000','20',140);
 insert into qlsp(namesp, gia, mucgiamgia, tonkho) values('nokia','106000','70',510);
 insert into qlsp(namesp, gia, mucgiamgia, tonkho) values('hp','107000','90',610);
 insert into qlsp(namesp, gia, mucgiamgia, tonkho) values('lenovo','100900','30',710);
 insert into qlsp(namesp, gia, mucgiamgia, tonkho) values('apple','101000','10',810);
 
 insert into qlnv(namenv, date_nv,  diachi_nv) values('Tuong','1-9-1990','Nghe An');
insert into qlnv(namenv, date_nv,  diachi_nv) values('Tuan Anh','11-6-1989','Da Nang');
insert into qlnv(namenv, date_nv,  diachi_nv) values('Tri','1-1-1992','Hai Phong');
insert into qlnv(namenv, date_nv,  diachi_nv) values('Tuong','1-2-1993','Hai Duong');
insert into qlnv(namenv, date_nv,  diachi_nv) values('Tan','1-3-1994','Quang Ninh');
insert into qlnv(namenv, date_nv,  diachi_nv) values('Tung','1-4-1995','Ha Noi');
insert into qlnv(namenv, date_nv,  diachi_nv) values('Toan','1-6-1996','Binh Duong');
insert into qlnv(namenv, date_nv,  diachi_nv) values('Tien','1-7-1997','TP HCM');
insert into qlnv(namenv, date_nv,  diachi_nv) values('Too','1-8-1998','An Giang');
insert into qlnv(namenv, date_nv,  diachi_nv) values('Toir','1-5-1999','Quang Nam');

insert into qlkh(name_kh, date_kh, sdt,  diachi_kh, email) values('Hai','1-5-1999','123456','Nghe an','Hai@cm.vn');
insert into qlkh(name_kh, date_kh, sdt,  diachi_kh, email) values('Hung','1-5-1999','123456','Ha Noi','Hai@cm.vn');
insert into qlkh(name_kh, date_kh, sdt,  diachi_kh, email) values('Ha','1-5-1999','123456','An Giang','Hai@cm.vn');
insert into qlkh(name_kh, date_kh, sdt,  diachi_kh, email) values('Hang','1-5-1999','123456','Quang Nam','Hai@cm.vn');
insert into qlkh(name_kh, date_kh, sdt,  diachi_kh, email) values('ba','1-5-1999','123456','Hai Duong','Hai@cm.vn');
insert into qlkh(name_kh, date_kh, sdt,  diachi_kh, email) values('hiii','1-5-1999','123456','Quang Ninh','Hai@cm.vn');
insert into qlkh(name_kh, date_kh, sdt,  diachi_kh, email) values('ho','1-5-1999','123456','TP HCM','Hai@cm.vn');
insert into qlkh(name_kh, date_kh, sdt,  diachi_kh, email) values('Hu','1-5-1999','123456','Nghe an','Hai@cm.vn');
insert into qlkh(name_kh, date_kh, sdt,  diachi_kh, email) values('Hang','1-5-1999','123456','Nghe an','Hai@cm.vn');
insert into qlkh(name_kh, date_kh, sdt,  diachi_kh, email) values('Huong','1-5-1999','123456','Nghe an','Hai@cm.vn');