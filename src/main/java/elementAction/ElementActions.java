package elementAction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import org.openqa.selenium.interactions.Actions;

public class ElementActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		
//		Clicking elements
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a/button")).click();
		String title = driver.getTitle();
		System.out.println("Book free demo page title : "+ title);
		
//		Typing the text but before type any text it is better partice to clear the text so we are going to cover both the tings
		
//		Clearing the text
		WebElement name =driver.findElement(By.id("Form_getForm_FullName"));
		name.click();
		name.clear(); //this will clear the text in the input field
		name.sendKeys("Don");
		
		driver.navigate().back();
		
//		Getting attribute value
		
		WebElement contact = driver.findElement(By.partialLinkText("Contact"));
		String conString = contact.getAttribute("href");
		System.out.println("href link : "+conString);
		
//		reading the value
		WebElement email = driver.findElement(By.id("Form_submitForm_EmailHomePage"));
		email.click();
		email.sendKeys("test@gmail.com");
		String text = email.getText();
		System.out.println("Ented email address is : "+ text);
		
//		------------------------------ Mouse Action------------------------------------------------------
		
//		Hover over a element
		WebElement solution = driver.findElement(By.xpath("//a[text()=\"Solutions\"]"));
		Actions actions = new Actions(driver);

		actions.moveToElement(solution).perform();
		
//		double click
		WebElement dobleClick=driver.findElement(By.xpath("//a[text()=\"Solutions\"]"));
		actions.doubleClick(dobleClick).perform();

		
		
//		Right click
		WebElement right=driver.findElement(By.xpath("//a[text()=\"Solutions\"]"));
		actions.contextClick(right).perform();
		
//		------------------------------ Keyboard Action------------------------------------------------------
		
		email.click();
		email.clear();
		email.sendKeys("sending@gmail.com"+Keys.CLEAR);
		
		driver.quit();
		
	}

}
