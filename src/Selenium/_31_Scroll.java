package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _31_Scroll extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://stackoverflow.com/questions/49871432/what-does-arguments0-and-arguments1-mean-when-using-executescript-method-fro");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        MyFunctions.Bekle(5);
        js.executeScript("window.scrollTo(0,500);");
        MyFunctions.Bekle(2);
        js.executeScript("window.scrollBy(0,500);");
        MyFunctions.Bekle(2);
        js.executeScript("window.scrollBy(0, -200);");

        BekleKapat();
    }
}
