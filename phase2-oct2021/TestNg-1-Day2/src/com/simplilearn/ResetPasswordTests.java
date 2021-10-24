package com.simplilearn;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ResetPasswordTests {

	
	@BeforeTest
	public void beftest() {
		System.out.println(" before test resetpass...");
	}
	

	
	@AfterTest
	public void bafttest() {
		System.out.println(" after test resetpass...");
	}
	
	
	
	@Test
	public void testUserIsAbleToResetPasswordViaEmail() {
	
		System.out.println("testUserIsAbleToResetPasswordViaEmail running");
	}
	

	@Test
	public void testUserIsAbleToResetPasswordViaSMS() {
		System.out.println("testUserIsAbleToResetPasswordViaSMS running");
		
		
	}
	
	
	
	
}
