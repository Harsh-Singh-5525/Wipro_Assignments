package com.booking.controller;

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

import com.booking.model.Customer;
import com.booking.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
		//http://localhost:8082/api/customers
		@GetMapping("/customers")
		public List<Customer> getAllCustomers(){
			
			return customerService.getAllCustomers();
		}
		
		//http://localhost:8082/api/customer/id
		@GetMapping("/customer/{id}")
		public Customer getCustomerById(@PathVariable Long id) {
			
			return customerService.getCustomerById(id);
			
		}
		
		//http://localhost:8082/api/customers
		@PostMapping("/customers")
		public Customer createCustomer(@RequestBody Customer customer) {
			
			return customerService.saveCustomer(customer);
			
		}
		
		//http://localhost:8082/api/customers/id
		@PutMapping("/customers/{id}")
		public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
			
			Customer existingMovie = customerService.getCustomerById(id);
			
			existingMovie.setName(customer.getName());
			existingMovie.setEmail(customer.getEmail());
			
			return customerService.saveCustomer(existingMovie);
			
		}
		
		//http://localhost:8082/api/customers/id
		@DeleteMapping("/customers/{id}")
		public String deleteCustomer(@PathVariable Long id) {
			
			customerService.deleteCustomer(id);
			
			return "Customer with "+ id + " is Successfully deleted";	
		}

}
