package com.mzn.pos.service;

import java.util.List;

import com.mzn.pos.model.entity.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();

	Customer createCustomer(Customer customer);

	List<Customer> createCustomers(List<Customer> customers);

	Customer getCustomerById(Long id);

	Customer updateCustomer(Long id, Customer customer);

	void deleteCustomer(Long id);
}
