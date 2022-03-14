package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ThirdClass  {
	@BeforeClass
	public void beforeClassMethod(){
		
		System.out.println("It will run before any methoed in this class");
	}
	
	@Test
	public void Carloan() {

		System.out.println("TC car loan method");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Im before method so i'll run before each method in that class");
	}
	@Parameters({"TestUrl"})
	@Test
	public void Homeloan(String testurl) {

		System.out.println("TC Home loan method");
		System.out.println(testurl);
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am the last in race so I m after Suite");
	}

	@Test(groups={"smoke"})
	public void Personalloan() {

		System.out.println("TC Personal loan method");
	}

	@Test(groups={"smoke"})
	public void Eduloan() {

		System.out.println("TC Education loan method");
	}
	
	@AfterMethod
	public void AfterMethod() {

		System.out.println("Im after method so i'll run after each method in that class");
	}
	
	@AfterClass
	public void aeforeClassMethod(){
		
		System.out.println("It will run after all methoed in this class have been run");
	}
}
