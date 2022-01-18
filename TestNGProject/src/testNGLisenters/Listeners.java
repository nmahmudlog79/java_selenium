package testNGLisenters;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {
	
	@Override
	public void onTestStart(ITestResult result) {
		//super.onTestStart(result);
		System.out.println("Test method is started");
	}
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		//super.onTestSuccess(tr);
		System.out.println("Test method is passed");
	}
	
	@Override
	public void onTestFailure(ITestResult tr) {
		//super.onTestFailure(tr);
		System.out.println("Test method is failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult tr) {
		//super.onTestSkipped(tr);
		System.out.println("Test method is skipped");
	}

}
