package com.testng.attributes;

import org.testng.annotations.Test;

public class EnabledAndDescription {

	@Test //by default, enable option is true in TestNG
	public void testa() {
		System.out.println("Test A");
	}
	 
	//What are the different ways to skip the tc from execution(except @ignore)
	// by using enabled=false
	@Test(enabled=false)
	public void testb() {
		System.out.println("Test B");
	}
	
	@Test(description = "This testcase to validate product price in PDP & Cart same or not")
	public void validateProductPriceInPDPAndCart() {
		System.out.println("Test C");
	}
}
