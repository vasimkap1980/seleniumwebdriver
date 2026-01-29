package js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemp {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement input=driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','vasim')",input);
		
		Thread.sleep(3000);
	   WebElement radio_btn=driver.findElement(By.xpath("//input[@id='male']"));
	   js.executeScript("arguments[0].click()",radio_btn);*/
		
		driver.get("https://demo.nopcommerce.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		//js.executeScript("window.scrollBy(0,1000)","");
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));

	}
	

}
