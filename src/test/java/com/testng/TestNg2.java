package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg2 {

	
	@Test
	public void testTitle() {
		System.setProperty("webdriver.chrome.driver", "e:/chromedriver.exe");	
		WebDriver driver=	new ChromeDriver();
		driver.get("https://saralharyana.gov.in/citizenRegistration.html"); 
		driver.manage().window().maximize();
		String title = driver.getTitle();
		Assert.assertEquals(title ,"Citizen Registration");
		driver.close();
		
	}
	
	
	@Test
	public void testLogout() {
		System.out.println("Logout");
		
		try {
		//Assert.assertEquals(3, 4);
		}
		catch(AssertionError e) {
			e.printStackTrace();
		}
		System.out.println("Logout");
		System.out.println("Logout");
		System.out.println("Logout");
		
		Assert.assertEquals(4, 4);
	}
	
	
	
}
