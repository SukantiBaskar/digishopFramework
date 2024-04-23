package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement pageTitle;
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countryDropdown;
	@FindBy(id = "BillingNewAddress_City")
	private WebElement city;
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement address1;
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement postalCode;
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNumber;
	@FindBy(xpath = "//div[@id='billing-buttons-container']//input")
	private WebElement continueButton1;
	
	@FindBy(xpath = "//div[@id='shipping-buttons-container']//input")
	private WebElement continueButton2;
	
	@FindBy(id = "shippingoption_0")
	private WebElement shippingOption;
	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']//input")
	private WebElement continueButton3;
	
	@FindBy(id = "paymentmethod_0")
	private WebElement paymentMethod;
	@FindBy(xpath = "//div[@id='payment-method-buttons-container']//input")
	private WebElement continueButton4;
	
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']//input")
	private WebElement continueButton5;
	
	@FindBy(xpath = "//input[@value='Confirm']")
	private WebElement confirmButton;
	
	
	public WebElement getPageTitle() {
		return pageTitle;
	}
	public WebElement getCountryDropdown() {
		return countryDropdown;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getPostalCode() {
		return postalCode;
	}
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	public WebElement getContinueButton1() {
		return continueButton1;
	}
	public WebElement getContinueButton2() {
		return continueButton2;
	}
	public WebElement getShippingOption() {
		return shippingOption;
	}
	public WebElement getContinueButton3() {
		return continueButton3;
	}
	public WebElement getPaymentMethod() {
		return paymentMethod;
	}
	public WebElement getContinueButton4() {
		return continueButton4;
	}
	public WebElement getContinueButton5() {
		return continueButton5;
	}
	public WebElement getConfirmButton() {
		return confirmButton;
	}
}
