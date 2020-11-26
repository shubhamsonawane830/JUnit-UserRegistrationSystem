package com.junitUserRegistrationSystem;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MobileNumberTest {
	
	static UserRegistration user;
	
	public static void createUserRegistrationObj(){
		user = new UserRegistration();
		System.out.println("In before class: Mobile Number");
	}
	
	@AfterClass
	public static void nullObj(){
		System.out.println("In After class: Mobile Number");
		user = null;
	}
	
	@Test
	public void testMobileNumberWithTwoMandatoryFeilds_testAssertionHappy() {
		boolean result = user.mobileNum("+91 8888999777");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testMobileNumberWithoutTwoMandatoryFeilds_testAssertionHappy() {
		boolean result = user.mobileNum("9876543210");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testMobileNumberWithoutTwoMandatoryFeilds_testAssertionSad() {
		boolean result = user.mobileNum("89543210");
		Assert.assertTrue(result);
	}
	
	
	@Test
	public void testMobileNumberWithTwoMandatoryFeilds_testAssertionSad() {
		boolean result = user.mobileNum("+91 8796560000");
		Assert.assertFalse(result);
	}
}



