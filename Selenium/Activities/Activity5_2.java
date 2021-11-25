package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page=" + webDriver.getTitle());
        WebElement dynamicCheckbox=webDriver.findElement(By.xpath("//input[@class='willDisappear']"));
        if(dynamicCheckbox.isDisplayed()){
            System.out.println("Dynamic checkbox selected on page="+dynamicCheckbox.isSelected());
            dynamicCheckbox.click();
            System.out.println("Dynamic checkbox selected on page="+dynamicCheckbox.isSelected());
        }
        webDriver.close();
    }
}


