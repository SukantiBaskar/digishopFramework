package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(groups= {"smoke","FT"})
	public void login_001() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		System.out.println("smoke FT login_001");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(groups= {"IT"})
	public void login_002() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		System.out.println("IT login_002");
		driver.manage().window().maximize();
		//driver.get("dkejl");
		Thread.sleep(2000);
		driver.quit();
	}


}
