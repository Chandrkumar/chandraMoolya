package com.swiggy.pages;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.swiggy.GenericUtilis.Utilis;
import com.swiggy.GenericUtilis.getProperties;

public class HelpPage extends BaseClass{
	@Test
	public void HelpDetails() throws InterruptedException, IOException {
		driver.findElement(By.id(getProperties.getProperty("searchTxtFieldId")))
		.sendKeys(getProperties.getProperty("deliveryPlaceOfOrder"));
		Utilis.nap(1000);
		driver.findElement(By.xpath(getProperties.getProperty("selectOrderLocation"))).click();
		Utilis.nap(1000);
		driver.findElement(By.xpath(getProperties.getProperty("helpMenu"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='L1QZ_'])[1]")).click();
		
		Utilis.nap(1000);
		driver.findElement(By.xpath(getProperties.getProperty("legalOpt"))).click();
	}
}
