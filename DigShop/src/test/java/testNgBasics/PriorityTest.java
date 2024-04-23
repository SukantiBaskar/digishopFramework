package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = -1, groups= "FT")
	public void register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("FT Register");
		driver.manage().window().maximize();
		//driver.get("sahk");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority = 0, groups="IT")
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("IT Login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(groups="RT")
	public void addToCart() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("RT Add to cart");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority = 1, groups= "smoke")
	public void payment() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("smoke Payment");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}

}
