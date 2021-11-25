package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        webDriver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page=" + webDriver.getTitle());
        WebElement dynamicCheckbox=webDriver.findElement(By.xpath("//input[@class='willDisappear']"));
        WebElement toggleCheckboxButton=webDriver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        toggleCheckboxButton.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicCheckbox));
        toggleCheckboxButton.click();
        wait.until(ExpectedConditions.visibilityOf(dynamicCheckbox));
        dynamicCheckbox.click();
        webDriver.close();
    }
}
