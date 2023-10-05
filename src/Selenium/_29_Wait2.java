package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _29_Wait2 extends BaseDriver {

    @Test
    public void Test(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement button = driver.findElement(By.cssSelector("button[onclick='timedText()']"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(By.id("demo"),"Selenium"));

        Assert.assertTrue("mesaj hatalı", driver.findElement(By.id("demo")).getText().toLowerCase().equals("selenium"));
        BekleKapat();
    }
}
