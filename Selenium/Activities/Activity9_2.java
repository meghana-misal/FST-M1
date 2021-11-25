package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://training-support.net/selenium/selects");
        System.out.println("Title of the page=" + webDriver.getTitle());
        WebElement multiValue = webDriver.findElement(By.id("multi-value"));
        Select multiList = new Select(webDriver.findElement(By.id("multi-select")));
        if(multiList.isMultiple()) {
            multiList.selectByVisibleText("Javascript");
            System.out.println(multiValue.getText());
            multiList.selectByValue("node");
            System.out.println(multiValue.getText());
            for(int i=4; i<=6; i++) {
                multiList.selectByIndex(i);
            }
            System.out.println(multiValue.getText());
            multiList.deselectByValue("node");
            System.out.println(multiValue.getText());
            multiList.deselectByIndex(7);
            System.out.println(multiValue.getText());
            List<WebElement> selectedOptions = multiList.getAllSelectedOptions();
            for(WebElement selectedOption : selectedOptions) {
                System.out.println("Selected option: " + selectedOption.getText());
            }
            multiList.deselectAll();
            System.out.println(multiValue.getText());
        }
        webDriver.close();
    }
}
