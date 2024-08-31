package utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegistrationData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//index
		XSSFSheet sheet = workbook.getSheetAt(0);
		//sheetName
//		XSSFSheet sheet = workbook.getSheet("smokeTest");
		
		
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
