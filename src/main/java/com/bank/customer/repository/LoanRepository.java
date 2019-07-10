package com.bank.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.customer.model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>{

	}
