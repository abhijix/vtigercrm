package commonUtils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClassContacts{

	public WebDriver driver=new ChromeDriver();
	JavaUtil jutil = new JavaUtil();
	PropertyUtils putil = new PropertyUtils();
	WebDriverUtils wutil = new WebDriverUtils();
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("Connect to database");
	}
	
	@BeforeClass
	public void BC() throws IOException 
	{	
		//@BeforeClass is used to launch the application
		String browser=putil.getDataFromPropertyFile("browser");
		String url=putil.getDataFromPropertyFile("url");
//		WebDriver driver =new ChromeDriver();
		wutil.maximize(driver);
		wutil.implicitwait(driver);
		driver.get(url);	
	}
	
	@BeforeMethod
	public void BM() throws IOException
	{	
		
		//@BeforeMethod is used to login to the application
//		WebDriver driver =new ChromeDriver();
		String username=putil.getDataFromPropertyFile("username");
		String password=putil.getDataFromPropertyFile("password");
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
	}
	
	@AfterMethod
	public void AM()
	{	
		//@AfterMethod is used to logout from the application
//		WebDriver driver =new ChromeDriver();
		WebElement img = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		wutil.mousehover(driver, img);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
	
	@AfterClass
	public void AC() 
	{
		//@AfterClass is used to close the browser
//		WebDriver driver =new ChromeDriver();
		driver.quit();
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("disconnect to database");
		
	}

}
