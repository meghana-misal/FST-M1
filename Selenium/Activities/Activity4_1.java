package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://training-support.net");
        System.out.println("Title of the page=" + webDriver.getTitle());
        webDriver.findElement(By.xpath("//a[@id='about-link']")).click();
        System.out.println("Title of the page after Clicking on about us=" + webDriver.getTitle());
        webDriver.close();
    }
}
