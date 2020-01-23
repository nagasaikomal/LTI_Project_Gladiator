package com.lti.service;

import com.lti.dao.CredentialsDao;
import com.lti.dao.CredentialsDaoImpl;

public class CredentialsServiceImpl implements CredentialsService {
	
	private CredentialsDao dao;

	public CredentialsServiceImpl() {
		super();
		dao=new CredentialsDaoImpl();
	}

	@Override
	public int readPassenger(String username, String password) {
		int value=dao.readPassenger(username, password);
		return value;
		

	}

}
