package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExample extends TestInit {
    @Test
    public void checkMethod(){
        Assert.assertEquals(doSumUp(), 8);
    }
    public int doSumUp(){
        return 4+4;
    }
    @Test
    public void runGoogle(){
        WebDriver driver = getDriver();
        driver.get("https://www.google.com.ua/");

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("dogs\n");
    }
}
