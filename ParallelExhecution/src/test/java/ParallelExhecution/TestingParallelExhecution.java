package ParallelExhecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingParallelExhecution 
{
	@Test
	public void Shopping()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.close();
	}
	
	@Test
	public void Banking()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swift.techwithjatin.com/login");
		driver.close();
	}
}
