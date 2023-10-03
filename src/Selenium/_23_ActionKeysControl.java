package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _23_ActionKeysControl extends BaseDriver {
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

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(searchBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("i")
                .keyUp(Keys.SHIFT)
                .sendKeys("pod")
                .build();
        MyFunctions.Bekle(3);
        action.perform();

        BekleKapat();
    }
}
