package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/login-form");
    }
    @Test
    public void loginConfirmation(){
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String message= driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(message,"Welcome Back, admin");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
