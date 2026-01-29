package browsershandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		/*
		 * List<String> windowList=new ArrayList<String>(windowIds); String parentid=
		 * windowList.get(0); String chidid= windowList.get(1);
		 * 
		 * driver.switchTo().window(chidid); System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(parentid); System.out.println(driver.getTitle());
		 */
		
		for(String winids:windowIds)
		{
			String title= driver.switchTo().window(winids).getTitle();
			if(title.equals("OrangeHRM"))
		
		{
			   // System.out.println(driver.getCurrentUrl());
				driver.close();
		}
		
	}

	}
	}
