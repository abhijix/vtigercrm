package basicAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertFalseFirst {

	
	public void myntra()
	{
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.myntra.com/");
		
		WebElement searchTf=wd.findElement(By.className("desktop-searchBar"));
		
		//call assertFalse(boolean condition)
		Assert.assertFalse(searchTf.isEnabled());
		System.out.println("AssertFalse used to true condition make fail");
	
	}

}
