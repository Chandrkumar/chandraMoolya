package com.swiggy.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.swiggy.GenericUtilis.getProperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeClass
	public  void  launcBrowser() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Thread.sleep(4000);
		driver.get(getProperties.getProperty("swiggy_Url"));
	}
	
	@AfterClass
	public  void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}

}
