package com.capg.pbms.controller;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.capg.pbms.entity.LoanDisburse;
import com.capg.pbms.entity.LoanRequest;
import com.capg.pbms.service.ILoanDisburseService;
import com.capg.pbms.service.ILoanRequestService;

@CrossOrigin
@RestController
@RequestMapping("/loan")
public class PecuniaRestController {

	

	@Autowired
	ILoanRequestService loanRequestService;
	
	@Autowired
	ILoanDisburseService loanDisbursedService;
	
	
	@PostMapping("/addloanrequest")
	public LoanRequest addLoanRequest(@RequestBody LoanRequest loanRequest) 
	{
		return loanRequestService.addLoanRequest(loanRequest);
	}
	
	
	@PutMapping("/acceptloanrequest/{loanRequestId}/{status}")
	public LoanRequest acceptLoanRequest(@PathVariable String loanRequestId, boolean status)throws RestClientException, URISyntaxException
	{
		return loanRequestService.acceptRequest(loanRequestId, status);
	}
	
	
	
	@GetMapping("/getallloans")
	public List<LoanRequest> getAllLoans(){
		return loanRequestService.getAllLoanReqest();
	}
	
	
	@PostMapping("/addloandisbursed")
	public LoanDisburse addLoanDisbursed(@RequestBody LoanDisburse loanDisburse) 
	{
		return loanDisbursedService.addLoanDisburse(loanDisburse);
	}
	
	
	
	@GetMapping("/getallloandisburses")
	public List<LoanDisburse> getAllLoanDisburse(){
		return loanDisbursedService.getAllLoanDisburses();
	}

	
	
	@GetMapping("/getalloandisburses-bylaonrequestid/{loanRequestId}")
	public List<LoanDisburse> getAllLoanDisbursedByLoanRequestId(@PathVariable String loanRequestId )
	{
		return loanDisbursedService.getAllLoanDisbursesByLoanRequestId(loanRequestId);
	}
}

