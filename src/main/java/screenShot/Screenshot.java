package screenShot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		
		File screenshotfile = screenShot.getScreenshotAs(OutputType.FILE);
		
		File destinationFile = new File("screenshot/screenshot_example.png");
		
		FileUtils.copyFile(screenshotfile, destinationFile);

        System.out.println("Screenshot saved at: " + destinationFile.getAbsolutePath());

	}

}
