package ParallelExhecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestingParallelExhecution 
{
	@Test
	public void Shopping()
	{
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--headless");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.close();
	}
	
	@Test
	public void Banking()
	{
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--headless");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swift.techwithjatin.com/login");
		driver.close();
	}
	@Test
	public void Movie()
	{
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--headless");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mkvcinemas.kim/");
		driver.close();

	}

}
