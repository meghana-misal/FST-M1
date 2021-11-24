package net.training_support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args){
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.google.com");
        webDriver.close();
    }
}
