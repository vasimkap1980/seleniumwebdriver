package day15;

import org.testng.annotations.Test;

public class Payments 
{
	@Test(priority = 1,groups = {"ui"})
	void paymentinruppe()
	{
		System.out.println("payment must in ruppe...");
	}
	
	@Test(priority = 2,groups = {"ui"})
	void paymentindoller()
	{
		System.out.println("payment must in doller...");
	}
}
