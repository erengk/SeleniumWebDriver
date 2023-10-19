package Selenium;

import Utilities.BaseDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class _38_ScreenShot extends BaseDriver {

    @Test
    public void Test() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement userName = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        userName.sendKeys("gokhan");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("admin123");

        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        loginBtn.click();

        List<WebElement> errorMessage = driver.findElements(By.xpath("//p[text()='Invalid credentials']"));

        if (errorMessage.size() > 0){
            System.out.println("Hatalı Giriş!");

            TakesScreenshot ts = (TakesScreenshot) driver;
            File hafizayaAtilacak = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(hafizayaAtilacak, new File("src/ScreenShotFiles/screenshot.png"));
        }
        //TODO: İsimlendirmeyi öyle bir yapalım ki ekran kayıtlarını tekil hale getirsin. Her aldığı kaydı görebilelim.

        BekleKapat();

    }
}
