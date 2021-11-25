package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://training-support.net/selenium/selects");
        System.out.println("Title of the page=" + webDriver.getTitle());
        WebElement options = webDriver.findElement(By.id("single-select"));
        Select dropdown = new Select(options);
        dropdown.selectByVisibleText("Option 2");
        System.out.println(options.getText());
        dropdown.selectByIndex(3);
        System.out.println(options.getText());
        dropdown.selectByValue("4");
        System.out.println(options.getText());
        for(WebElement option : dropdown.getOptions()) {
            System.out.println("Option: " + option.getText());
        }
        webDriver.close();
    }
}
