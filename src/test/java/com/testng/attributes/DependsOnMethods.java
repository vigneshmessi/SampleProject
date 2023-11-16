package com.testng.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void login() {
		System.out.println("User logged in");
		Assert.assertTrue(false); //It expects parameter should be given true
								  //if we didn't pass the parameter as false
								  //then, it will fail the tc
	}
	
	@Test(priority=-1)
	public void addToCart() {
		System.out.println("Product added into the Cart");
	}
	
	@Test(dependsOnMethods="login")
	public void checkout() {
		System.out.println("Checkout the Product");
	}
	
	//If we want to use different class method in dependsOnMethod attr then, 
	//we have to declare the method name like this
	//    packagename.ClassName.methodName
	@Test(dependsOnMethods = "com.testng.attributes.EnabledAndDescription.testa")
	public void diffClass() {
		System.out.println("Depends on Different Class method");
	}
}

