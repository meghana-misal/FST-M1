package net.training_support.examples;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity2 {
    AndroidDriver<MobileElement> driver = null;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel4Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "uiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            System.out.println("chrome is open");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        wait = new WebDriverWait(driver, 10);
    }
    @Test
    public void verifyTitle(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.training-support.net/");
        String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
        System.out.println("Title on Homepage: " + pageTitle);
        MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@resource-id='about-link']");
        aboutButton.click();
        String newPageTitle = driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]")
                .getText();
        System.out.println("Title on new page: " + newPageTitle);
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
    }

    @AfterClass
    public void tearDown(){
        if(driver!=null) {
           // driver.quit();
        }
    }
}
