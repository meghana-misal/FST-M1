package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity9 {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin/");
    }
    @Test
    public void loginToAlchemyAndPostTheJob(){
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        Assert.assertEquals(driver.getTitle(),"Dashboard ‹ Alchemy Jobs — WordPress");
        Reporter.log("Wordpress Page title="+driver.getTitle());

        driver.findElement(By.xpath("//div[@class='wp-menu-name' and contains(text(),'Job Listings')]")).click();
        driver.findElement(By.className("page-title-action")).click();

        driver.findElement(By.id("post-title-0")).sendKeys("Test automation Specialist");
        driver.findElement(By.id("_job_location")).sendKeys("Pune");
        driver.findElement(By.id("_company_name")).sendKeys("IBM");
        driver.findElement(By.id("_company_website")).sendKeys("https://www.ibm.com");
        driver.findElement(By.id("_company_tagline")).sendKeys("This is test tagline");

        driver.findElement(By.xpath("//button[contains(@class,'post-publish-button')]")).click();
        driver.findElement(By.xpath("(//button[contains(@class,'post-publish-button')])[2]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.linkText("View Job")).click();
        String jobTitle = driver.findElement(By.className("entry-title")).getText();
        Assert.assertEquals(jobTitle,"Test automation Specialist");
    }

    @AfterClass
    public void tearDown(){
        //driver.close();
    }
}
