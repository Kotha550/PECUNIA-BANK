package com.capg.pbms.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loandisbursed_table")
public class LoanDisburse {

	@Id
	private String loanDisbursedId;
	private String loanRequestId;
	private String loanAccountNum;
	private Double loanAmount;
	private Double loanAmountPaid; 
	private LocalDateTime loanDueDate;
	
	
	public LoanDisburse() {
	
	}


	public LoanDisburse(String loanDisbursedId, String loanRequestId, String loanAccountNum, Double loanAmount,
			Double loanAmountPaid, LocalDateTime loanDueDate) {
		super();
		this.loanDisbursedId = loanDisbursedId;
		this.loanRequestId = loanRequestId;
		this.loanAccountNum = loanAccountNum;
		this.loanAmount = loanAmount;
		this.loanAmountPaid = loanAmountPaid;
		this.loanDueDate = loanDueDate;
		
	}

	
	
	public String getLoanDisbursedId() {
		return loanDisbursedId;
	}


	public void setLoanDisbursedId(String loanDisbursedId) {
		this.loanDisbursedId = loanDisbursedId;
	}


	public String getLoanRequestId() {
		return loanRequestId;
	}

	public void setLoanRequestId(String loanRequestId) {
		this.loanRequestId = loanRequestId;
	}

	public String getLoanAccountNum() {
		return loanAccountNum;
	}

	public void setLoanAccountNum(String loanAccountNum) {
		this.loanAccountNum = loanAccountNum;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Double getLoanAmountPaid() {
		return loanAmountPaid;
	}

	public void setLoanAmountPaid(Double loanAmountPaid) {
		this.loanAmountPaid = loanAmountPaid;
	}

	public LocalDateTime getLoanDueDate() {
		return loanDueDate;
	}

	public void setLoanDueDate(LocalDateTime loanDueDate) {
		this.loanDueDate = loanDueDate;
	}

	
	@Override
	public String toString() {
		return "LoanDisburseb [loanRequestId=" + loanRequestId + ", loanAccountNum=" + loanAccountNum + ", loanAmount="
				+ loanAmount + ", loanAmountPaid=" + loanAmountPaid + ", loanDueDate=" + loanDueDate + "]";
	}
	
	
}
