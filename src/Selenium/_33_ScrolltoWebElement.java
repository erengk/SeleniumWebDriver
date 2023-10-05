package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _33_ScrolltoWebElement extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunctions.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement iframeName = driver.findElement(By.name("nested_scrolling_frame"));
        js.executeScript("arguments[0].scrollIntoView(true);", iframeName);

        BekleKapat();
    }
}
