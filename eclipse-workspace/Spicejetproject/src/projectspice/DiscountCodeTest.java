package projectspice;
package com.spicejet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DiscountCodeTest extends ReportTest {

    @Test
    public void testApplyDiscountCode() {
        ExtentTest test = extent.createTest("Discount Code Application Test");

        // Apply discount code
        WebElement discountCodeField = driver.findElement(By.id("discount-code-id"));
        WebElement applyButton = driver.findElement(By.id("apply-button-id"));

        discountCodeField.sendKeys("DISCOUNT2024");
        applyButton.click();

        // Verify discount applied
        WebElement discountAppliedMsg = driver.findElement(By.id("discount-applied-msg-id"));
        Assert.assertTrue(discountAppliedMsg.isDisplayed());
        test.pass("Discount code application test passed");
    }
}

