package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity10 {
    private WebDriver driver;
    private Actions builder;
    private WebElement slider;
    private String volumeLevel;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        builder = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/sliders");
        slider = driver.findElement(By.id("slider"));
    }

    @Test
    public void sliderToMiddleTest() {
        slider.click();
        volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Mid value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "50");
    }

    @Test
    public void sliderToMaxTest() {
        builder.clickAndHold(slider).moveByOffset(75, 0).release().build().perform();
        volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Max value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "100");
    }

    @Test
    public void sliderToMinTest() {
        builder.clickAndHold(slider).moveByOffset(-75, 0).release().build().perform();
        volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "0");
    }

    @Test
    public void sliderTo30Test() {
        builder.clickAndHold(slider).moveByOffset(-30, 0).release().build().perform();
        volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "30");
    }

    @Test
    public void sliderTo80Test() {
        builder.clickAndHold(slider).moveByOffset(45, 0).release().build().perform();
        volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "81");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
