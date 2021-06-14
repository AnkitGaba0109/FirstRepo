package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg {

	
	@Test
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "e:/chromedriver.exe");	
		WebDriver driver=	new ChromeDriver();
		driver.get("https://saralharyana.gov.in/citizenRegistration.html"); 
		driver.findElement(By.name("spdvCitizenName")).sendKeys("ankit");
		driver.findElement(By.name("spdvCitizenEmailId")).sendKeys("ankitgaba@gmail.com");
		
		
	}
	
	
	@Test
	public void testLogout() {
		System.out.println("Logout");
		Assert.assertEquals(3, 3);
		
		System.out.println("Logout");
		System.out.println("Logout");
		System.out.println("Logout");
		
		Assert.assertEquals(4, 4);
	}
	
	
	
}
