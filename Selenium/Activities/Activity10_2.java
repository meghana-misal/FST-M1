package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of the page=" + driver.getTitle());

        WebElement keyPressedElement = driver.findElement(By.id("keyPressed"));
        Actions actions = new Actions(driver);

        actions.sendKeys("S").build().perform();
        System.out.println("Pressed key is: " + keyPressedElement.getText());

        actions.keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build().perform();
        System.out.println("Pressed key is: " + keyPressedElement.getText());
        driver.close();
    }
}
