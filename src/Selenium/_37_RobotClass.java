package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.awt.*;
import java.awt.event.KeyEvent;

public class _37_RobotClass extends BaseDriver {
    @Test
    public void Test() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        String windowID = driver.getWindowHandle();

        Robot robot = new Robot();

        driver.switchTo().window(windowID);

        for (int i = 0; i < 21; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        MyFunctions.Bekle(2);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        MyFunctions.Bekle(1);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        MyFunctions.Bekle(1);


        WebElement message = driver.findElement(By.id("res"));
        BekleKapat();

    }
}
