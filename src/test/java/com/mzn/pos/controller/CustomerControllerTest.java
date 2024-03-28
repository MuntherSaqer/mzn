package com.mzn.pos.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mzn.pos.model.entity.Customer;
import com.mzn.pos.service.CustomerService;

@SpringBootTest
class CustomerControllerTest {

	@Mock
	private CustomerService customerServiceMock;

	@InjectMocks
	private CustomerController customerController;

	@Test
	void testCreateCustomer() {
	    // Create mock customer
	    Customer mockCustomer = new Customer(1L, "John", "john@example.com", "123456789", "123 Main St");

	    // Stub the service method
	    when(customerServiceMock.createCustomer(any(Customer.class))).thenReturn(mockCustomer);

	    // Call the controller method
	    ResponseEntity<Customer> responseEntity = customerController.createCustomer(mockCustomer);
	    Customer result = responseEntity.getBody(); // Extract the Customer object from ResponseEntity

	    // Verify the result
	    assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
	    assertEquals(mockCustomer, result);
	}

	@Test
	void testUpdateCustomer() {
	    // Create mock customer
	    Customer mockCustomer = new Customer(1L, "John", "john@example.com", "123456789", "123 Main St");

	    // Stub the service method
	    when(customerServiceMock.updateCustomer(eq(1L), any(Customer.class))).thenReturn(mockCustomer);

	    // Call the controller method
	    ResponseEntity<Customer> responseEntity = customerController.updateCustomer(1L, mockCustomer);
	    Customer result = responseEntity.getBody(); // Extract the Customer object from ResponseEntity

	    // Verify the result
	    assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	    assertEquals(mockCustomer, result);
	}


	@Test
	void testDeleteCustomer() {
		// Call the controller method
		customerController.deleteCustomer(1L);

		// Verify that the service method is called
		verify(customerServiceMock, times(1)).deleteCustomer(1L);
	}
}
