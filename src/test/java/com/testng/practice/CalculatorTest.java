package com.testng.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

	@Test(dataProvider = "Calculator" , dataProviderClass =  com.datasource.DataUtility.class)
	public void calc( String amount , String  period , String interest) {
		
		
		System.setProperty("webdriver.chrome.driver", "e:/chromedriver.exe");	
		WebDriver driver=	new ChromeDriver();
		driver.get("https://vindeep.com/Calculators/FDCalc.aspx"); 
		driver.manage().window().maximize();
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
		
		WebElement element =  driver.findElement(By.id("ContentPlaceHolder1_cphCentre_MaturityAmountTextBox"));
		String result = element.getText();
		System.out.println(result);
		
		Assert.assertEquals(result, 14874);
		
		//Assert.assertEquals(result, "14874");
		//driver.close();
		
	}
	
//	
//	PASSED: calc("10000", "80", "6")
//	PASSED: calc("30000", "50", "9")
//	PASSED: calc("40000", "90", "4")
	
	
}
