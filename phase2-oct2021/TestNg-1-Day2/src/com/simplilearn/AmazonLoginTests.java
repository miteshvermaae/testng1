package com.simplilearn;

import javax.management.RuntimeErrorException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonLoginTests {

	public static boolean env1Passed=false;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("doing some setup");
		
		throw new RuntimeException("some unknown err....");
	}
	

	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		System.out.println("cleanup.... setup");
	}
	
	
	@Test
	public void userLoginTest() {
	
		System.out.println("userLoginTest");
	}
	


	@Test(priority=-100,enabled=false)
	public void axminLoginTest() {
	
		System.out.println("axminLoginTest");
	}

	@Test(priority=1,enabled=false)
	public void aaminLoginTest() {
	
		System.out.println("aaminLoginTest");
	}
	
	
	@Test
	public void userLogoutTest() {
	
		System.out.println("userLogoutTest");
	}
	

	
	@Test(priority=-500)
	public void adminLoginTest() {
	
		System.out.println("adminLoginTest");
		
		//Assert.assertTrue(3>10);
		
		//throw new RuntimeException("some erro");
	}
	
	
	@Test(dependsOnMethods="adminLoginTest" )
	public void adminDashboardTest() {
	
		System.out.println("adminDashboardTest");
		Assert.assertEquals(10, 20);
	}
	

	@Test(priority=-600, dependsOnMethods= {"adminLoginTest","adminDashboardTest"})
	public void adminLogoutTest() {
	
		System.out.println("adminLogoutTest");
	}
	
	@Test(timeOut=4000)
	public void longRunningTesCase() throws Throwable {
		
		System.out.println("api call started..");
		
		
		///code execution
		 Thread.sleep(10000);
		
		System.out.println("api call completed");
		
	}
	
	
	@Test
	public void parentTest() {
		try{
			System.out.println("parent test");
		
//		Assert.assertEquals(1, 2);
		
		env1Passed=true;
		}catch(Exception e) {
			env2_parentTest();
		}
	}

	@Test(dependsOnMethods="parentTest",alwaysRun=true)
	public void childTest() {
		System.out.println("child test");
	}
	
	
	public void env2_parentTest() {
		if(!env1Passed) {
		System.out.println("env2 parent test");
		}
	}
	
	
	
}
