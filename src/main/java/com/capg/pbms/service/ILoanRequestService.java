package com.capg.pbms.service;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.web.client.RestClientException;

import com.capg.pbms.entity.LoanRequest;

public interface ILoanRequestService {

	LoanRequest addLoanRequest(LoanRequest loanRequest);
	
	LoanRequest acceptRequest(String loanRequestId, boolean status)throws RestClientException, URISyntaxException;
	
	List<LoanRequest> getAllLoanReqest();
	
}
