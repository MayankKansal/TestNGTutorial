package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {
	
	
	public ArrayList<String> getData(String TestcaseName) throws IOException{
		
		FileInputStream fis = new FileInputStream("E:\\TestCase.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		ArrayList<String> al = new ArrayList<String>();
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testCase")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				System.out.println(sheet);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cells = firstrow.cellIterator();
				int k = 0;
				int coulmn = 0;
				while (cells.hasNext()) {
					Cell value = cells.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCase")) {
						coulmn = k;
					}
					k++;

				}

				System.out.println(coulmn);

				while (rows.hasNext()) {

					Row nextRow = rows.next();
					if (nextRow.getCell(coulmn).getStringCellValue().equalsIgnoreCase(TestcaseName)) {

						Iterator<Cell> nextColumn = nextRow.cellIterator();
						while (nextColumn.hasNext()) {
							Cell cellData= nextColumn.next();
							if(cellData.getCellType()==CellType.STRING){
								al.add(cellData.getStringCellValue());
							}
							else{
								al.add(NumberToTextConverter.toText(cellData.getNumericCellValue()));
							}

						}
					}
				}
			}

		}
		
		return al;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	}

}
