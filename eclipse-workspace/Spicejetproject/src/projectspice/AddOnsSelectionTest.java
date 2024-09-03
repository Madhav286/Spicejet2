package projectspice;
package com.spicejet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddOnsSelectionTest extends ReportTest {

    @Test
    public void testAddOnsSelection() {
        ExtentTest test = extent.createTest("Add-ons Selection Test");

        // Select add-ons
        WebElement addOn = driver.findElement(By.id("addon-id"));
        addOn.click();

        WebElement continueButton = driver.findElement(By.id("continue-button-id"));
        continueButton.click();

        Assert.assertTrue(driver.getTitle().contains("Payment"));
        test.pass("Add-ons selection test passed");
    }
}

