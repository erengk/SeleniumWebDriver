package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _34_JavaScriptExecutorClick extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.copado.com/robotic-testing");
        MyFunctions.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement watchLink = driver.findElement(By.xpath("(//div[@class='button-text-with-right-icon'])[5]"));
        //watchLink.click();

        js.executeScript("arguments[0].click();",watchLink);
        MyFunctions.Bekle(2);
        BekleKapat();


    }
}
