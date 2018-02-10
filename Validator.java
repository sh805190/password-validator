package com.acme.csci3130;
import java.util.regex.Pattern;
public class Validator {

	
	public static int correctpassword(String password) {
		int x = 0 ;
		
		if(password == null || password.isEmpty()) {
			return 0;
		}
			// its not "password"
		if(! password.equals("password")) {
			x++;
		}
			// length >= 8
		if(password.length() >= 8 ) {
			x++;
		}

		//check have special characters
		if(password.indexOf('!') != -1 || password.indexOf('#') != -1 
				|| password.indexOf('@') != -1 || password.indexOf('%') != -1
				|| password.indexOf('$') != -1 || password.indexOf('*') != -1
				|| password.indexOf('^') != -1 || password.indexOf('&') != -1 ) {
			x ++;
		}
		
		//check if string is at-least one digit
		if(Pattern.compile("[0-9]").matcher(password).find()){
			x++;
		}
		
		//check if string has both upper and lower case
		if(Pattern.compile("[a-z]").matcher(password).find() && Pattern.compile("[A-Z]").matcher(password).find()) {		
			x++;
		}
		return x;
		}
	
}
