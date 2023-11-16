package com.testng.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCountAndTimeOut extends BaseClass{

	@Test(invocationCount=3, invocationTimeOut=15000)
	public void searchJava() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		browserOpen("chrome");
		loadUrl("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		dataSend(search, "Java");
		//search.sendKeys("Java", Keys.ENTER);
		search.submit();
		pageClose();
	}
}
