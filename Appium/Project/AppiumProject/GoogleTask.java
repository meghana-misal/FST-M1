package AppiumProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
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

public class GoogleTask {
    AndroidDriver<MobileElement> driver = null;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel4Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "uiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            wait = new WebDriverWait(driver, 30);
            System.out.println("Google Tasks App is open");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void addTasks() {
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String task1="Complete Activity with Google Tasks";
        String task2="Complete Activity with Google Keep";
        String task3="Complete the second Activity Google Keep";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Create new task']")));
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Create new task']").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
        driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys(task1);

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.apps.tasks:id/add_task_done")));
        driver.findElement(MobileBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Create new task']")));
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Create new task']").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
        driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys(task2);

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.apps.tasks:id/add_task_done")));
        driver.findElement(MobileBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Create new task']")));
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Create new task']").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
        driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys(task3);

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.apps.tasks:id/add_task_done")));
        driver.findElement(MobileBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

        String actualTask1= driver.findElementByXPath("//android.widget.TextView[@text='"+task1+"']").getText();
        String actualTask2= driver.findElementByXPath("//android.widget.TextView[@text='"+task2+"']").getText();
        String actualTask3= driver.findElementByXPath("//android.widget.TextView[@text='"+task3+"']").getText();
        Assert.assertEquals(actualTask1,task1);
        Assert.assertEquals(actualTask2,task2);
        Assert.assertEquals(actualTask3,task3);
    }

    @AfterMethod
    public void tearDown(){
         driver.quit();
    }
}


