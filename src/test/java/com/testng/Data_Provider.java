package com.testng;




import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider="testdata")
	private void credentials(String username, int password) {
System.out.println("Username :"+username);
System.out.println("Password :"+password);
	}
@DataProvider
private Object[][] testdata() {
	return new Object[][] {
		{"priya",123},
		{"leyah",345},
		{"mathu",345}


	};
}
}