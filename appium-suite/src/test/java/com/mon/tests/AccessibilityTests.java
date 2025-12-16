package com.mon.tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * Accessibility validation tests for login screen elements.
 */
public class AccessibilityTests extends BaseTest {

    @Test
    public void loginScreenAccessible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement username = wait.until(
                ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.example.demoapp:id/username"))
        );
        WebElement password = wait.until(
                ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.example.demoapp:id/password"))
        );
        WebElement submit = wait.until(
                ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.example.demoapp:id/submit"))
        );

        // Text / label validation
        Assert.assertFalse(username.getText().isEmpty(), "Username must be labeled");
        Assert.assertFalse(password.getText().isEmpty(), "Password must be labeled");

        // Accessibility (TalkBack / VoiceOver)
        String contentDesc = submit.getAttribute("contentDescription");
        Assert.assertTrue(contentDesc != null && !contentDesc.isEmpty(),
                "Submit needs contentDescription for screen readers");
    }

    @Test
    public void lightweightCheck() {
        System.out.println("AccessibilityTests discovered!");
    }
}