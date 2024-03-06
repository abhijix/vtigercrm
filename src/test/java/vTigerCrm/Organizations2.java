package vTigerCrm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonUtils.ExcelUtils;
import commonUtils.JavaUtil;
import commonUtils.ListenerImplementation;
import commonUtils.PropertyUtils;
import commonUtils.WebDriverUtils;

@Listeners(ListenerImplementation.class)
public class Organizations2 {
	ExcelUtils eutil=new ExcelUtils();
	JavaUtil jutil=new JavaUtil();
	PropertyUtils putil=new PropertyUtils();
	WebDriverUtils wutil=new WebDriverUtils();
	
	@Test
	public void loginOrgLogout() throws IOException, InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		wutil.maximize(driver);
		wutil.implicitwait(driver);
		
		String url=putil.getDataFromPropertyFile("url");
		String username=putil.getDataFromPropertyFile("username");
		String password=putil.getDataFromPropertyFile("password");
		String org=eutil.getDataFromExcel("Organizations", 0, 1);
		String group=eutil.getDataFromExcel("Organizations", 1, 1);
		
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
//		driver.findElement(By.cssSelector("imCreate Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(org+jutil.getRandomNumber()+""+jutil.getRandomNumber());
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		WebElement dropdwn = driver.findElement(By.name("assigned_group_id"));
		
		wutil.handledropdown(dropdwn, group);
		
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		wutil.mousehover(driver, img);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
	}
}
