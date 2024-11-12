package javaScripet;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class JavaSripet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		WebElement privacy = driver.findElement(By.linkText("Privacy Policy"));
		js.executeScript("arguments[0].click();", privacy);

	}

}
