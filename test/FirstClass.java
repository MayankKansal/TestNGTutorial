package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstClass {

	@Test
	public void FCmethod() {

		System.out.println("FCmethod");
		Assert.assertTrue(false);
	}

	@Test(dataProvider ="check")
	public void FCmethod1(String username, String password) {

		System.out.println("FCmethod1");
		System.out.println(username);
		System.out.println(password);

	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("I m  aftertest method so I 'll run after the test tag");
	}
	
	@DataProvider (name = "check")
	public Object[][] getData(){
		
		Object[][] ob = new Object[3][2];
		
		ob[0][0] = "firstusername";
		ob[0][1] = "firstPassword";
		
		ob[1][0] = "Secondusername";
		ob[1][1] = "SecondPassword";
		
		ob[2][0] = "Thirdusername";
		ob[2][1] = "ThirdPassword";
		
		return ob;
	}
}
