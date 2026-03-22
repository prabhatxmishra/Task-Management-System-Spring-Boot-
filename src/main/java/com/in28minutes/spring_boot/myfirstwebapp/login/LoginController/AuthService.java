package com.in28minutes.spring_boot.myfirstwebapp.login.LoginController;

import org.springframework.stereotype.Service;

@Service
class AuthService {

	  boolean authenticate(String username, String password)
	  {
		
		  boolean isValusername=username.equalsIgnoreCase("prabhat");
		  boolean isValpassword=password.equalsIgnoreCase("Tisha");
		  
		  return isValusername && isValpassword;
	  }
}
