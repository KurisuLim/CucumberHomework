package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class ServiceHooks {
    public WebDriver driver;
    public LoginPage page;
    //TO-DO

//    @Before
//    public void initializeTest(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        System.setProperty("webdriver.chrome.silentOutput", "true");
//        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
//        driver = new ChromeDriver();
//        driver.get("http://the-internet.herokuapp.com/login");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

//    @After
//    public void teardown(){
//        driver.quit();
//    }
}
