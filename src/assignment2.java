import com.sun.jna.platform.win32.OaIdl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class assignment2 {

    public static void main(String[] args) throws InterruptedException {
        //Selenum code to open google.com in chrome browser

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        // System.out.println("jyoti : "+System.getProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();

        //--------hit the URL you want to open in browse--------
        driver.get("https://www.cleartrip.com/");

        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day.DayPicker-Day--start.DayPicker-Day--selected.DayPicker-Day--today')]")).click();
        System.out.println(driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day.DayPicker-Day--start.DayPicker-Day--selected.DayPicker-Day--today')]")));



    }
}
