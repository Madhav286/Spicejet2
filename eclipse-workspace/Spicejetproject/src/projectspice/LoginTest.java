package projectspice;
package com.spicejet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ReportTest {

    @Test
    public void testValidLogin() {
        ExtentTest test = extent.createTest("Valid Login Test");
        
        WebElement loginButton = driver.findElement(By.id("ctl00_HyperLinkLogin"));
        loginButton.click();
        
        // Enter valid credentials
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        
        emailField.sendKeys("test@example.com");
        passwordField.sendKeys("password");
        submitButton.click();
        
        // Verify login success
        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
        test.pass("Login test passed");
    }

    @Test
    public void testInvalidLogin() {
        ExtentTest test = extent.createTest("Invalid Login Test");
        
        WebElement loginButton = driver.findElement(By.id("ctl00_HyperLinkLogin"));
        loginButton.click();
        
        // Enter invalid credentials
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        
        emailField.sendKeys("invalid@example.com");
        passwordField.sendKeys("wrongpassword");
        submitButton.click();
        
        // Verify error message
        WebElement errorMsg = driver.findElement(By.id("error-message-id"));
        Assert.assertTrue(errorMsg.isDisplayed());
        test.pass("Invalid login test passed");
    }
}


