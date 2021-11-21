CREATE DATABASE IF NOT EXISTS banking_ve;

CREATE TABLE if NOT EXISTS users (userId long primary key auto_increment, username varchar(255)not null unique
    ,user_password varchar(255)not null unique);

CREATE TABLE if  NOT EXISTS bank(bankId long primary key auto_increment,bankName varchar(255) not null unique,
                                 address varchar(255) not null unique);

CREATE TABLE if  NOT EXISTS employee(
    employeeId long primary key auto_increment,firstName varchar(255) not null unique,
    lastName varchar(255) not null unique, age int not null unique ,  salary float not null unique ,
    address varchar(255),department varchar(255) not null unique, employees_statues bit not null unique,
    bankId int not null,FOREIGN KEY (bankId) REFERENCES bank(bankId));






