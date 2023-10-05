package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _30_IFrame extends BaseDriver {
    @Test
    public void Test(){
        /*
        index kullanarak geçiş yapılabilir
        id ile geçiş yapabiliyoruz

         */
        driver.get("https://chercher.tech/practice/frames");
        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1);
        WebElement topicTextBox = driver.findElement(By.cssSelector("b#topic + input"));
        topicTextBox.sendKeys("Gokhan");

        WebElement frame3 = driver.findElement(By.id("frame3"));
        driver.switchTo().frame(frame3);

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

        driver.switchTo().frame(1);
        WebElement selectDDM = driver.findElement(By.id("animals"));
        Select select = new Select(selectDDM);
        select.selectByVisibleText("Baby Cat");

        BekleKapat();

    }
}
/*
1.Frame
    1.1.Frame
    1.2. Frame
2. Frame
3. Frame
    3.1. Frame
        3.1.1. Frame







 */