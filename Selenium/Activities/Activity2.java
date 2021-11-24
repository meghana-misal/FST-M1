package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.training-support.net");
        System.out.println("Title of the page="+webDriver.getTitle());
        WebElement aboutUsID = webDriver.findElement(By.id("about-link"));
        System.out.println("ID="+aboutUsID.getText());
        WebElement aboutUsIDClassName = webDriver.findElement(By.xpath("//a[@class='ui inverted huge green button']"));
        System.out.println("ClassName="+aboutUsIDClassName.getText());
        WebElement aboutUsIDLinkText = webDriver.findElement(By.linkText("About Us"));
        System.out.println("linkText="+aboutUsIDLinkText.getText());
        WebElement aboutUsIDCSS = webDriver.findElement(By.cssSelector("a.ui"));
        System.out.println("css="+aboutUsIDCSS.getText());
        webDriver.close();
    }
}
