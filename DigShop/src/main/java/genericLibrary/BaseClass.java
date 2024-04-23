package genericLibrary;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class BaseClass extends UtilityMethods{
	public WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;

	@BeforeSuite
	public void bs(){
		report=new ExtentReports("./Reports/"+getTime()+".html");
	}
	
	@AfterSuite
	public void as() {
		report.flush();
		Reporter.log("After Suite", true);
	}
	
	@BeforeTest
	public void bt() {
		Reporter.log("Before Test", true);
	}
	
	@AfterTest
	public void at() {
		
		Reporter.log("After test", true);
	}
	
	@Parameters({"browser", "url"})
	@BeforeClass
	public void LaunchBrowser() {
		
		String browser=FileUtility.getProperty("browser");
		String url=FileUtility.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initObjects(driver);
		
		Reporter.log("Browser launched", true);
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
		Reporter.log("Browser closed", true);
	}
	
	@BeforeMethod
	public void Login(Method method) {
		String email=FileUtility.getProperty("email");
		String password=FileUtility.getProperty("password");
		
		test=report.startTest(method.getName());
		
		//Click on login link
		driver.findElement(By.linkText("Log in")).click();
		//Enter the email
		driver.findElement(By.id("Email")).sendKeys(email);
		//Enter the password
		driver.findElement(By.id("Password")).sendKeys(password);
		//Click on login button
		driver.findElement(By.className("login-button")).click();
		Reporter.log("Login", true);
	}
	
	@AfterMethod
	public void Logout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Logout", true);
		report.endTest(test);
	}

}
