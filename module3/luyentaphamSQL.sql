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
INSERT INTO `qlsv`.`sv` (`ID`, `TEN`, `TUOI`, `KHOAHOC`, `SOTIEN`) VALUES ('1', 'Hoang', '21', 'CNTT', '400000');
INSERT INTO `qlsv`.`sv` (`ID`, `TEN`, `TUOI`, `KHOAHOC`, `SOTIEN`) VALUES ('2', 'Viet', '19', 'DTVT', '320000');
INSERT INTO `qlsv`.`sv` (`ID`, `TEN`, `TUOI`, `KHOAHOC`, `SOTIEN`) VALUES ('3', 'Thanh', '18', 'KTDN', '400000');
INSERT INTO `qlsv`.`sv` (`ID`, `TEN`, `TUOI`, `KHOAHOC`, `SOTIEN`) VALUES ('4', 'Nhan', '19', 'CK', '450000');
INSERT INTO `qlsv`.`sv` (`ID`, `TEN`, `TUOI`, `KHOAHOC`, `SOTIEN`) VALUES ('5', 'Huong', '20', 'TCNH', '500000');
INSERT INTO `qlsv`.`sv` (`ID`, `TEN`, `TUOI`, `KHOAHOC`, `SOTIEN`) VALUES ('6', 'Huong', '20', 'TCNH', '200000');