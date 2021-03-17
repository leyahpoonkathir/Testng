package com.testng;

import org.testng.annotations.Test;

public class GroupingTest {
	@Test(groups="books")
	private void bookSearch() {

System.out.println("booksearch");

	}
	@Test(groups="books")
	private void novelSearch() {

System.out.println("novelSearch");

	}
	@Test(groups="electronics")
	private void laptop() {

System.out.println("laptop");

	}
	@Test(groups="electronics")
	private void mobile() {

System.out.println("mobile");

	}
	@Test(groups="electronics")
	private void earPhone() {

System.out.println("earphone");

	}
	@Test(groups="socialmedia")
	private void facebook() {

System.out.println("facebook");

	}
	@Test(groups="socialmedia")
	private void instagram() {

System.out.println("instagram");

	}

}
