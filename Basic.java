package com.banking.service;

import com.banking.beans.Details;

public interface Basic {
public Details register(Details detail) throws Exception;
public void login(Details detail) throws Exception;
}
