package testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;

public class ComputerTest extends BaseClass{
	@Test
	public void computers_001(){
		driver.findElement(By.linkText("COMPUTERS")).click();
		String actualTitle=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
		Assert.assertEquals(actualTitle, "Computers", "Computers page is not displayed");
		
		Reporter.log("Test case completed", true);
	}
	
	@Test
	public void computers_002() {
		driver.findElement(By.linkText("COMPUTERS")).click();
		Boolean desktopsLink=driver.findElement(By.linkText("Desktops")).isDisplayed();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(desktopsLink, true, "Desktops is not displayed");
		
		Boolean notebooksLink=driver.findElement(By.linkText("Notebooks")).isDisplayed();
		soft.assertEquals(notebooksLink, true, "Notebooks is not displayed");
		
		Boolean accessoriesLink=driver.findElement(By.linkText("Accessories")).isDisplayed();
		soft.assertEquals(accessoriesLink, true, "Accessories is not displayed");
		
		soft.assertAll();
		driver.quit();
		Reporter.log("Test case completed", true);
		
	}

}
