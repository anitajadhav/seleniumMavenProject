package seleniumAutomation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTag{
	@Test
	public void groupofobjects() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver obrowser=new ChromeDriver();
		obrowser.get("https://www.ebay.com/");
		obrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		obrowser.findElement(By.id("gh-btn")).click();
	    
		
		//retrive all links from the page
		List <WebElement> olist= obrowser.findElements(By.tagName("a"));
		System.out.println(olist.size());
		
		
		//all dropdown
		List <WebElement> olist1= obrowser.findElements(By.tagName("select"));

		
		
		
		//all textboxes
		List <WebElement> olist2= obrowser.findElements(By.xpath("//input[@type='text']"));
		
		//all checkboxes
		List <WebElement> olist3= obrowser.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement selection:olist3)
		{
			
			if(!selection.isSelected()) 
			{
				selection.click();
			}
		}
		//all buttons/search/submit
		List <WebElement> olist4= obrowser.findElements(By.xpath("//input[@type='submit']"));
  }
	
}
