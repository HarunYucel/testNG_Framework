package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookpage {

public Facebookpage(){

    PageFactory.initElements(Driver.getDriver(),this);

}

@FindBy(xpath = "//input[@id='email']")
public WebElement Facebookemail;

@FindBy(xpath = "//input[@id='pass']")
public WebElement Facebookpasword;


@FindBy(xpath = "//button[@name='login']")
 public WebElement Facebookgiris;

@FindBy(xpath = "//div[@class='_9ay7']")
public WebElement FacebookYanlisgiris;





}
