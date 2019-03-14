package com.banking.UI;

import java.util.Scanner;

import com.banking.beans.Details;
import com.banking.service.Basic;
import com.banking.service.ServiceImpl;
import com.banking.service.ServiceImpl1;
import com.banking.service.Transaction;

public class MainUI {
	Details detail= new Details();
	Scanner s= new Scanner(System.in);
	Basic basic= new ServiceImpl();

	Details detail1= new Details();
	Transaction transaction= new ServiceImpl1();
	Details display()
{
	System.out.println("enter firstname");
	detail.setFirst_name(s.next());
	System.out.println("enter last name");
	detail.setLast_name(s.next());
	System.out.println("enter emailid");
	detail.setEmail_id(s.next());
	System.out.println("enter password");
	detail.setPassword(s.next());
	System.out.println("enter aadharno");
	detail.setAadhar_no(s.next());
	System.out.println("enter mobile no");
	detail.setMobile_no(s.next());
	detail.setBalance(0);
	return detail;
	
}
	void choice() throws Exception
	{
		detail1=basic.register(display());
//System.out.println("your account no is "+detail1.getAccount_no());
		
	}
	public static void main(String args[]) throws Exception
	{
		MainUI main= new MainUI();
		main.choice();
	}
}
