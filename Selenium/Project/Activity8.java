package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin/");
    }
    @Test
    public void loginToAlchemy (){
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        Assert.assertEquals(driver.getTitle(),"Dashboard ‹ Alchemy Jobs — WordPress");
        Reporter.log("Wordpress Page title="+driver.getTitle());
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
