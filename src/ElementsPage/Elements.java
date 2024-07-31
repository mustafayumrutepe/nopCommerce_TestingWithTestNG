package ElementsPage;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(css = "[class='content']")
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

    @FindBy(xpath = "//div[@class='header-menu']")
    public WebElement headerMenu;

    @FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
    public WebElement computers;

    @FindBy(xpath = "(//a[contains(text(),'Desktop')])[1]")
    public WebElement desktops;

    @FindBy(xpath = "(//a[contains(text(),'Notebook')])[1]")
    public WebElement notebooks;

    @FindBy(xpath = "(//a[contains(text(),'Software')])[1]")
    public WebElement software;

    @FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
    public WebElement electronics;

    @FindBy(xpath = "(//a[contains(text(),'Camera')])[1]")
    public WebElement cameraPhoto;

    @FindBy(xpath = "(//a[contains(text(),'Cell')])[1]")
    public WebElement cellPhones;

    @FindBy(xpath = "(//a[contains(text(),'Others')])[1]")
    public WebElement others;

    @FindBy(xpath = "(//a[contains(text(),'Apparel')])[1]")
    public WebElement apparel;

    @FindBy(xpath = "(//a[contains(text(),'Shoes')])[1]")
    public WebElement shoes;

    @FindBy(xpath = "(//a[contains(text(),'Clothing')])[1]")
    public WebElement clothing;

    @FindBy(xpath = "(//a[contains(text(),'Accessories')])[1]")
    public WebElement accessories;

    @FindBy(xpath = "(//a[contains(text(),'downloads')])[1]")
    public WebElement digitalDownloads;

    @FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
    public WebElement books;

    @FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]")
    public WebElement jewelry;

    @FindBy(xpath = "(//a[contains(text(),'Gift')])[1]")
    public WebElement giftCards;

    @FindBy(className = "page-body")
    public WebElement desktopPage;

    @FindBy(xpath = "(//*[text()='Build your own computer'])[1]")
    public WebElement buildOwnComputer;

    @FindBy(id = "product_attribute_2")
    public WebElement selectRAM;

    @FindBy(name = "product_attribute_3")
    public List<WebElement> selectHDD;

    @FindBy(xpath = "(//a[text()='Gift Cards '])[1]")
    public WebElement GiftCardSec;

    @FindBy(xpath = "(//*[text()='Add to cart'])[2]")
    public WebElement PhsicCARD50;

    @FindBy(css = ".recipient-name")
    public WebElement RecipientName;

    @FindBy(xpath = "//textarea[@class='message']")
    public WebElement MessageBox;

    @FindBy(xpath = "//button[@type='button'][text()='Add to cart']")
    public WebElement LastAddButton;

    @FindBy(xpath = "//*[contains(text(),'been added')]")
    public WebElement BeenAdded;
}
