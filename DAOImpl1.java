package com.banking.dao;

import com.banking.beans.Details;
import com.banking.beans.Transact;

public class DAOImpl1 implements TransactionDao {
	Details detail= new Details();

	
	public void transfer(int amount, Transact trans) {
		// TODO Auto-generated method stub
		
	}

	public void balanceCheck(Details detail) {
		// TODO Auto-generated method stub
		System.out.println(detail.getBalance());
		
	}

	public void withdraw(int amount, Details detail) {
		// TODO Auto-generated method stub
		detail.setBalance(detail.getBalance()-amount);
		System.out.println(detail.getBalance());
		
	}

	public void deposit(int amount, Details detail) {
		// TODO Auto-generated method stub
		detail.setBalance(detail.getBalance()+amount);
		System.out.println(detail.getBalance());

	}



}
