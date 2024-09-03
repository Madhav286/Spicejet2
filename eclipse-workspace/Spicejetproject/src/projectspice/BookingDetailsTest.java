package projectspice;
package com.spicejet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingDetailsTest extends ReportTest {

    @Test
    public void testBookingDetails() {
        ExtentTest test = extent.createTest("Booking Details Test");
        
        // Fill passenger details
        WebElement passengerName = driver.findElement(By.id("passenger-name-id"));
        WebElement passengerAge = driver.findElement(By.id("passenger-age-id"));
        WebElement passengerGender = driver.findElement(By.id("passenger-gender-id"));

        passengerName.sendKeys("John Doe");
        passengerAge.sendKeys("30");
        passengerGender.sendKeys("Male");

        WebElement continueButton = driver.findElement(By.id("continue-button-id"));
        continueButton.click();

        Assert.assertTrue(driver.getTitle().contains("Payment"));
        test.pass("Booking details test passed");
    }
}

