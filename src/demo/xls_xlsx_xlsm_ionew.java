package demo;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class xls_xlsx_xlsm_ionew {
public static void main(String[] args) throws IOException {
	String path = "C:\\Users\\admin\\Desktop\\信托产品预登记申报模板.xlsm"; 
	read(path);
	}
	
	
	public static void read(String path)throws IOException {
		InputStream stream = new FileInputStream(path);
		Workbook wb = null;
		if (path.endsWith("xls")) {
		wb = new HSSFWorkbook(stream);
		// 读取excel中第一个sheet页的(2,2)单元格
		// (列，行)，从0开始
		Sheet sheet = wb.getSheetAt(0);
		sheet.getSheetName();
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(2);
		//ver3 1.1.3
		System.out.print(cell.getStringCellValue());
		
		
		} else if (path.endsWith("xlsx")) {
		wb = new XSSFWorkbook(stream);
		// 读取excel中第一个sheet页的(2,2)单元格
		// (列，行)，从0开始
		Sheet sheet = wb.getSheetAt(0);
		sheet.getSheetName();
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(2);
		//ver3 1.1.3
		System.out.print(cell.getStringCellValue());
		
		
		} else if (path.endsWith("xlsm")) {
			wb = new XSSFWorkbook(stream);
			
			
			int numOfSheets = wb.getNumberOfSheets();
			for (int i = 0; i < numOfSheets; i++) {
			Sheet sheet = wb.getSheetAt(i);
			String sname = sheet.getSheetName();
			System.out.println(sname);
			if (sname.equals("システム管理")) {
				Row row = sheet.getRow(3);
				//获取单元格内容的方式一
				//cell类型为Numeric，故采用getNumericCellValue()方法
				//Cell cell = row.getCell(2);
				//version 3.1
				//System.out.print(cell.getNumericCellValue());
				
				//获取单元格内容的方式二
				row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
				//Cannot get a text value from a numeric cell,故先将cell类型设置为String型
				System.out.print(row.getCell(2).getStringCellValue());
				}
			}
		} else {
		System.out.println("您输入的excel格式不正确");
		}
	}
}
