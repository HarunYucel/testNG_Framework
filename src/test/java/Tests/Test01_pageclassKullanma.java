package Tests;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Facebookpage;

public class Test01_pageclassKullanma {

    /*
    1 - https://www.facebook.com/ adresine gidin
2- POM’a uygun olarak email, sifre kutularini ve giris
yap butonunu locate edin
3- Faker class’ini kullanarak email ve sifre
degerlerini yazdirip, giris butonuna basin
4- Basarili giris yapilamadigini test edin
     */
/*


git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/HarunYucel/testNG_Framework.git
git push -u origin main
 */


@Test
public void TestFacebook(){
 Facebookpage facebookpage = new Facebookpage();

 Driver.getDriver().get(ConfigReader.getProperty("Facebookurl"));


 facebookpage.Facebookemail.sendKeys("hotofr@hotmail.com");
facebookpage.Facebookpasword.sendKeys("125874");
facebookpage.Facebookgiris.click();
Assert.assertTrue(facebookpage.FacebookYanlisgiris.isDisplayed());


















}





}
