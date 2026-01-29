package getDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_demo 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		String s=driver.getCurrentUrl();
		System.out.println(s);
		
		System.out.println();driver.getPageSource();
		
		
		
	
		
	
	}

}
