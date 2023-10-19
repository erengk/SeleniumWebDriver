package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;
/*
https://www.selenium.dev/ sayfasına git
target =_blank olan a tag'lerine tıkla (mail içerenler hariç)
title ve url bilgilerini terminale yazdır
Anasayfa hariç diğer tüm sekmeleri kapat
 */
public class _35_Windows extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev/");

        MyFunctions.Bekle(2);
        String anasayfaID = driver.getWindowHandle();

        List<WebElement> blankList = driver.findElements(By.xpath("//a[@target='_blank']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (WebElement e : blankList) {
            if (!e.getAttribute("href").contains("mail")) {
                js.executeScript("arguments[0].click();", e);
                System.out.println(e.getAttribute("href"));
                MyFunctions.Bekle(3);
            }
        }

        Set<String> windowsIDList = driver.getWindowHandles();

        for(String id : windowsIDList){
            System.out.println("id = " + id);
        }
        MyFunctions.Bekle(3);
        driver.switchTo().window(anasayfaID);
        BekleKapat();
    }
}
