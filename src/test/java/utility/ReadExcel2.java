package utility;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegisterStudent.xls");
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		//index
//		HSSFSheet sheet = workbook.getSheetAt(0);
		//sheetName
		HSSFSheet sheet = workbook.getSheet("smokeTest");
		
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Rows count: " + rowCount);
		System.out.println("columnCount : " + columnCount);
		
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			String fname = sheet.getRow(i).getCell(0).toString();
			String address = sheet.getRow(i).getCell(4).toString();
			
			
			System.out.println("Name and Address details are: " + fname + " : " + address);
			System.out.println("============================================================");
			
		}
		
		
		
		
		

	}

}
