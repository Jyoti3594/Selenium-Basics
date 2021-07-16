package Assignments;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
HOw to switch between parent window & child window
 */
public class Assignment4 {
    public static void main(String[] args) {

// TODO Auto-generated method stub


        //Selenum code to open google.com in chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[33]/a[1]")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/a[1]")).click();
        Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

        Iterator<String>it = windows.iterator();

        String parentId = it.next();

        String childId = it.next();

      //Switch to child window
        driver.switchTo().window(childId);


     // Print text on output
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
    }
}