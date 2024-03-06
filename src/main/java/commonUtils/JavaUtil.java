package commonUtils;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JavaUtil {
	
	public int getRandomNumber()
	{
		Random r=new Random();
		int ran=r.nextInt(10);
		return ran;
	}
	

}
