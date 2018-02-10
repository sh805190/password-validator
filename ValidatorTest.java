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
		assertEquals(Validator.correctpassword("QWERQAZQ"),2);
		assertEquals(Validator.correctpassword("QWERQAZqqq"),2);
		assertEquals(Validator.correctpassword("asDC"),2);
		assertEquals(Validator.correctpassword("ascd34rt"),3);
		assertEquals(Validator.correctpassword("abcd34er@"),4);
		assertEquals(Validator.correctpassword("ASDFSADsad"),3);	
		assertEquals(Validator.correctpassword("pas@word"),3);
		assertEquals(Validator.correctpassword("ASDFS$sD1"),5);
	}

}
