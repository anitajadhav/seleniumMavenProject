package seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {
	@Test
	public void ClickSearch()
	{
	//Open Chrome
		//System.setProperty(key, value);
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe" );
		ChromeDriver obrowser=new ChromeDriver(); 
		
	//Enter ebay.com
		obrowser.get("https://www.ebay.com/");
	//enter Laptop
		obrowser.findElement(By.id("gh-ac")).clear();
		obrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		//obrowser.findElementById("gh-ac").sendKeys("Laptop");
	//	obrowser.findElements(By.id("gh-ac")).sendKeys("Laptop");
		
	//Cick on Search
		obrowser.findElement(By.id("gh-btn")).click();
		//obrowser.findElementById("gh-btn").click();
		//obrowser.findElements(By.id("gh-btn")).click();
		
	}
}
