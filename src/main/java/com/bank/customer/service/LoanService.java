package com.bank.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.Exception.LoanException;
import com.bank.customer.model.Customer;
import com.bank.customer.model.Loan;
import com.bank.customer.repository.LoanRepository;

@Service
public class LoanService {

	@Autowired
	LoanRepository loanRepo;
	
	public String applyLoan(Loan loan) {
		if(loanRepo.save(loan) != null) {
			return "Loan apllied!! kindly wait for approval";
		}
		else {
			return "Loan has not applied..Try again";
		}
	}
	
	public List<Loan> getByStatus(String status){
		return loanRepo.findAll();
	}
	
	public String loanApproval(Long accountNumber, Long OfficerId) throws LoanException {
		Customer customer = new Customer();
		Loan loan = new Loan();
		 if(loan.getSecurityAmount() == 2*loan.getLoanAmount()) {
				if(loan.getCreditScore()>=600) {
					
					if(customer.getAge()>=24 && customer.getAge()<60) {
						
						if(customer.getMaritalStatus().equals("married") && (customer.getAge()>=24 && customer.getAge()<29)) {
							
							loan.setLoanStatus("Approved");
							
						}else {
							loan.setLoanStatus("Rejected");
							throw new LoanException("If you are married and your age is between 24 to 29");
						}
					}else {
						loan.setLoanStatus("Rejected");
						throw new LoanException("Age should have maximum age of 60 and minimum of 24");
					}
					
				}else {
					loan.setLoanStatus("Rejected");
					throw new LoanException("Customer cannot have less than 600 Credit Score");
				}
				
			}else {
				loan.setLoanStatus("Rejected");
				throw new LoanException("Security valued should be double the loan amount ");
			}
	return null;
				
     }
}

