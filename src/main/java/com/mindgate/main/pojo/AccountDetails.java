package com.mindgate.main.pojo;

import java.time.LocalDate;

public class AccountDetails {

	private CustomerDetails customerDetails;
	private LocalDate openingDate;
	private long accountNo;
	private double currentBalance;
	private int minimumBalance;
	private float rateOfInterset;
	private double overDraft;
	private LocalDate validity;
	private String accountType;

	public AccountDetails() {

	}

	public AccountDetails(CustomerDetails customerDetails, LocalDate openingDate, long accountNo, double currentBalance,
			int minimumBalance, float rateOfInterset, double overDraft, LocalDate validity, String accountType) {
		super();
		this.customerDetails = customerDetails;
		this.openingDate = openingDate;
		this.accountNo = accountNo;
		this.currentBalance = currentBalance;
		this.minimumBalance = minimumBalance;
		this.rateOfInterset = rateOfInterset;
		this.overDraft = overDraft;
		this.validity = validity;
		this.accountType = accountType;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public int getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public float getRateOfInterset() {
		return rateOfInterset;
	}

	public void setRateOfInterset(float rateOfInterset) {
		this.rateOfInterset = rateOfInterset;
	}

	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}

	public LocalDate getValidity() {
		return validity;
	}

	public void setValidity(LocalDate validity) {
		this.validity = validity;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "AccountDetails [customerDetails=" + customerDetails + ", openingDate=" + openingDate + ", accountNo="
				+ accountNo + ", currentBalance=" + currentBalance + ", minimumBalance=" + minimumBalance
				+ ", rateOfInterset=" + rateOfInterset + ", overDraft=" + overDraft + ", validity=" + validity
				+ ", accountType=" + accountType + "]";
	}

}
