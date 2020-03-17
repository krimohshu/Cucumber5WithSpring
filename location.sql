use projectdb
create table
location (id int PRIMARY KEY,code varchar(20),name varchar(20),type varchar(10))ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from location;

drop table location;