package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAsserts
{
	SoftAssert soft = new SoftAssert();
	@Test
	public void test1()
	{
		System.out.println("Launch Browser");
		Assert.assertEquals(false, true);
	}
	@Test
	public void test2()
	{
		System.out.println("Enter URL");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Enter username");
		System.out.println("Enter password");
		soft.assertEquals(false, true);
	}
	@Test
	public void test4()
	{
		System.out.println("Sign in");
		soft.assertAll();
	}
}