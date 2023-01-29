package testNGbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class detailproviderdemo {
@Test (dataProvider = "getData")
	
	public void validateLogin(String username,  String password) {
	WebDriver driver = new ChromeDriver ();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println("username");
	System.out.println("password");
	driver.close();
}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="hr";
		data[1][1]="hr123";
		
		data[2][0]="finance";
		data[2][1]="finance 123";
		return data;
		
		
	}

}
