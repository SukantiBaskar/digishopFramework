package testScripts;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import objectRepository.CheckOutPage;
import objectRepository.HomePage;
import objectRepository.JewelryPage;
import objectRepository.ShoppingCartPage;
import objectRepository.ThankYouPage;

public class JewelryTest extends BaseClass{
	@Test
	public void jewelry() {
		HomePage homepage=new HomePage(driver);
		JewelryPage jewelrypage=new JewelryPage(driver);
		ShoppingCartPage shoppingcartpage=new ShoppingCartPage(driver);
		CheckOutPage checkoutpage=new CheckOutPage(driver);
		ThankYouPage thankyoupage=new ThankYouPage(driver);
		
		//Click on Jewelry link
		homepage.getJewelryPage().click();
		//Verify Jewelry page is displayed
		Assert.assertEquals(jewelrypage.getPageTitle().getText(), "Jewelry", "Jewelry page os not displayed");
		//Take screenshot of jewelry page
		getWepPageScreenshot(driver);
		
		//Click on add to cart button
		jewelrypage.getaddToCartButton().click();
		//Click on Shopping cart
		jewelrypage.getShoppingCart().click();
		
		//Verify shopping cart page is displayed
		Assert.assertEquals(shoppingcartpage.getPageTitle().getText(), "Shopping cart", "Shopping cart page is not displayed");
		//Take screenshot of Shopping 
		
		getWepPageScreenshot(driver);
		//Click on the checkbox
		shoppingcartpage.getCheckBox().click();
		//Click on checkout button
		shoppingcartpage.getCheckOutButton().click();
		
		//Verify checkout page is displayed
		Assert.assertEquals(checkoutpage.getPageTitle().getText(), "Checkout", "Checkout page is not displayed");
		//Select country from dropdown
		Select select=new Select(checkoutpage.getCountryDropdown());
		select.selectByVisibleText("India");
		//Enter city 
		checkoutpage.getCity().sendKeys("Chennai");
		//Enter Address 1
		checkoutpage.getAddress1().sendKeys("Paramount court, 12th Avenue, Ashok nagar");
		//Enter postal code
		checkoutpage.getPostalCode().sendKeys("600083");
		//Enter phone number
		checkoutpage.getPhoneNumber().sendKeys("9876543210");
		//Click on continue
		checkoutpage.getContinueButton1().click();
		
		//Click on continue button
		checkoutpage.getContinueButton2().click();
		
		//Select shipping method
		checkoutpage.getShippingOption().click();
		//Click on continue button
		checkoutpage.getContinueButton3().click();
		
		//Select payment method
		checkoutpage.getPaymentMethod().click();
		//Click on continue button
		checkoutpage.getContinueButton4().click();
		
		//Click on continue button
		checkoutpage.getContinueButton5().click();
		
		//Click on confirm button
		checkoutpage.getConfirmButton().click();
		
		//Verify thank you page is displayed
		//Assert.assertEquals(thankyoupage.getPageTitle().getText(), "Thank you", "Thankyou page is not displayed");
		//Click on continue button
		thankyoupage.getContinueButton().click();
		
	}

}
