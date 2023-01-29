package testNGbasics;

import org.testng.annotations.Test;

public class groupBy {
	
	@Test (groups = "smoke")
	public void  validateLogin()
	{
		System.out.println("validate login");
	}
	@Test (groups = {"regression", "reports"})
	public void  validateTitle()
	{
		System.out.println("validate title");
	}
	@Test (groups ="smoke")
	public void  monthlyReport()
	{
		System.out.println("monthly report");
	}
	@Test (groups = {"reports", "smoke"})
	public void  annualReport()
	{
		System.out.println("annual report");
	}

	@Test (groups ="reports")
	public void  SendReq()
	{
		System.out.println("send request");
	}
	@Test (groups ="reports")
	public void  AcceptReq()
	{
		System.out.println("accept request");
	}
}
