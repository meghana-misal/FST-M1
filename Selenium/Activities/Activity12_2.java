package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        System.out.println("Title of the page=" + driver.getTitle());

        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        System.out.println("Nested frame 1 heading=" + driver.findElement(By.xpath("//div[contains(@class,'content')]")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        System.out.println("Nested frame 2 heading=" + driver.findElement(By.xpath("//div[contains(@class,'content')]")).getText());

        driver.close();
    }
}
