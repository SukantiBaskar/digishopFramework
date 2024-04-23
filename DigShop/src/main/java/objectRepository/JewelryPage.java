package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {
	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement pageTitle;
	@FindBy(xpath  = "//div[@data-productid='14']//input")
	private WebElement addToCartButton;
	@FindBy(xpath  = "//span[.='Shopping cart']")
	private WebElement shoppingCart;
	
	public WebElement getPageTitle() {
		return pageTitle;
	}
	public WebElement getaddToCartButton() {
		return addToCartButton;
	}
	public WebElement getShoppingCart() {
		return shoppingCart;
	}
}
