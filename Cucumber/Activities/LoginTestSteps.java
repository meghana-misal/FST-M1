package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
        String confirmMessage=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Log In message="+ driver.findElement(By.id("action-confirmation")).getText());
        if(confirmMessage.contains("admin")) {
            Assert.assertEquals(confirmMessage, "Welcome Back, admin");
        } else {
            Assert.assertEquals(confirmMessage, "Invalid Credentials");
        }
    }

    @And("Close the Browser")
    public void closeTheBrowser() {
        driver.close();
    }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void userEntersAnd(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
