package com.junitUserRegistrationSystem;
import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean firstName(String firstName) {
		boolean fname = Pattern.matches("^[A-Z]([a-z]{2,})$", firstName);
		return fname;
	}

	public static boolean lastName(String lastName) {
		boolean lname = Pattern.matches("^[A-Z]([a-z]{2,})$", lastName);
		return lname;
	}

	public static boolean email(String mail) {
		boolean email = Pattern.matches("^[A-Za-z0-9]+([._%+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+([.]([a-zA-Z]{2,3})*)+$", mail);
		return email;
	}

	public static boolean mobileNum(String mNum) {
		boolean mobileNum = Pattern.matches("^[+]*([0-9]{1,3})+[[:space:]]+[0-9]{10}$", mNum);
		return mobileNum;
	}

	public static boolean password1(String password) {
		boolean pwd1 = Pattern.matches("^([0-9a-zA-Z@#!]){8,}$", password);
		return pwd1;
	}

	public static boolean password2(String password) {
		boolean pwd2 = Pattern.matches("^([a-z0-9@#!]*)[A-Z]+([a-z0-9@#!]*)$", password);
		return pwd2;
	}

	public static boolean password3(String password) {
		boolean pwd3 = Pattern.matches("^([a-zA-Z@#!]*)[0-9]+([a-zA-Z@#!]*)$", password);
		return pwd3;
	}

	public static boolean password4(String password) {
		boolean pwd4 = Pattern.matches("^([a-zA-Z0-9]*)[@#!$]{1}([a-zA-Z0-9]*)$", password);
		return pwd4;
	}
}

