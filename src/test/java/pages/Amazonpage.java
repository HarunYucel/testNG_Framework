package pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonpage {


    public Amazonpage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(id = "twotabsearchtextbox")
    public WebElement amazonAramaKutusu;


    public void amazonsayfasonu() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }


    @FindBy(xpath = "//tbody/tr")
    public WebElement amazonSatirlar;

    @FindBy(xpath = "/td")
    public WebElement amazonSutunlar;

    /*
    Ø AmazonPage sayfasinda istedigim satir ve sutun sayisi ile cagirdigimda
bana hucredeki yaziyi getirecek bir method olusturun
     */



    public WebElement getElement(int satir, int sutun) {

        //     //tbody/tr[5]/td[7]

        String dinamikXpath = "//tbody/tr[" + satir + "]/td[" + sutun + "]";

        WebElement istenenElement = Driver.getDriver().findElement(By.xpath(dinamikXpath));


        return istenenElement;


    }

}
















