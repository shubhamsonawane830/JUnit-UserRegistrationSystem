package com.junitUserRegistrationSystem;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class LastNameTest {
	
	static UserRegistration user;

	
	public static void createUserRegistrationObj() {
		user = new UserRegistration();
		System.out.println("In before class: Last Name");
	}

	@AfterClass
	public static void nullObj() {
		System.out.println("In After class: Last Name");
		user = null;
	}

	@Test
	public void testLasttNameWithFirstLetterCapital_testAssertionHappy() {
		boolean result = user.lastName("Sonawane");
		Assert.assertTrue(result);
	}

	@Test
	public void testLastNameWithoutFirstLetterCapital_testAssertionHappy() {
		boolean result = user.lastName("Sonawane");
		Assert.assertFalse(result);
	}

	@Test
	public void testLastNameWithoutFirstLetterCapital_testAssertionSad() {
		boolean result = user.lastName("Sonawane");
		Assert.assertTrue(result);
	}

	@Test
	public void testLastNameWithFirstLetterCapital_testAssertionSad() {
		boolean result = user.lastName("Sonawane");
		Assert.assertFalse(result);
	}
}

