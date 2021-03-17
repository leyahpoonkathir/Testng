package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	@Test
	private void credential() {
		String actual="priya";
		String expected="kathir";
		Assert.assertEquals(actual, expected);

	}
	@Test
private void creditional1() {

	String actual="priya";
	String expected="kathir";
	Assert.assertNotEquals(actual, expected);


}
}
