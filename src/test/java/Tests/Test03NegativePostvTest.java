package Tests;

import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualitydemyPage;

public class Test03NegativePostvTest {
    /*
    NegativeTest
1- https://www.qualitydemy.com/ anasayfasina gidin
2- login linkine basin
3- Kullanvalid 3 farkli test method’u olusturun.
- gecerli username, gecersiz password
- gecersiz username, gecerli password
- gecersiz username, gecersiz password.
4- Login butonuna basarak login olun
5- Basarili olarak giris yapilamadigini test edin
     */

    @Test
    public void Testsenaryolari(){

        Driver.getDriver().get(ConfigReader.getProperty("QAurl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();

        qualitydemyPage.QAilkloginlink.click();

        Driver.closeDriver();


    }


    @Test
    public void gecerliusernameGecersizpassword(){
        Driver.getDriver().get(ConfigReader.getProperty("QAurl"));

        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.QAilkloginlink.click();
        qualitydemyPage.QAEmail.sendKeys("valid@gmail.com");
        qualitydemyPage.QApasword.sendKeys("270154");
        qualitydemyPage.QAikinciLoginButon.click();


        SoftAssert softAssert= new SoftAssert();

        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id=\"toast-container\"]/div/div"));
       softAssert.assertTrue(element.isDisplayed());
        System.out.println(element.getText());
        System.out.println(Driver.getDriver().getTitle());

        softAssert.assertAll();

        Driver.closeDriver();


    }

    @Test
    public void gecersizusernameGecerlipassword(){

        Driver.getDriver().get(ConfigReader.getProperty("QAurl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();

        qualitydemyPage.QAilkloginlink.click();
        qualitydemyPage.QAEmail.sendKeys("harun@gmail.com");
        qualitydemyPage.QApasword.sendKeys("valid");
      qualitydemyPage.QAikinciLoginButon.click();

     Assert.assertTrue(qualitydemyPage.QaArmadegeribulunmadi.isDisplayed());
        Driver.closeDriver();

    }


    @Test
    public void gecersizusernameGecersizpassword(){

        Driver.getDriver().get(ConfigReader.getProperty("QAurl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();

        qualitydemyPage.QAilkloginlink.click();

        qualitydemyPage.QAEmail.sendKeys("harun@gmail.com");
        qualitydemyPage.QApasword.sendKeys("270154");
        qualitydemyPage.QAikinciLoginButon.click();
        Assert.assertTrue(qualitydemyPage.QaArmadegeribulunmadi.isDisplayed());
        Driver.closeDriver();

    }

}

