package com.arjun.service;

import com.arjun.dao.LoginDAO;

public class LoginService {

	public Boolean loginAction(String userName, String password) {
		
		return new LoginDAO().loginDbCheck(userName, password);
	}
	
	
}
