package com.testng;

import org.testng.annotations.Test;

public class Exception_Test {
	@Test(expectedExceptions=StringIndexOutOfBoundsException.class)
	
	private void add() {

String s="greens";
System.out.println(s);
System.out.println(s.charAt(8));

	}

}
