package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _37_RobotClass extends BaseDriver {

    @Test
    public void Test() throws AWTException {
        driver.get("https://www.selenium.dev/");

        String windowId = driver.getWindowHandle();

        Robot robot = new Robot();

        driver.switchTo().window(windowId);

        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        MyFunctions.Bekle(2);

        for (int i = 0; i < 17; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        MyFunctions.Bekle(2);

        String urlDownload = "https://www.selenium.dev/downloads/";
        Assert.assertEquals(driver.getCurrentUrl(), urlDownload);

        BekleKapat();




    }
}

