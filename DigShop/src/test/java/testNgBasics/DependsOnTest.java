package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnTest {
	@Test(groups="smoke")
	public void register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("smoke Register",true);
		driver.manage().window().maximize();
		//driver.get("sahk");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(groups = "FT")//(dependsOnMethods = "register")
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("FT Login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(groups={"RT","IT"})//(dependsOnMethods = "login")
	public void addToCart() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("RT IT Add to cart");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(groups={"smoke","RT"})//(dependsOnMethods = "addToCart")
	public void payment() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("smoke RT Payment");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}

}
