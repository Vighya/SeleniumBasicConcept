package waitsInSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.*;
import java.time.*;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait.
		
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.partialLinkText("Contact")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Form_getForm_FullName")));//explicit wait
		element.sendKeys("Test");
		
		driver.navigate().back();
		
		// Define Fluent Wait with a timeout of 30 seconds and a polling interval of 2 seconds
        FluentWait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))           // Max time to wait
                .pollingEvery(Duration.ofSeconds(2))           // Check every 2 seconds
                .ignoring(NoSuchElementException.class);       // Ignore if element is not found

        // Wait for the element to be visible
        WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Contact")));

        // Interact with the element
        element1.click();
        
        driver.quit();

	}

}
