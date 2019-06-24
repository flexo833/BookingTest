import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ResultPage {
    private WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, 5);
    @FindBy(xpath = "//a[@class='sort_option ']")
    private WebElement sortByPriceButton;


    public ResultPage (WebDriver driver) {
        this.driver = driver;

    }
    public void sortByPrice ()  {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='sort_option']")));

        sortByPriceButton.click();
    }
}
