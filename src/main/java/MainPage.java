import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "(//li[@id='current_account']//div)")
    private WebElement signInButton;
    @FindBy(xpath = "//input[@name='ss']")
    private WebElement destinationInput;
    @FindBy(xpath = "//div[@data-mode='checkin']")
    private WebElement dateCalendar;
    @FindBy(xpath = "//td[@data-date='2019-06-27']")
    private WebElement checkIn;
    @FindBy(xpath = "//td[@data-date='2019-06-29']")
    private WebElement checkOut;
    @FindBy(xpath = "//button[@class='sb-searchbox__button  ']")
    private WebElement searchButton;





    public LoginPage clickSignIn(){
        signInButton.click();
        return new LoginPage(driver);
    }

    public ResultPage selectOffers() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        destinationInput.click();
        destinationInput.clear();
        destinationInput.sendKeys("Kyiv");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        dateCalendar.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        checkIn.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        checkOut.click();
        searchButton.click();

        return new ResultPage(driver);
    }




}
