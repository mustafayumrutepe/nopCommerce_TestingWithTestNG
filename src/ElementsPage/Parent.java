package ElementsPage;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Parent {

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
}
