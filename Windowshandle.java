package selenium1.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\SysSoft\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtsearch=driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone",Keys.ENTER);
		WebElement search=driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		WebElement productsearch=driver.findElement(By.xpath("(//span[text()='Apple iPhone 12 (128GB) - Blue'])[1]"));
		productsearch.click();
		//to get the parent window id
		String parent_id=driver.getWindowHandle();
		System.out.println(parent_id);
		//to get windowhandle method to get id of new window(chlid window)
        Set<String>Child_id=driver.getWindowHandles();
        System.out.println(Child_id);
        
		//to iterate id one by one
		for(String eachwin:Child_id) {
			if(!parent_id.equals(eachwin)) {
				driver.switchTo().window(eachwin);
			}
		}
		
		//to  change focus on new window	
			//driver.switchTo().window(parent_id);
			Thread.sleep(3000);
			WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
			addtocart.click();
			
		
		
	}

}

