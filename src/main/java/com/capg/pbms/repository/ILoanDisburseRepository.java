package com.capg.pbms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.entity.LoanDisburse;

public interface ILoanDisburseRepository extends JpaRepository<LoanDisburse, String>{
	
	public List<LoanDisburse> findByLoanRequestId(String loanRequestId);
	
}