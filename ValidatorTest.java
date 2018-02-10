package com.acme.csci3130;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidatorTest {

	@Test 
	//Junit test
	public void testValidator() {
		//it is not “password” (case insensitive)
		//it is at least 8 characters long
		assertEquals(Validator.correctpassword("password"),1);
		assertEquals(Validator.correctpassword("afdsqwqe"),1);
		assertEquals(Validator.correctpassword("QWERQAZQ"),0);
		assertEquals(Validator.correctpassword("QWERQAZqqq"),0);	
	}

}
