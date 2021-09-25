package com.selenium.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\richa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl="http://automationpractice.com/index.php";
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		String expectedTitle="My Store";
		String actualTitle= driver.getTitle();
		
		if(expectedTitle.equalsIgnoreCase(actualTitle))
		{
			System.out.println("Test Case is passed");
			
		}
		else
		{
			System.out.println("Test Case is failed");
		}
		
	    driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
	    driver.findElement(By.id("email_create")).sendKeys("richaprakash9@gmail.com");
	    
		

		driver.close();
		
		
	
		
		
		
		
		
	}

}
