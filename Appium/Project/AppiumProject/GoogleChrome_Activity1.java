package AppiumProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class GoogleChrome_Activity1 {
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
            System.out.println("Google chrome is open");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.training-support.net/selenium");
    }

    @Test
    public void testToDoListPage(){

        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
        driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(5).scrollIntoView(textContains(\"TO-DO List\"))")).click();
        String task1 ="Add tasks to list";
        String task2="Get number of tasks";
        String task3="Clear the list";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText")));
        driver.findElementByXPath("//android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys(task1);
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View[4]/android.view.View[1]/android.widget.Button")));
        driver.findElementByXPath("//android.view.View[4]/android.view.View[1]/android.widget.Button").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("taskInput")));
        driver.findElementById("taskInput").sendKeys(task2);
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View[4]/android.view.View[1]/android.widget.Button")));
        driver.findElementByXPath("//android.view.View[4]/android.view.View[1]/android.widget.Button").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("taskInput")));
        driver.findElementById("taskInput").sendKeys(task3);
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View[4]/android.view.View[1]/android.widget.Button")));
        driver.findElementByXPath("//android.view.View[4]/android.view.View[1]/android.widget.Button").click();

        driver.findElementByXPath("//android.view.View[contains(text(),'"+task1+"')]").click();
        driver.findElementByXPath("//android.view.View[contains(text(),'"+task2+"')]").click();
        driver.findElementByXPath("//android.view.View[contains(text(),'"+task3+"')]").click();
        driver.findElementByXPath("//android.view.View[contains(text(),'Clear List')]").click();

        List<MobileElement> tasks = driver.findElementsById("tasksList");
        Assert.assertEquals(tasks.size(), 0);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
