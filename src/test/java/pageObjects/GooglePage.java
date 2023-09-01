package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage {
    public GooglePage(WebDriver driver){
       super(driver);
    }
    public WebElement getSearchField(){
        return getElementByXpath("//textarea[@id='APjFqb']");
    }
    public void goToGoogle() {
        driver.get("https://www.google.com.ua/");
    }

}
