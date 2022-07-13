package com.mindgate.main.pojo;

public class Cheque {

	private Transaction transaction;
	private long chequeNo;

	public Cheque() {

	}

	public Cheque(Transaction transaction, long chequeNo) {
		super();
		this.transaction = transaction;
		this.chequeNo = chequeNo;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public long getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(long chequeNo) {
		this.chequeNo = chequeNo;
	}

	@Override
	public String toString() {
		return "Cheque [transaction=" + transaction + ", chequeNo=" + chequeNo + "]";
	}

}
