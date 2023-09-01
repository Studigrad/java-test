package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class TestInit {
    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver.set(new FirefoxDriver());
    }

    public WebDriver getDriver(){
        return driver.get();
    }

    @AfterMethod
    public void closeBrowser(){
        getDriver().quit();
    }

}
