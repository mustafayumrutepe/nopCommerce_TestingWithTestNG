package Mustafa;

import ElementsPage.Elements;
import ElementsPage.Parent;
import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mustafa extends BaseDriver {

    @Test(priority = 1 , groups = {"Smoke Test" , "UserRegistiration"})
    public void Register(){
        Elements el = new Elements();

        el.clickFunction(el.register);
        el.sendKeysFunction(el.firstName,"Raperin");
        Parent.ActionsSendKeys("Kaya");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("15");
        Parent.RobotTAB(1);
        el.selectFunction(el.DateOfBirthMonth, "December");
        Parent.RobotTAB(1);
        el.selectFunction(el.DateOfBirthYear, "1966");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("rkaya@gmail.com");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("ITCompany");
        Parent.RobotTAB(2);
        Parent.ActionsSendKeys("12345rk");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("12345rk");
        el.clickFunction(el.registerButton);

        el.assertionFunction(el.verification,"completed");
        el.logout.click();
    }

    @Test(priority = 2 , groups = {"Smoke Test" , "Login Test"})
    public void Login(){
        //Elements el = new Elements();
        LoginTest("rkaya@gmail.com","12345rk");
        //el.logout.click();

    }

    @Test(priority = 3 , groups = {"UI Testing" , "TAB Menu"})
    public void TabMenu(){

        Elements el = new Elements();

        Assert.assertTrue(el.headerMenu.isEnabled());
        el.hoverFunction(el.computers);
        el.clickFunction(el.desktops);
        Assert.assertTrue(driver.getCurrentUrl().contains("desktop"));
        el.hoverFunction(el.computers);
        el.clickFunction(el.notebooks);
        Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
        el.hoverFunction(el.computers);
        el.clickFunction(el.software);
        Assert.assertTrue(driver.getCurrentUrl().contains("software"));
        el.hoverFunction(el.electronics);
        el.clickFunction(el.cameraPhoto);
        Assert.assertTrue(driver.getCurrentUrl().contains("camera-photo"));
        el.hoverFunction(el.electronics);
        el.clickFunction(el.cellPhones);
        Assert.assertTrue(driver.getCurrentUrl().contains("cell-phones"));
        el.hoverFunction(el.electronics);
        el.clickFunction(el.others);
        Assert.assertTrue(driver.getCurrentUrl().contains("others"));
        el.hoverFunction(el.apparel);
        el.clickFunction(el.shoes);
        Assert.assertTrue(driver.getCurrentUrl().contains("shoes"));
        el.hoverFunction(el.apparel);
        el.clickFunction(el.clothing);
        Assert.assertTrue(driver.getCurrentUrl().contains("clothing"));
        el.hoverFunction(el.apparel);
        el.clickFunction(el.accessories);
        Assert.assertTrue(driver.getCurrentUrl().contains("accessories"));
        el.clickFunction(el.digitalDownloads);
        Assert.assertTrue(driver.getCurrentUrl().contains("digital-downloads"));
        el.clickFunction(el.books);
        Assert.assertTrue(driver.getCurrentUrl().contains("books"));
        el.clickFunction(el.jewelry);
        Assert.assertTrue(driver.getCurrentUrl().contains("jewelry"));
        el.clickFunction(el.giftCards);
        Assert.assertTrue(driver.getCurrentUrl().contains("gift-cards"));
    }
}
