package projectspice;
package com.spicejet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightSelectionTest extends ReportTest {

    @Test
    public void testSelectFlight() {
        ExtentTest test = extent.createTest("Flight Selection Test");
        
        WebElement flightOption = driver.findElement(By.xpath("//input[@value='Select Flight']"));
        flightOption.click();

        WebElement continueButton = driver.findElement(By.id("continue-button-id"));
        continueButton.click();

        Assert.assertTrue(driver.getTitle().contains("Passenger Details"));
        test.pass("Flight selection test passed");
    }
}

