package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {

    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void validateSecondHeader(){
        WebElement secondHeader = driver.findElement(By.tagName("h2"));
        Reporter.log("Second Header on the page="+secondHeader.getText());
        Assert.assertEquals(secondHeader.getText(),"Quia quis non");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
