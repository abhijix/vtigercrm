package commonUtils;

import org.apache.commons.io.FileUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener{
	
	ExtentReports er;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName=result.getMethod().getMethodName();
		Reporter.log("method name: "+methodName+" testscript execution is started", true);
		test=er.createTest(methodName);
		test.log(Status.PASS, "testscript execution is started");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		String methodName=result.getMethod().getMethodName();
		Reporter.log("method name: "+methodName+"testscript execution is success", true);
//		Test.class
		test.log(Status.PASS, "testscript execution is success");
//		test.log(Status.PASS, null)
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String msg = result.getThrowable().toString();
		String methodName=result.getMethod().getMethodName();
		Reporter.log("method name: "+methodName+"testscript execution is failure. "+msg, true);
		test.log(Status.PASS, "testscript execution is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName=result.getMethod().getMethodName();
		Reporter.log("method name: "+methodName+" testscript execution is skipped", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
//		String methodName=result.getMethod().getMethodName();
//		Reporter.log("testscript execution is started", true);
		
		//use extentsparkreporter class just to configure extent report
		JavaUtil jutil=new JavaUtil();
		ExtentSparkReporter reporter=new ExtentSparkReporter("./extentreport/report"+jutil.getRandomNumber()+".html");
		//file utils
		reporter.config().setTheme(Theme.DARK);
//		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("Abhijit");
		
		// create object of ExtentReports to generate ExtentReports
		er=new ExtentReports();
		
		//call attachReporter() method to add all configurations to extentreport
		er.attachReporter(reporter);
		
		er.setSystemInfo("Windows","11");
		er.setSystemInfo("Chrome","122.0.6261.95");
		er.setSystemInfo("Author","Ajay");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		er.flush();
		
	}
}
