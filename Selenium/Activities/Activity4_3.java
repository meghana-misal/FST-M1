package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://training-support.net/selenium/target-practice");
        System.out.println("Title of the page=" + webDriver.getTitle());
        if(webDriver.findElement(By.xpath("//h3[@id='third-header']")).isDisplayed())
        {
            System.out.println("Third Header available");
        }
        else{
            System.out.println("Third Header not available");
        }
        String h5Color=webDriver.findElement(By.xpath("//h5[contains(@class,'green')]")).getCssValue("color");
        System.out.println("Fifth header color is ="+h5Color);
        WebElement violetButton = webDriver.findElement(By.xpath("//button[contains(@class,'violet ')]"));
        System.out.println("background-color of violet button="+violetButton.getCssValue("background-color"));
        System.out.println("color of violet button="+violetButton.getCssValue("color"));
        System.out.println("text-shadow of violet button="+violetButton.getCssValue("text-shadow"));
        System.out.println("background-image of violet button="+violetButton.getCssValue("background-image"));
        WebElement greyButton = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        System.out.println("The grey button's text =" + greyButton.getText());
        webDriver.close();
    }

}
