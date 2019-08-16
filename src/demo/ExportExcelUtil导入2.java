package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportExcelUtil导入2 {

		public static void main(String[] args) throws Exception {
			
			ExportExcelUtil导入2 export = new ExportExcelUtil导入2();
			String srcFilePath = "C:\\Users\\admin\\Desktop\\信托产品终止登记申报模板.xlsm";
			String fileName = "test_" + System.currentTimeMillis() + ".xlsm";
			String desFilePath = "C:\\Users\\admin\\Desktop\\" + fileName;
			
			export.exportExcel(srcFilePath,desFilePath);
		}
		
		//根据指定的excel模板导出数据
		public void exportExcel(String srcFilePath,String desFilePath) throws Exception {
		
			//创建Excel文件的输入流对象
			FileInputStream fis = new FileInputStream(srcFilePath);
			//根据模板创建excel工作簿
			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			//创建Excel文件输出流对象
			FileOutputStream fos = new FileOutputStream(desFilePath);
			//获取创建的工作簿第一页
			for (int i = 0; i < workBook.getNumberOfSheets(); i++) {
				System.out.println(workBook.getSheetName(i)+"--"+i);
			}
			XSSFSheet sheet = workBook.getSheetAt(7);
			//给指定的sheet命名
//			workBook.setSheetName(0,"aaaa");
			
			//获取行列坐标
			XSSFRow row = sheet.getRow(3);
			XSSFCell cell = row.getCell(2);
			
			String s = cell.getStringCellValue();
			//获取指定单元格值
			cell.setCellValue("1"+s);
			
			//获取行列坐标
			XSSFRow row2 = sheet.getRow(4);
			XSSFCell cell2 = row2.getCell(2);
			//获取指定单元格值
			cell2.setCellValue("2");
			
			//获取行列坐标
			XSSFRow row3 = sheet.getRow(6);
			XSSFCell cell3 = row3.getCell(2);
			//获取指定单元格值
			cell3.setCellValue("3");
			
			//获取行列坐标
			XSSFRow row10 = sheet.getRow(10);
			XSSFCell cell10 = row10.getCell(2);
			//获取指定单元格值
			cell10.setCellValue("4");
			
			//获取行列坐标
			XSSFRow row11 = sheet.getRow(11);
			XSSFCell cell11 = row11.getCell(2);
			//获取指定单元格值
			cell11.setCellValue("5");
			
			//获取行列坐标
			XSSFRow row12 = sheet.getRow(12);
			XSSFCell cell12 = row12.getCell(2);
			//获取指定单元格值
			cell12.setCellValue("6");
			
			//获取行列坐标
			XSSFRow row13 = sheet.getRow(13);
			XSSFCell cell13 = row13.getCell(2);
			//获取指定单元格值
			cell13.setCellValue("7");
			
			//获取行列坐标
			XSSFRow row14 = sheet.getRow(14);
			XSSFCell cell14 = row14.getCell(2);
			//获取指定单元格值
			cell14.setCellValue("8");
			
			//获取行列坐标
			XSSFRow row15 = sheet.getRow(15);
			XSSFCell cell15 = row15.getCell(2);
			//获取指定单元格值
			cell15.setCellValue("9");
			
			//获取行列坐标
			XSSFRow row16 = sheet.getRow(16);
			XSSFCell cell16 = row16.getCell(2);
			//获取指定单元格值
			cell16.setCellValue("10");
			
			//获取行列坐标
			XSSFRow row17 = sheet.getRow(17);
			XSSFCell cell17 = row17.getCell(2);
			//获取指定单元格值
			cell17.setCellValue("11");
			
			//获取行列坐标
			XSSFRow row18 = sheet.getRow(18);
			XSSFCell cell18 = row18.getCell(2);
			//获取指定单元格值
			cell18.setCellValue("12");
			
			//获取行列坐标
			XSSFRow row19 = sheet.getRow(19);
			XSSFCell cell19 = row19.getCell(2);
			//获取指定单元格值
			cell19.setCellValue("13");
			
			//获取行列坐标
			XSSFRow row20 = sheet.getRow(20);
			XSSFCell cell20 = row20.getCell(2);
			//获取指定单元格值
			cell20.setCellValue("14");
			
			//获取行列坐标
			XSSFRow row21 = sheet.getRow(21);
			XSSFCell cell21 = row21.getCell(2);
			//获取指定单元格值
			cell21.setCellValue("15");
			
			//获取行列坐标
			XSSFRow row22 = sheet.getRow(22);
			XSSFCell cell22 = row22.getCell(2);
			//获取指定单元格值
			cell22.setCellValue("16");
			
			//获取行列坐标
			XSSFRow row23 = sheet.getRow(23);
			XSSFCell cell23 = row23.getCell(2);
			//获取指定单元格值
			cell23.setCellValue("17");
			
			//获取行列坐标
			XSSFRow row24 = sheet.getRow(24);
			XSSFCell cell24 = row24.getCell(2);
			//获取指定单元格值
			cell24.setCellValue("18");
			
			//获取行列坐标
			XSSFRow row25 = sheet.getRow(25);
			XSSFCell cell25 = row25.getCell(2);
			//获取指定单元格值
			cell25.setCellValue("19");
			
			//获取行列坐标
			XSSFRow row26 = sheet.getRow(26);
			XSSFCell cell26 = row26.getCell(2);
			//获取指定单元格值
			cell26.setCellValue("20");
			
			//获取行列坐标
			XSSFRow row27 = sheet.getRow(27);
			XSSFCell cell27 = row27.getCell(2);
			//获取指定单元格值
			cell27.setCellValue("21");
			
			//获取行列坐标
			XSSFRow row28 = sheet.getRow(28);
			XSSFCell cell28 = row28.getCell(2);
			//获取指定单元格值
			cell28.setCellValue("22");
			
			
			workBook.write(fos);
			
			//关闭流
			fis.close();
			fos.flush();
			fos.close();
			System.out.println("导出成功");
		}
}

