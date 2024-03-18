package basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class FirstProject {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Url is " + currentUrl);
        String title = driver.getTitle();
        System.out.println("Title is " + title);
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.navigate().to("https://www.amazon.in");
        driver.navigate().back();

        WebElement register = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        register.click();

        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Abigail");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Arko");

        Select date = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        date.selectByVisibleText("8");

        Select month = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
        month.selectByVisibleText("June");

        Select year = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        year.selectByVisibleText("1999");

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        String string = RandomStringUtils.randomAlphanumeric(12);
        email.sendKeys(string+"@gmail.com");

        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Abigail&123arko");

        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Abigail&123arko");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();


        driver.navigate().to("https://www.amazon.in");
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("earrings");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Set<String> WindowHandle = driver.getWindowHandles();
        System.out.println(WindowHandle);
        driver.quit();

        // Close the browser
 //       driver.quit();
    }
}
