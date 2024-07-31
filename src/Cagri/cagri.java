//package Cagri;
//
//import ElementsPage.Elements;
//import Utility.BaseDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class cagri extends BaseDriver {
//
//
//    @Test(priority = 3,dataProvider = "userData",dataProviderClass = cagri.class,groups = {"Smoke Test","Login Test"})
//    public void NegativeAndPositiveLoginCombinations(String email, String password){
//         Elements el=new Elements();
//
//        el.clickFunction(el.login);
//        el.sendKeysFunction(el.email,email);
//        el.sendKeysFunction(el.password,password);
//        el.clickFunction(el.LoginButtonCCC);
//
//        if (email.equals("rkaya@gmail.com")&&password.equals("12345rk")){
//            Assert.assertTrue(el.MyAccount.isDisplayed());
//            System.out.println("giriş Başarılı");
//            el.clickFunction(el.logout);
//        }else{
//            System.out.println("giriş Hatalı");
//
//        }
//        wait.until(ExpectedConditions.elementToBeClickable(el.login));
//
//
//
//    }
//    @DataProvider
//    public Object[][] userData() {
//        Object[][] data={
//                { "invalid1@example.com", "invalidpassword1", },
//                { "rkaya@gmail.com"     , "invalidpassword2", },
//                { "invalid3@example.com", "12345rk"         , },
//                { "rkaya@gmail.com", "12345rk"              , }
//        };
//        return data;
//    }
//
//    @Test(priority = 4 , groups = {"UI Testing" , "TAB Menu"})
//    public void GiftOrderingProcess(){
//        LoginTest("rkaya@gmail.com","12345rk");
//        Elements el=new Elements();
//        el.clickFunction(el.GiftCardSec);
//        el.clickFunction(el.PhsicCARD50);
//        el.sendKeysFunction(el.RecipientName,"Ekrem İMARO");
//        el.sendKeysFunction(el.MessageBox,"Mustafa Sarıgül vurdu ve Gol oldu. GGG000000000000000000000000000000000000000000000000000000000000llll");
//        el.clickFunction(el.LastAddButton);
//        el.assertionFunction(el.BeenAdded,"been added");
//
//    }
//
//}
//
//
