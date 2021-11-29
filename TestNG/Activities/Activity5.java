package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    private WebDriver driver;

    @BeforeClass (alwaysRun = true)
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test(priority = 1, groups = {"HeaderTests", "ButtonTests"})
    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(),"Target Practice");
        System.out.println("New Page title="+driver.getTitle());
    }

    @Test(priority = 2, groups = {"HeaderTests"})
    public void headerTest1(){
        String thirdheader = driver.findElement(By.id("third-header")).getText();
        Assert.assertEquals(thirdheader,"Third header");
    }

    @Test(priority = 3,groups = {"HeaderTests"})
    public void headerTest2(){
        String h5Color = driver.findElement(By.tagName("h5")).getCssValue("color");
        Assert.assertEquals(h5Color,"rgb(33, 186, 69)");
    }

    @Test(priority = 4,groups = {"ButtonTests"})
    public void buttonTest1(){
        String buttonText = driver.findElement(By.xpath("//button[contains(@class,'olive')]")).getText();
        Assert.assertEquals(buttonText,"Olive");
    }

    @Test(priority = 5,groups = {"ButtonTests"})
    public void buttonTest2(){
        String buttonColor = driver.findElement(By.xpath("//button[contains(@class,'brown')]")).getCssValue("color");
        Assert.assertEquals(buttonColor,"rgb(255, 255, 255)");
    }
    @AfterClass (alwaysRun = true)
    public void tearDown(){
        driver.close();
    }
}
