package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondClass {

	@Parameters({"URL"})
	@Test
	public void SCmethod(String urlname){
		System.out.println("0 SecondClass Method");
		System.out.println(urlname);
	}
}
