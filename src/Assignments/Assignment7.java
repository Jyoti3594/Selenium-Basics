package Assignments;


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

public class Assignment7 {
    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


        //Selenum code to open google.com in chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");


        //Use  Java Script  for scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(3000L);


        //limit the scope to table
         WebElement tableSelected = driver .findElement(By.id("product"));
        //total number of rows
         System.out.println(tableSelected.findElements(By.tagName("tr")).size());

       //total numbers of column
       System.out.println(tableSelected.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

       //Print second column in out put
        List<WebElement> select2ndRow = (tableSelected.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")));
       System.out.println(select2ndRow.get(0).getText());
       System.out.println(select2ndRow.get(1).getText());
       System.out.println(select2ndRow.get(2).getText());
    }
}

