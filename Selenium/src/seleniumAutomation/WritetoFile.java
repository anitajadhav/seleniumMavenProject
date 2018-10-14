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

public class WritetoFile {
	@Test
	public void groupofobjects() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver obrowser=new ChromeDriver();
		obrowser.get("https://www.ebay.com/");
		obrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		obrowser.findElement(By.id("gh-btn")).click();
	    
		List <WebElement> olist= obrowser.findElements(By.className("s-item__title"));
		File ofile=new File("C:\\Selenium\\abc.txt");
		FileWriter fw=new FileWriter(ofile);
		 for(WebElement eachitem:olist)
		    {
		    	fw.write(eachitem.getText());		   
		    }
		fw.flush();

        fw.close();
  }
	
}
