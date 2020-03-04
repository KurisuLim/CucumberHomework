package stepdefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;


public class StepDefinitions {
    public LoginPage page;
    public WebDriver driver;

    @Given("User open chrome and launch the application")
    public void go_to_login_page() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        page = new LoginPage(driver);

    }

    @When("I  fill Username as {string} and Password as {string}")
    public void i_fill_valid_login(String username, String password) {
        page.loginUser(username,password);
    }

    @When("^I click on Login$")
    public void i_click_on_Login() {
        page.clickLogin();
    }

    @Then("I should see {string}")
    public void i_should_see(String string) {
        String text = page.getAlertMessage();
        if(text.contains(string)){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
    }

    @When("I fill Username as {string} and Password as {string}")
    public void i_fill_invalid_login(String username, String password) {
        page.loginUser(username,password);
    }
    @And("quit the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
