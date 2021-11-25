package net.training_support;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the page=" + driver.getTitle());

        WebElement promptAlert = driver.findElement(By.id("prompt"));

        promptAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Yes, you are!");
        System.out.println("Prompt Alert text="+alert.getText());
        alert.accept();

        driver.close();
    }
}
