package Tests;

import ElementsPage.Elements;
import ElementsPage.Parent;
import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestMethods extends BaseDriver {

    @Test(priority = 1 , groups = {"Smoke Test" , "UserRegistiration"})
    public void Register(){
        Elements el = new Elements();

        el.clickFunction(el.getRegister());
        el.sendKeysFunction(el.getFirstName(),"Raperin");
        Parent.ActionsSendKeys("Kaya");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("15");
        Parent.RobotTAB(1);
        el.selectFunction(el.getDateOfBirthMonth(), 3);
        Parent.RobotTAB(1);
        el.selectFunction(el.getDateOfBirthYear(), 5);
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("r2kaya@gmail.com");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("ITCompany");
        Parent.RobotTAB(2);
        Parent.ActionsSendKeys("12345rk");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("12345rk");
        el.clickFunction(el.getRegisterButton());

        el.assertionFunction(el.getVerification(),"completed");
        el.getLogout().click();
    }

    @Test(priority = 2 , groups = {"Smoke Test" , "Login Test"})
    public void Login(){
        LoginTest("rkaya@gmail.com","12345rk");
    }

    @Test(priority = 3 , groups = {"UI Testing" , "TAB Menu"})
    public void TabMenu(){

        Elements el = new Elements();

        Assert.assertTrue(el.getHeaderMenu().isEnabled());
        el.hoverFunction(el.getComputers());
        el.clickFunction(el.getDesktops());
        Assert.assertTrue(driver.getCurrentUrl().contains("desktop"));
        el.hoverFunction(el.getComputers());
        el.clickFunction(el.getNotebooks());
        Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
        el.hoverFunction(el.getComputers());
        el.clickFunction(el.getSoftware());
        Assert.assertTrue(driver.getCurrentUrl().contains("software"));
        el.hoverFunction(el.getElectronics());
        el.clickFunction(el.getCameraPhoto());
        Assert.assertTrue(driver.getCurrentUrl().contains("camera-photo"));
        el.hoverFunction(el.getElectronics());
        el.clickFunction(el.getCellPhones());
        Assert.assertTrue(driver.getCurrentUrl().contains("cell-phones"));
        el.hoverFunction(el.getElectronics());
        el.clickFunction(el.getOthers());
        Assert.assertTrue(driver.getCurrentUrl().contains("others"));
        el.hoverFunction(el.getApparel());
        el.clickFunction(el.getShoes());
        Assert.assertTrue(driver.getCurrentUrl().contains("shoes"));
        el.hoverFunction(el.getApparel());
        el.clickFunction(el.getClothing());
        Assert.assertTrue(driver.getCurrentUrl().contains("clothing"));
        el.hoverFunction(el.getApparel());
        el.clickFunction(el.getAccessories());
        Assert.assertTrue(driver.getCurrentUrl().contains("accessories"));
        el.clickFunction(el.getDigitalDownloads());
        Assert.assertTrue(driver.getCurrentUrl().contains("digital-downloads"));
        el.clickFunction(el.getBooks());
        Assert.assertTrue(driver.getCurrentUrl().contains("books"));
        el.clickFunction(el.getJewelry());
        Assert.assertTrue(driver.getCurrentUrl().contains("jewelry"));
        el.clickFunction(el.getGiftCards());
        Assert.assertTrue(driver.getCurrentUrl().contains("gift-cards"));
    }

    @Parameters({"text", "text2"})
    @Test(priority = 5 , groups = {"UI Testing", "TAB Menu", "Order Tests"})
    public void OrderCopmuter(String text, String text2){
        Elements el = new Elements();

        Assert.assertTrue(el.getHeaderMenu().isEnabled());
        el.hoverFunction(el.getComputers());
        el.clickFunction(el.getDesktops());
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
        Assert.assertTrue(el.getDesktopPage().isEnabled());
        el.clickFunction(el.getBuildOwnComputer());

        int i = Parent.RandomNumberGenerator(4);
        el.selectFunction(el.getSelectRAM(), i);

        int j = Parent.RandomNumberGenerator(2);
        ArrayList<WebElement> list = new ArrayList<>();
        for (WebElement e : el.getSelectHDD()) {
            list.add(e);
        }
        el.clickFunction(list.get(j));

        el.clickFunction(el.getLastAddButton());
        el.assertionFunction(el.getVerification2(), text2);
    }

    @Parameters("search")
    @Test(priority = 3 , groups = {"UI Testing" , "TAB Menu"})
    public void TabMenuProductControl(String string) {
        Elements el = new Elements();
        el.hoverFunction(el.getComputers());
        el.clickFunction(el.getNotebooks());

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < el.getNotebookList().size(); i++) {
            list.add(el.getNotebookList().get(i).getText());
        }

        el.sendKeysFunction(el.getSearchBox(), string);
        int i = Parent.RandomNumberGenerator(6);
        el.clickFunction(el.getNotebookList().get(i));

        boolean check=false;
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j).substring(0,10)+" - "+el.getProductName().getText().substring(0,10));
            if (list.get(j).substring(0,10).equals(el.getProductName().getText().substring(0,10)))
                check = true;
        }
        Assert.assertEquals(check, true,"element not found in list");
    }




    @Test(priority = 3,dataProvider = "userData",dataProviderClass = TestMethods.class,groups = {"Smoke Test","Login Test"})
    public void NegativeAndPositiveLoginCombinations(String email, String password){
        Elements el=new Elements();

        el.clickFunction(el.getLogin());
        el.sendKeysFunction(el.getEmail(),email);
        el.sendKeysFunction(el.getPassword(),password);
        el.clickFunction(el.getLoginButtonCCC());

        if (email.equals("rkaya@gmail.com")&&password.equals("12345rk")){
            Assert.assertTrue(el.getMyAccount().isDisplayed());
            System.out.println("giriş Başarılı");
            el.clickFunction(el.getLogout());
        }else{
            System.out.println("giriş Hatalı");

        }
        wait.until(ExpectedConditions.elementToBeClickable(el.getLogin()));



    }
    @DataProvider
    public Object[][] userData() {
        Object[][] data={
                { "invalid1@example.com", "invalidpassword1", },
                { "rkaya@gmail.com"     , "invalidpassword2", },
                { "invalid3@example.com", "12345rk"         , },
                { "rkaya@gmail.com", "12345rk"              , }
        };
        return data;
    }

    @Test(priority = 4 , groups = {"UI Testing" , "TAB Menu"})
    public void GiftOrderingProcess(){
        LoginTest("rkaya@gmail.com","12345rk");
        Elements el=new Elements();
        el.clickFunction(el.getGiftCardSec());
        el.clickFunction(el.getPhsicCARD50());
        el.sendKeysFunction(el.getRecipientName(),"Ekrem İMARO");
        el.sendKeysFunction(el.getMessageBox(),"Mustafa Sarıgül vurdu ve Gol oldu. GGG000000000000000000000000000000000000000000000000000000000000llll");
        el.clickFunction(el.getLastAddButton());
        el.assertionFunction(el.getBeenAdded(),"been added");

    }
    @Parameters("text")
    @Test(priority = 5,groups = {"UI Testing","Search","Smoke","Regression"})
    public void ParameterSearchProcess(String text){
        LoginTest("r2kaya@gmail.com","12345rk");
        Elements el=new Elements();
        el.sendKeysFunction(el.getSearchBox(),text);
        Actions actions = new Actions(BaseDriver.driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        el.assertionFunction(el.getPicAdoPhoto(),"adobe photoshop");




    }

}

