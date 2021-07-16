import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class rediffBrowser {

    public static void main(String[] args) {
        //Selenum code to open google.com in chrome browser

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        // System.out.println("jyoti : "+System.getProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();

        //hit the URL you want to open in browse
        driver.get("https://www.rediff.com/");

        driver.findElement(By.xpath("//a[@class='signin']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aashimak77@gmail.com");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("ajmimmp1234");
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        System.out.println(driver.getTitle() + " " + "opened successfully!!");

        driver. close();

    }
}