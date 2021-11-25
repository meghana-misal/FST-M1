package net.training_support;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the page=" + driver.getTitle());
        WebElement confirmAlert = driver.findElement(By.id("confirm"));


        confirmAlert.click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Confirm Alert text="+alert.getText());
        alert.accept();

        confirmAlert.click();
        alert = driver.switchTo().alert();
        System.out.println("Confirm Alert text="+alert.getText());
        alert.dismiss();

        driver.close();
    }
}
