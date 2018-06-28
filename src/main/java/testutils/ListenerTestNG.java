package testutils;



	import org.testng.ITestContext; 
	import org.testng.ITestListener; 
	import org.testng.ITestResult;

import Base.TestBase; 
	 
	public class ListenerTestNG extends TestBase implements ITestListener 
	{ 
		
		TestUtil tb = new TestUtil();
	 
	    public void onFinish(ITestContext Result) 
	    { 
	                 
	    } 
	 
	    public void onStart(ITestContext Result) 
	    { 
	             
	    } 
	 
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) 
	    { 
	     
	    } 
	 
	    // When Test case get failed, this method is called. 
	    public void onTestFailure(ITestResult Result) 
	    { 
	    System.out.println("The name of the testcase failed is :"+Result.getName()); 
	    try {
			tb.takeSnapShot(driver, Result.getMethod().getMethodName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    } 
	 
	    // When Test case get Skipped, this method is called. 
	    public void onTestSkipped(ITestResult Result) 
	    { 
	    System.out.println("The name of the testcase Skipped is :"+Result.getName()); 
	    } 
	 
	    public void onTestStart(ITestResult Result) 
	    { 
	   
	    } 
	 
	    // When Test case get passed, this method is called. 
	    public void onTestSuccess(ITestResult Result) 
	    { 
	    System.out.println("The name of the testcase passed is :"+Result.getName()); 
	    } 
	 
	}
