/*package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker1 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	
	String year ="2025";
	String month ="November";
	String date ="10";
	
	
	driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	
	while(true)
	{
	  String  currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	  String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	   
	   if(currentmonth.equals(month)&& currentyear.equals(year))
	    {
		  break;
	    }
	    
	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
	   List<WebElement>alldate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
	   
	   for(WebElement dt:alldate)
	   {
		 if (dt.getText().equals(date))
		 {
			 dt.click();
			 break ;
		 }	 
				 
	   }

}
*/
	
    
