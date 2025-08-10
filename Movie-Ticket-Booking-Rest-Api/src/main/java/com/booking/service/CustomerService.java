package com.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.model.Customer;
import com.booking.repo.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	
	public List<Customer> getAllCustomers(){
		return customerRepo.findAll();
	}

	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public Customer getCustomerById(Long id) {
		return customerRepo.findById(id).get();
	}
	
	public void deleteCustomer(Long id) {
		customerRepo.deleteById(id);
	}
}
