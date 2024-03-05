package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends RemoveFromCartPage {

    /** Click on Item */
    @FindBy(id = "shopping_cart_container")
    private WebElement clickcart;

    /**  Checkout. */
    @FindBy(id = "checkout")
    private WebElement checkout;


    public CheckOutPage(WebDriver driver) {
        super(driver);
    }


    /**
     * Click Checkout.
     */
    public void checkOutFromCart() {
        clickcart.click();
        checkout.click();

    }

}
