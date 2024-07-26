package Utility;

import ElementsPage.Elements;
import ElementsPage.Parent;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static final org.apache.logging.log4j.Logger logger4j= LogManager.getLogger();
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void startupOperations() {
        Logger logger=Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    }

    @AfterClass
    public void endOperations(){
        Parent.Waiting(5);
        driver.quit();
    }




    @BeforeMethod
    public void beforeMethod(){
        driver.get("https://demo.nopcommerce.com/");
        logger4j.info("test method started");
        logger4j.warn("warning message testing has started");
    }

    @AfterMethod
    public void afterMethod(ITestResult result){
        logger4j.info(result.getName() + " test method finished " + (result.getStatus() == 1 ? " passed " : "fail"));
        logger4j.warn("warning message testing has finished");
    }


    public static void LoginTest(){
        Elements el = new Elements();

        el.Click(el.login);
        Parent.ActionsSendKeys("rkaya@gmail.com");
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys("12345rk");
        el.Click(el.loginButton);

        el.Assertion(el.logout,"out");
    }

}

