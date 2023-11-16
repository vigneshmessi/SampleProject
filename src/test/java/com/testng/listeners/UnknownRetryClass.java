package com.testng.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class UnknownRetryClass implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, //@Test
						  Class testClass, //UnknownFailedTest
						  Constructor testConstructor, //UnknownFailedTest
						  Method testMethod) { //unknownFail
	
		annotation.setRetryAnalyzer(RetryClass.class);
	}

}
