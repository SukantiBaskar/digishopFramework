package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement pageTitle;
	
	@FindBy(linkText = "Cell phones")
	private WebElement cellPhoneLink;

	public WebElement getPageTitle() {
		return pageTitle;
	}

	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}
}
