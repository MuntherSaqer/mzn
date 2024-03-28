package com.mzn.pos.service;

import java.util.List;

import com.mzn.pos.model.entity.Order;

public interface OrderService {

	Order getOrderById(Long id);

	Order createOrder(Order order);

	Order updateOrder(Long id, Order order);

	void deleteOrder(Long id);

	List<Order> getAllOrders();
}
