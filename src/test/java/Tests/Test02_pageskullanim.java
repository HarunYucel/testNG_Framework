package Tests;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualitydemyPage;

public class Test02_pageskullanim {

/*
PositiveTest
1- https://www.qualitydemy.com/ anasayfasina gidin
2- login linkine basin
3- Kullanici email'i olarak valid email girin
4- Kullanici sifresi olarak valid sifre girin
5- Login butonuna basarak login olun
6- Basarili olarak giris yapilabildigini test edin
 */


@Test

  public void TestQA(){
    Driver.getDriver().get(ConfigReader.getProperty("QAurl"));

  QualitydemyPage qualitydemyPage= new QualitydemyPage();
  qualitydemyPage.QAilkloginlink.click();
  qualitydemyPage.QAEmail.sendKeys("valid@gmail.com");
  qualitydemyPage.QApasword.sendKeys("valid");
  qualitydemyPage.QAikinciLoginButon.click();

  SoftAssert softAssert = new SoftAssert();

  softAssert.assertTrue(qualitydemyPage.QaArmadegeribulunmadi.isDisplayed());


softAssert.assertAll();

Driver.closeDriver();

}




}
