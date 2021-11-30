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

import java.time.Duration;
import java.util.List;

public class Activity6 {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void applyForJob(){
        driver.findElement(By.linkText("Jobs")).click();
        Assert.assertEquals(driver.getTitle(),"Jobs – Alchemy Jobs");
        Reporter.log("Jobs Page title="+driver.getTitle());
        Reporter.log("Navigated to Jobs page verified");
        System.out.println("Jobs Page title="+driver.getTitle());
        System.out.println("Navigated to Jobs page verified");
        driver.findElement(By.id("search_keywords")).sendKeys("Banking");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> listOfJobs_banking= driver.findElements(By.xpath("//ul[@class='job_listings']/li"));
        listOfJobs_banking.get(0).click();
        Reporter.log("First job clicked from list of banking job");
        driver.findElement(By.xpath("//input[contains(@class,'application_button')]")).click();
        Reporter.log("Applied for the job");
        String email = driver.findElement(By.className("job_application_email")).getText();
        Reporter.log("To apply for this job email your details to "+ email);
    }

    @AfterClass
    public void tearDown(){
        //driver.close();
    }
}
