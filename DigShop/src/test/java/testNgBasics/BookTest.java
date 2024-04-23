package testNgBasics;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BookTest {
	@Test
	public void booktest(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on BOOKS link
		driver.findElement(By.linkText("BOOKS")).clear();
		String actualTitle=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
		assertEquals(actualTitle, "Books", "Books page is not displayed");
		driver.quit();
		
	}
	

}
