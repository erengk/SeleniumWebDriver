package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _25_IntroAlert extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyFunctions.Bekle(3);

        WebElement clickMe1 = driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        clickMe1.click();
        MyFunctions.Bekle(2);

        driver.switchTo().alert().accept();

        BekleKapat();
    }
}
