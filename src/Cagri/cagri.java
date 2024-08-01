package Cagri;

import ElementsPage.Elements;
import ElementsPage.Parent;
import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class cagri extends BaseDriver {


    @Test(priority = 3,dataProvider = "userData",dataProviderClass = cagri.class,groups = {"Smoke Test","Login Test"})
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


