package com.acme.csci3130;

public class Validator {

	
	public static int correctpassword(String password) {
		int x = 0 ;
		
		if(password == null || password.isEmpty()) {
			return 0;
		}
			// its not PASSWORD
		if(! password.equals("password")) {
			x++;
		}
			// length >= 8
		if(password.length() >= 8 ) {
			x++;
		}

		return x;	

	}
	
}
