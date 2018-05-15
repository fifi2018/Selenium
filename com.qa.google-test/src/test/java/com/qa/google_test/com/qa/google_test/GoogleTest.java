package com.qa.google_test.com.qa.google_test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class GoogleTest {
	
	private WebDriver driver;
	String url = "https://www.google.co.uk";
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void methodTest() throws InterruptedException {
		driver.get(url); //String variable declared above
		
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
		
		Thread.sleep(2000);
		
		checkElement.sendKeys("BBC news");
		Thread.sleep(2000);
		
		
		checkElement.submit();
		Thread.sleep(2000);
	}
	
	@After
	public void teardown() {
		driver.quit();
	}

	
	
}