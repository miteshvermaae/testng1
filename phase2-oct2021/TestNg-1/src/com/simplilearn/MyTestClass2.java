package com.simplilearn;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestClass2 {

	
	@BeforeSuite
	public void beforeSuiteMethod() {
		
		System.out.println("this is  beofre suite method....");
		System.out.println("start the browser....");
		
		boolean envIsUp = CommonLib.checkEnv();
		Assert.assertTrue(envIsUp," Env is not up! aborting suite");
		
		//browser is there
		//db is up
		//aws is up
	}
	

	@AfterSuite
	public void afterSuiteMethod() {
		
		System.out.println("this is  after suite method....");
		System.out.println("close the browser....");
	}
	
	
	@BeforeTest
	public void beftest() {
		System.out.println(" before test...");
		Assert.assertTrue(false);
	}
	

	
	@AfterTest
	public void bafttest() {
		System.out.println(" after test...");
	}
	
	
	
	@Test
	public void test2_1() {
	
		System.out.println("this is test2_1 running");
	}
	

	@Test
	public void test2_2() {
		System.out.println("this is test 2_2 running");
		
		
	}
	


	@Test
	public void test2_3() {
		System.out.println("this is test 2_3 running");
		
	}
	
	@Test
	public void test2_4() {
		System.out.println("this is test 2_4 running");
		
		int n1=10, n2=20;
		int sum = n1+n2;
		
		
		Assert.assertEquals(sum, 31);
		
		
}
	
	
	@Test
	public void test2_5() {
		System.out.println("this is test 2_4 running");
		
		int n1=10, n2=20;
		int sum = n1+n2;
		
		
		Assert.assertTrue(  sum >20   );  //pass
		
		Assert.assertFalse(  sum >20 , "sum is not expected to be greater than 20"    ); //fail
		
		
}
	
	

	

	
	
	
	
	
}
