import com.sun.jna.platform.win32.OaIdl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class assignment1 {

    public static void main(String[] args) throws InterruptedException {
        //Selenum code to open google.com in chrome browser

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        // System.out.println("jyoti : "+System.getProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();

        //--------hit the URL you want to open in browse--------
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        //---Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked--
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());


        //--How to get the Count of number of check boxes present in the page--

        driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());
        Assert.assertEquals(driver.findElements(By.cssSelector("input[type*='checkbox']")).size(), 3);
    }

}





