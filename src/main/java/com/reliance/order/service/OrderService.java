package com.reliance.order.service;

import java.util.List;

import com.reliance.order.model.Orders;

public interface OrderService {

	List<Orders> getOrders();

	Orders getOrder(Integer id);

	Orders createOrder(Orders order);

	Orders updateOrder(Integer id, Orders order);

	void deleteOrder(Integer id);
}
