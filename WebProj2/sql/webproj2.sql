drop database if exists webproj2db;
create database webproj2db;
use webproj2db;

create table users(
user_id int,
user_name varchar(255),
password varchar(255)
);

insert users values
(1,"taro","123"),
(2,"jiro","456"),
(3,"hanako","789");

create table inquiry(
name varchar(255),
qtype varchar(255),
body varchar(255)
);
r