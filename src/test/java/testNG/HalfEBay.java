package testNG;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfEBay
{
	static Properties prop;
	static WebDriver driver;
	static FileInputStream fis;
	
	@DataProvider
	public void getTestData()
	{
		
	}
	
	@BeforeMethod
	public static void tearup(String username)
	{
		try
		{
			fis = new FileInputStream("..\\MavenSelenium\\Config.properties");
			prop = new Properties();
			prop.load(fis);
					
		} catch (Exception e)
		{
			System.out.println("Config file not found, please check...");
		}
		
		try
		{
			System.setProperty("webdriver.chrome.driver", "..\\MavenSelenium\\Drivers\\chromedriver.exe");
			
		} catch (Exception e)
		{
			System.out.println("Chrome driver is not available...please check...");
		}
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	@Test
	public void createUser(String fname, String lname, String email, String pwd)
	{
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.id("identifierId")).sendKeys(prop.getProperty(""));
		driver.findElement(By.id("identifierNext")).click();
	}
}