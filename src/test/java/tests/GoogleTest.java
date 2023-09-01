package tests;

import org.testng.annotations.Test;
import pageObjects.GooglePage;

public class GoogleTest extends TestInit {

    @Test
    public void runGoogle(){

        GooglePage newTab = new GooglePage(getDriver());
        newTab.goToGoogle();
        newTab.getSearchField().sendKeys("dogs\n");

    }

    @Test
    public void testCheck1(){

    }

}