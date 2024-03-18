package basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class curaHealthcare {

    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://consults.cura.com/");
        String title = driver.getTitle();
        System.out.println("title is " + title);
        String Url = driver.getCurrentUrl();
        System.out.println("Current Url is " + Url);
        driver.findElement(By.xpath("//input[@id='input_1_4_3']")).sendKeys("Abigail");
        driver.findElement(By.xpath("//input[@id='input_1_4_6']")).sendKeys("Arko");
        driver.findElement(By.xpath("//img[@title='Select date']")).click();
        driver.findElement(By.xpath("(//select[@aria-label='Select month'])[1]")).click();
        Select month = new Select (driver.findElement(By.xpath("(//select[@aria-label='Select month'])[1]")));
        month.selectByVisibleText("June");
        Select year = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
        year.selectByVisibleText("1996");
        driver.findElement(By.xpath("//a[normalize-space()='8']")).click();
        driver.findElement(By.xpath("//input[@id='choice_1_7_1']")).click();
        driver.findElement(By.xpath("//input[@id='input_1_8']")).sendKeys("000135");
        driver.findElement(By.xpath("//input[@id='input_1_11']")).sendKeys("New York");
        driver.findElement(By.xpath("//textarea[@id='input_1_12']")).sendKeys("Headache");
      driver.findElement(By.xpath("//input[@id='input_1_18']")).sendKeys("Randy Andoh");
      driver.findElement(By.xpath("//input[@id='input_1_16']")).sendKeys("0597764501");
      driver.findElement(By.xpath("//input[@id='input_1_19']")).sendKeys("28");
      driver.findElement(By.xpath("//input[@id='input_1_20']")).sendKeys("Abigail Arko");
      driver.findElement(By.xpath("//input[@id='input_1_22']")).sendKeys("0276886822");
      driver.findElement(By.xpath("//input[@id='input_1_23']")).sendKeys("7");
      driver.findElement(By.xpath("//input[@id='gform_submit_button_1']")).click();
      driver.quit();
    }
    }
