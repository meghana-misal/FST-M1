package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/target-practice");
    }
    @Test(priority = 1)
    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(),"Target Practice");
        System.out.println("Page title="+driver.getTitle());
    }
    @Test(priority = 2)
    public void checkBackButton(){
        WebElement blackButton = driver.findElement(By.id("blackButton"));
        Assert.assertTrue(blackButton.isDisplayed());
    }
    @Test(priority = 3,enabled = false)
    public void thirdTest(){
        WebElement blackButton = driver.findElement(By.id("blackButton"));
        Assert.assertTrue(blackButton.isDisplayed());
    }

    @Test(priority = 4)
    public void fourthTest() throws SkipException {
        throw new SkipException("Skipping test case");
    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
