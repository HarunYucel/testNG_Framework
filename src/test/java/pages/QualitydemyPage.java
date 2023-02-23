package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QualitydemyPage {

public QualitydemyPage(){

    PageFactory.initElements(Driver.getDriver(),this);

}

@FindBy(xpath = "//a[text()='Log in']")

public WebElement QAilkloginlink;

@FindBy(xpath = "//input[@name='email']")

public WebElement QAEmail;

@FindBy(xpath = "//input[@name='password']")

public WebElement QApasword;

@FindBy(xpath = "(//button[@type='submit'])[1]")
public WebElement QAikinciLoginButon;

@FindBy(xpath = "//*[@id=\"toast-container\"]/div/div")
public WebElement QaArmadegeribulunmadi;




}
