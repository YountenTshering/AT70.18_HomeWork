insert into role (name) values ('ROLE_ADMIN');
insert into role (name) values ('ROLE_COMPANY');


-- admin user --
insert into user (username, password, active, email) values ('Younten', '$2y$10$uwslZFS.czXR6VE7XzyBTuH.xGtdDmBBnioj2J/KZqJr0cHDEr3fa', true, 'younten@ait.asia');
insert into user_roles (users_id, roles_id) values (1, 1);

-- Company user --
insert into user (username, password, active, email) values ('Tshering', '$2y$10$uwslZFS.czXR6VE7XzyBTuH.xGtdDmBBnioj2J/KZqJr0cHDEr3fa', true, 'tshering@ait.asia');
insert into user_roles (users_id, roles_id) values (2, 2);

insert into user (username, password, active, email) values ('Jam', '$2y$10$uwslZFS.czXR6VE7XzyBTuH.xGtdDmBBnioj2J/KZqJr0cHDEr3fa', true, 'jam@ait.asia');
insert into user_roles (users_id, roles_id) values (3, 2);

insert into user (username, password, active, email) values ('Kam', '$2y$10$uwslZFS.czXR6VE7XzyBTuH.xGtdDmBBnioj2J/KZqJr0cHDEr3fa', true, 'kamfree@ait.asia');
insert into user_roles (users_id, roles_id) values (4, 2);


-- Product and Category --

insert into company (name) values ('AIT');
insert into company (name) values ('TU');
insert into company (name) values ('BMW');

insert into category (name) values ('Home');
insert into category (name) values ('Outdoor');


insert into product (name, company_id, price, stock) values ('Bed', 1, 9999, 10);
insert into product (name, company_id, price, stock) values ('Tap', 2, 99, 20);

insert into category_products (categories_id, products_id) values (1, 1);
insert into category_products (categories_id, products_id) values (2, 2);