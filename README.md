# order-service

Create table in MySQL using the following query
<br/>
CREATE TABLE orders(id int(5), description varchar(30), date date, status varchar(15), primary key(id));

1. Post a order (Note: The id is set as auto increment)
![image](https://user-images.githubusercontent.com/37982804/149362001-2ce3e47f-2e20-45d8-a8df-769e025c605f.png)
<br/>
2. Update an order
![image](https://user-images.githubusercontent.com/37982804/149362199-fcd339f4-3385-496c-9fe4-187809d22d4d.png)
<br/>
3. Get all orders
GET localhost:8080/api/orders
<br/>
4. Get a specific order
GET localhost:8080/api/orders/4
<br/>
5. Delete an order
DELETE localhost:8080/api/orders/11
<br/>
Table in MySQL
<br/>
![image](https://user-images.githubusercontent.com/37982804/149362788-7ba005ad-660b-4f20-b5ed-ea7a076eca13.png)
<br/>
Note: Make sure you modify database name, username and password as per yours.
