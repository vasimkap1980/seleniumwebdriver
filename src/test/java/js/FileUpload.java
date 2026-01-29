package js;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\wasim\\Desktop\\Documents\\Restful Apis.txt");
		if(driver.findElement(By.xpath("//li[normalize-space()='Restful Apis.txt']")).getText().equals("Restful Apis.txt"))
		{
		System.out.println("file uploaded");
		}
		else
		{
			System.out.println("file failed");
		}
		
	}

}
