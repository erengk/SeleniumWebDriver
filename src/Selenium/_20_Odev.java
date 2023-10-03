package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _20_Odev extends BaseDriver {
    /*
        Odev

        Bu websitesine gidiniz. https://testpages.eviltester.com/styled/index.html

        Calculator'e tıklayınız.

        İlk input'a herhangi bir sayı giriniz.

        İkinci input'a herhangi bir sayı giriniz.

        Select yardımı ile minus seçeneğini seçiniz

        Calculate button'una tıklayınız.

        Sonucu alınız.

        Sonucu yazdırınız.

        Ana sayfaya back ile gidiniz ve url ile doğrulama işlemi yapınız.

Xpath ile locator bulma işlemi yapınız
 */

    @Test
    public void Test(){
        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");

        MyFunctions.Bekle(3);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement calculator = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        js.executeScript("arguments[0].scrollIntoView();",calculator);
        calculator.click();
        MyFunctions.Bekle(2);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


        WebElement number1 = driver.findElement(By.xpath("//input[@id='number1']"));
        number1.sendKeys("20");
        MyFunctions.Bekle(1);

        WebElement ddMenu = driver.findElement(By.xpath("//select[@id='function']"));
        Select select = new Select(ddMenu);
        select.selectByIndex(2);
        MyFunctions.Bekle(1);

        WebElement number2 = driver.findElement(By.xpath("//input[@id='number2']"));
        number2.sendKeys("15");
        MyFunctions.Bekle(1);

        WebElement calculate = driver.findElement(By.xpath("//input[@id='calculate']"));
        calculate.click();
        MyFunctions.Bekle(1);

        String s = driver.findElement(By.xpath("//span[@id='answer']")).getText();
        System.out.println("Sonuç : " + s);
        driver.navigate().back();
        MyFunctions.Bekle(2);
        driver.navigate().back();
        MyFunctions.Bekle(2);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Assert.assertTrue("Eşit değil", driver.getCurrentUrl().contains("https://testpages.eviltester.com/styled/index.html"));
        BekleKapat();

    }
}
