package projectspice;
package com.spicejet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeatSelectionTest extends ReportTest {

    @Test
    public void testSeatSelection() {
        ExtentTest test = extent.createTest("Seat Selection Test");

        // Select a seat
        WebElement seat = driver.findElement(By.id("seat-id"));
        seat.click();

        WebElement continueButton = driver.findElement(By.id("continue-button-id"));
        continueButton.click();

        Assert.assertTrue(driver.getTitle().contains("Add-ons Selection"));
        test.pass("Seat selection test passed");
    }
}

