package com.interview.webdrivefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebDriverFactory {
	/*
	 * 
	 * I have static driver and i want to run the test case in parallel mode how you
	 * configure TestNG to run in parallel mode Explanation:
	 *  ThreadLocal WebDriver:
	 * The WebDriverFactory class uses ThreadLocal<WebDriver> to store the WebDriver
	 * instance. This ensures each thread has its own instance of the WebDriver.
	 * 
	 * Test Setup and Teardown: In the ParallelTest class, the setUp method
	 * retrieves the WebDriver instance for the current thread, and the tearDown
	 * method quits and removes the WebDriver instance after the test method
	 * completes.
	 * 
	 * Parallel Execution: The testng.xml configuration sets the suite to run
	 * methods in parallel with a specified number of threads (thread-count). This
	 * will ensure that your test methods run in parallel with each having its own
	 * WebDriver instance.
	 * 
	 * By using ThreadLocal<WebDriver>, you avoid the issues of sharing a static
	 * WebDriver instance across multiple parallel tests, leading to reliable and
	 * consistent test execution.
	 */
private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

public static WebDriver getDriver() {
    if (driver.get() == null) {
        // Set the driver instance for the current thread
        driver.set(createDriver());
    }
    return driver.get();
}

public static void removeDriver() {
    driver.get().quit();
    driver.remove();
}

private static WebDriver createDriver() {
    // Initialize your WebDriver here (e.g., ChromeDriver, FirefoxDriver)
    WebDriver driver = new ChromeDriver();
    return driver;
}}
