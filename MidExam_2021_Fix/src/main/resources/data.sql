insert into role (name) values ('ROLE_ADMIN');
insert into role (name) values ('ROLE_USER');

-- insert into user (username, password, active, role) values ('Younten', '$2y$10$uwslZFS.czXR6VE7XzyBTuH.xGtdDmBBnioj2J/KZqJr0cHDEr3fa', true, 'ROLE_ADMIN');
-- insert into user (username, password,  active, role) values ('Jams', '$2y$10$uwslZFS.czXR6VE7XzyBTuH.xGtdDmBBnioj2J/KZqJr0cHDEr3fa', true, 'ROLE_ADMIN');
-- insert into user (username, password,  active, role) values ('Kims', '$2y$10$uwslZFS.czXR6VE7XzyBTuH.xGtdDmBBnioj2J/KZqJr0cHDEr3fa', true, 'ROLE_USER');

insert into User (username, password, role, active, email) values ('Younten', '$2y$10$uwslZFS.czXR6VE7XzyBTuH.xGtdDmBBnioj2J/KZqJr0cHDEr3fa', 'ROLE_ADMIN', true, 'yo@gmail.com');
insert into User (username, password, role, active, email) values ('Tshering', '$2y$10$uwslZFS.czXR6VE7XzyBTuH.xGtdDmBBnioj2J/KZqJr0cHDEr3fa', 'ROLE_ADMIN', true, 'younten@gmail.com');
insert into User (username, password, role, active, email) values ('Karma', '$2y$10$uwslZFS.czXR6VE7XzyBTuH.xGtdDmBBnioj2J/KZqJr0cHDEr3fa', 'ROLE_USER', true, 'karam@gmail.com');
insert into User (username, password, role, active, email) values ('chaklam', '$2y$10$uwslZFS.czXR6VE7XzyBTuH.xGtdDmBBnioj2J/KZqJr0cHDEr3fa', 'ROLE_USER', true, 'chaklam@gmail.com');


insert into address (city, house_no, street_address, zipcode, emp_user_id) values ('Bangkok', '30/6', 'Ramindra', '10220', 1);
insert into address (city, house_no, street_address, zipcode, emp_user_id) values ('Bangkok', '30/7', 'Victory Monument', '12220', 2);