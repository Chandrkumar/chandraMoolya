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

public class SignUpPage extends BaseClass {
	
	@Test
	public  void signUpProcess() throws InterruptedException, IOException {
		AssertJUnit.assertTrue(driver.findElement(By.linkText(getProperties.getProperty("signUpLnk"))).isDisplayed());
		
		driver.findElement(By.linkText(getProperties.getProperty("signUpLnk"))).click();
		Utilis.nap(2000);
		
		AssertJUnit.assertTrue(driver.findElement(By.xpath(getProperties.getProperty("continueBtn"))).isDisplayed());
		Utilis.nap(2000);
		driver.findElement(By.id(getProperties.getProperty("mobileNoField"))).sendKeys(Utilis.getRandomMobileNo());
		Utilis.nap(2000);
		driver.findElement(By.id(getProperties.getProperty("nameField"))).sendKeys(getProperties.getProperty("name"));
		Utilis.nap(2000);
		driver.findElement(By.id(getProperties.getProperty("emailField"))).sendKeys(Utilis.generateRandomEmailId());
		Utilis.nap(2000);
		
		driver.findElement(By.id(getProperties.getProperty("passwordField"))).sendKeys(getProperties.getProperty("password"));
		Utilis.nap(2000);
		driver.findElement(By.xpath(getProperties.getProperty("continueBtn"))).click();
		Utilis.nap(2000);
		AssertJUnit.assertTrue(driver.findElement(By.xpath(getProperties.getProperty("signUpTxt"))).isDisplayed());
		
		driver.findElement(By.id(getProperties.getProperty("otpFieldId"))).sendKeys(Utilis.getRandomOtp());
		Utilis.nap(2000);
		driver.findElement(By.linkText(getProperties.getProperty("VerifyOtpBtn"))).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath(getProperties.getProperty("otpErrorMSgForSignUpField"))).getText(), 
				getProperties.getProperty("otpError_MsgSignUp"));
	}
}