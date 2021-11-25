package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page=" + webDriver.getTitle());
        WebElement textField=webDriver.findElement(By.xpath("//input[@id='input-text']"));
        System.out.println("TextField enabled="+textField.isEnabled());
        webDriver.findElement(By.xpath("//button[@id='toggleInput']")).click();
        System.out.println("TextField enabled="+textField.isEnabled());
        webDriver.close();
    }
}
