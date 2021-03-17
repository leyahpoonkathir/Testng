package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {
	@Test
private void credentials() {
String expected="priya";
String actual="kathir";
Assert.assertNotEquals(actual, expected);
System.out.println("passed");



}
}
