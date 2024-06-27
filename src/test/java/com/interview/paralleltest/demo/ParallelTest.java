package com.interview.paralleltest.demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.interview.webdrivefactory.StaticWebDriverFactory;

public class ParallelTest {
	WebDriver driver;

@BeforeMethod
public void setUp() {
    driver = StaticWebDriverFactory.getDriver();
}

@AfterMethod
public void tearDown() {
    StaticWebDriverFactory.removeDriver();
}

@Test
public void testMethod1() {
    driver.get("https://www.google.com");
    // Add your test steps here
}

@Test
public void testMethod2() {
    driver.get("https://www.facebbok.com");
    // Add your test steps here
}


}
