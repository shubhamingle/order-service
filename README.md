# order-service

Create table in MySQL using the following query
CREATE TABLE orders(id int(5), description varchar(30), date date, status varchar(15), primary key(id));

1. Post a order
![image](https://user-images.githubusercontent.com/37982804/149362001-2ce3e47f-2e20-45d8-a8df-769e025c605f.png)

2. Update an order
![image](https://user-images.githubusercontent.com/37982804/149362199-fcd339f4-3385-496c-9fe4-187809d22d4d.png)

3. Get all orders
GET localhost:8080/api/orders

4. Get a specific order
GET localhost:8080/api/orders/4

5. Delete an order
DELETE localhost:8080/api/orders/11
