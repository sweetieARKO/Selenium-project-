package ListOfElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test2 {
    WebDriver driver;

    public Test2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//textarea[@id='APjFqb']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='lJ9FBc']//input[@name='btnK']")
    public WebElement searchButton;

    @FindBy(xpath = "(//h3[normalize-space()='Facebook - log in or sign up'])[1]")
    public WebElement facebookLink;

    public void searchOnGoogle(String searchInput) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the search box to be visible
        wait.until(ExpectedConditions.visibilityOf(searchBox));

        // Enter the search input
        searchBox.sendKeys(searchInput);
    }

    public void clickButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the search button to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        // Click the search button
        searchButton.click();
    }

    public void clickFacebook() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the Facebook link to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(facebookLink));

        // Click the Facebook link
        facebookLink.click();
    }
}
