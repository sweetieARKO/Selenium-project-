package Tests;

import ListOfElements.Test2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
   WebDriver driver;
    Test2 pageFactory;


    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void yourTest() throws InterruptedException {
      pageFactory = new Test2(driver);
      pageFactory.searchOnGoogle("Facebook");
      pageFactory.clickButton();
      pageFactory.clickFacebook();
        // Your test steps go here
        // For example, interacting with the Test2 class or performing actions on the page
    }
}
