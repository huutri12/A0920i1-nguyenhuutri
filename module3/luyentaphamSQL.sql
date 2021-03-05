drop database if exists qlsv;
create database qlsv;
use qlsv;

create table sv(
ID int primary key,
TEN varchar(255),
TUOI int,
KHOAHOC varchar(255),
SOTIEN int
);