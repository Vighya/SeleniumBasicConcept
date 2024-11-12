package selectDeselect;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDeselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-592856129%26loc_physical_ms%3D1007769%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=Cj0KCQiA88a5BhDPARIsAFj595gBgkvve543N2Pue3uCnhSDOxUomm-3q7NQzwLf5exoTSGWNtYra5kaAs40EALw_wcB");
		driver.manage().window().maximize();
		
		WebElement day= driver.findElement(By.id("day"));
		
		Select select = new Select(day);
		select.selectByVisibleText("9");
		select.selectByIndex(13);
		select.selectByValue("8");
//		select.deselectAll();--->java.lang.UnsupportedOperationException: You may only deselect all options of a multi-select
		
//		Checking the element state
		WebElement name = driver.findElement(By.name("firstname"));
		boolean displayed = name.isDisplayed(); //check if the element is displayed or not
		boolean enabled =  name.isEnabled();//check for element is enabled or not
		
		System.out.println("name filed is displayed in the UI : "+ displayed);
		System.out.println("Name field is enabled in the UI for interaction : "+ enabled);
		
		WebElement female = driver.findElement(By.xpath("//label[text()='Female']/input"));
		female.click();
		boolean femaleValue = female.isSelected();
		
		System.out.println("female is selected or not : "+ femaleValue);
		
		WebElement male = driver.findElement(By.xpath("//label[text()='Male']/input"));
		boolean maleVlaue = male.isSelected();
		System.out.println("Male value is selected or not : "+ maleVlaue);
		
		driver.quit();
	}

}
