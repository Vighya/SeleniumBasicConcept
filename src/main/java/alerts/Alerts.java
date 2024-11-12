package alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
//		Simple alert window with message
		
		driver.findElement(By.id("alert1")).click();
		
		Alert alt=driver.switchTo().alert();
		String alertString = alt.getText();
		System.out.println("Simple Alert message is: "+alertString);
		alt.accept();
		
//		Confirmation alert
		
		WebElement confAlert = driver.findElement(By.id("confirm"));
		confAlert.click();
		
		Alert conAlert = driver.switchTo().alert();
		String conAlertString = conAlert.getText();
		System.out.println("Confirmation Alert message is while accepting: "+conAlertString);
		alt.accept();//accepting the alert
		
		confAlert.click();
		Alert conAlert1 = driver.switchTo().alert();
		String conAlertString1 = conAlert1.getText();
		System.out.println("Confirmation Alert message is while rejecting: "+conAlertString1);
		conAlert1.dismiss();//cancel the alert
		
//		Prompt alert
		WebElement promnt= driver.findElement(By.id("prompt"));
		promnt.click();
		
		Alert promAlert = driver.switchTo().alert();
		String proAlertString = promAlert.getText();
		System.out.println("Prompt Alert message is while accepting: "+proAlertString);
		promAlert.accept();//accepting the alert
		
		promnt.click();
		Alert promAlert1 = driver.switchTo().alert();
		String proAlertString1 = promAlert1.getText();
		System.out.println("Prompt Alert message is while rejecting: "+proAlertString1);
		promAlert1.dismiss();//cancel the alert
		
		promnt.click();
		Alert promAlert2 = driver.switchTo().alert();
		String proAlertString2 = promAlert2.getText();
		System.out.println("Prompt Alert message is while passing the message: "+proAlertString2);
		promAlert2.sendKeys("alerts");
		promAlert2.accept();
		
		
	}

}
