package com.bank.customer.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bank.customer.service.OfficerService;

@RestController
@RequestMapping("/officer")
public class OfficerController {

	@Autowired
	OfficerService officerService;
	

}
