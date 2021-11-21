CREATE DATABASE IF NOT EXISTS banking-ve;

CREATE TABLE if NOT EXISTS users (userId long primary key auto_increment, user_login varchar(255)not null unique
    ,user_password varchar(255)not null unique);

CREATE TABLE if  NOT EXISTS employee(
    employeeId long primary key auto_increment,firstName varchar(255) not null unique,
    lastName varchar(255) not null unique,salary int not null unique, salary float not null,
    street varchar(255), buildingNumber varchar(255) not null unique,FOREIGN KEY (bankId) REFERENCES bank(bankId));

CREATE TABLE if  NOT EXISTS bank(bankId long primary key auto_increment,bankName varchar(255) not null unique,
    address varchar(255) not null unique, FOREIGN KEY (bankId) REFERENCES employee(employeeId));




