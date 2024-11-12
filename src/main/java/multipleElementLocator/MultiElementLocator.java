package multipleElementLocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiElementLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		
//		Find Multiple element selector 
		
//		1.By Name
//		driver.findElement(By.name(null))
		
		
		
//		2.By TagName
		List <WebElement> elements=driver.findElements(By.tagName("li"));
		System.out.println("Number of element present in the lsit : "+ elements.size());
		
		
//		3.By LinkText
		
//		4.By PartialLinkText
		List <WebElement> partialLinkText=driver.findElements(By.partialLinkText("Policy"));
		System.out.println("Partial link text total count : " + partialLinkText.size());
		
//		5.Xpath
		List <WebElement> xpath=driver.findElements(By.xpath("//div[@class='footer-main-section']/div/div/div[2]/div/ul/li"));
		System.out.println("xpath total count : " + xpath.size());
		
		driver.quit();
		

	}

}
