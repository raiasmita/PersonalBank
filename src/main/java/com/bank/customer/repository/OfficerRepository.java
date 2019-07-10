package com.bank.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.customer.model.Officer;

@Repository
public interface OfficerRepository extends JpaRepository<Officer, Long>{

}
