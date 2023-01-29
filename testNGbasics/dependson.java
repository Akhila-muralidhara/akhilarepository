package testNGbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependson {
	
	@Test
	public void login()
	{
	
	System.out.println("login");
	Assert.fail();
	}
	
	@Test (dependsOnMethods = "login")
	public void validatenewsfeed() 
	{
		System.out.println("validate news feed");
		
	}
	@Test 
	public void validateRequest()
	{
		System.out.println("validate request");
	}
@Test (dependsOnMethods = { "login", "validateRequest"})
public void acceptRequest()
{
	System.out.println ("Accept request");
}
}
