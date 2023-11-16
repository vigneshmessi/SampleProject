package com.testng.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer{

	int min = 0;
	int max = 5;
	
	public boolean retry(ITestResult result) {	  
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}

}
