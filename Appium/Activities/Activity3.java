package net.training_support.examples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    AndroidDriver<MobileElement> driver = null;

    @BeforeClass
    public void setUp() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel4Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "uiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            System.out.println("Calculator is open");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 1)
    public void testAdd() {
        driver.findElementById("digit_5").click();
        driver.findElementByAccessibilityId("plus").click();
        driver.findElementByXPath("//android.widget.Button[@text='9']").click();
        driver.findElementById("eq").click();
        String result= driver.findElement(MobileBy.id("result")).getText();
        System.out.println("Result="+result);
        Assert.assertEquals(result, "14");

    }
    @Test(priority = 2)
    public void subtract() {
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("op_sub").click();
        driver.findElementById("digit_5").click();
        driver.findElementById("eq").click();
        String result = driver.findElementById("result").getText();
        Assert.assertEquals(result, "5");
    }

    @Test(priority = 3)
    public void multiply() {
        driver.findElementById("digit_5").click();
        driver.findElementById("op_mul").click();
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("eq").click();
        String result = driver.findElementById("result").getText();
        Assert.assertEquals(result, "500");
    }

    @Test(priority = 4)
    public void divide() {
        driver.findElementById("digit_5").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("op_div").click();
        driver.findElementById("digit_2").click();
        driver.findElementById("eq").click();
        String result = driver.findElementById("result").getText();
        Assert.assertEquals(result, "25");
    }

    @AfterClass
    public void tearDown(){
        if(driver!=null) {
            driver.quit();
        }
    }
}
