package selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipleoption {
	public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver",
			"C:\\Users\\SysSoft\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/dropdowns");
	driver.manage().window().maximize();
	WebElement select =driver.findElement(By.id("fruits"));
	Select s=new Select(select);
	s.selectByValue("0");
	s.selectByVisibleText("Mango");
	WebElement IsMultiple=driver.findElement(By.id("superheros"));
	Select s1=new Select(IsMultiple);
	//to check whether the drop down is multiple option selectable or not
	boolean b=s1.isMultiple();
	System.out.println(b);
	s1.selectByValue("am");
	s1.selectByVisibleText("Aquaman");
	
}

}


