package com.mon.tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChaosCheckoutTests extends BaseTest {

    @Test
    public void cartAndCheckoutFlow() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Tap on Cart button
        WebElement cartBtn = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.id("com.example.demoapp:id/cart")));
        cartBtn.click();

        // Assert that Cart button is displayed
        Assert.assertTrue(cartBtn.isDisplayed(), "Cart button should be visible and clickable");

        // Tap on Checkout button
        WebElement checkoutBtn = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.id("com.example.demoapp:id/checkout")));
        checkoutBtn.click();

        // Assert that Checkout button is displayed
        Assert.assertTrue(checkoutBtn.isDisplayed(), "Checkout button should be visible and clickable");
    }
    @Test
    public void checkoutButtonIsClickable() {
        WebElement checkoutBtn = driver.findElement(AppiumBy.id("com.example.demoapp:id/checkout"));
        checkoutBtn.click();
        Assert.assertTrue(checkoutBtn.isDisplayed(), "Checkout button should be visible and clickable");
    }
}