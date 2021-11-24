package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title of the page=" + webDriver.getTitle());
        webDriver.findElement(By.id("firstName")).sendKeys("Meghana");
        webDriver.findElement(By.id("lastName")).sendKeys("Misal");
        webDriver.findElement(By.id("email")).sendKeys("meghana.misal@ibm.com");
        webDriver.findElement(By.id("number")).sendKeys("8879224532");
        webDriver.findElement(By.tagName("textarea")).sendKeys("good");
        webDriver.findElement(By.xpath("//input[@value='submit']")).click();
        webDriver.close();
    }
}
