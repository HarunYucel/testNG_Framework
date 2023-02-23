package Tests;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Amazonpage;

public class Test05Amazonhucretesti {

    /*
    Soru 2 :
Ø AmazonPage sayfasinda istedigim satir ve sutun sayisi ile cagirdigimda
bana hucredeki yaziyi getirecek bir method olusturun
Ø Tests paketi altinda yeni bir class olusturun: D26_AmazonHucreTesti
Ø Bu class’in altinda bir test method olusturun : hucretesti( ) ve webtable’da
3. satir 2.sutundaki yazinin “Home Services” yazisi icerdigini test edin
Ø Yeni bir method olusturun : AmazonYazisi( ) ve tabloda 9 Hucrede
“Amazon” yazisi bulundugunu test edin
     */


    @Test
    public void hucretesti(){

        Driver.getDriver().get(ConfigReader.getProperty("Amazonurl"));
        Amazonpage amazonpage = new Amazonpage();
        amazonpage.amazonsayfasonu();

       Assert.assertTrue(amazonpage.getElement(3,2).getText().contains("Home Services"));


    }


    @Test
    public void amazonyazisi(){

        Driver.getDriver().get(ConfigReader.getProperty("Amazonurl"));
        Amazonpage amazonpage = new Amazonpage();
        amazonpage.amazonsayfasonu();
        Assert.assertTrue(amazonpage.amazonSutunlar.getText().contains("Amazon"));

/*
 Amazon uzerine yapilan 4 testi otomatik olarak calistiracak xml
kodunu yazin ve calistirin
Ø D26_AmazonSatirSutunSayisi class’indan satirSayisi( ) testini ve
D26_AmazonHucreTesti class’indan hucretesti( ) testini calistiracak xml
kodunu yazin ve calistirin
 */

//*********************************************************************//
    /*
    Ø D26_AmazonSatirSutunSayisi class’indan satirSayisi( ) testini ve
D26_AmazonHucreTesti class’indan hucretesti( ) testini rapor alacak
sekilde hazirlayin ve 3.sorudaki xml dosyasi ile calistirip raporu
olusturun
     */



    }





}
