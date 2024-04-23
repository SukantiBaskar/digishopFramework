package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DisableScripts {
	@Test(groups="FT")
	public void test1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("FT Test case 1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(groups={"RT","IT"})
	public void test2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("RT IT Test case 2");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(groups = "smoke")//(enabled = false)
	public void test3() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("smoke Test case 3",true);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}

}
