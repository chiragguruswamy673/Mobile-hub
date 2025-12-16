package com.mon.tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginWithValidCredentials() {
        driver.findElement(AppiumBy.id("com.example.demoapp:id/username")).sendKeys("user");
        driver.findElement(AppiumBy.id("com.example.demoapp:id/password")).sendKeys("pass");
        driver.findElement(AppiumBy.id("com.example.demoapp:id/submit")).click();
        Assert.assertTrue(driver.findElement(AppiumBy.id("com.example.demoapp:id/submit")).isDisplayed());
    }

    @Test
    public void loginWithEmptyCredentials() {
        driver.findElement(AppiumBy.id("com.example.demoapp:id/submit")).click();
        Assert.assertTrue(driver.findElement(AppiumBy.id("com.example.demoapp:id/username")).isDisplayed());
    }
}