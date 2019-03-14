package com.banking.beans;

public class Transact {
int transaction_id ;
int fromaccount_no ;
public int getTransaction_id() {
	return transaction_id;
}
public void setTransaction_id(int transaction_id) {
	this.transaction_id = transaction_id;
}
public int getFromaccount_no() {
	return fromaccount_no;
}
public void setFromaccount_no(int fromaccount_no) {
	this.fromaccount_no = fromaccount_no;
}
public int getToaccount_no() {
	return toaccount_no;
}
public void setToaccount_no(int toaccount_no) {
	this.toaccount_no = toaccount_no;
}
public int getAmount_transferred() {
	return amount_transferred;
}
public void setAmount_transferred(int amount_transferred) {
	this.amount_transferred = amount_transferred;
}
int toaccount_no ;
int amount_transferred;
}
