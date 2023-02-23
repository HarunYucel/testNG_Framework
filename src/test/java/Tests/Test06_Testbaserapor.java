package Tests;

import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.TestBaseRapor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Amazonpage;

public class Test06_Testbaserapor extends TestBaseRapor {

    /*
     // amazon anasayfaya gidin
     // sampuan aratın
     */


    @Test
    public void testraporu(){

        extentTest= extentReports.createTest("sampuan arama sonuclari ","kullanici sampuan arayabilmeli ");
        // amazon anasayfaya gidin
        Amazonpage amazonpage  = new Amazonpage();
        Driver.getDriver().get(ConfigReader.getProperty("Amazonurl"));
        // sampuan aratın
        extentTest.info("amazona gidildi");


        amazonpage.amazonAramaKutusu.sendKeys("sampuan"+ Keys.ENTER);

        extentTest.info("sampuan aratıldı");



      // arama sonuclarını görun ve sayfayi kapatın
        WebElement sampuanaramasonuclari = Driver.getDriver().findElement(By.xpath("//span[text()='\"sampuan\"']"));

    Assert.assertTrue(sampuanaramasonuclari.getText().contains("sampuan"));

    extentTest.pass("aramasonuslari sampuan iceriyor");

    Driver.closeDriver();

    }






}
