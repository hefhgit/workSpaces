package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSMimportExcelXLS {

	
	public static void main(String[] args) throws IOException {
		
		String filePathName="C:\\Users\\admin\\Desktop\\批量补录产品信息.xlsm";
		InputStream in = new FileInputStream(filePathName);
		chooseWorkbook(filePathName, in);
		
	}

	private static Workbook chooseWorkbook(String filePathName, InputStream in) throws IOException {
		// TODO Auto-generated method stub
		
        //获得Workbook工作薄对象
        Workbook wb = getWorkBook(filePathName,in);
        for (int i = 0; i < wb.getNumberOfSheets(); i++) {
			System.out.println("sheet名称:"+wb.getSheetName(i));
		}
        Sheet sheet = wb.getSheetAt(0);//sheet0
        Row row = sheet.getRow(0);
        int rowNum = sheet.getLastRowNum();
        int colNum = row.getPhysicalNumberOfCells();
        System.out.println("rowNum:"+rowNum+"   colNum:"+colNum);
      //从1开始，跳过表头的标题
        for (int i = 1; i <= rowNum; i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < 3; j++){
            	if(j!=1) {
            		System.out.println("obj["+i+"*"+j+"]======================"+row.getCell(j));
            	}
            }
        }

		return null;
	}

	private static Workbook getWorkBook(String filePathName, InputStream in) throws IOException {
		Workbook workbook = null;
		if(filePathName.endsWith("xls")) {
			workbook = new HSSFWorkbook(in);
		}else if(filePathName.endsWith("xlsx")){
			 workbook = new XSSFWorkbook(in);
		}
		return workbook;
	}
	



	
}
