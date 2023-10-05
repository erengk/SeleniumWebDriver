package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _31_IFrame2 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        WebElement topicTextBox = driver.findElement(By.cssSelector("b#topic + input"));
        topicTextBox.sendKeys("Gokhan");

        driver.switchTo().frame(0);
        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        //driver.switchTo().parentFrame();
        //driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement selectDDM = driver.findElement(By.id("animals"));
        Select select = new Select(selectDDM);
        select.selectByValue("avatar");

        BekleKapat();
    }
}
