package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTestSteps {
    private WebDriver driver;
    private WebDriverWait wait;

    @Given("User is on Login page")
    public void userIsOnLoginPage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @When("User enters username and password")
    public void userEntersUsernameAndPassword() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
    }

    @Then("Read the page title and confirmation message")
    public void readThePageTitleAndConfirmationMessage() {
        System.out.println("Title of the Page="+ driver.getTitle());
        System.out.println("Log In message="+ driver.findElement(By.id("action-confirmation")).getText());
    }

    @And("Close the Browser")
    public void closeTheBrowser() {
        driver.close();
    }
}
