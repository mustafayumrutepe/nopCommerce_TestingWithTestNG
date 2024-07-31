package ElementsPage;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements extends Parent{
    public Elements() {PageFactory.initElements(BaseDriver.driver,this);}

    @FindBy(xpath = "//*[text()='Register']")
    private WebElement register;

    @FindBy(id = "FirstName")
    private WebElement firstName;

    @FindBy(name = "DateOfBirthMonth")
    private WebElement DateOfBirthMonth;

    @FindBy(name = "DateOfBirthYear")
    private WebElement DateOfBirthYear;

    @FindBy(id = "register-button")
    private WebElement registerButton;

    @FindBy(css = "[class='result']")
    private WebElement verification;

    @FindBy(css = "[class='content']")
    private WebElement verification2;

    @FindBy(css = "[class='ico-login']")
    private WebElement login;

    @FindBy(xpath = "//*[@type='submit'][text()='Log in']")
    private WebElement loginButton;

    @FindBy(css = "[class='ico-logout']")
    private WebElement logout;

    @FindBy(css = ".email")
    private WebElement email ;

    @FindBy(css = ".password")
    private WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement LoginButtonCCC;

    @FindBy(xpath = "//a[@class='ico-account']")
    private WebElement MyAccount;

    @FindBy(xpath = "//div[contains(text(),'unsuccessful')]")
    private WebElement unsuccessfully;

    @FindBy(xpath = "//div[@class='header-menu']")
    private WebElement headerMenu;

    @FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
    private WebElement computers;

    @FindBy(xpath = "(//a[contains(text(),'Desktop')])[1]")
    private WebElement desktops;

    @FindBy(xpath = "(//a[contains(text(),'Notebook')])[1]")
    private WebElement notebooks;

    @FindBy(xpath = "(//a[contains(text(),'Software')])[1]")
    private WebElement software;

    @FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
    private WebElement electronics;

    @FindBy(xpath = "(//a[contains(text(),'Camera')])[1]")
    private WebElement cameraPhoto;

    @FindBy(xpath = "(//a[contains(text(),'Cell')])[1]")
    private WebElement cellPhones;

    @FindBy(xpath = "(//a[contains(text(),'Others')])[1]")
    private WebElement others;

    @FindBy(xpath = "(//a[contains(text(),'Apparel')])[1]")
    private WebElement apparel;

    @FindBy(xpath = "(//a[contains(text(),'Shoes')])[1]")
    private WebElement shoes;

    @FindBy(xpath = "(//a[contains(text(),'Clothing')])[1]")
    private WebElement clothing;

    @FindBy(xpath = "(//a[contains(text(),'Accessories')])[1]")
    private WebElement accessories;

    @FindBy(xpath = "(//a[contains(text(),'downloads')])[1]")
    private WebElement digitalDownloads;

    @FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
    private WebElement books;

    @FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]")
    private WebElement jewelry;

    @FindBy(xpath = "(//a[contains(text(),'Gift')])[1]")
    private WebElement giftCards;

    @FindBy(className = "page-body")
    private WebElement desktopPage;

    @FindBy(xpath = "(//*[text()='Build your own computer'])[1]")
    private WebElement buildOwnComputer;

    @FindBy(id = "product_attribute_2")
    private WebElement selectRAM;

    @FindBy(name = "product_attribute_3")
    private List<WebElement> selectHDD;

    @FindBy(xpath = "(//a[text()='Gift Cards '])[1]")
    private WebElement GiftCardSec;

    @FindBy(xpath = "(//*[text()='Add to cart'])[2]")
    private WebElement PhsicCARD50;

    @FindBy(css = ".recipient-name")
    private WebElement RecipientName;

    @FindBy(xpath = "//textarea[@class='message']")
    private WebElement MessageBox;

    @FindBy(xpath = "//button[@type='button'][text()='Add to cart']")
    private WebElement LastAddButton;

    @FindBy(xpath = "//*[contains(text(),'been added')]")
    private WebElement BeenAdded;

    @FindBy(className = "item-box")
    private List<WebElement> notebookList;

    @FindBy(id = "small-searchterms")
    private WebElement searchBox;

    @FindBy(className = "product-name")
    private WebElement productName;

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public List<WebElement> getNotebookList() {
        return notebookList;
    }

    public WebElement getRegister() {
        return register;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getDateOfBirthMonth() {
        return DateOfBirthMonth;
    }

    public WebElement getDateOfBirthYear() {
        return DateOfBirthYear;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getVerification() {
        return verification;
    }

    public WebElement getVerification2() {
        return verification2;
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getLogout() {
        return logout;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButtonCCC() {
        return LoginButtonCCC;
    }

    public WebElement getMyAccount() {
        return MyAccount;
    }

    public WebElement getUnsuccessfully() {
        return unsuccessfully;
    }

    public WebElement getHeaderMenu() {
        return headerMenu;
    }

    public WebElement getComputers() {
        return computers;
    }

    public WebElement getDesktops() {
        return desktops;
    }

    public WebElement getNotebooks() {
        return notebooks;
    }

    public WebElement getSoftware() {
        return software;
    }

    public WebElement getElectronics() {
        return electronics;
    }

    public WebElement getCameraPhoto() {
        return cameraPhoto;
    }

    public WebElement getCellPhones() {
        return cellPhones;
    }

    public WebElement getOthers() {
        return others;
    }

    public WebElement getApparel() {
        return apparel;
    }

    public WebElement getShoes() {
        return shoes;
    }

    public WebElement getClothing() {
        return clothing;
    }

    public WebElement getAccessories() {
        return accessories;
    }

    public WebElement getDigitalDownloads() {
        return digitalDownloads;
    }

    public WebElement getBooks() {
        return books;
    }

    public WebElement getJewelry() {
        return jewelry;
    }

    public WebElement getGiftCards() {
        return giftCards;
    }

    public WebElement getDesktopPage() {
        return desktopPage;
    }

    public WebElement getBuildOwnComputer() {
        return buildOwnComputer;
    }

    public WebElement getSelectRAM() {
        return selectRAM;
    }

    public List<WebElement> getSelectHDD() {
        return selectHDD;
    }

    public WebElement getGiftCardSec() {
        return GiftCardSec;
    }

    public WebElement getPhsicCARD50() {
        return PhsicCARD50;
    }

    public WebElement getRecipientName() {
        return RecipientName;
    }

    public WebElement getMessageBox() {
        return MessageBox;
    }

    public WebElement getLastAddButton() {
        return LastAddButton;
    }

    public WebElement getBeenAdded() {
        return BeenAdded;
    }
}
