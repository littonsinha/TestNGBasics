package testNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReportsLog4J 
{
	static WebDriver driver;
	String URL = "http://newtours.demoaut.com/";
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "..\\MavenSelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.name("userName")).sendKeys("sinha.litton@gmail.com");
		driver.findElement(By.name("password")).sendKeys("India@123");
		driver.findElement(By.name("login")).click();
	}

}
