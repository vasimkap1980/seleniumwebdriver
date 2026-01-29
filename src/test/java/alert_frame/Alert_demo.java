package alert_frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		System.out.println("this is alert message: "+alert.getText());
		
		alert.sendKeys("javed");
		alert.accept();
		
		String reg=driver.findElement(By.xpath("//p[@id='result']")).getText();
		if(reg.contains("javed"))
		{
			System.out.println("test passed");
			
		}
		else 
		{
			System.out.println("test faield");
		}
	}

}
