package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://training-support.net/selenium/tables");
        System.out.println("Title of the page=" + webDriver.getTitle());
        List<WebElement> cols = webDriver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
        List<WebElement> rows = webDriver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of columns are: " + cols.size());
        System.out.println("Number of rows are: " + rows.size());
        WebElement cellValueBefore = webDriver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value(Before sorting): " + cellValueBefore.getText());
        webDriver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();
        WebElement cellValueAfter = webDriver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value(After sorting): " + cellValueAfter.getText());
        WebElement footer = webDriver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Table footer values: " + footer.getText());
        webDriver.close();
    }
}
