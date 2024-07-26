package Mustafa;

import ElementsPage.Elements;
import ElementsPage.Parent;
import Utility.BaseDriver;
import org.testng.annotations.Test;

public class mustafa extends BaseDriver {

    @Test(priority = 1 , groups = {"Smoke Test" , "UserRegistiration"})
    public void Register(){
        Elements el = new Elements();

        el.Click(el.register);
        el.SendKeys(el.firstName,"Raperin");
        Parent.ActionsSendKeys("Kaya");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("15");
        Parent.RobotTAB(1);
        el.Select(el.DateOfBirthMonth, "December");
        Parent.RobotTAB(1);
        el.Select(el.DateOfBirthYear, "1966");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("rkaya@gmail.com");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("ITCompany");
        Parent.RobotTAB(2);
        Parent.ActionsSendKeys("12345rk");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("12345rk");
        el.Click(el.registerButton);

        el.Assertion(el.verification,"completed");
    }

    @Test(priority = 2 , groups = {"Smoke Test" , "Login Test"})
    public void Login(){
        LoginTest();
    }
}
