package com.banking.service;

import com.banking.beans.Details;
import com.banking.dao.DAOImpl1;
import com.banking.dao.TransactionDao;

public class ServiceImpl1 implements Transaction {
TransactionDao trans= new DAOImpl1();
	public void withdraw(int amount,Details detail) {
		// TODO Auto-generated method stub
		trans.withdraw(amount, detail);

	}

	public void deposit(int amount,Details detail) {
		// TODO Auto-generated method stub
trans.deposit(amount, detail);
	}

	public void transfer(int amount,Details detail) {
		// TODO Auto-generated method stub
trans.deposit(amount, detail);
	}

	public void balanceCheck(Details detail) {
		// TODO Auto-generated method stub

	}

}
