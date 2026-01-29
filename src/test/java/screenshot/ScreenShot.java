package screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.orangehrm.com/");
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir") + "\\screenshots\\page.png");
		sourcefile.renameTo(targetfile);
		*/
		
		driver.get("https://demo.nopcommerce.com/");
		WebElement product=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='item-grid']"));
		
		File sourcefile=product.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+ "\\screenshots\\feature.png");
		sourcefile.renameTo(targetfile);
	
	
	}
	

}
