package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _22_ActionHover2 extends BaseDriver {
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

        WebElement componentsDDM = driver.findElement(By.xpath("//a[text()='Components']"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(componentsDDM).build();
        action.perform();
        MyFunctions.Bekle(2);

        WebElement allComponentLink = driver.findElement(By.linkText("Show All Components"));

        Assert.assertTrue("Hover yapılamadı", allComponentLink.isDisplayed());

        BekleKapat();

    }
}
