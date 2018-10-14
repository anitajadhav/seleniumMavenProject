package seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFunctions {
	@Test
 public void browser() throws InterruptedException
 {
	 
	 System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver obrowser=new ChromeDriver();
		obrowser.navigate().to("https://www.ebay.com/");
		obrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		
		obrowser.findElement(By.id("gh-btn")).click();
		Thread.sleep(5000);
		obrowser.navigate().back();
		Thread.sleep(5000);
		obrowser.navigate().forward();
		
 }
}
