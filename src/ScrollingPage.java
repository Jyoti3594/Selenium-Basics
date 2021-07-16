
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/*
How to Perform Scrolling with in table and
Window level using JavaScriptExecutor .
 */

public class ScrollingPage {
    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


        //Selenum code to open google.com in chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");


        //Use  Java Script  for scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000L);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        //sum up the total numbers given in table
        List<WebElement> value = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;
        for (int i = 0; i < value.size(); i++) {

            sum = sum + Integer.parseInt(value.get(i).getText());

        }
        System.out.println(sum);

        //compare the Sum value is same as mentioned total amount on web page or not ?
        driver.findElement(By.cssSelector(".totalAmount")).getText();
        int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        Assert.assertEquals(sum, total);
    }
}