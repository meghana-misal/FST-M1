package AppiumProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleKeep {

    AndroidDriver<MobileElement> driver = null;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel4Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "uiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            wait = new WebDriverWait(driver, 30);
            System.out.println("Google Keep app is open");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void createNewNote(){

        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"New text note\"]")));
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"New text note\"]").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.keep:id/editable_title")));
        driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Testing Appium Automation");

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.keep:id/edit_note_text")));
        driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Testing Appium Description");

        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Open navigation drawer")));
        driver.findElementByAccessibilityId("Open navigation drawer").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.keep:id/notes")));
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//androidx.cardview.widget.CardView[@content-desc=\"Testing Appium Automation. Testing Appium Description. \"]")));
        String actualNote = driver.findElementByXPath("//androidx.cardview.widget.CardView[@content-desc=\"Testing Appium Automation. Testing Appium Description. \"]").getText();
        System.out.println(actualNote);
        Assert.assertTrue(actualNote.contains("Testing Appium Automation"));
    }


    @AfterMethod
    public void tearDown(){
         driver.quit();
    }
}
