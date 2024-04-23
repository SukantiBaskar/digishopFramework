package testScripts;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import objectRepository.CellPhonePage;
import objectRepository.ElectronicsPage;
import objectRepository.HomePage;

public class ElectronicsTest extends BaseClass{
	
	@Test
	public void electronics_cellPhone() {
		HomePage homepage=new HomePage(driver);
		ElectronicsPage electronics=new ElectronicsPage(driver);
		CellPhonePage cellPhone=new CellPhonePage(driver);
	
		//Click on Electronics Link
		homepage.getElectronicsLink().click();
		//Verify electronics page is displayed
		Assert.assertEquals(electronics.getPageTitle().getText(), "Electronics", "Electronics page is not displayed");
		//Click on Cell phone link
		electronics.getCellPhoneLink().click();
		//Verify cell phone page is displayed
		Assert.assertEquals(cellPhone.getPageTitle().getText(), "Cell phones", "Cell phone page is not displayed");
		
		//Sort the options by Name A to Z
		Select select=new Select(cellPhone.getSortByDropdown());
		select.selectByIndex(1);
		//Sort the options by Name Z to A
		select.selectByIndex(2);
	}
}
