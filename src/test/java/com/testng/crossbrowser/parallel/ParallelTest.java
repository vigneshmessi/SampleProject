package com.testng.crossbrowser.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void adactinLoginWithValidUserAndValidPwd() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://adactinhotelapp.com/");
		driver1.findElement(By.id("username")).sendKeys("Muthulakshmi07");
		driver1.findElement(By.id("password")).sendKeys("Test@123");
		driver1.findElement(By.id("login")).click();
	}
	
	@Test
	public void adactinLoginWithValidUserAndInValidPwd() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://adactinhotelapp.com/");
		driver1.findElement(By.id("username")).sendKeys("Muthulakshmi07");
		driver1.findElement(By.id("password")).sendKeys("Test@");
		driver1.findElement(By.id("login")).click();
	}
	
	@Test
	public void adactinLoginWithInValidUserAndValidPwd() {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://adactinhotelapp.com/");
		driver1.findElement(By.id("username")).sendKeys("Muthulakshmi");
		driver1.findElement(By.id("password")).sendKeys("Test@123");
		driver1.findElement(By.id("login")).click();
	}

	@Test
	public void adactinLoginWithInValidUserAndInValidPwd() {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://adactinhotelapp.com/");
		driver1.findElement(By.id("username")).sendKeys("Muthulakshmi");
		driver1.findElement(By.id("password")).sendKeys("Test@");
		driver1.findElement(By.id("login")).click();
	}
}
