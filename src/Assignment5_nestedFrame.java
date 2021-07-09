import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

    /*
    How to work with nested frames in Selenium
     */
public class Assignment5_nestedFrame {
    public static void main(String[] args) {

// TODO Auto-generated method stub


        //Selenum code to open google.com in chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");


        driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) ul:nth-child(4) li:nth-child(34) > a:nth-child(1)")).click();

        //Switching to frames as frames are not part of web pages

        driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]")));


        //Switch to middle frame
        driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/frameset[1]/frame[2]")));


        //Print the middle text in output
        System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]")).getText());
    }
}