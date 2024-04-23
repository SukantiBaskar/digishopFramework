package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement pageTitle;
	@FindBy(id = "termsofservice")
	private WebElement checkBox;
	@FindBy(id = "checkout")
	private WebElement checkOutButton;
	
	public WebElement getPageTitle() {
		return pageTitle;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getCheckOutButton() {
		return checkOutButton;
	}

	
}
