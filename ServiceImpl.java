package com.banking.service;

import com.banking.beans.Details;
import com.banking.dao.BasicDao;
import com.banking.dao.DAOImpl;
import com.banking.dao.DAOImpl1;
import com.banking.dao.TransactionDao;

public class ServiceImpl implements Basic {
	BasicDao dao= new DAOImpl();

	
	public void login(Details detail) throws Exception {
		// TODO Auto-generated method stub
		dao.login(detail);
		
	}

	public Details register(Details detail) throws Exception {
		// TODO Auto-generated method stub
		dao.register(detail);
		return detail;
	}

	

}
