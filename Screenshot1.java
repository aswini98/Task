package selenium1.org;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\SysSoft\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");	
	driver.manage().window().maximize();
	//typecast syntax
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src=tk.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\SysSoft\\eclipse-workspace\\Selenium\\Screenshot\\nopcommerce.png");
	FileHandler.copy(src, des);
	}
	
}
