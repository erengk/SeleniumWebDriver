package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _19_Odev extends BaseDriver {
    /*
        Odev

        1) -> https://demo.applitools.com/

        2) Username: "tester@gmail.com"

        3) Password: "test1234"

        4) "Sign in" buttonunan tıklayınız.

        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

        ilgili locator'ları cssSelector kullanarak ve sibling, child özelliklerini kullanarak bulunuz.
 */

    @Test
    public void Test() {
        driver.get("https://demo.applitools.com/");

        WebElement userName = driver.findElement(By.cssSelector("div.form-group > input#username"));
        userName.sendKeys("tester@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("div.form-group > input#password"));
        password.sendKeys("test1234");

        WebElement signInButton = driver.findElement(By.cssSelector("div.buttons-w > a#log-in"));
        signInButton.click();
        MyFunctions.Bekle(2);

        WebElement message = driver.findElement(By.cssSelector("div.element-actions + h6"));
        Assert.assertTrue("Mesaj uyuşmadı", message.getText().equals("Your nearest branch closes in: 30m 5s"));

        BekleKapat();

    }
}
