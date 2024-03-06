package basicTestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@Test
	public void facebook() 
	{
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("https://www.facebook.com");
		System.out.println("test1");
	}
	
	@BeforeMethod
	public void google() 
	{
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("https://www.google.com");
		System.out.println("befor method");
	}
	@AfterMethod
	public void myntra() 
	{
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("https://www.myntra.com");
		System.out.println("after method");
	}
	@Test
	public void instagram() 
	{
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("https://www.instagram.com");
		System.out.println("test2");
	}
	
	@BeforeClass
	public void tinder()
	{
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("https://www.youtube.com");
		System.out.println("before class");
	}
	@AfterClass
	public void youtube()
	{
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("https://www.youtube.com");
		System.out.println("after class");
	}
	@BeforeTest
	public void tinder1()
	{
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("https://www.youtube.com");
		System.out.println("before Test");
	}
	@AfterTest
	public void youtube1()
	{
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("https://www.youtube.com");
		System.out.println("after Test");
	}
	@BeforeSuite
	public void google1() 
	{
		System.out.println("befor Suite");
	}
	@AfterSuite
	public void google2() 
	{
		System.out.println("after Suite");
	}


}
