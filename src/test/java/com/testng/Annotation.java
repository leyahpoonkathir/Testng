package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeSuite
	private void setProperties() {

System.out.println("setproperties");

	}
	@BeforeTest
	private void browserLaunch() {

System.out.println("beforelaunch");

	}
	@BeforeClass
	private void url() {
		System.out.println("url");

	}
	@BeforeMethod
	private void logIn() {

System.out.println("login");

	}
@Test
private void mobileSearch() {

System.out.println("mobile");

}
@Test
private void laptop() {

System.out.println("laptop");

}
@AfterMethod
private void logout() {

System.out.println("logout");

}
@AfterClass
private void homePage() {
	System.out.println("homepage");

}
@AfterTest
private void close() {

System.out.println("close");

}
@AfterSuite
private void deleteAllCokies() {


System.out.println("deleteallcokies");

}



}
