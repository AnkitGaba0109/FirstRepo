package com.testng.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest2 {

	WebDriver driver;
	
	@Test(dataProvider = "Calculator" , dataProviderClass =  com.datasource.DataUtility.class)
	public void calc( String amount , String  period , String interest,String excpectedresult) throws InterruptedException {
		
		
		
		WebElement amountElement =  driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount"));
		amountElement.clear();
		amountElement.sendKeys(amount);
		WebElement periodElement =  driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period"));
		periodElement.clear();
		periodElement.sendKeys(period);
		WebElement interestElement =  driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate"));
		interestElement.clear();
		interestElement.sendKeys(interest);
		
		driver.findElement(By.id("ContentPlaceHolder1_cphCentre_btnFDMAmount")).click();
		
		Thread.sleep(1000);
		
		WebElement element =  driver.findElement(By.id("ContentPlaceHolder1_cphCentre_MaturityAmountTextBox"));
		String result = element.getAttribute("value");
		System.out.println(result);
		
		Assert.assertEquals(result, 14874);
		
		//Assert.assertEquals(result, "14874");
		//driver.close();
		
	}
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "e:/chromedriver.exe");	
		driver=	new ChromeDriver();
		driver.get("https://vindeep.com/Calculators/FDCalc.aspx"); 
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
//	
//	PASSED: calc("10000", "80", "6")
//	PASSED: calc("30000", "50", "9")
//	PASSED: calc("40000", "90", "4")
	
}
