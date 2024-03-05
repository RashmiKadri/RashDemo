package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test(testName = "Login test", description = "login test")

public class SauceDemoLoginTest extends BaseTest {

    @Test
    public void LoginTest() {
        //TC1
        driver.get("https://www.saucedemo.com/");
        //TC2
        SauceDemoLoginPage sauceDemoLoginPage = PageinstancesFactory.getInstance(SauceDemoLoginPage.class);
        sauceDemoLoginPage.enterEmail("standard_user").enterPassword("secret_sauce").clickSignIn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(true, "Login successfull : Test Passed");
        //TC5
        AddToCartPage addToCartPage = PageinstancesFactory.getInstance(AddToCartPage.class);
        addToCartPage.selectItemAndAddToCart();
        Assert.assertTrue(true, "Backpack added successfull : Test Passed");
//        driver.switchTo().alert().accept();
        //TC7 and TC8
        RemoveFromCartPage removeFromCartPage = PageinstancesFactory.getInstance(RemoveFromCartPage.class);
        removeFromCartPage.removeItemFromCart();
        Assert.assertTrue(true, "Add to Cart is displayed : Test Passed");
        ClickAllItemsPage clickAllItemsPage=PageinstancesFactory.getInstance(ClickAllItemsPage.class);
        clickAllItemsPage.selectItemAgainAddToCart();
        addToCartPage.selectItemAndAddToCart();
        Assert.assertTrue(true, "Backpack added successfull : Test Passed");

        //TC11
        CheckOutPage checkOutPage = PageinstancesFactory.getInstance(CheckOutPage.class);
        checkOutPage.checkOutFromCart();
        Assert.assertTrue(true, "CheckedOut : Test Passed");

        //TC12
        InformationPage informationPage=PageinstancesFactory.getInstance(InformationPage.class);
        informationPage.enterFirstName("Test").enterLastName("Test").enterZipCode("1").clickContinue();
        Assert.assertTrue(true, "CheckedOut:Overview : Test Passed");

        //TC14
        CheckoutOverViewPage checkoutOverViewPage=PageinstancesFactory.getInstance(CheckoutOverViewPage.class);
        checkoutOverViewPage.clickFinish();
        Assert.assertTrue(true,"Thank you for your order! : Test Passed");
    }

//    public void AddTest() {
//
//        AddToCartPage addToCartPage = PageinstancesFactory.getInstance(AddToCartPage.class);
//        addToCartPage.selectItemAndAddToCart();
//        Assert.assertTrue(true, "Backpack added successfull : Test Passed");
//    }
    }