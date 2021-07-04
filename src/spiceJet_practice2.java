import com.sun.jna.platform.win32.OaIdl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class spiceJet_practice2 {

    public static void main(String[] args) throws InterruptedException {
        //Selenum code to open google.com in chrome browser

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        // System.out.println("jyoti : "+System.getProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();

        //--------hit the URL you want to open in browse--------
        driver.get("https://www.spicejet.com/");

       //------select round trio option------
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        Thread.sleep(1000L);

      //--------from - to--
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Amritsar (ATQ)')]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Jaisalmer (JSA)']")).click();

     //---------Calender------
        driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/a[1]")).click();
        driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
        driver.findElement(By.xpath("//a[contains(text(),'21')]")).click();



     //--------dynmic drop down----
        driver.findElement(By.id("divpaxinfo")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
        driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[6]/div[2]/div[2]/p[1]/select[1]/option[4]")).click();


        //--------Static dropdown----------
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        driver.findElement(By.xpath("//option[contains(text(),'INR')]")).click();

        //----Click on  CHECKBOX-------
        driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());


       //---Assertion----
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());


        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        Thread.sleep(4000L);
        driver.close();

     


        }


    }

