package com.mzn.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzn.pos.model.entity.Order;
import com.mzn.pos.repository.OrderRepository;

@Service
public class OrderServiceImp implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                              .orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Long id, Order order) {
        Order existingOrder = getOrderById(id);
        Order updatedOrder = Order.builder()
                .id(existingOrder.getId())
                .customer(order.getCustomer()) 
                .products(order.getProducts()) 
                .build();

        return orderRepository.save(updatedOrder);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
