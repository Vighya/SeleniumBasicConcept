package changingBrowserTab;

import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;
import java.util.ArrayList;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ChangingBrowserTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
//		Privacy Policy
		WebElement privacy = driver.findElement(By.linkText("Privacy Policy"));
		js.executeScript("arguments[0].click();", privacy);
		
//		Service Privacy Policy
		WebElement service = driver.findElement(By.linkText("Service Privacy Policy"));
		js.executeScript("arguments[0].click()",service);
		
//		General Public License
		WebElement general = driver.findElement(By.linkText("General Public License"));
		js.executeScript("arguments[0].click()",general);
		
		Set <String> windowhandle = driver.getWindowHandles();
		
		ArrayList<String> windowHandlesList = new ArrayList<>(windowhandle);
		
		for(int i=0;i<=windowHandlesList.size()-1;i++)
		{
			String title = driver.switchTo().window(windowHandlesList.get(i)).getTitle();
			
			System.out.println("Title of the page "+i +" "+title);
		}

	}

}
