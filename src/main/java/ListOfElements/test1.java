package ListOfElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {

    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Input fields
        WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
        name.sendKeys("Abigail Arko");

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("abigail.arko@gmail.com");

        WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
        phone.sendKeys("0572493796");

        WebElement address = driver.findElement(By.xpath("//textarea[@id='textarea']"));
        address.sendKeys("P.O.Box 229");

        // Radio button
        WebElement gender = driver.findElement(By.xpath("//input[@id='female']"));
        gender.click();

        // Checkbox
        WebElement sunday = driver.findElement(By.xpath("//input[@id='sunday']"));
        WebElement tuesday = driver.findElement(By.xpath("//input[@id='tuesday']"));
        WebElement friday = driver.findElement(By.xpath("//input[@id='friday']"));
        sunday.click();
        tuesday.click();
        friday.click();

        // Dropdowns
        Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        drpCountry.selectByVisibleText("Japan");

        Select colours = new Select(driver.findElement(By.xpath("//select[@id='colors']")));
        colours.selectByIndex(4);

        // Datepicker
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("30/06/1999");

        // Click on specific links and buttons
        driver.findElement(By.xpath("//a[normalize-space()='31']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='orange HRM']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
        driver.findElement(By.xpath("//a[@type='application/atom+xml']")).click();

        // Perform additional actions, e.g., clicking a button
        driver.findElement(By.xpath("//body[1]/div[5]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]")).click();


    }
}