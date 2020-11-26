package com.junitUserRegistrationSystem;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EmailTest.class, FirstNameTest.class, LastNameTest.class, MobileNumberTest.class,
		ParameterisedEmailTest.class, PasswordTest.class })

public class AllTests {
	

		
		public static void testBefore() {
			System.out.println("Inside Suite Class: Before");
		}

		@AfterClass
		public static void testAfter() {
			System.out.println("Inside Suite Class: After");
		}
	}



