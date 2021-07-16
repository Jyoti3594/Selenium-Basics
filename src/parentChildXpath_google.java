import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class parentChildXpath_google {

    public static void main(String[] args) {
        //Selenum code to open google.com in chrome browser

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        // System.out.println("jyoti : "+System.getProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();

        //hit the URL you want to open in browse
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[@class='gb_9d gb_i gb_ng gb_eg']/div[2]/a")).click();
    }
}

