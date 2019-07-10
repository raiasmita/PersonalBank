package com.bank.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.customer.model.Customer;
import com.bank.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired 
	CustomerService customerService;

	@PostMapping("/customer")
	public ResponseEntity<Object> addCustomer(@RequestBody Customer customer){
		Customer cust = (Customer) customerService.addCustomer(customer);
		return new ResponseEntity<Object>(cust, HttpStatus.OK);
	}
	
}
