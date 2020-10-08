package com.capg.pbms.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



import com.capg.pbms.entity.LoanDisburse;
import com.capg.pbms.entity.LoanDisburse;
import com.capg.pbms.entity.LoanRequest;
import com.capg.pbms.repository.ILoanDisburseRepository;
import com.capg.pbms.repository.ILoanRequestRepository;

@Service
public class LoanDisburseService implements ILoanDisburseService {

	@Autowired
	ILoanDisburseRepository loanDisburseRepository;

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	ILoanRequestRepository loanRequestRepository;

	@Autowired
	Random random;
	
	
	
	@Override
	public LoanDisburse addLoanDisburse(LoanDisburse loanDisburse) {
		
		LoanRequest loanRequest = loanRequestRepository.getOne(loanDisburse.getLoanRequestId());
		
		
		Double balance = loanRequest.getLoanAmount() - loanDisburse.getLoanAmountPaid();
		
		
		
		loanRequest.setLoanAmount(balance);
		
		loanDisburse.setLoanDisbursedId(Integer.toString(random.nextInt(1000000)).substring(0, 4));
		
		loanDisburse.setLoanDueDate(loanRequest.getLoanIssueDate().plusMonths(loanRequest.getLoanEmi()));
		
		loanRequestRepository.save(loanRequest);
		
		return loanDisburseRepository.save(loanDisburse);
	}

	
	
	@Override
	public List<LoanDisburse> getAllLoanDisburses() {
		return loanDisburseRepository.findAll();
	}
	
	
	@Override
	public List<LoanDisburse> getAllLoanDisbursesByLoanRequestId(String loanRequestId) {
		return loanDisburseRepository.findByLoanRequestId(loanRequestId);
	}

}


