package seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class Practice {
@Test
	public void practiceTest()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		ChromeDriver obrowser= new ChromeDriver();
		//obrowser.get("https://www.amazon.com/");
		obrowser.get("https://www.google.com");
		//obrowser.findElement(By.linkText("signin")).click();
		//WebElement odropdown = obrowser.findElement(By.id("searchDropdownBox"));
		//Select item= new Select(odropdown);
		//item.selectByIndex(3);
		//obrowser.findElement(By.id("hplogo")).click();
		obrowser.findElement(By.linkText("Google Search")).click();
		
	}
}
