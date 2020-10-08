package com.capg.pbms.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loanrequest_table")
public class LoanRequest {

	@Id
	private String loanRequestId;
	private String loanAccountNum;
	private Double loanAmount;
	private String loanType;
	private Double loanRoi;
	private String loanStatus;
	private Long loanEmi;
	private Integer creditScore;
	private LocalDateTime loanIssueDate;
	
	

	public LoanRequest() {
	
	}

	
	public LoanRequest(String loanRequestId, String loanAccountNum, Double loanAmount, String loanType, Double loanRoi,
			String loanStatus, Long loanEmi, Integer creditScore, LocalDateTime loanIssueDate) {
		super();
		this.loanRequestId = loanRequestId;
		this.loanAccountNum = loanAccountNum;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.loanRoi = loanRoi;
		this.loanStatus = loanStatus;
		this.loanEmi = loanEmi;
		this.creditScore = creditScore;
		this.loanIssueDate = loanIssueDate;
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

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Double getLoanRoi() {
		return loanRoi;
	}

	public void setLoanRoi(Double loanRoi) {
		this.loanRoi = loanRoi;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public Long getLoanEmi() {
		return loanEmi;
	}

	public void setLoanEmi(Long loanEmi) {
		this.loanEmi = loanEmi;
	}

	public Integer getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}
	public LocalDateTime getLoanIssueDate() {
		return loanIssueDate;
	}

	public void setLoanIssueDate(LocalDateTime loanIssueDate) {
		this.loanIssueDate = loanIssueDate;
	}

	@Override
	public String toString() {
		return "LoanRequest [loanRequestId=" + loanRequestId + ", loanAccountNum=" + loanAccountNum + ", loanAmount="
				+ loanAmount + ", loanType=" + loanType + ", loanRoi=" + loanRoi + ", loanStatus=" + loanStatus
				+ ", loanEmi=" + loanEmi + ", creditScore=" + creditScore + ", loanIssueDate=" + loanIssueDate + "]";
	}

	
	
	
}

