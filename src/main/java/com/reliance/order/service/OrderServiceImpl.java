package com.reliance.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reliance.order.exception.OrderNotFoundException;
import com.reliance.order.model.Orders;
import com.reliance.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Orders> getOrders() {
		List<Orders> orders = orderRepository.findAll();
		return orders;
	}

	@Override
	public Orders getOrder(Integer id) {
		Optional<Orders> order = orderRepository.findById(id);
		if (order.isPresent()) {
			return order.get();
		} else {
			throw new OrderNotFoundException("The orders with id " + id + " does not exist");
		}
	}

	@Override
	public Orders createOrder(Orders order) {
		Orders dbOrder = orderRepository.save(order);
		return dbOrder;
	}

	@Override
	public Orders updateOrder(Integer id, Orders order) {
		Optional<Orders> dbOrder = orderRepository.findById(id);
		if (dbOrder.isPresent()) {
			Orders toBeUpdated = dbOrder.get();
			toBeUpdated.setDescription(order.getDescription());
			toBeUpdated.setDate(order.getDate());
			toBeUpdated.setStatus(order.getStatus());
			Orders updatedOrder = orderRepository.save(toBeUpdated);
			return updatedOrder;
		} else {
			System.out.println("The orders with id " + id + " does not exist");
			throw new OrderNotFoundException("The orders with id " + id + " does not exist");
		}
	}

	@Override
	public void deleteOrder(Integer id) {
		Optional<Orders> dbOrder = orderRepository.findById(id);
		if (dbOrder.isPresent()) {
			orderRepository.deleteById(id);
			System.out.println("Order with id " + id + " has been deleted");
		} else {
			System.out.println("The orders with id " + id + " does not exist");
			throw new OrderNotFoundException("The orders with id " + id + " does not exist");
		}
	}

}
