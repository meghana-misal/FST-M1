package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        webDriver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of the page=" + webDriver.getTitle());
        webDriver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("meghana");
        webDriver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("password");
        webDriver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("password");
        webDriver.findElement(By.xpath("//input[contains(@class,'email-')]")).sendKeys("meghana.misal@ibm.com");
        webDriver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        System.out.println("Login message=" + webDriver.findElement(By.id("action-confirmation")).getText());
        webDriver.close();
    }
}
