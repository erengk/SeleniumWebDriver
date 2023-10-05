package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class _28_Wait extends BaseDriver {
    @Test
    public void Test() throws InterruptedException {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement button = driver.findElement(By.cssSelector("button[onclick='timedText()']"));
        button.click();

        //Thread.sleep(10000);

        WebElement seleniumMsg = driver.findElement(By.id("demo"));
        System.out.println(seleniumMsg.getText());

        Assert.assertTrue("mesaj hatalı", seleniumMsg.getText().toLowerCase().equals("selenium"));

        BekleKapat();
    }
}
