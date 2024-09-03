package projectspice;
package com.spicejet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingConfirmationTest extends ReportTest {

    @Test
    public void testBookingConfirmation() {
        ExtentTest test = extent.createTest("Booking Confirmation Test");

        // Confirm booking
        WebElement confirmButton = driver.findElement(By.id("confirm-button-id"));
        confirmButton.click();

        // Verify booking confirmation
        WebElement bookingMsg = driver.findElement(By.id("booking-msg-id"));
        Assert.assertTrue(bookingMsg.isDisplayed());
        test.pass("Booking confirmation test passed");
    }
}

