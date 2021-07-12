import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

/*
Get the Available link count in  footer part of webpage .
How to open the links in Separate Tabs .
Getting the Titles of child tabs with optimized while loop.
 */

public class LimitScope {
    public static void main(String[] args) throws InterruptedException {

        //Selenum code to open google.com in chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");



        //footer link count by limiting the web driver scope

        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        WebElement insideFooter = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(insideFooter.findElements(By.tagName("a")).size());

        //click on each link to open separately

        int i =1;
        for(i=1;i<insideFooter.findElements(By.tagName("a")).size();i++){
            String clickonLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
            insideFooter.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
            Thread.sleep(5000L);


        }
        //Getting the Titles of child tabs with optimized while loop

        Set<String> strngName = driver.getWindowHandles();
        Iterator<String> iterName = strngName.iterator();

        while(iterName.hasNext())
        {
            driver.switchTo().window(iterName.next());
            System.out.println(driver.getTitle());
        }
    }
}
