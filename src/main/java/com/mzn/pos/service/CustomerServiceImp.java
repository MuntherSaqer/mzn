package com.mzn.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzn.pos.model.entity.Customer;
import com.mzn.pos.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository; 
    
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    
    @Override
    public List<Customer> createCustomers(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

	@Override
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        Customer existingCustomer = customerRepository.findById(id)
                                    .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));

        Customer updatedCustomer = Customer.builder()
                .id(existingCustomer.getId()) 
                .name(customer.getName())
                .email(customer.getEmail()) 
                .phone(customer.getPhone()) 
                .address(customer.getAddress()) 
                .build();

        return customerRepository.save(updatedCustomer);
    }


	@Override
	public void deleteCustomer(Long id) {
	    customerRepository.deleteById(id);
	}

}
