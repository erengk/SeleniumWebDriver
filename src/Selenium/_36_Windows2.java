package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _36_Windows2 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/");
        MyFunctions.Bekle(2);
        String anasayfaID = driver.getWindowHandle();

        List<WebElement> blankList = driver.findElements(By.xpath("//a[@target='_blank']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (WebElement e : blankList) {
            if (!e.getAttribute("href").contains("mail")) {
                System.out.println(e.getAttribute("href"));
                System.out.println(e.getAttribute("title"));
                js.executeScript("arguments[0].click();", e);
                System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
                MyFunctions.Bekle(3);
            }
        }
        Set<String> windowsIDList = driver.getWindowHandles();
        for(String id : windowsIDList){
            if (id.equals(anasayfaID))continue;
            driver.switchTo().window(id);
            driver.close();
        }
        BekleKapat();
    }
}
