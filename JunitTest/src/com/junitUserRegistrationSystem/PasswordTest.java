package com.junitUserRegistrationSystem;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordTest {
	
	static UserRegistration user;

	
	public static void createUserRegistrationObj() {
		user = new UserRegistration();
		System.out.println("In before class: Password");
	}

	@AfterClass
	public static void nullObj() {
		System.out.println("In After class: Password");
		user = null;
	}

	@Test
	public void testPasswordWithMinimumEightCharacters_testAssertionHappy() {
		boolean result = user.password1("Sreekarp");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutMinimumEightCharacters_testAssertionHappy() {
		boolean result = user.password1("Sreekar");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithoutMinimumEightCharacters_testAssertionSad() {
		boolean result = user.password1("8545654");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithMinimumEightCharacters_testAssertionSad() {
		boolean result = user.password1("87965646");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithAtleastOneUpperCase_testAssertionHappy() {
		boolean result = user.password2("Sreekarp");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutAtleastOneUpperCase_testAssertionHappy() {
		boolean result = user.password2("sreeka");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithoutAtleastOneUpperCase_testAssertionSad() {
		boolean result = user.password2("kmdklwkas");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithAtleastOneUpperCase_testAssertionSad() {
		boolean result = user.password2("skwndkxS");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithAtleastOneNumeric_testAssertionHappy() {
		boolean result = user.password3("Sreekar09");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutAtleastOneNumeric_testAssertionHappy() {
		boolean result = user.password3("sreeka");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithoutAtleastOneNumeric_testAssertionSad() {
		boolean result = user.password3("kmdklwkasK");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithAtleastOneNumeric_testAssertionSad() {
		boolean result = user.password3("9skwndkx");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithExactlyOneSpecialCharacter_testAssertionHappy() {
		boolean result = user.password4("Sreekar09@");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithoutExactlyOneSpecialCharacter_testAssertionHappy() {
		boolean result = user.password4("sreeka");
		Assert.assertFalse(result);
	}

	@Test
	public void testPasswordWithoutExactlyOneSpecialCharacter_testAssertionSad() {
		boolean result = user.password4("9kmdklwkasK");
		Assert.assertTrue(result);
	}

	@Test
	public void testPasswordWithExactlyOneSpecialCharacter_testAssertionSad() {
		boolean result = user.password4("skwndkx$");
		Assert.assertFalse(result);
	}
}


