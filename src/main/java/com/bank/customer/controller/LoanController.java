package com.bank.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.customer.Exception.LoanException;
import com.bank.customer.model.Loan;
import com.bank.customer.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {

	@Autowired
	LoanService loanService;
	
	@PostMapping("/loan/apply")
	public ResponseEntity<String> applyLoan(@RequestBody Loan loan){
		String loan1 = loanService.applyLoan(loan);
		return new ResponseEntity<String>(loan1, HttpStatus.OK);
	}
	
	@GetMapping("loans/{status}")
	public ResponseEntity<List<Loan>> getStatus(@PathVariable String status){
		 List<Loan> list = loanService.getByStatus(status);
		return new ResponseEntity<List<Loan>>(list, HttpStatus.OK);
	}
	
	@PutMapping("/loan/approval")
	public String loanApproval(@RequestParam Long accountNumber, @RequestParam Long OfficerId) throws LoanException
	{
		return loanService.loanApproval(accountNumber, OfficerId); 
	}
}
