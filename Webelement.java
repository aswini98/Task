package selenium1.org;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webelement {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\SysSoft\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	
	// Storing the element in  list
	List <WebElement> elementList = driver.findElements(By.xpath(""));

	// Get the size of the list
	int listSize = elementList.size();

	for (int i=0; i<listSize; i++)
	{
	    // iterate through element or perform any action
	    //serviceProviderLinks.get(i).getText();
		
	}
	}
}
