package vTigerCrm;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.PropertyUtils;
import commonUtils.WebDriverUtils;

public class Organizations {
	
	@Test
	public void organizationsTest() throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		PropertyUtils putil=new PropertyUtils();
		WebDriverUtils wutil=new WebDriverUtils();
		//to maximize the window
		wutil.maximize(driver);
		//to apply wait for find element
		wutil.implicitwait(driver);
		
		//to read data from property file
		String url=putil.getDataFromPropertyFile("url");

		String username=putil.getDataFromPropertyFile("username");
		String password=putil.getDataFromPropertyFile("password");
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
//		clik on oraganisation
	}

}
