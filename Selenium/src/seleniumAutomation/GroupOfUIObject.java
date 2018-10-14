package seleniumAutomation;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupOfUIObject {

@Test	
public void groupofobjects() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	WebDriver obrowser=new ChromeDriver();
	obrowser.get("https://www.ebay.com/");
	obrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
	obrowser.findElement(By.id("gh-btn")).click();
    
	List <WebElement> olist= obrowser.findElements(By.className("s-item__title"));
	//List <WebElement> olist= obrowser.findElements(By.xpath("//h3[contains(@class='s-item__title')])\"));
    Thread.sleep(3000);
    System.out.println(olist.size());
    
    for(WebElement eachitem:olist)
    {
    	System.out.println(eachitem.getText());
    }
    		
}
}
