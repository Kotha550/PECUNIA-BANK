package com.capg.pbms.service;

import java.util.List;

import com.capg.pbms.entity.LoanDisburse;

public interface ILoanDisburseService {
	
	LoanDisburse addLoanDisburse(LoanDisburse loanDisburse);
	
	List<LoanDisburse> getAllLoanDisburses();

	List<LoanDisburse> getAllLoanDisbursesByLoanRequestId(String LoanRequestId);
}


