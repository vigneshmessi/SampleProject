package com.parameters.dataprovider;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ParametersSample extends BaseClass{

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser) {
		browserOpen(browser);
	}
	
	@Parameters("url")
	@BeforeMethod
	public void beforeMethod(String url) {
		loadUrl(url);
	}
	
	@Parameters({"username", "password"})
	@Test
	public void login(String user, String pwd) {
		WebElement userName = findElementById("email");
		WebElement passWord = findElementById("pass");
		
		userName.sendKeys(user);
		passWord.sendKeys(pwd);
		
		String userData = userName.getAttribute("value");
		
		Assert.assertEquals(user, userData);
		
		//boolean checkUserData = userData.equals(user);
		//Assert.assertTrue(checkUserData);
	}
}
