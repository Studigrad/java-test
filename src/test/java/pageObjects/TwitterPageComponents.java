package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TwitterPageComponents extends BasePage{
    public TwitterPageComponents(WebDriver driver) {
        super(driver);
    }
    public WebElement getRegistrationBtn(){
        return getElementByXpath("//a[@data-testid='signupButton']");
    }
    public WebElement getLogBtn(){
        return getElementByXpath("//a[@data-testid='loginButton']");
    }
}
