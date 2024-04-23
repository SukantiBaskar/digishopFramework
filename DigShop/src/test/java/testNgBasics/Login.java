package testNgBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	@DataProvider(parallel=true, name="data")
	public String[][] LoginData(){
		String[][] data=new String[5][2];
		data[0][0]="nandanhkjd@gmail.com";
		data[0][1]="nandanqw@143";
		
		data[1][0]="harshaSir@gmail.com";
		data[1][1]="harshaShanti@143";
		
		data[2][0]="TabrezB@gmail.com";
		data[2][1]="Tabmaala@143";

		data[3][0]="BharathSir@gmail.com";
		data[3][1]="BharathSomany@143";

		data[4][0]="Shambusheela@gmail.com";
		data[4][1]="Shambusheela@143";
		
		return data;
	}
	
	@Test(dataProvider="data")
	public void Login(String email, String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click on login link
		driver.findElement(By.linkText("Log in")).click();
		//Enter email
		driver.findElement(By.id("Email")).sendKeys(email);
		//Enter Password
		driver.findElement(By.id("Password")).sendKeys(password);
		//Click on login button
		driver.findElement(By.className("login-button")).click();
		//Close the browser
		driver.quit();
	}

}
