package com.bank.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanNumber;	
	private long loanAmount;
	private int creditScore;
	private long securityAmount;
	private long pendingAmount;
	private String status;//loanStatus;
	long officerId;
	
	@OneToOne
	@JoinColumn(name="accountNumber")
	Customer customer;
	
	public Loan() {
		// TODO Auto-generated constructor stub
	}
	public long getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(long loanNumber) {
		this.loanNumber = loanNumber;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public long getSecurityAmount() {
		return securityAmount;
	}
	public void setSecurityAmount(long securityAmount) {
		this.securityAmount = securityAmount;
	}
	public long getPendingAmount() {
		return pendingAmount;
	}
	public void setPendingAmount(long pendingAmount) {
		this.pendingAmount = pendingAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setLoanStatus(String loanStatus) {
		this.status = loanStatus;
	}
	public long getOfficerId() {
		return officerId;
	}
	public void setOfficerId(long officerId) {
		this.officerId = officerId;
	}
	
}
