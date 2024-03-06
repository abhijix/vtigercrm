package vTigerCrm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.BaseClass;
import commonUtils.ExcelUtils;
import commonUtils.JavaUtil;
import commonUtils.PropertyUtils;
import commonUtils.WebDriverUtils;

public class OrganizationsTestNg extends BaseClass{
	ExcelUtils eutil=new ExcelUtils();
	JavaUtil jutil=new JavaUtil();
	PropertyUtils putil=new PropertyUtils();
	WebDriverUtils wutil=new WebDriverUtils();
	
	@Test
	public void loginOrgLogout() throws IOException, InterruptedException
	{
		String org=eutil.getDataFromExcel("Organizations", 0, 1);
		String group=eutil.getDataFromExcel("Organizations", 1, 1);
		
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(org+jutil.getRandomNumber()+""+jutil.getRandomNumber());
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		WebElement dropdwn = driver.findElement(By.name("assigned_group_id"));
		
		wutil.handledropdown(dropdwn, group);
		
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		Thread.sleep(2000);
	}
}
