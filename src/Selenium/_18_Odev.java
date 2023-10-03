package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _18_Odev extends BaseDriver {
        /*
       Odev

    1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    2- Personal use radio butonunu seçin
    3- How did you discover XYZ? altındaki Search Engine'i seçin
    4- Less Than Once a Week'i seçin
    5- Average'ı seçin
    6- How long have you been using XYZ? altındaki I'm not using XYZ yet, but I will in the future seçeneğini seçin
    7- What is your favorite feature? kısmına bir text girin
    css selector kullanarak senaryonuzu oluşturun. Select tanımlı olan yerlerde seçimler için select kullanın
     */
    @Test
    public void Test(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement personalRadio = driver.findElement(By.cssSelector("input#u_N1O_4586_1"));
        personalRadio.click();

        WebElement xyzSelect = driver.findElement(By.cssSelector("select#u_N1O_4588"));

        Select select = new Select(xyzSelect);
        select.selectByVisibleText("Search Engine");

        WebElement onceWeek = driver.findElement(By.cssSelector("input#u_N1O_89585_2"));
        onceWeek.click();

        WebElement average = driver.findElement(By.cssSelector("input#u_N1O_4589_1"));
        average.click();


        WebElement usingXYS = driver.findElement(By.cssSelector("select#u_N1O_4597"));

        Select select2 = new Select(usingXYS);
        select2.selectByIndex(4);

        WebElement textArea = driver.findElement(By.cssSelector("textarea#u_N1O_89597"));
        textArea.sendKeys("Bu bir test metnidir");

        BekleKapat();
    }

}
