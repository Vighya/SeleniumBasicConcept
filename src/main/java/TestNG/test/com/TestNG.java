package TestNG.test.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver(options);
		
//		 maximize the window
		driver.manage().window().maximize();

		// Open a specific URL
		driver.get("https://www.orangehrm.com/");
		
		
		
//		---------------------Different way to find the element in the selenium -----------------------
		
//		1. By ID 
		WebElement emailAdd= driver.findElement(By.id("Form_submitForm_EmailHomePage"));
		emailAdd.click();
		emailAdd.sendKeys("test123@gmail.com");
		
		
		
//		2.By Name locator 
		WebElement emailAddName = driver.findElement(By.name("EmailHomePage"));
		emailAddName.clear();
		emailAddName.click();
		emailAddName.sendKeys("Name123@gmail.com");
		
		
		
//		3.By ClassName
		WebElement langauge = driver.findElement(By.className("lan-ul"));
		langauge.click();
		
//		4.By TagName Locator
		WebElement tagName = driver.findElement(By.tagName("h1"));
		String h1tag = tagName.getText();
		System.out.println(h1tag);
		
		
//		5.By LinkText Locator
		WebElement  LinkText = driver.findElement(By.linkText("Contact Sales"));
		LinkText.click();
		
		driver.navigate().back();
		
//		6.By PartialLink Text Locator 
		WebElement  partialLinkText = driver.findElement(By.partialLinkText("Contact"));
		partialLinkText.click();
		
		driver.navigate().back();
		
//		7.By css selector
		WebElement cssSelector = driver.findElement(By.cssSelector("#Form_submitForm_EmailHomePage"));
		cssSelector.clear();
		cssSelector.sendKeys("css@gmail.com");
		
		
//		8.By Xpath
		WebElement xpath = driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']"));
		xpath.clear();
		xpath.sendKeys("xpath@gmail.com");
		
//		9.By custom attribute
		
		
		
		
		
		
		
		driver.quit();
	}

}
