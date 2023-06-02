show databases;

create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup(formnumber varchar(10), name varchar(20), surname varchar(20), dateofbirth varchar(40), gender varchar(10), email varchar(40), maritalstatus varchar(10), address varchar(40), city varchar(20), nomos varchar(20), tk varchar(5));

select * from signup;

create table signuptwo(formno varchar(10), income varchar(50), occupation varchar(50), pannumber varchar(30), clientnumber varchar(30), seniorcitizen varchar(3), existingaccount varchar(3));

select * from signuptwo;

create table signupthree(formno varchar(10), accounttype varchar(70), cardnumber varchar(25), pinnumber varchar(10), servicesrequired varchar(200));

select * from signupthree;

create table login(formno varchar(10), cardnumber varchar(25), pinnumber varchar(10));

select * from login;

drop table bank;

create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));

select * from bank;