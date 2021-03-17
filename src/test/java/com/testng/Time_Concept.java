package com.testng;

import org.testng.annotations.Test;

public class Time_Concept {

@Test(timeOut=4000)
private void navigateToPage() throws InterruptedException {

System.out.println("button click");
Thread.sleep(3000);
System.out.println("navigate");

}

}
