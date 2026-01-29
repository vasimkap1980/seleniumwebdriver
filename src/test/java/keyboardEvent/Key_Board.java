package keyboardEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Board {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		Actions act = new Actions(driver);

		WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("Default location if the slider" + min_slider.getLocation());

		act.dragAndDropBy(min_slider, 100, 293).perform();
		System.out.println("location if the slider after moving " + min_slider.getLocation());

	}

}
