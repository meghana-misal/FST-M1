package net.training_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Title of the page=" + driver.getTitle());
        String mainWindow= driver.getWindowHandle();
        System.out.println("Handle of the page=" +mainWindow);

        WebElement launcher = driver.findElement(By.id("launcher"));
        launcher.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> handles = driver.getWindowHandles();
        for(String handle:handles){
            System.out.println("Opened Handles="+handle);
            driver.switchTo().window(handle);
        }
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("Title of the new page=" + driver.getTitle());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'sub')]")));
        System.out.println("Header of the new page=" + driver.findElement(By.xpath("//div[contains(@class,'sub')]")).getText());

        WebElement actionButton = driver.findElement(By.id("actionButton"));
        actionButton.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        handles = driver.getWindowHandles();
        for(String handle:handles){
            System.out.println("Opened Handles="+handle);
            driver.switchTo().window(handle);
        }
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("Title of the new page=" + driver.getTitle());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'sub')]")));
        System.out.println("Header of the new page=" + driver.findElement(By.xpath("//div[contains(@class,'sub')]")).getText());
        driver.quit();
    }
}
