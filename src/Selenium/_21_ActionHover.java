package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _21_ActionHover extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement emailBox = driver.findElement(By.id("input-email"));
        emailBox.sendKeys("carlosSantana@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("1234");

        WebElement button = driver.findElement(By.cssSelector("input[value='Login']"));
        button.click();

        MyFunctions.Bekle(2);

        WebElement searchBox = driver.findElement(By.cssSelector("input[name='search']"));
        searchBox.sendKeys("ipod");

        WebElement searchButton = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
        searchButton.click();

        MyFunctions.Bekle(2);


        WebElement ipodTouch = driver.findElement(By.linkText("iPod Touch"));
        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(ipodTouch).build();
        action.perform();

        Action action1 = actions.click().build();
        action1.perform();

        MyFunctions.Bekle(2);
        WebElement description = driver.findElement(By.linkText("Description"));

        Assert.assertTrue("tıklama işlemi yapılamadı", description.isDisplayed());
        BekleKapat();

    }
}
