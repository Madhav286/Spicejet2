package projectspice;
package com.spicejet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightSearchTest extends ReportTest {

    @Test
    public void testSearchFlight() {
        ExtentTest test = extent.createTest("Flight Search Test");
        
        WebElement origin = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        origin.sendKeys("Mumbai");

        WebElement destination = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
        destination.sendKeys("Delhi");

        WebElement searchButton = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
        searchButton.click();

        // Verify search results
        Assert.assertTrue(driver.getPageSource().contains("Select your departure"));
        test.pass("Flight search test passed");
    }
}

