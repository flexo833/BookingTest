import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement emailField;
    @FindBy(xpath = "//span[@class='bui-button__text']")
    private WebElement submitButton;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    private String email;
    private String password;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }
    public void signIn(String email, String password) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        emailField.sendKeys(email);
        submitButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        passwordField.sendKeys(password);
        submitButton.click();
    }


}
