package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickAllItemsPage extends RemoveFromCartPage {

    /** Click on SideBar to display All Items menu option */
    @FindBy(id = "react-burger-menu-btn")
    private WebElement sidebar;

    /** Click on All Items menu option. */
    @FindBy(id = "inventory_sidebar_link")
    private WebElement allItems;

    public ClickAllItemsPage(WebDriver driver) {
        super(driver);
    }


    /**
     * Click Add to Cart once again.
     */
    public void selectItemAgainAddToCart() {
        sidebar.click();
        allItems.click();

    }

}

