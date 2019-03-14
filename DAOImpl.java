package com.banking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.banking.beans.Details;
import com.banking.beans.Transact;
import com.banking.service.Basic;
import com.banking.service.Transaction;

public class DAOImpl implements BasicDao {
	Details detail= new Details();
	Transact trans= new Transact();
	String id,password;
	int choice;
	static int amount;
	int account1,account2;
	TransactionDao dao= new DAOImpl1();
	Scanner s= new Scanner(System.in);
	public Connection connect() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CONNECTION","honey@123");
	return con;
	}

	public void login(Details detail) throws Exception {
		
		// TODO Auto-generated method stub
		System.out.println("enter userid");
		id=s.next();
		System.out.println("enter pwd");
		password= s.next();
		Connection con= connect();
		PreparedStatement pst= con.prepareStatement("select * from customer_details");
		ResultSet rst= pst.executeQuery();
		while(rst.next())
		{
			if(rst.getString("Account_no").equalsIgnoreCase(id) && rst.getString("Password").equalsIgnoreCase(password))
			{
				System.out.println("enter choice");
				choice=s.nextInt();
				switch(choice) {
				case 1:dao.balanceCheck(detail); break;
				case 2:System.out.println("enter amount for deposit");
					dao.deposit(amount,detail);break;
				case 3:System.out.println("enter amount for withdraw");
				dao.withdraw(amount,detail);break;
				case 4:
					System.out.println("enter the details of sending person");
					account1=s.nextInt();
					trans.setFromaccount_no(account1);
					System.out.println("enter the details of receiving person");
					account2=s.nextInt();
					trans.setToaccount_no(account2);
					dao.transfer(amount,trans);break;
				}
			}
		}
	}

	public Details register(Details detail) throws Exception {
		// TODO Auto-generated method stub
		Connection con=connect();
		/*PreparedStatement ps2= con.prepareStatement("SQL> select seq_emp.currval from dual");
		ResultSet rs= ps2.executeQuery();
		int i1=rs.getInt(1);*/
		String sqlIdentifier = "select customer_details_SEQ.NEXTVAL from dual";
		PreparedStatement pst = con.prepareStatement(sqlIdentifier);
		synchronized( this ) {
		   ResultSet rs = pst.executeQuery();
		   if(rs.next())
		     detail.setAccount_no(rs.getInt(1));
		PreparedStatement ps= con.prepareStatement("insert into customer_details  values (?,?,?,?,?,?,?)");
	ps.setInt(1,detail.getAccount_no() );
		ps.setString(2,detail.getFirst_name());
		ps.setString(3, detail.getLast_name());
		ps.setString(4, detail.getEmail_id());
		ps.setString(5, detail.getPassword());
		ps.setString(6, detail.getAadhar_no());
		ps.setString(7, detail.getMobile_no());
		ps.setInt(8, detail.getBalance());
		int i= ps.executeUpdate();
		login(detail);
		return detail;
	}

}
}
