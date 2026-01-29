package Selectdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_drp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement  drp_ele= driver.findElement(By.xpath("//select[@id='colors']"));
		Select drp = new Select (drp_ele);
		
		drp.selectByContainsVisibleText("Green");
		List<WebElement>option=drp.getOptions();
		System.out.println(option.size());
		
		for(WebElement op:option)
		{
			System.out.println(op.getText());
		}
		
		/*WebElement  drpcou_ele= driver.findElement(By.xpath("//select[@id='country']"));
		Select drp = new Select (drpcou_ele);
		
		
		
		//drp.selectByContainsVisibleText("China");	
		//drp.selectByValue("france");
		drp.selectByIndex(5);
		
		List<WebElement>options =drp.getOptions();
		System.out.println("number of country:"+ options.size());
		
		/*for(int i=0;i<options.size();i++)
		{
			
			System.out.println(options.get(i).getText());
		}
		
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
			*/
		
		
		

	}

}
