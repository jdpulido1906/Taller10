create database CarUnity;
USE CarUnity;

create table users_tbl(
user_id int not null primary key auto_increment,
user_firstname VARCHAR(40) not null,
user_lastname VARCHAR(40) not null,
user_email VARCHAR(60) not null,
user_password VARBINARY(256)
);
create table category_tbl(
category_id int not null primary key auto_increment,
category_name VARCHAR(40) not null
);
create table product_tbl(
product_id int not null primary key auto_increment,
product_name VARCHAR(40) not null,
product_value int null,
category_id int not null
);

insert INTO CarUnity.users_tbl (user_firstname, user_lastname, user_email, user_password)VALUES (UPPER('fabian'), UPPER('perez'), 'mate@gmail.com',AES_ENCRYPT('password','$2a$15$Ov6xYXkMlR2Ez2/RwUiO.OoYBEIKcQzy3YQkIfeIQXCiTPUSAWPta'));
SELECT *,CAST(AES_DECRYPT(user_password,'$2a$15$Ov6xYXkMlR2Ez2/RwUiO.OoYBEIKcQzy3YQkIfeIQXCiTPUSAWPta') AS CHAR(50))end_data FROM users_tbl WHERE user_id = 1;
alter table product_tbl
add constraint category_id
foreign key (category_id)
references category_tbl (category_id);
INSERT INTO category_tbl (category_name) VALUES ('Gaseosa');
INSERT INTO category_tbl (category_name) VALUES ('paquetes');
select*from product_tbl;






