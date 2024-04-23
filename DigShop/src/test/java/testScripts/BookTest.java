package testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass;

@Listeners(listenerUtility.ListenerImpl.class)
public class BookTest extends BaseClass{
	
	@Test
	public void books_001(){
		driver.findElement(By.linkText("BOO")).click();
		test.log(LogStatus.INFO, "To click on Books","Clicked on Books link");
		
		String actualTitle=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
		try {
			//Verify the Books page is displayed
			Assert.assertEquals(actualTitle, "Boo", "Books page is not displayed");
			test.log(LogStatus.PASS, "Books page is displayed");
			
		} catch (AssertionError e) {
			test.log(LogStatus.FAIL, test.addScreenCapture(getWepPageScreenshot(driver)));
		}
		
		Reporter.log("Test case completed",true);
	}
	
	@Test
	public void books_002() {
		driver.findElement(By.linkText("BOOKS")).click();
		test.log(LogStatus.INFO, "Clicked on Books Link");
		Boolean sortByDropdown=driver.findElement(By.id("products-orderby")).isDisplayed();
		Assert.assertEquals(sortByDropdown, true, "Sort by dropdown is not displayed");
		test.log(LogStatus.PASS, "Sort by dropdown is displayed");
		
		Reporter.log("Test case completed",true);
	}
	
	@Test
	public void books_003() {
		driver.findElement(By.linkText("BOOKS"));
	}

}
