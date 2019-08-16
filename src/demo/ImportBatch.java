package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportBatch {
	private static Workbook chooseWorkbook(String path) throws IOException {
		// 创建Excel文件的输入流对象
				FileInputStream fis = new FileInputStream(path);
				// 根据模板创建excel工作簿
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				Map<String, Object> mapRes = new HashMap<String, Object>();
				XSSFSheet sheet = wb.getSheetAt(0);
				int rowNum = sheet.getLastRowNum();
				Row row = sheet.getRow(0);
				 for (int i = 1; i <= rowNum; i++) {
			            row = sheet.getRow(i);
			            for (int j = 1; j < 4; j++){
		            		System.out.println("obj["+i+"*"+j+"]======================"+row.getCell(j));
			            }
			            System.err.println("************************************\r\n");
			        }
						
				

		return null;
	}
public static void main(String[] args) throws IOException {
		
		String filePathName="C:\\Users\\admin\\Desktop\\批量补录产品信息.xlsm";
		chooseWorkbook(filePathName);
		
	}
}
