	package seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkandButtons {
	@Test
	public void link() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		//1. Start Browser
		ChromeDriver obrowser=new ChromeDriver();
		//2.Enter URL
		obrowser.get("https://www.ebay.com/");
		//3.Click on Search and enter Laptop
		obrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		//4.Click on search
		obrowser.findElement(By.id("gh-btn")).click();
		
		//5. Click on advance Search
		
		obrowser.findElement(By.linkText("Advanced")).click();
		
		//6. Select option from dropdown
		WebElement odrop=obrowser.findElement(By.id("e1-1"));
		Select oitem= new Select(odrop);
		
		oitem.selectByVisibleText("Crafts");
        Thread.sleep(3000);	
		
        oitem.selectByIndex(2);
        Thread.sleep(3000);	
		
        
        oitem.selectByValue("20081");
      //  oitem.
        
        //7. click on Search
       // obrowser.findElement(By.className("btn btn-prim")).click();;
		
		
		
		
	}

}
