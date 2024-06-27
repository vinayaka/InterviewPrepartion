package com.interview.RunningTestonLatest.Broser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		

		
		        // Setup WebDriverManager to manage ChromeDriver
		        WebDriverManager.chromedriver().setup();

		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to a website
		        driver.get("https://www.google.com");

		        // Perform actions or assertions
		        System.out.println("Page title is: " + driver.getTitle());

		        // Close the browser
		        driver.quit();
		    }
	

	}


