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

public class Activity7 {
    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");

    }
    @Test
    public void postTheJob(){
        driver.findElement(By.linkText("Post a Job")).click();
        Assert.assertEquals(driver.getTitle(),"Post a Job – Alchemy Jobs");
        Reporter.log("Post Jobs Page title="+driver.getTitle());
        Reporter.log("Navigated to post Jobs page verified");
        System.out.println("Post Jobs Page title="+driver.getTitle());
        System.out.println("Navigated to Post Jobs page verified");


        driver.findElement(By.xpath("//a[@class='button' and contains(text(),'Sign in')]")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();

        WebElement jobTitle = driver.findElement(By.id("job_title"));
        jobTitle.clear();
        jobTitle.sendKeys("Banking");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
        driver.switchTo().frame(0);
        WebElement description =  driver.findElement(By.xpath("//body[@id='tinymce']"));
        description.click();
        description.sendKeys("test description");
        driver.switchTo().defaultContent();

        WebElement companyName = driver.findElement(By.id("company_name"));
        companyName.clear();
        companyName.sendKeys("IBM");

        WebElement companyWebsite =  driver.findElement(By.id("company_website"));
        companyWebsite.clear();
        companyWebsite.sendKeys("https://www.ibm.com/in-en");

        WebElement cTagline= driver.findElement(By.id("company_tagline"));
        cTagline.clear();
        cTagline.sendKeys("Intelligence Business Machines ");

        String videoURL= "https://video.ibm.com/IBMCloudVideo";
        WebElement video = driver.findElement(By.id("company_video"));
        video.clear();
        video.sendKeys(videoURL);

        WebElement twitter = driver.findElement(By.id("company_twitter"));
        twitter.clear();
        twitter.sendKeys("@ibm");

        driver.findElement(By.xpath("//input[@name='submit_job']")).click();
        driver.findElement(By.id("job_preview_submit_button")).click();
        Reporter.log("Job Submitted");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
