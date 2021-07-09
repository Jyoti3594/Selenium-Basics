import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class assignment2 {

    public static <webElement> void main(String[] args) throws InterruptedException {
        //Selenum code to open google.com in chrome browser

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        // System.out.println("jyoti : "+System.getProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();

        //--------hit the URL you want to open in browse--------
        driver.get("https://www.cleartrip.com/");

        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(2000L);


        //Select Today s date
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[5]/div[1]")).click();
        //Select 2 adult numbers
        // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/select[1]")).click();
        WebElement staticDropdown = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/select[1]"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByValue("2");
        //click on link
        driver.findElement(By.partialLinkText("Class of travel, Air")).click();

        //Entre flight name
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("indigo");
        //Tap on search flight
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[2]/button[1]")).click();

        //Print error message in output
        System.out.println(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText());
    }
}
