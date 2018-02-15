package DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String [] args){
		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		
		//Location of the excel file
		String path = "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/2-ExcelRead.xlsx";
		String Sheetname = "Sheet1";
		
		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(Sheetname);
			
			Cell = ExcelWSheet.getRow(1).getCell(2);
			String cellData = Cell.getStringCellValue();
			System.out.println("Cell Data: " + cellData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
