package checkbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		/*
		 * WebElement chkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		 * System.out.println("before selected: "+ chkbox.isSelected());
		 * driver.findElement(By.xpath("//input[@id='sunday']")).click();
		 * System.out.println("after selected: "+ chkbox.isSelected());
		 */

		List <WebElement> chkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("number of checkboxes:"+ chkboxes.size());
		
		/*
		 * for(int i=0;i<chkboxes.size();i++) { chkboxes.get(i).click(); }
		 */
		
		for(WebElement check:chkboxes)
		{
			check.click();
		}
        driver.quit();
	}

}
