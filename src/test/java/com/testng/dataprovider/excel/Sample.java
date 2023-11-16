package com.testng.dataprovider.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

	@Test(dataProvider = "loginData", dataProviderClass = ExcelUtil.class)
	public void TestLogin(String userName, String password) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
