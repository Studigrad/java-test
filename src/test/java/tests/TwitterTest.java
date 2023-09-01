package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.TwitterPageComponents;

public class TwitterTest extends TestInit {
    @Test
    public void checkForRegBtn() {
        WebDriver driver = getDriver();
        TwitterPageComponents window = new TwitterPageComponents(driver);
        driver.get("https://twitter.com/");
        Assert.assertTrue(window.getRegistrationBtn().isDisplayed());
    }
    @Test
    public void checkForLogBtn() {
        WebDriver driver = getDriver();
        TwitterPageComponents window = new TwitterPageComponents(driver);
        driver.get("https://twitter.com/");
        Assert.assertTrue(window.getLogBtn().isDisplayed());
    }
//    @Test(groups={"nums"})
//    public void testing1() {
//
//    }
//    @Test(groups={"nums"})
//    public void testing2() {
//
//    }
}
