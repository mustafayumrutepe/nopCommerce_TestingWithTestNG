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
}
