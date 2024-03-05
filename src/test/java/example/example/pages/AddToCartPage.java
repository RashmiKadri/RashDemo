package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends SauceDemoLoginPage {

    /** Click on Item */
    @FindBy(id = "item_4_title_link")
    private WebElement selectitem;

    /** Add to Cart. */
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addtocartbackpack;

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }


    /**
     * Click Add to Cart.
     */
    public void selectItemAndAddToCart() {
        selectitem.click();
        addtocartbackpack.click();

    }

}
