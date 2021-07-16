import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.ui.Select;

/*
How to select Calender Date without hard code of dates .
 */


public class CalenderDateSelect {
    public static void main(String[] args) {

// TODO Auto-generated method stub

        //Selenum code to open google.com in chrome browser

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.path2usa.com/travel-companions");

        //Open calender
        driver.findElement( By.id("travel_date")).click();

        //Select month by using while loop
        while(!driver.findElement(By.xpath("//div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText().contains("August"))
        {
            driver.findElement(By.cssSelector(".next")).click();
        }

        //Get common value from calender view
        List<WebElement> allDates = driver.findElements(By.cssSelector(".day"));

        int count= driver.findElements(By.cssSelector(".day")).size();
        //Use For loop for checking if the highlighted date is matching with the given number or not ?
        //If Yes , then click on that date and exit

        for(int i=0;i<count;i++){
            String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
            if(text.equalsIgnoreCase("22")){
                driver.findElements(By.cssSelector(".day")).get(i).click();
                break;
            }
        }
    }
}