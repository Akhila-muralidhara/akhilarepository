package testNGbasics;

import org.testng.annotations.Test;

public class priority {
	@Test (priority=-1)
	public void a1 () 
	{
		System.out.println("a1");
	}
	
	@Test (priority =-3)
	public void b1 () {
	
	System.out.println("b1");
}

	
	@Test (priority = -2)
	public void d1() {
		System.out.println("d1");
	}
}
