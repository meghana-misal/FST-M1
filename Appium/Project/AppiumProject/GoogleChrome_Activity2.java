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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleChrome_Activity2 {
    AndroidDriver<MobileElement> driver = null;
    WebDriverWait wait;

    @BeforeMethod
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
            System.out.println("Google chrome is open");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.training-support.net/selenium");
    }

    @Test(priority = 1)
    public void testValidLogin() {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
        driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(5).scrollIntoView(textContains(\"Login Form\"))")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("username")));
        driver.findElementById("username").sendKeys("admin");
        driver.findElementById("password").sendKeys("password");
        driver.findElementByXPath("//android.widget.Button[contains(text(),'Log in')]").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("action-confirmation")));
        Assert.assertEquals(driver.findElementById("action-confirmation").getText(),"Welcome Back, admin");

    }
    @Test(priority = 2)
    public void testInvalidLogin() {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
        driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(5).scrollIntoView(textContains(\"Login Form\"))")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("username")));
        driver.findElementById("username").sendKeys("admin1");
        driver.findElementById("password").sendKeys("password1");
        driver.findElementByXPath("//android.widget.Button[contains(text(),'Log in')]").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("action-confirmation")));
        Assert.assertEquals(driver.findElementById("action-confirmation").getText(),"Invalid credentials");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
