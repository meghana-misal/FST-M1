package net.training_support.examples;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity4 {
    AndroidDriver<MobileElement> driver = null;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void addContact() {
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Create new contact")));
        driver.findElementByAccessibilityId("Create new contact").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@text='First name']")));
        MobileElement firstName = driver.findElementByXPath("//android.widget.EditText[@text='First name']");
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@text='Last name']")));
        MobileElement lastName = driver.findElementByXPath("//android.widget.EditText[@text='Last name']");
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@text='Phone']")));
        MobileElement phoneNumber = driver.findElementByXPath("//android.widget.EditText[@text='Phone']");

        firstName.sendKeys("Test");
        lastName.sendKeys("Appium");
        phoneNumber.sendKeys("4556677889");

        driver.findElementById("editor_menu_save_button").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));


        MobileElement mobileCard = driver.findElementById("toolbar_parent");
        Assert.assertTrue(mobileCard.isDisplayed());

        String contactName = driver.findElementById("large_title").getText();
        Assert.assertEquals(contactName, "Test Appium");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}