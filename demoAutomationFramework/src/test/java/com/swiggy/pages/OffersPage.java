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

public class OffersPage extends BaseClass {
	@Test
	public  void offetingDetails() throws InterruptedException, IOException {
		driver.findElement(By.id(getProperties.getProperty("searchTxtFieldId")))
		.sendKeys(getProperties.getProperty("deliveryPlaceOfOrder"));
		Utilis.nap(1000);
		driver.findElement(By.xpath(getProperties.getProperty("selectOrderLocation"))).click();
		Utilis.nap(1000);
		driver.findElement(By.xpath(getProperties.getProperty("offers"))).click();
		Utilis.nap(2000);
		AssertJUnit.assertEquals(driver.findElement(By.xpath(getProperties.getProperty("offersForYou"))).getText(), 
				getProperties.getProperty("offersForYouTxt"));
		driver.findElement(By.xpath(getProperties.getProperty("offerCoupans"))).click();
		Utilis.nap(2000);
		driver.findElement(By.xpath(getProperties.getProperty("copyCode"))).click();
		Utilis.nap(2000);
		AssertJUnit.assertEquals(driver.findElement(By.xpath(getProperties.getProperty("codeCopied"))).getText(),
				getProperties.getProperty("codeCopiedTxt"));
		Utilis.nap(2000);
	}
}
