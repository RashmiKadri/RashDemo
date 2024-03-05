package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveFromCartPage extends AddToCartPage {

    /** Remove Item */
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement removeitem;

    public RemoveFromCartPage(WebDriver driver) {
        super(driver);
    }


    /**
     * Click Remove Item Cart.
     */
    public void removeItemFromCart() {
        removeitem.click();
    }

}
