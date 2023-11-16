package com.testng.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {

	@Test
	public void login() {
		System.out.println("User logged in");
		Assert.assertTrue(false);  //failed due to AssertionError
	}
	
	@Test(priority=-1)
	public void addToCart() {
		System.out.println("Product added into the Cart");
	}
	
	@Test(dependsOnMethods="login", alwaysRun=true)
	public void checkout() {
		System.out.println("Checkout the Product");
	}
}
