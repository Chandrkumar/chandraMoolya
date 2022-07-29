package com.swiggy.pages;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.swiggy.GenericUtilis.Utilis;
import com.swiggy.GenericUtilis.getProperties;

public class LoginPage extends BaseClass{
	
	@Test
	public void loginpage() throws IOException, InterruptedException {
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual: " + actualUrl);
		AssertJUnit.assertEquals(actualUrl, getProperties.getProperty("swiggy_Url"));
		
		driver.findElement(By.linkText(getProperties.getProperty("LoginlinkText"))).click();
		Thread.sleep(2000);
		AssertJUnit.assertTrue(driver.findElement(By.linkText(getProperties.getProperty("LoginlinkText"))).isDisplayed());
		
		driver.findElement(By.id(getProperties.getProperty("phoneNoFieldId")))
		.sendKeys(getProperties.getProperty("phonenumber"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(getProperties.getProperty("loginBtn1xpath"))).click();
		Thread.sleep(2000);
		AssertJUnit.assertTrue(driver.findElement(By.xpath(getProperties.getProperty("otpText"))).isDisplayed());
		
		driver.findElement(By.id(getProperties.getProperty("otpFieldId"))).sendKeys(Utilis.getRandomOtp());
		driver.findElement(By.linkText(getProperties.getProperty("VerifyOtpBtn"))).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath(getProperties.getProperty("otpErrorMsgXpath"))).getText(), 
				getProperties.getProperty("otpError_Msg"));
	}
}
