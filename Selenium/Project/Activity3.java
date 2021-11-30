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

public class Activity3 {

    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void printHeaderImageURL(){
        WebElement headerImage = driver.findElement(By.xpath("//div[contains(@class,'post-thumb-img-content')]/img"));
        Reporter.log("URL of the header image="+headerImage.getAttribute("src"));
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
