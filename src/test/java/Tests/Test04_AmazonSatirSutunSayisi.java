package Tests;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;
import pages.Amazonpage;

public class Test04_AmazonSatirSutunSayisi {

    /*
    Amazon anasayfaya gidebilecek sekilde bir page sayfasi olusturun : AmazonPage
Ø Amazon ana sayfasinda en altta bulunan Webtable’i inceleyebilmek icin
AmazonPage clasinda en altta gitme isini yapacak bir method olusturun
Ø Tests paketi altinda yeni bir class olusturun: D26_AmazonSatirSutunSayisi
Ø Bu class’in altinda bir test method olusturun : satirSayisi( ) ve webtable’da 10
satir oldugunu test edin
Ø Yeni bir method olusturun : sutunSayisi( ) ve yazi olan sutun sayisinin 7oldugunu
test edin
     */



    @Test
    public void satirsayisi (){

        Amazonpage amazonpage = new Amazonpage();
        Driver.getDriver().get(ConfigReader.getProperty("Amazonurl"));

        amazonpage.amazonsayfasonu();
        System.out.println(amazonpage.amazonSatirlar.getSize());
        System.out.println(amazonpage.amazonSutunlar.getSize());


    }




}
