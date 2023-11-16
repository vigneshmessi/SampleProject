package com.testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnknownFailedTest {

	@Test
	public void unknownFail() {
		System.out.println("Unknown Fail Test");
		Assert.assertTrue(false);
	}
}
