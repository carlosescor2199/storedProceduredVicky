create table empleados
(
    id       int auto_increment
        primary key,
    nombre   varchar(50) not null,
    apellido varchar(50) not null
);

create
    definer = root@localhost procedure consultarEmpleados(IN _id int)
BEGIN
    SELECT nombre, apellido
    FROM empleados
    WHERE id = _id;
END;

create
    definer = root@localhost procedure crearEmpleados(IN _name varchar(50), IN _apellido varchar(50))
BEGIN
    insert into empleados (nombre, apellido) values (_name, _apellido);
END;

insert into pepitoplus.empleados (id, nombre, apellido) values (1, 'Vicky', 'Arraez');
insert into pepitoplus.empleados (id, nombre, apellido) values (2, 'Jhon', 'Mendez');
insert into pepitoplus.empleados (id, nombre, apellido) values (3, 'Namuel', 'Solorzano');
insert into pepitoplus.empleados (id, nombre, apellido) values (4, 'Miguel', 'Romero');
insert into pepitoplus.empleados (id, nombre, apellido) values (5, 'Wilson', 'Manyoma');
insert into pepitoplus.empleados (id, nombre, apellido) values (6, 'James', 'Rodriguez');
insert into pepitoplus.empleados (id, nombre, apellido) values (7, 'Radamel Falcao', 'Garcia');
insert into pepitoplus.empleados (id, nombre, apellido) values (8, 'Duvan Zapata', 'Zapata');
insert into pepitoplus.empleados (id, nombre, apellido) values (9, 'Lionel Andres', 'Messi');
insert into pepitoplus.empleados (id, nombre, apellido) values (10, 'Andres', 'Iniesta');

