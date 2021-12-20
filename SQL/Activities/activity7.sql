REM   Script: activity7
REM   GroupBy order_no

SELECT order_no, SUM(purchase_amount)
FROM orders
GROUP BY order_no;

SELECT SUM(purchase_amount) as "Purchase_SUM" FROM orders;

select AVG(purchase_amount) as "Average" from orders;

select MAX(purchase_amount) as "Maximum" from orders;

select MIN(purchase_amount) as "Minimum" from orders;

select COUNT(distinct salesman_id) as "Total_Count" from orders;