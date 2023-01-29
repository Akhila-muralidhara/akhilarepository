package testNGbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	@BeforeSuite 
	public void ConnectingDb()
	{
		System.out.println("Before Suite - connecting db");
	}
	
	@BeforeTest
	
	public void TestingConfiguration () {
		
		System.out.println("before test - testing configuration");
	}
		
		@BeforeClass
		public void TestingConfigurationBrowser()
		{
			System.out.println("before class- testing configuration browser");
		}
			
			@BeforeMethod
			
			public void LaunchBrowserApplication()
			{
				System.out.println ("Before Method - launch browser application");
			
		
	}
	@Test
	public void ValidateLogin()
	{
		System.out.println("Validate Login TC");
	}

	@AfterSuite
	public void ClosingDb()
	
	{
		System.out.println("After Suite - closing db connection");
	}
	
	@AfterTest
	public void closingconnection()
	{
		System.out.println("Aftertest = closing connection");
	}
	
	@AfterClass
	public void cacheclear()
	{
		System.out.println("afterclass - cacheclear");
	}
	@AfterMethod
	
	
	public void closebrowserandapplication()
	{
		System.out.println("after method - close browserand application");
	}
	
	@Test
	public void Validatelogin2()
	{
		System.out.println ("validating login tc 2");
	}
	}

