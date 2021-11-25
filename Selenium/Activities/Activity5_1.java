package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page=" + webDriver.getTitle());
        WebElement dynamicCheckbox=webDriver.findElement(By.xpath("//input[@class='willDisappear']"));
        if(dynamicCheckbox.isDisplayed()){
            System.out.println("Dynamic checkbox displayed on page="+dynamicCheckbox.isDisplayed());
            webDriver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
            System.out.println("Dynamic checkbox disappeared on page after clicking remove checkbox button");
            System.out.println("Dynamic checkbox displayed on page="+dynamicCheckbox.isDisplayed());

        }
        webDriver.close();
    }
}
