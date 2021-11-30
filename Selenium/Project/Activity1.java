package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(),"Alchemy Jobs – Job Board Application");
        Reporter.log("New Page title="+driver.getTitle());
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
