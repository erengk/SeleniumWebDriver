package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _26_Alert2 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyFunctions.Bekle(3);

        WebElement onClick = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        onClick.click();

        MyFunctions.Bekle(2);

        driver.switchTo().alert().dismiss();
        Assert.assertTrue("başarısız", driver.findElement(By.id("confirm-demo")).getText().toLowerCase().contains("cancel"));
        BekleKapat();
    }
}
