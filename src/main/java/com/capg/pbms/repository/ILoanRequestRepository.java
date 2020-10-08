package com.capg.pbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.entity.LoanRequest;

public interface ILoanRequestRepository extends JpaRepository<LoanRequest, String>{

}