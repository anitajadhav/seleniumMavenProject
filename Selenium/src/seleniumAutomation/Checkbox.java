package seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
 	public void checkboxtest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver obrowser=new ChromeDriver();
		obrowser.navigate().to("https://www.southwest.com/");
		//ManagedBlocker.
		obrowser.findElement(By.partialLinkText("Log in")).click();
		//obrowser.findElement(By.xpath("//span[@contains="Vacations")");
		System.out.println(obrowser.getCurrentUrl());
		System.out.println();
		//System.out.println(obrowser.getPageSource());
		System.out.println();
		System.out.println(obrowser.getTitle());
				
		Thread.sleep(4000);
		
		if(!obrowser.findElement(By.id("rememberme")).isSelected())
			obrowser.findElement(By.id("rememberme")).click();
	}
		
 	
 	@Test
		public void radiobutton() throws InterruptedException
		{
			String svacation="A+H+C";
			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
			ChromeDriver obrowser=new ChromeDriver();
			obrowser.navigate().to("https://www.southwest.com/");
			
			Thread.sleep(4000);
			//obrowser.findElement(By.xpath("//a[@id='booking-form--vacations-tab']")).click();
			////*[@id="booking-form--vacations-tab"]/span[2]
			obrowser.findElement(By.xpath("//li/a/span[@id=’booking-form--vacations-tab’]")).click();
			//<HTML Tag>[contains(@<Attribute>, '<PART of Attribute Value>')]
			Thread.sleep(5000);
			if(svacation.equals("A+H"))
			{
				obrowser.findElement(By.id("bundle-saving-vacation-hotel")).click();
			}
			else if(svacation.equals("A+H+C"))
			{
				obrowser.findElement(By.id("bundle-saving-vacation-hotel-car")).click();
			}
			else
			{
				obrowser.findElement(By.id("bundle-saving-vacation-car")).click();
				
			}
			
			
			
			//obrowser.close();
					
		}
		
		
		
		
		
	
}
