package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/iframes");
        System.out.println("Title of the page=" + driver.getTitle());

        driver.switchTo().frame(0);
        System.out.println("Details of first frame....");
        System.out.println("heading=" + driver.findElement(By.xpath("//div[contains(@class,'content')]")).getText());
        System.out.println("sub heading=" + driver.findElement(By.xpath("//div[contains(@class,'sub')]")).getText());
        WebElement actionButton= driver.findElement(By.id("actionButton"));
        System.out.println("Text of button="+actionButton.getText());
        System.out.println("color of button="+actionButton.getCssValue("color"));
        actionButton.click();
        System.out.println("Text of button after click="+actionButton.getText());
        System.out.println("color of button after click="+actionButton.getCssValue("color"));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        System.out.println("Details of Second frame....");
        System.out.println("heading=" + driver.findElement(By.xpath("//div[contains(@class,'content')]")).getText());
        System.out.println("sub heading=" + driver.findElement(By.xpath("//div[contains(@class,'sub')]")).getText());
        actionButton= driver.findElement(By.id("actionButton"));
        System.out.println("Text of button="+actionButton.getText());
        System.out.println("color of button="+actionButton.getCssValue("color"));
        actionButton.click();
        System.out.println("Text of button after click="+actionButton.getText());
        System.out.println("color of button after click="+actionButton.getCssValue("color"));

        driver.close();
    }
}
