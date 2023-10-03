package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _24_YonTuslari extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/auto-complete");

        WebElement singleTextBox = driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions actions = new Actions(driver);

        Action action = actions
                .moveToElement(singleTextBox)
                .click()
                .sendKeys("a")
                .build();
        action.perform();

        MyFunctions.Bekle(2);

        Action action1 = actions
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();
        action1.perform();

        MyFunctions.Bekle(2);

        WebElement aqua = driver.findElement(By.xpath("//div[text()='Aqua']"));

        Assert.assertTrue("Aqua seçilemedi", aqua.getText().toLowerCase().contains("aqua"));

        BekleKapat();
    }
}
