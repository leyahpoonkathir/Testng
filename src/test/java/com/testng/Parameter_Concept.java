package com.testng;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameter_Concept {
@Test
@Parameters({"username","password"})
private void credential(String username,int password) {
	System.out.println("username"+username);
System.out.println("password"+password);
}
}
