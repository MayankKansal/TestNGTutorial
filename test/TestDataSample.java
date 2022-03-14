package test;

import java.io.IOException;
import java.util.ArrayList;

public class TestDataSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExcelDataDriven ob = new ExcelDataDriven();
		ArrayList<String> data=ob.getData("Case3");
		for(int i=0; i<data.size(); i++){
			
			System.out.println(data.get(i));
			
		}
		
		

	}

}
