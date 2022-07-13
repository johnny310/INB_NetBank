package com.mindgate.main.pojo;

import java.time.LocalDate;

public class BankSlip {

	private Transaction transaction;
	private LocalDate slipDate;
	private Cheque cheque;
	private long payerAccountNo;
	private long amount;

	public BankSlip() {

	}

	public BankSlip(Transaction transaction, LocalDate slipDate, Cheque cheque, long payerAccountNo, long amount) {
		super();
		this.transaction = transaction;
		this.slipDate = slipDate;
		this.cheque = cheque;
		this.payerAccountNo = payerAccountNo;
		this.amount = amount;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public LocalDate getSlipDate() {
		return slipDate;
	}

	public void setSlipDate(LocalDate slipDate) {
		this.slipDate = slipDate;
	}

	public Cheque getCheque() {
		return cheque;
	}

	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}

	public long getPayerAccountNo() {
		return payerAccountNo;
	}

	public void setPayerAccountNo(long payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BankSlip [transaction=" + transaction + ", slipDate=" + slipDate + ", cheque=" + cheque
				+ ", payerAccountNo=" + payerAccountNo + ", amount=" + amount + "]";
	}

}
