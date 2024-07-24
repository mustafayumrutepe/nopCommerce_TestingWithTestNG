package ElementsPage;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements() {PageFactory.initElements(BaseDriver.driver,this);}

    @FindBy(xpath = "")
    public WebElement login;

}
