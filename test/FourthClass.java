package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FourthClass {

	@Test(groups={"smoke", "regression"},dependsOnMethods={"EduloanApproved"})
	public void CarloanApproved() {

		System.out.println("FC car loan approved method");
	}

	@Test( enabled=true)
	public void HomeloanApproved() {

		System.out.println("FC Home loan approved method");
	}

	@Test(groups={"smoke"}, enabled=false)
	public void PersonalloanApproved() {

		System.out.println("FC Personal loan approved method");
	}

	@Test(groups={"smoke"})
	public void EduloanApproved() {

		System.out.println("FC Education loan approved method");
	}

	@BeforeTest
	public void ClearCookies() {
		System.out.println("I will run beforemethod in that tag test");
	}

	@AfterMethod(groups={"smoke"})
	public void AfterMethod() {

		System.out.println("Im after method so i'll run after each method in that class");
	}

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("I m before suite So i'll be fiirst in race");
	}
}
