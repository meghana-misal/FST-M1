package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import  org.openqa.selenium.Alert;

public class Activity11_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the page=" + driver.getTitle());

        WebElement simpleAlert = driver.findElement(By.id("simple"));
        WebElement confirmAlert = driver.findElement(By.id("confirm"));
        WebElement promptAlert = driver.findElement(By.id("prompt"));

        simpleAlert.click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Simple Alert text="+alert.getText());
        alert.accept();

        driver.close();
    }
}
