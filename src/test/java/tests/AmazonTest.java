package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AmazonPageHelper;

public class AmazonTest extends TestInit {

    @Test
    public void checkForHeader(){

        AmazonPageHelper newPage = new AmazonPageHelper(getDriver());
        newPage.openPage();

        Assert.assertTrue(newPage.getTitleField().isDisplayed());
        Assert.assertTrue(newPage.getDeliverText().isDisplayed());
        Assert.assertTrue(newPage.getSearchInput().isDisplayed());
        Assert.assertTrue(newPage.getSearchBtn().isDisplayed());
        Assert.assertTrue(newPage.getLanguageSelect().isDisplayed());
        Assert.assertTrue(newPage.getLoginField().isDisplayed());
        Assert.assertTrue(newPage.getNavOrders().isDisplayed());
        Assert.assertTrue(newPage.getShoppingCart().isDisplayed());

    }

}
