package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 10, threadPoolSize = 5)
	public void test1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("Test case 1");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	
}
