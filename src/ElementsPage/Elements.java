package ElementsPage;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent{
    public Elements() {PageFactory.initElements(BaseDriver.driver,this);}

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement DateOfBirthMonth;

    @FindBy(name = "DateOfBirthYear")
    public WebElement DateOfBirthYear;

    @FindBy(id = "register-button")
    public WebElement registerButton;

    @FindBy(css = "[class='page-body']")//*[contains(text(),'completed')]
    public WebElement verification;

    @FindBy(css = "[class='ico-login']")
    public WebElement login;

    @FindBy(xpath = "//*[@type='submit'][text()='Log in']")
    public WebElement loginButton;

    @FindBy(css = "[class='ico-logout']")
    public WebElement logout;

    @FindBy(css = ".email")
    public WebElement email ;

    @FindBy(css = ".password")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement LoginButtonCCC;

    @FindBy(xpath = "//a[@class='ico-account']")
    public WebElement MyAccount;


    @FindBy(xpath = "//div[contains(text(),'unsuccessful')]")
    public WebElement unsuccessfully;

}
