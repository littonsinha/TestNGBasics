package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicXPath
{
	static WebDriver driver;
	static String URL = "https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&ignoreAuthState=1&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&prevRID=EF81G7XEMCMAR8C95XW1&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
	@BeforeMethod
	public void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "..\\MavenSelenium\\Drivers\\chromedriver.exe");
			
		} catch (Exception e)
		{
			e.printStackTrace();
			//System.out.println("Chrome driver is not available...please check...");
		}
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void enterText()
	{
		driver.get(URL);
		driver.findElement(By.id("ap_customer_name")).sendKeys("Litton Sinha");
		driver.findElement(By.id("auth-country-picker-container")).click();
		List<WebElement> listOfCodes = driver.findElements(By.xpath("//*[@id=\"auth-country-picker_0]"));
		
		
	}
	@AfterMethod
	public void close()
	{
	//	driver.quit();
	}

}