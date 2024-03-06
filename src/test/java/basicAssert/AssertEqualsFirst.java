package basicAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsFirst {

		@Test
		public void myntraPage() 
		{
			WebDriver wd=new ChromeDriver();
			wd.get("https://www.myntra.com");
//			
//			String actualUrl=wd.getCurrentUrl();
//			String expectedUrl="https://www.myntra.com/";
//						
//			//call assterEquals(boolean actual, boolean expected)
//			Assert.assertEquals(actualUrl,expectedUrl);
			
//			System.out.println("Actual URL of Myntra: "+actualUrl );
			
			
			//try with getTitle()
			String actualTitle=wd.getTitle();
			String expectedTitle="Offline Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			
			System.out.println("Actual Title of Myntra: "+actualTitle );
			
			
			//			//using if-else we cannot achieve assertion 
//			if(url.equals("https://www.myntra.com/pune")) 
//			{
//				System.out.println("URL is matching");
//			}
//			else
//			{
//				System.out.println("URL is not matching");
//			}
		}
}
