import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainClass {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get("http://www.booking.com");

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickSignIn();
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.signIn("testselenium_flexo@ukr.net","Abcd12345" );
        mainPage.selectOffers();

        ResultPage resultPage = PageFactory.initElements(driver, ResultPage.class);
        resultPage.sortByPrice();








    }
}
