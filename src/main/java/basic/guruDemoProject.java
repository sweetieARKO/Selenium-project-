package basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class guruDemoProject {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");

        // Correcting the XPath for the "My Account" link
        driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();

        // Inputting the first name
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Abigail");

        // Inputting the last name
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Arko");

        // Generating a random email address
        String randomEmail = RandomStringUtils.randomAlphanumeric(12) + "@gmail.com";

        // Inputting the email address
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(randomEmail);

        // Inputting the password
        String randomPassword = RandomStringUtils.randomAlphanumeric(12) + "14&%7";
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(randomPassword);

        // Clicking the agree checkbox
        driver.findElement(By.xpath("//input[@name='agree']")).click();

        // Clicking the submit button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
