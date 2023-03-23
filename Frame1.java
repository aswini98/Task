package selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\SysSoft\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		//Find the total number of iframes on the page
		int totalIFramesOnPage=driver.findElements(By.tagName("iframe")).size();
		//Print the total iframes on page
		System.out.println("Total iframes on Page:"+totalIFramesOnPage);
        
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		WebElement frame1Heading=driver.findElement(By.id("sampleHeading"))	;
		 //Finding the text of the heading
        String frame1Text=frame1Heading.getText();
        
        //Print the heading text
        System.out.println(frame1Text);
        
        //closing the driver
        driver.close();
}

}
