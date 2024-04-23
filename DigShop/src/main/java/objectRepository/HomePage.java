package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css = "[alt='Tricentis Demo Web Shop']")
	private WebElement logo;
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(partialLinkText  = "Log in")
	private WebElement loginLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchField;
	
	@FindBy(className = "search-box-button")
	private WebElement searchButton;
	
	@FindBy(linkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(linkText = "JEWELRY")
	private WebElement jewelryPage;
	
	@FindBy (css = "img[alt='Picture of 14.1-inch Laptop']")
	private WebElement laptopImage;
	
	@FindBy (linkText = "Log out")
	private WebElement logoutLink;
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getLaptopImage() {
		return laptopImage;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getSearchField() {
		return searchField;
	}
	public WebElement getSearchButton(){
		return searchButton;
	}
	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	public WebElement getJewelryPage() {
		return jewelryPage;
	}
}
