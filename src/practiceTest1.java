import com.sun.jna.platform.win32.OaIdl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class practiceTest1 {

    public static void main(String[] args) throws InterruptedException {
        //Selenum code to open google.com in chrome browser

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        // System.out.println("jyoti : "+System.getProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();

        //hit the URL you want to open in browse
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));


        //---------------------------------------AUTO SUGGESTIVE DROPDOWN BOX----------------------------------------- //

        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(3000L);
        List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement option:options){
            if("India".equalsIgnoreCase(option.getText())) {
                option.click();
                break;
            }
        }



        //------------------------------------ DYNAMIC DROPDOWN BOX --------------------------------------------------//

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(1000L);
        //driver.findElement(By.xpath("(//a[@text='Jaisalmer (JSA)'])[2]")).click();   ---index used in x path ---
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Jaisalmer (JSA)']")).click();  /* it is parent xpath following by child x path ,this need to be used when we don't want to use indexes */
        driver.findElement(By.className("search-buttons-heading")).click();


        //------------------------STATIC DROPDOWN BOX-------------------------------------------- (options that cannot be changed) //
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();



        int i=0;
        while(i<4){
            driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
            i++;
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        Thread.sleep(2000L);


        driver.close();
    }

}