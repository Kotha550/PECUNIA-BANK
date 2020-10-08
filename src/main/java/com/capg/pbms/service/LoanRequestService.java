package com.capg.pbms.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.pbms.entity.Account;
import com.capg.pbms.entity.LoanRequest;
import com.capg.pbms.repository.ILoanRequestRepository;

@Service
public class LoanRequestService implements ILoanRequestService {
	
	@Autowired
	ILoanRequestRepository loanRequestRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	Random random;
	
	
	
	@Override
	public LoanRequest addLoanRequest(LoanRequest loanRequest) {
		//Account account= 	restTemplate.getForObject("account url"+loanRequest.getLoanAccountNum(), Account.class);
		
		
		
		loanRequest.setLoanRequestId(Integer.toString(random.nextInt(1000000)).substring(0,4));
		
		
		loanRequest.setLoanIssueDate(LocalDateTime.now());
		return loanRequestRepository.save(loanRequest);
	}
	
	
	
	@Override
	public LoanRequest acceptRequest(String loanRequestId, boolean status) {
		LoanRequest loanRequest = loanRequestRepository.getOne(loanRequestId);
		
		loanRequest.setLoanStatus("Active");
		
		Account account= 	restTemplate.getForObject("account url"+loanRequest.getLoanAccountNum(), Account.class);
		
		account.setAccountBalance(account.getAccountBalance()+loanRequest.getLoanAmount());
		account.setLastUpdated(LocalDateTime.now());
		loanRequestRepository.save(loanRequest);
		
		//restTemplate.put(new URI("account url"), account);


		return loanRequest;
	}

	
	@Override
	public List<LoanRequest> getAllLoanReqest() {
		
		return loanRequestRepository.findAll();
	}

	

}



