drop database if exists dulieu;
create database dulieu;
use dulieu;
create table hocsinh(
	id int primary key,
    tenhs varchar(255),
    gioitinh varchar(25),
    quequan varchar(255)
);
create table  customer(
	id int primary key,
    tencus varchar(255),
    gioitinhcus varchar(25),
    quequancus varchar(255)
);

 -- select id,tencus,gioitinhcus,quequancus from customer
 
 create table contacts(
 contact_id int not null auto_increment,
 last_name varchar(30) not null,
 first_name varchar(25),
 birthday date,
 constraint contacts_pk primary key (contact_id)
 );
 
 create table suppliers(
 supplier_id int not null auto_increment,
 supplier_name varchar(50) not null,
 account_rep varchar(30) not null default 'TBD',
 constraint suppliers_pk primary key (supplier_id)
 );
 

 