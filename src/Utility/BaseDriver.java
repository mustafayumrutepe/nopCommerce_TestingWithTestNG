package Utility;

import ElementsPage.Elements;
import ElementsPage.Parent;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Point;
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

            Logger logger = Logger.getLogger("");
            logger.setLevel(Level.SEVERE);

            driver = new ChromeDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            wait = new WebDriverWait(driver, Duration.ofSeconds(20));

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


    public static void LoginTest(String email,String password){
        Elements el = new Elements();

        el.clickFunction(el.getLogin());
        Parent.ActionsSendKeys(email);
        Parent.RobotTAB(1);
        Parent.ActionsSendKeys(password);
        el.clickFunction(el.getLoginButton());
        el.assertionFunction(el.getLogout(),"out");
    }



}

