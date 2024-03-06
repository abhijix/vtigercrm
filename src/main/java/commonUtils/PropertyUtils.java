package commonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getDataFromPropertyFile(String keyname) throws IOException
	{
//		FileInputStream fis=new FileInputStream("src\\test\\resources\\data.properties");
		FileInputStream fis=new FileInputStream("src\\test\\resources\\LoginCred.properties");
//		FileInputStream fis=new FileInputStream("src\\test\\resources\\VtigerOrgData.xlsx");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(keyname);
		return value;
	}

}
