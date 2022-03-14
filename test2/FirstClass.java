package test2;

import org.testng.annotations.Test;

public class FirstClass {

	@Test
	public void LoginChrome(){
		
		System.out.println("FC login Chrome Mehtod");
	}
	
	@Test
	public void LoginFireFox(){
		
		System.out.println("FC login Firefox Mehtod");
	}
	
	@Test
	public void LoginSafari(){
		
		System.out.println("FC login Safari Mehtod");
	}
	
	@Test
	public void LogOutSafari(){
		
		System.out.println("FC logout Safari Mehtod");
	}
}
