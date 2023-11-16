package com.parameters.dataprovider;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class DataProviderSample extends BaseClass{

	//@Test(dataProvider="credentials")
	@Test(dataProviderClass = DataProviderDiffClass.class, dataProvider="UserAndPwd")
	public void testMethod(String userName, String passWord) {
		browserOpen("chrome");
		loadUrl("https://en-gb.facebook.com/");
		WebElement username = findElementById("email");
		WebElement password = findElementById("pass");
		
		username.sendKeys(userName);
		password.sendKeys(passWord);
	}
	
	//If you declare the name for DataProvider then, we can't use the methodName for execution
	@DataProvider(name="credentials")
	public Object[][] testData(){
		return new Object[][] {{"Kavitha", "kavitha@123"},
							   {"Manikandan", "mani@123"},
							   {"Mathavi", "mathavi@123"},
							   {"Purush", "purush@123"}};
	}
}
