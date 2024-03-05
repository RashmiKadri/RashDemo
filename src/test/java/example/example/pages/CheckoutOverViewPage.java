package example.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutOverViewPage extends InformationPage {

    /**
     * Click on Finish Button     */


    @FindBy(xpath = "//*[@id=\"finish\"]")
    private WebElement finishButton;

    public CheckoutOverViewPage(WebDriver driver) {
        super(driver);
    }


    /**
     * Enter first name, last name and zip code
     */

    public void clickFinish() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        finishButton.click();
    }}
