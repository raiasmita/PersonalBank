package com.bank.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.model.Customer;
import com.bank.customer.repository.CustomerRepository;
@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepo;
	
	public Object addCustomer(Customer customer) {
		if(customerRepo.save(customer) != null) {
			return "User Registered!!";
		}else {
			return "Something went wrong!! Please try again";
		}			
	}
}
