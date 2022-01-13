package com.reliance.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reliance.order.model.Orders;
import com.reliance.order.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/orders")
	public List<Orders> getOrders() {
		List<Orders> orders = orderService.getOrders();
		return orders;
	}

	@GetMapping("/orders/{id}")
	public Orders getOrder(@PathVariable("id") Integer id) {
		return orderService.getOrder(id);
	}

	@PostMapping("/orders")
	public Orders createOrder(@RequestBody Orders order) {
		return orderService.createOrder(order);
	}

	@PutMapping("/orders/{id}")
	public Orders updateOrder(@PathVariable("id") Integer id, @RequestBody Orders order) {
		return orderService.updateOrder(id, order);
	}

	@DeleteMapping("/orders/{id}")
	public void deleteOrder(@PathVariable("id") Integer id) {
		orderService.deleteOrder(id);
	}
}
