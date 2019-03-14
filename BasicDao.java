package com.banking.dao;

import com.banking.beans.Details;

public interface BasicDao {
	public Details register(Details detail) throws Exception;
	public void login(Details detail) throws Exception;
}
