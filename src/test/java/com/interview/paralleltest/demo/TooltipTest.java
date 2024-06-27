package com.interview.paralleltest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.interview.webdrivefactory.StaticWebDriverFactory;

public class TooltipTest {
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
	    public void testTooltip() {
	        // Locate the element that has the tooltip
	        WebElement elementWithTooltip = driver.findElement(By.cssSelector(".tooltip-element")); // Replace with your element's selector

	        // Use Actions class to hover over the element
	        Actions actions = new Actions(driver);
	        actions.moveToElement(elementWithTooltip).perform();

	        // Locate the tooltip element (assuming it's displayed after hovering)
	        WebElement tooltip = driver.findElement(By.cssSelector(".tooltip-text")); // Replace with your tooltip's selector

	        // Get the tooltip text
	        String tooltipText = tooltip.getText();

	        // Print the tooltip text
	        System.out.println("Tooltip text: " + tooltipText);

	        // Assert the tooltip text (optional)
	        Assert.assertEquals(tooltipText, "Expected Tooltip Text"); // Replace with the expected tooltip text
	    }
}
