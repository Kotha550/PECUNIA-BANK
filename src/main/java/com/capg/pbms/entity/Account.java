package com.capg.pbms.entity;

import java.time.LocalDateTime;

import javax.persistence.Id;

public class Account {
	@Id
	private String accountId;
	
	private String accountType;
	
	private String accountStatus;
	
	private double accountBalance;
	
	private double accountInterest;
	
	private LocalDateTime lastUpdated;
	


	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getAccountInterest() {
		return accountInterest;
	}

	public void setAccountInterest(double accountInterest) {
		this.accountInterest = accountInterest;
	}

	
	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	

}
