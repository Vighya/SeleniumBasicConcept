package datePicker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.sendKeys("11/14/2024");
		datePicker.clear();
		
		String date="12/11/2023";
		datePicker.click();
		
		WebElement prev = driver.findElement(By.xpath("//a[@data-handler='prev']"));
		prev.click();
		
		WebElement date1 = driver.findElement(By.id("/html/body/div[4]/table/tbody/tr[1]/td[3]/a"));
		date1.click();
		
		

	}

}
