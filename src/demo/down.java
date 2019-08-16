package demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

public class down {

	
	public static void main(String[] args) throws IOException {
		HSSFWorkbook  workbook = new HSSFWorkbook();
//		try{
//		    workbook = new HSSFWorkbook();
//		}catch(Exception e){
//		    workbook = new XSSFWorkbook();
//		}
		
		HSSFFont f  = (HSSFFont) workbook.createFont();  
//		 f.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);//加粗  
		 
		 f.setFontName("仿宋_GB2312");  
		 f.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//粗体显示  
		 f.setFontHeightInPoints((short) 12); 
		 
		HSSFCellStyle style = (HSSFCellStyle) workbook.createCellStyle();
		style.setFillForegroundColor((short) 13);// 设置背景色
		style.setAlignment(CellStyle.ALIGN_CENTER);//水平居中  
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//垂直居中 
//		style.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		style.setFillForegroundColor((short) 13);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style.setFont(f);
		
		
		HSSFCellStyle style2 = (HSSFCellStyle) workbook.createCellStyle();
		style2.setAlignment(HSSFCellStyle.ALIGN_RIGHT);//居右	
		style2.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//垂直居中 
		style2.setFont(f);
        //创建新工作簿
        //新建工作表
       Sheet sheet = workbook.createSheet("终止登记");
       sheet.setColumnWidth(0, 9100);
       sheet.setColumnWidth(1, 22000);
       
        //创建行,行号作为参数传递给createRow()方法,第一行从0开始计算
        Row row = sheet.createRow(0);
        //创建单元格,row已经确定了行号,列号作为参数传递给createCell(),第一列从0开始计算
        Cell cell = row.createCell(0);
        cell.setCellValue("终止登记");
        cell.setCellStyle(style);
        
        Row row3 = sheet.createRow(3);
        row3.setHeight((short) 500);
        Cell cell3 = row3.createCell(0);
        cell3.setCellValue("*信托机构名称:");
        cell3.setCellStyle(style2);
        
        CellRangeAddress region = new CellRangeAddress(0, 2, 0, 1);
        sheet.addMergedRegion(region);
        
        //输出到磁盘中
        FileOutputStream fos = new FileOutputStream(new File("E:\\111.xlsx"));
        workbook.write(fos);
//        ((FileOutputStream) workbook).close();
        fos.close();
        System.out.println("success");
	}
	
	
	
}
