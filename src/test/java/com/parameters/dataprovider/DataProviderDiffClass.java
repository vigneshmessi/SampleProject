package com.parameters.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderDiffClass {

	@DataProvider(name="UserAndPwd", parallel=true)
	public Object[][] data(){
		return new Object[][] {{"Muthu", "muthu@123"},
							   {"Sangeetha", "sangee@123"},
							   {"Sathya", "sathya@123"},
							   {"Vignesh", "vignesh@123"}};
	}
}
