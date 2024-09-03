package projectspice;
package com.spicejet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends ReportTest {

    @Test
    public void testPayment() {
        ExtentTest test = extent.createTest("Payment Test");
        
        // Select payment method
        WebElement paymentMethod = driver.findElement(By.id("payment-method-id"));
        paymentMethod.click();

        // Fill payment details
        WebElement cardNumber = driver.findElement(By.id("card-number-id"));
        WebElement expiryDate = driver.findElement(By.id("expiry-date-id"));
        WebElement cvv = driver.findElement(By.id("cvv-id"));

        cardNumber.sendKeys("4111111111111111");
        expiryDate.sendKeys("12/25");
        cvv.sendKeys("123");

        WebElement payNowButton = driver.findElement(By.id("pay-now-button-id"));
        payNowButton.click();

        Assert.assertTrue(driver.getTitle().contains("Booking Confirmation"));
        test.pass("Payment test passed");
    }
}

