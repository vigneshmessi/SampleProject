package com.testng.groups;

import org.testng.annotations.Test;

public class GroupsSample {

	@Test(groups={"Sanity", "LoginPage"})
	public void testdesc() {
		System.out.println("Test 1");
	}
	
	@Test(groups= {"Smoke", "Sanity", "HomePage"})
	public void testss() {
		System.out.println("Test 2");
	}
	
	@Test(groups= {"Sanity", "Regression", "PDPPage"})
	public void testout() {
		System.out.println("Test 3");
	}
	
	@Test(groups= {"Smoke", "Regression", "PLPPage"})
	public void testsample() {
		System.out.println("Test 4");
	}
	
	@Test(groups= {"Smoke", "Sanity", "Regression", "CartPage"})
	public void testsamp() {
		System.out.println("Test 5");
	}
}
