package com.junitUserRegistrationSystem;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmailTest {
	
	static UserRegistration user;
	
	public static void createUserRegistrationObj(){
		user = new UserRegistration();
		System.out.println("In before class: Email");
	}
	
	@AfterClass
	public static void nullObj(){
		System.out.println("In After class: Email");
		user = null;
	}
	
	@Test
	public void testEmailWithThreeMandatoryFeilds_testAssertionHappy() {
		boolean result = user.email("shubham@gmail.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testEmailWithoutThreeMandatoryFeilds_testAssertionHappy() {
		boolean result = user.email("shubham@.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testEmailWithoutThreeMandatoryFeilds_testAssertionSad() {
		boolean result = user.email("shubham@gmail");
		Assert.assertTrue(result);
	}
	
	
	@Test
	public void testEmailWithThreeMandatoryFeilds_testAssertionSad() {
		boolean result = user.email("shubham@gmil.co");
		Assert.assertFalse(result);
	}
}



