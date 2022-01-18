package assertion_concept;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	SoftAssert softAssert = new SoftAssert();
	@Test
	public void test1() {
		SoftAssert softAssert1 = new SoftAssert();
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);
		//==>Hard assertion getting failed that means next corresponding line/case won't be executed 
		//i.e. immediately test case will be terminated 
		//==>What are the subsequent line are available after hard assertion won't be executed 
		//i.e. immediately corresponding line of code will be terminated 
		//sometimes it is good to use hard assertion   not 
		System.out.println("Enter username");
		System.out.println("Enter Password");
		System.out.println("click on sign in button");
		Assert.assertEquals(true, true);
		
		System.out.println("validate home page");
		//Assert.assertEquals(true, false);// hard assertion
		//This is not the right position to input hard assert
		softAssert1.assertEquals(true, false, "home page title is missing");//soft assertion
		//==>Soft assertion getting failed means till corresponding next line of code will be executed 
		//but it is not marking as test case failed, this is the property of soft assertion.
		//So, how can you solve it. once entire assertion is done in your test cases simple write
		//softAssert.assertAll(); at the end and marked test case as failed.
		//thats the beauty of soft assert.		
		System.out.println("go to deal page");
		System.out.println("create a deal");
		softAssert1.assertEquals(true, false, "not able to create a deal");//soft assert
		
		System.out.println("go to contact page");
		System.out.println("create a contact");
		softAssert1.assertEquals(true, false, "not able to create a contact");//soft assert
		softAssert1.assertAll();
		//assertAll(); to mark the test case as failed, if any assertion is getting failed.
	}
	
	public void test2() {
		SoftAssert softAssert2 = new SoftAssert();
		System.out.println("logout");
		softAssert2.assertEquals(true, false);
		//this test case will be marked as passed if we don't put softAssert.assertAll(); at the end. 
	}
	
	@AfterClass
	public void teardown() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
		//if we mention softAssert.assertAll(); here then what happen? all the test case will be marked as passed
		//but teardown method will be marked as failed. So, best practice is if we have 100 test cases then use
		//softAssert.assertAll(); at the end of every test case.
	}

}
