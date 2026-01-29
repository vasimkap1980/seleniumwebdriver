package day15;

import org.testng.annotations.Test;

public class LoginTest 
{
	@Test(priority = 1,groups= {"sanity"})
	void loginbyfacebook()
	{
		System.out.println("login by FB ...");
	}
	
	@Test(priority = 2,groups = {"sanity"})
	void loginbyemail()
	{
		System.out.println("login by email ...");
	}
	
	@Test(priority = 3,groups = {"sanity"})
	void loginbytwitter()
	{
		System.out.println("login by twitter ...");
	}
}
