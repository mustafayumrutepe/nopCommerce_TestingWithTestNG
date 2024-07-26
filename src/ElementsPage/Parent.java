package ElementsPage;

import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Parent {

    static WebDriverWait wait;

    public Parent() {wait=new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(15));}

    public static void Waiting(int sec){
        try {
            Thread.sleep(sec*1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int RandomNumberGenerator(int border){
        return (int)(Math.random()*border);
    }

    public void randomClick(List<WebElement> element) {
        Random rnd = new Random();
        int index = rnd.nextInt(element.size());
        element.get(index).click();
    }

    public void Click(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void SendKeys(WebElement element, String text){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(text);
    }

    public static void ActionsSendKeys(String text){
        Actions actions=new Actions(BaseDriver.driver);
        actions.sendKeys(text).build().perform();
    }

    public static void RobotTAB(int number){
        Robot robot= null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < number; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
    }

    public  void Select(WebElement element, String text){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Select select=new Select(element);
        select.selectByVisibleText(text);
    }

    public void Assertion(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().toLowerCase().
                contains(text.toLowerCase()),"Transaction failed.");
    }
    }
