package Table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_table {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("total numbers of rows: "+rows);
		
		int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("total numbers of cols :"+ col);
		
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[1]")).getText();
		System.out.println(bookname);
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=col;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			    System.out.println();
		}
		
		
		for (int r=2;r<=rows;r++)
		{
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if (authorname.equals("Mukesh"))
			{
				String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(book+"\t"+authorname);
			}
		}
	}

}
