package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.ui.Select;

/*
Select any checkbox and get the label text of same selected checkbox .
Select the  dropdown value same as checkbox label .
Enter the same text in edit box and creat alert .
Check If alea has the same text in it or not ?

**All should be done without hard code the label **

 */
public class Assignment6 {
    public static void main(String[] args) {

// TODO Auto-generated method stub


        //Selenum code to open google.com in chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\IdeaProjects\\Introduction\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //Select the check box
        driver.findElement(By.id("checkBoxOption2")).click();

        //Create variable for the selected checkbox and get the label text .
        String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        //Select the dropdown box for options
        WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));

        //Give same variable reference to select the option from dropdown
        Select J = new Select(dropDown);
        J.selectByVisibleText(opt);

        //Click on text box to enter the same text by giving variable reference
        driver.findElement(By.id("name")).sendKeys(opt);

       //Generate Alert  & Get text from it
        driver.findElement(By.id("alertbtn")).click();
        String textOutput = driver.switchTo().alert().getText();

        //Used If Else statement to check if the entered text is present in the output text or not .
        if(textOutput.contains(opt)) {

            System.out.println("Output is correct !!");
        }
        else
            System.out.println("there is somthing wrong with output ,Please check !");
        }


        }







