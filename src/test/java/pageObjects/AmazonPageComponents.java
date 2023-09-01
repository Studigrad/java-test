package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPageComponents extends BasePage{
    public AmazonPageComponents(WebDriver driver){
        super(driver);
    }
    public WebElement getTitleField(){
        return getElementByXpath("//a[@id='nav-logo-sprites']");
    }
    public WebElement getDeliverText(){
        return getElementByXpath("//a[@id='nav-global-location-popover-link']");
    }
    public WebElement getSearchInput(){
        return getElementByXpath("//input[@id='twotabsearchtextbox']");
    }
    public WebElement getSearchBtn(){
        return getElementByXpath("//input[@id='nav-search-submit-button']");
    }
    public WebElement getLanguageSelect(){
        return getElementByXpath("//a[@id='icp-nav-flyout']");
    }
    public WebElement getLoginField(){
        return getElementByXpath("//a[@id='nav-link-accountList']");
    }
    public WebElement getNavOrders(){
            return getElementByXpath("//a[@id='nav-orders']");
    }
    public WebElement getShoppingCart(){
        return getElementByXpath("//a[@id='nav-cart']");
    }
}
