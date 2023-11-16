package com.testng.attributes;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	public void testdesc() {
		System.out.println("Test 1");
	}
	
	@Test(priority=2)
	public void testss() {
		System.out.println("Test 2");
	}
	
	@Test(priority=3)
	public void testout() {
		System.out.println("Test 3");
	}
	
	@Test(priority=4)
	public void testsample() {
		System.out.println("Test 4");
	}
	
	@Test //If we didn't declare any priority, it will execute at 0th priority
	public void testsamp() {
		System.out.println("Test 5");
	}
	
	//If we have more than one @Test without declaring priority, 
    //so how it will execute --> it will follow alphabetical order
	@Test
	public void testann() {
		System.out.println("Test 6");
	}
	
	//Can we declare negative value in priority -> yes, we can
	@Test(priority=-4)
	public void testexe() {
		System.out.println("Test 7");
	}
	
	@Test(priority=-14)
	public void testexec() {
		System.out.println("Test 8");
	}
	
}
