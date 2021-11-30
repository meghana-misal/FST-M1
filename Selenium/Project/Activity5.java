package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void validateJobsPageTitle(){
        driver.findElement(By.linkText("Jobs")).click();
        Assert.assertEquals(driver.getTitle(),"Jobs – Alchemy Jobs");
        Reporter.log("Jobs Page title="+driver.getTitle());
        Reporter.log("Navigated to Jobs page verified");
        System.out.println("Jobs Page title="+driver.getTitle());
        System.out.println("Navigated to Jobs page verified");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
