package frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.devtools.idealized.Javascript;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

//		Switching the frame in the webpage
		WebElement element = driver.findElement(By.id("frm1"));
		driver.switchTo().frame(element);

		String value = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div[1]/div[1]/div/h1")).getText();

		System.out.println("Reading the value in the frame : " + value);
		
		driver.switchTo().defaultContent();

		String value1 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div[1]/div[1]/div")).getText();

		System.out.println("Reading the value in the frame : " + value1);
		
		
//		Switching the frame within the frames
		WebElement frame3 = driver.findElement(By.id("frm3"));
		driver.switchTo().frame(frame3);
		
		
		WebElement frame1 = driver.findElement(By.id("frm2"));
		driver.switchTo().frame(frame1);
		
		WebElement text1= driver.findElement(By.xpath("//*[@id=\"post-body-7593811851313663875\"]/div/div/div[1]"));
		String str = text1.getText();
		
		System.out.println("The frame inside it is : "+ str);
		
		driver.switchTo().parentFrame();
		
		String textFrame3 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div[1]/div[1]/div/h1")).getText();
		
		System.out.println("The frame outside it is : "+ textFrame3);
		
		driver.switchTo().defaultContent();
		
		String value3 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div[1]/div[1]/div")).getText();

		System.out.println("Reading the value in the frame : " + value3);
		
		
		driver.quit();
		
		
	}

}
