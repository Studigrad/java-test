package pageObjects;

import org.openqa.selenium.WebDriver;

public class AmazonPageHelper extends AmazonPageComponents {

    public AmazonPageHelper(WebDriver driver) {
        super(driver);
    }

    public void openPage(){
        driver.get("https://www.amazon.com/");
    }


}
