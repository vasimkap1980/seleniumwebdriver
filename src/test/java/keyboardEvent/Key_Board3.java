package keyboardEvent;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Board3 {

	public static void main(String[] args)  {
	 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		//WebElement reglink=driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]"));
		//WebElement reglink=driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]"));
		WebElement reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
		
		List<String> ids=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
			

	}

}
