package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.AddToCartPage;
import example.example.pages.SauceDemoLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test(testName = "Add to Cart test", description = "add to cart test")

public class AddToCartTest extends SauceDemoLoginTest
{
    @Test
public void AddTest() {
        AddToCartPage addToCartPage = PageinstancesFactory.getInstance(AddToCartPage.class);
        addToCartPage.selectItemAndAddToCart();
    Assert.assertTrue(true, "Backpack added successfull : Test Passed");
}
}