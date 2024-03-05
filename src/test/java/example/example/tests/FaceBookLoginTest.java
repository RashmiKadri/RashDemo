package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.FacebookLoginPage;


@Test(testName = "Login test", description = "login test")
public class FaceBookLoginTest extends BaseTest {

	@Test
	public void LoginTest() {
		driver.get("https://www.saucedemo.com/");
		FacebookLoginPage facebookLoginPage = PageinstancesFactory.getInstance(FacebookLoginPage.class);
		facebookLoginPage.enterEmail("abc").enterPassword("abc").clickSignIn();
		Assert.assertTrue(false, "Login failed : Test failed");
	}
}
