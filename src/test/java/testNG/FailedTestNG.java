package testNG;

import org.testng.annotations.Test;

public class FailedTestNG
{
	@Test
	public void Test1()
	{
		System.out.println("Test1");
		int i=1/0;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}
}