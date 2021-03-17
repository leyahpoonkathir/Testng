package com.testng;

import org.testng.annotations.Test;

public class Invocation_Concept {
	@Test
	private void mobileSearch() {

	System.out.println("mobile");

	}
	@Test(invocationCount=5)
	private void laptop() {

	System.out.println("laptop");

	}
	@Test
	private void termsAndCondition() {

		System.out.println("termsAndCondition");

	}
}
