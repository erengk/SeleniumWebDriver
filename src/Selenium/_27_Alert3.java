package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _27_Alert3 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyFunctions.Bekle(3);
        WebElement onClick = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        onClick.click();
        MyFunctions.Bekle(2);

        driver.switchTo().alert().sendKeys("Gokhan");
        MyFunctions.Bekle(2);
        driver.switchTo().alert().accept();
        MyFunctions.Bekle(2);

        Assert.assertTrue("İsim gözükmedi", driver.findElement(By.id("prompt-demo")).getText().toLowerCase().contains("gokhan"));

        BekleKapat();
    }
}
