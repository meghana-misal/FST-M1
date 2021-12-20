REM   Script: activity9
REM   activity9

create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

insert all
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001)
into customers values (3007, 'Brad Davis', 'New York', 200, 5001)
into customers value (3005, 'Graham Zusi', 'California', 200, 5002)
into customers value (3008, 'Julian Green', 'London', 300, 5002)
into customers value (3004, 'Fabian Johnson', 'Paris', 300, 5006)
into customers value (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
into customers value (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
into customers value (3001, 'Brad Guzan', 'London', 300, 5005);

create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

insert all
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001)
into customers values (3007, 'Brad Davis', 'New York', 200, 5001)
into customers values (3005, 'Graham Zusi', 'California', 200, 5002)
into customers values (3008, 'Julian Green', 'London', 300, 5002)
into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006)
into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
into customers values (3001, 'Brad Guzan', 'London', 300, 5005);

insert all
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001)
into customers values (3007, 'Brad Davis', 'New York', 200, 5001)
into customers values (3005, 'Graham Zusi', 'California', 200, 5002)
into customers values (3008, 'Julian Green', 'London', 300, 5002)
into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006)
into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
into customers values (3001, 'Brad Guzan', 'London', 300, 5005);

select * from customers;

describe customers


use customer;


insert into customers values(
(3002, 'Nick Rimando', 'New York', 100, 5001),
(3007, 'Brad Davis', 'New York', 200, 5001),
(3005, 'Graham Zusi', 'California', 200, 5002),
(3008, 'Julian Green', 'London', 300, 5002),
(3004, 'Fabian Johnson', 'Paris', 300, 5006),
(3009, 'Geoff Cameron', 'Berlin', 100, 5003),
(3003, 'Jozy Altidor', 'Moscow', 200, 5007),
(3001, 'Brad Guzan', 'London', 300, 5005)
);

use customer;


insert into customers values(
(3002, 'Nick Rimando', 'New York', 100, 5001),
(3007, 'Brad Davis', 'New York', 200, 5001),
(3005, 'Graham Zusi', 'California', 200, 5002),
(3008, 'Julian Green', 'London', 300, 5002),
(3004, 'Fabian Johnson', 'Paris', 300, 5006),
(3009, 'Geoff Cameron', 'Berlin', 100, 5003),
(3003, 'Jozy Altidor', 'Moscow', 200, 5007),
(3001, 'Brad Guzan', 'London', 300, 5005)
) ;


select table customers;


insert all
into customers values(3002, 'Nick Rimando', 'New York', 100, 5001)
into customers values(3007, 'Brad Davis', 'New York', 200, 5001)
into customers values(3005, 'Graham Zusi', 'California', 200, 5002)
into customers values(3008, 'Julian Green', 'London', 300, 5002)
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006)
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003)
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007)
into customers values(3001, 'Brad Guzan', 'London', 300, 5005)
select dual(1);

insert all
into customers values(3002, 'Nick Rimando', 'New York', 100, 5001)
into customers values(3007, 'Brad Davis', 'New York', 200, 5001)
into customers values(3005, 'Graham Zusi', 'California', 200, 5002)
into customers values(3008, 'Julian Green', 'London', 300, 5002)
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006)
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003)
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007)
into customers values(3001, 'Brad Guzan', 'London', 300, 5005)
select 1 from dual;

select * from customers;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission
FROM customers a
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

select * from salesman;

select * from salesman;

describe salesman


CREATE TABLE salesman(
salesman_id int,
salesman_name varchar(20),
salesman_city varchar(20),
comission int
)
INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)

SELECT * FROM salesman

;

CREATE TABLE salesman(
salesman_id int,
salesman_name varchar(20),
salesman_city varchar(20),
comission int
)
;

INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)

SELECT * FROM salesman

;

describe salesman


select * from salesman;

INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)

SELECT 1 FROM dual;

select * from salesman;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission
FROM customers a
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission
FROM customers a
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman"
FROM customers a
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name"
FROM customers a
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name"
FROM customers a
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name"
FROM customers a
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name" ,a.salesman_id AS "Salesman"
FROM customers a
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT customers.customer_name,customers.city, salesman.salesman_name, salesman.commission FROM customers
INNER JOIN salesman ON customers.salesman_id=salesman.salesman_id
WHERE commission>12;