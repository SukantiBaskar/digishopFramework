package testScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.ExcelUtility;
import objectRepository.HomePage;

public class HomeTest extends BaseClass{
	@Test
	public void home_001() {
		HomePage homepage=new HomePage(driver);
		//Enter the product name
		homepage.getSearchField().sendKeys("laptop");
		//Click on Search Button
		homepage.getSearchButton().click();
	}
	
	@Test
	public void home_002() throws InterruptedException{
		HomePage homePage=new HomePage(driver);
		scrollToElement(homePage.getLaptopImage());
		Thread.sleep(3000);
	}
	
	@Test
	public void home_003() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		scrollFromOrigin(homePage.getLaptopImage(), 0, 300);
		Thread.sleep(5000);
		scrollFromOrigin(homePage.getLaptopImage(), 0, -500);
		Thread.sleep(5000);
	}
	
	@DataProvider(name="pdata")
	public String[][] productData(){
		return ExcelUtility.readRowData("Products");
	}
	
	@Test
	public void home_004() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		//Search for the product
		//homePage.getSearchField().sendKeys(product);
		Thread.sleep(1000);
		//Click on search button
		homePage.getSearchButton().click();
		
	}
}
