package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceDemoLoginPage extends BasePage {

    /** The email input. */
    @FindBy(id = "user-name")
    private WebElement emailInput;

    /** The pass. */
    @FindBy(id = "password")
    private WebElement pass;

    @FindBy(id = "login-button")
    private WebElement login;


    /**
     * Instantiates a new Sauce login page.
     *
     * @param driver the driver
     */
    public SauceDemoLoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Enter email.
     */
    public SauceDemoLoginPage enterEmail(String username) {
        emailInput.sendKeys(username);
        return this;
    }

    /**
     * Enter password.
     */
    public SauceDemoLoginPage enterPassword(String password) {
        pass.sendKeys(password);
        return this;
    }

    /**
     * Click Login.
     */
    public void clickSignIn() {
        login.submit();
    }
}
