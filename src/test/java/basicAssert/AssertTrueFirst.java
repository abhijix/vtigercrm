package basicAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFirst {

	@Test
	public void myntra()
	{
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.myntra.com/");
		
		WebElement searchTf=wd.findElement(By.className("desktop-searchBar"));
		
//		Assert.assertTrue(searchTf.isDisplayed());
//		Assert.assertTrue(searchTf.isSelected());
		
		Assert.assertTrue(searchTf.isEnabled());
		System.out.println("Assert True Method");
		
		//searchTf.isSelected()-------False condition-------fail
		//searchTf.isDisplayed()---------True condition-----pass
//		searchTf.isEnabled()------------True condition-------pass
	}

}
