package com.banking.dao;

import com.banking.beans.Details;
import com.banking.beans.Transact;

public interface TransactionDao {
	public void withdraw(int amount, Details detail);
	public void deposit(int amount, Details detail);
	public void transfer(int amount, Transact trans);
	public void balanceCheck(Details detail);
}
