package com.mon.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName(System.getProperty("deviceName", "Pixel_6"))
                .setAutomationName("UiAutomator2")
                .setAutoGrantPermissions(true)
                .setAppPackage("com.example.demoapp")
                .setAppActivity(".MainActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        System.out.println("Session started with ID: " + driver.getSessionId());
        System.out.println("Current activity: " + driver.currentActivity());
        System.out.println("Current package: " + driver.getCurrentPackage());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}