package net.training_support;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }
    @Test(priority = 1)
    public void simpleAlertTestCase(){
        driver.findElement(By.id("simple")).click();
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Switched to Simple Alert");
        Reporter.log("Simple Alert text =" + simpleAlert.getText());
        Assert.assertEquals("This is a JavaScript Alert!", simpleAlert.getText());
        simpleAlert.accept();
    }
    @Test (priority = 2)
    public void confirmAlertTestCase(){
        driver.findElement(By.id("confirm")).click();
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Switched to confirm Alert");
        Reporter.log("Confirm alert text =" + confirmAlert.getText());
        Assert.assertEquals("This is a JavaScript Confirmation!", confirmAlert.getText());
        confirmAlert.accept();
    }
    @Test(priority = 3)
    public void promptAlertTestCase(){
        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Switched to Prompt Alert");
        Reporter.log("Prompt alert text =" + promptAlert.getText());
        promptAlert.sendKeys("Hello!");
        Assert.assertEquals("This is a JavaScript Prompt!", promptAlert.getText());
        promptAlert.accept();
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
