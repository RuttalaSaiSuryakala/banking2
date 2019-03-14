package com.banking.service;

import com.banking.beans.Details;

public interface Transaction {
public void withdraw(int amount,Details detail);
public void deposit(int amount,Details detail);
public void transfer(int amount,Details detail);
public void balanceCheck(Details detail);
}
