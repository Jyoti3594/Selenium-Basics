import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Demo {
    public static void main(String[] args){
        //Selenum code to open google.com in chrome browser

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
       // System.out.println("jyoti : "+System.getProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();

        //hit the URL you want to open in browser
        driver.get("https://www.google.com/");

        //to  validate if page tittle is correct or not
        System.out.println(driver.getTitle());

        //to validate if we landed on correct URL or not
      // System.out.println(driver.getCurrentUrl());
       //driver.get("https://www.reebok.ca/");

       //to use  back & forward icon of browser
       //driver.navigate().back();
        //driver.navigate().forward();

        //to close current broswer open by selenium
        //driver. close();

        //to close all broswer pages opened by selenium
        //driver.quit();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("aashimak77@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("ajmimmp12345");
        //driver.findElement(By.name("login")).click();
        // X path created manually .
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.findElement(By.className("d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }
}
