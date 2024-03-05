package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage extends CheckOutPage {

    /**
     * Click on First Name, Last Name and zip code
     */
    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "finish")
    private WebElement finishButton;

    @FindBy(id = "postal-code")
    private WebElement postalCode;

    public InformationPage(WebDriver driver) {
        super(driver);
    }


    /**
     * Enter first name, last name and zip code
     */
    public InformationPage enterFirstName(String firstname) {
        firstName.sendKeys(firstname);
        return this;
    }

    public InformationPage enterLastName(String lastname) {
        lastName.sendKeys(lastname);
       return this;
    }
    public InformationPage enterZipCode(String zipCode) {
        postalCode.sendKeys(zipCode);
        return this;
    }
    public void clickContinue() {
        continueButton.submit();
}}