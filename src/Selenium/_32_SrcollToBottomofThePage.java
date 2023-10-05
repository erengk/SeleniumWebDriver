package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _32_SrcollToBottomofThePage extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunctions.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        MyFunctions.Bekle(2);
        js.executeScript("window.scrollTo(0,0);");


        BekleKapat();
    }
}
