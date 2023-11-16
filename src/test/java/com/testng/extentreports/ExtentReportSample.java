package com.testng.extentreports;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ExtentReportSample extends BaseClass{

	@Test
	public void login() throws Exception {
		createTest("TS01_Validate_user_able_to_login_with_Valid_Credentials");
		browserOpen("chrome");
		reportStatus("Pass", "Browser opened successfully");
		loadUrl("https://adactinhotelapp.com/");
		
		String expectedURL = "https://adactinhotelapp.com/";
		String actualURL = getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
		reportStatus("Pass", "URL launched in the browser");
		reportStatus("Fail", "Sample failed step");
		reportStatus("Info", "Sample info step");
		reportStatus("Warning", "Sample Warning step");
		
		reportStatus("Pass with screenshot", "Screenshot sample");
		
	}
	
	@Test
	public void signUp() {
		createTest("TS02_Validate_user_able_to_Create_an_Account");
	}
}
