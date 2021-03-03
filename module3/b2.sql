drop database if exists manager_bank;
create database manager_bank;
use manager_bank;

create table Customer(
customer_number int,
fullname varchar(50),
address varchar(255),
email varchar(50),
phone int
);

create table Accounts(
account_number int,
account_type varchar(255),
date_acc date,
balance int
);

create table Transactions(
tran_number int,
account_number int,
date_tran date,
amounts int,
description_tran varchar(255)
);