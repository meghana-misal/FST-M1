package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }
    @Test
    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(),"Training Support");
        driver.findElement(By.id("about-link")).click();
        System.out.println("New Page title="+driver.getTitle());
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
