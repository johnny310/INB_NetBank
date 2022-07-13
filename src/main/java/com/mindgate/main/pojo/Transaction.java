package com.mindgate.main.pojo;

import java.time.LocalDate;

public class Transaction {

	private AccountDetails accountDetails;
	private long accountNo;
	private String typeOfTransaction;
	private long transactionId;
	private long amount;
	private LocalDate dateAndTime;

	public Transaction() {

	}

	public Transaction(AccountDetails accountDetails, long accountNo, String typeOfTransaction, long transactionId,
			long amount, LocalDate dateAndTime) {
		super();
		this.accountDetails = accountDetails;
		this.accountNo = accountNo;
		this.typeOfTransaction = typeOfTransaction;
		this.transactionId = transactionId;
		this.amount = amount;
		this.dateAndTime = dateAndTime;
	}

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getTypeOfTransaction() {
		return typeOfTransaction;
	}

	public void setTypeOfTransaction(String typeOfTransaction) {
		this.typeOfTransaction = typeOfTransaction;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public LocalDate getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(LocalDate dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	@Override
	public String toString() {
		return "Transaction [accountDetails=" + accountDetails + ", accountNo=" + accountNo + ", typeOfTransaction="
				+ typeOfTransaction + ", transactionId=" + transactionId + ", amount=" + amount + ", dateAndTime="
				+ dateAndTime + "]";
	}

}
