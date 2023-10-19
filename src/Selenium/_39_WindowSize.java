package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class _39_WindowSize extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement userName = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("admin123");

        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        loginBtn.click();

        MyFunctions.Bekle(3);

        Dimension screenSize = driver.manage().window().getSize();
        MyFunctions.Bekle(3);

        Dimension newSize = new Dimension(200,400);
        driver.manage().window().setSize(newSize);

        BekleKapat();
    }
}
