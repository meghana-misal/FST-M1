package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        webDriver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of the page=" + webDriver.getTitle());
        webDriver.findElement(By.xpath("//input[contains(@class,'username-')]")).sendKeys("admin");
        webDriver.findElement(By.xpath("//input[contains(@class,'password-')]")).sendKeys("password");
        webDriver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        System.out.println(webDriver.findElement(By.id("action-confirmation")).getText());
        webDriver.close();
    }
}
