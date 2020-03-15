create database projectdb

use projectdb

create table studenttab(
id int PRIMARY KEY AUTO_INCREMENT,
sname varchar(20),
scourse varchar(30),
sfee int
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from studenttab;

drop table studenttab;