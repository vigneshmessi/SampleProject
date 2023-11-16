package com.testng.crossbrowser.parallel;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class CrossBrowser extends BaseClass{

	@Parameters("browser")
	@Test
	public void adactinLogin(String browser) {
		browserOpen(browser);
		loadUrl("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Muthulakshmi07");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();
		
//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("https://adactinhotelapp.com/");
//		driver1.findElement(By.id("username")).sendKeys("Muthulakshmi07");
//		driver1.findElement(By.id("password")).sendKeys("Test@123");
//		driver1.findElement(By.id("login")).click();
	}
}
