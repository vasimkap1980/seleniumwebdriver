package day15;

import org.testng.annotations.Test;

public class SignupTest 
{
	@Test(priority = 1,groups = {"functional"})
	void signupwithFB()
	{
		System.out.println("signup with FaceBook....");
	}
	
	@Test(priority = 2,groups = {"functional"})
	void signupwithemail()
	{
		System.out.println("signup with email....");
	}
	
	@Test(priority = 3,groups = {"functional"})
	void signupwithtwitter()
	{
		System.out.println("signup with twitter....");
	}
	
}
