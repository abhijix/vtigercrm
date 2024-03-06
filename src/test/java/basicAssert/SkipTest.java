package basicAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SkipTest {

	@Test
	public void facebook() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.facebook.cm/";
		Assert.assertEquals(actualUrl,expectedUrl);
		
	}
	@Test (dependsOnMethods="facebook")
	public void google() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void gmail() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
	}

	

}
