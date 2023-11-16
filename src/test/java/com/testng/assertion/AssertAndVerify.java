package com.testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAndVerify {

	@Test
	public void hardAssert() {
		String name = "Kavitha";
		String name1 = "kavitha";
//		if(name.equals(name1)) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not Equal");
//		}
		Assert.assertEquals(name, name1);
		System.out.println("Test Passed");
	}
	
	@Test
	public void softAssert() {
		String name = "Kavitha";
		String name1 = "kavitha";
	
		SoftAssert verify = new SoftAssert();
		
		verify.assertEquals(name, name1);
		System.out.println("Test Passed");
	}
}
