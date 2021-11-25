package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        webDriver.get("https://training-support.net/selenium/ajax");
        System.out.println("Title of the page=" + webDriver.getTitle());
        WebElement changeContentButton=webDriver.findElement(By.xpath("//button[contains(@class,'violet')]"));
        changeContentButton.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
        String ajaxText = webDriver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxText);

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        String lateText = webDriver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);
        webDriver.close();
    }
}
