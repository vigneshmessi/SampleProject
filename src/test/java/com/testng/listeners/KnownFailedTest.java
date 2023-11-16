package com.testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KnownFailedTest {

	@Test(retryAnalyzer = RetryClass.class)
	public void failedTest() {
		System.out.println("Known Failed Test");
		Assert.assertTrue(true);
	}
}
