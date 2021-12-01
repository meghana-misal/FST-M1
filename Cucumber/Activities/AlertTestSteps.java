package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertTestSteps {
    private WebDriver driver;
    private WebDriverWait wait;
    private Alert alert;
    private String alertText;

    @Given("User is on the page")
    public void userIsOnThePage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @When("User clicks the Simple Alert button")
    public void userClicksTheSimpleAlertButton() {
        driver.findElement(By.id("simple")).click();
    }

    @Then("Alert opens")
    public void alertOpens() {
        alert =  driver.switchTo().alert();
    }

    @And("Read the text from it and print it")
    public void readTheTextFromItAndPrintIt() {
        alertText= alert.getText();
    }

    @And("Close the alert")
    public void closeTheAlert() {
        alert.accept();
    }

    @And("Read the result text")
    public void readTheResultText() {
        System.out.println("Alert text is= "+alertText);
    }

    @And("Close Browser")
    public void closeBrowser() {
        driver.close();
    }

    @When("User clicks the Prompt Alert button")
    public void userClicksThePromptAlertButton() {
        driver.findElement(By.id("prompt")).click();
    }

    @And("Write a custom message in it")
    public void writeACustomMessageInIt() {
        alert.sendKeys("Custom Message for test");
    }

    @When("User clicks the Confirm Alert button")
    public void userClicksTheConfirmAlertButton() {
        driver.findElement(By.id("confirm")).click();
    }

    @And("Close the alert with Cancel")
    public void closeTheAlertWithCancel() {
        alert.dismiss();
    }
}
