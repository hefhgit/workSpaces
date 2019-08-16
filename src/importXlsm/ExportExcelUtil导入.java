package importXlsm;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import importXlsm.vo.BionePreregistFactorVO;
import importXlsm.vo.BioneProductDetailsVO;

public class ExportExcelUtil导入 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\admin\\Desktop\\信托产品预登记申报模板.xlsm";
		read(path);
	}

	public static void read(String path) throws IOException {
		// 创建Excel文件的输入流对象
		FileInputStream fis = new FileInputStream(path);
		// 根据模板创建excel工作簿
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int numOfSheets = wb.getNumberOfSheets();
		
		BioneProductDetailsVO bioneproductdetailsvo=new BioneProductDetailsVO();
		List<BionePreregistFactorVO>  bionePreregistList=new ArrayList<BionePreregistFactorVO>();
		for (int i = 0; i < numOfSheets; i++) {
			XSSFSheet sheet = wb.getSheetAt(i);
			String sname = sheet.getSheetName();
			System.out.println(sname);
			if (sname.equals("产品信息详表")) {
				// 获取行列坐标
				XSSFRow row = sheet.getRow(4);
				XSSFCell cell = row.getCell(2);
				bioneproductdetailsvo.setXtjgmc(getCellValue(cell));
				isEmptyReg(5,getCellValue(cell),"信托机构名称");
				
				XSSFRow row5 = sheet.getRow(5);
				XSSFCell cell5 = row5.getCell(2);
				bioneproductdetailsvo.setZcdz(getCellValue(cell5));
				isEmptyReg(6,getCellValue(cell5),"注册地址");
				
				XSSFRow row6 = sheet.getRow(6);
				XSSFCell cell6 = row6.getCell(2);
				bioneproductdetailsvo.setSymjzc(getCellValue(cell6));
				isEmptyReg(7,getCellValue(cell6),"上月末净资产(万 元)");
				
				XSSFRow row626 = sheet.getRow(6);
				XSSFCell cell626 = row626.getCell(4);
				bioneproductdetailsvo.setSjmjzc(getCellValue(cell626));
				isEmptyReg(6,getCellValue(cell626),"上季末净资本(万 元)");
				
				XSSFRow row7 = sheet.getRow(7);
				XSSFCell cell7 = row7.getCell(2);
				bioneproductdetailsvo.setSymxtzzc(getCellValue(cell7));
				isEmptyReg(8,getCellValue(cell7),"上月末信托总资产 (万元)");
				
				XSSFRow row71 = sheet.getRow(7);
				XSSFCell cell71 = row71.getCell(4);
				bioneproductdetailsvo.setSymxtzzc(getCellValue(cell71));
				isEmptyReg(8,getCellValue(cell71),"上月末信托总资产 (万元)");
				//预登记类型：
				XSSFRow row9 = sheet.getRow(9);
				XSSFCell cell9 = row9.getCell(2);
				bioneproductdetailsvo.setYdjlx(getCellValue(cell9));
				//信托财产性质标识
				XSSFRow row10 = sheet.getRow(10);
				XSSFCell cel10 = row10.getCell(2);
				bioneproductdetailsvo.setCsxtcclx(getCellValue(cel10));
				
				if(getCellValue(cel10)!=null&&""!=getCellValue(cel10)) {
					if(!getCellValue(cel10).equals("资金")) {
						//财产权信托进行受益权拆分转让或者对外发行受益权标识
						XSSFRow row11 = sheet.getRow(11);
						XSSFCell cel11 = row11.getCell(2);
						bioneproductdetailsvo.setCcqxtcfzr(getCellValue(cel11));
					}
				}
				//单一集合标识
				XSSFRow row12 = sheet.getRow(12);
				XSSFCell cel12 = row12.getCell(2);
				bioneproductdetailsvo.setDyjhbz(getCellValue(cel12));
				//信托功能标识
				XSSFRow row13 = sheet.getRow(13);
				XSSFCell cel13 = row13.getCell(2);
				bioneproductdetailsvo.setXtgn(getCellValue(cel13));
				
				//报告业务类型
				XSSFRow row14 = sheet.getRow(14);
				XSSFCell cel14 = row14.getCell(2);
				bioneproductdetailsvo.setBgywlx(getCellValue(cel14));
				//信托功能标识
				XSSFRow row15 = sheet.getRow(15);
				XSSFCell cel15 = row15.getCell(4);
				bioneproductdetailsvo.setQtbgywlx(getCellValue(cel15));
				//信托产品名称
				XSSFRow row17 = sheet.getRow(17);
				XSSFCell cel17 = row17.getCell(2);
				bioneproductdetailsvo.setXtxmmc(getCellValue(cel17));
				//拟发行或成立总规模类型
				XSSFRow row18 = sheet.getRow(18);
				XSSFCell cel18 = row18.getCell(2);
				bioneproductdetailsvo.setNfxclzgmlx(getCellValue(cel18));
				if(getCellValue(cel18)!=null&&getCellValue(cel18)!="") {
					//固定规模总范围（万元）：
					if(getCellValue(cel18).equals("固定规模")) {
						//2个必有一个填写
						XSSFRow row19 = sheet.getRow(19);
						XSSFCell cel19= row19.getCell(2);
						bioneproductdetailsvo.setZdgdgmzfw(getCellValue(cel19));
						XSSFRow row192 = sheet.getRow(19);
						XSSFCell cel192= row192.getCell(4);
						bioneproductdetailsvo.setZggdgmzfw(getCellValue(cel192));
					}
				}
				//信托产品总期限类型
				XSSFRow row20 = sheet.getRow(20);
				XSSFCell cel20= row20.getCell(2);
				bioneproductdetailsvo.setXtxmzqxlx(getCellValue(cel20));
				if(getCellValue(cel20)!=null&&getCellValue(cel20)!="") {
					//固定期限总范围（月）：
					if(getCellValue(cel20).equals("固定规模")) {
						//2个必有一个填写
						XSSFRow row21 = sheet.getRow(21);
						XSSFCell cel21= row21.getCell(2);
						bioneproductdetailsvo.setZdgdqxzfw(getCellValue(cel21));
						XSSFRow row212 = sheet.getRow(19);
						XSSFCell cel212= row212.getCell(4);
						bioneproductdetailsvo.setZggdqxzfw(getCellValue(cel212));
					}
				}
				//拟发行或成立规模类型
				XSSFRow row22 = sheet.getRow(22);
				XSSFCell cel22= row22.getCell(2);
				bioneproductdetailsvo.setYjxtxmgm(getCellValue(cel22));
				if(getCellValue(cel22)!=null&&getCellValue(cel22)!="") {
					//固定期限总范围（月）：
					if(getCellValue(cel22).equals("固定规模")) {
						//2个必有一个填写
						XSSFRow row23 = sheet.getRow(23);
						XSSFCell cel23= row23.getCell(2);
						bioneproductdetailsvo.setZdgdqxzfw(getCellValue(cel23));
						XSSFRow row232 = sheet.getRow(23);
						XSSFCell cel232= row232.getCell(4);
						bioneproductdetailsvo.setZgxtxmgmfw(getCellValue(cel232));
					}
				}
				//信托产品期限类型
				XSSFRow row24 = sheet.getRow(24);
				XSSFCell cel24= row24.getCell(2);
				bioneproductdetailsvo.setXtxmqxlx(getCellValue(cel24));
				if(getCellValue(cel24)!=null&&getCellValue(cel24)!="") {
					//固定期限范围（月）
					if(getCellValue(cel24).equals("固定规模")) {
						//2个必有一个填写
						XSSFRow row25 = sheet.getRow(25);
						XSSFCell cel25= row25.getCell(2);
						bioneproductdetailsvo.setZdxtxmqxfw(getCellValue(cel25));
						XSSFRow row252 = sheet.getRow(25);
						XSSFCell cel252= row252.getCell(4);
						bioneproductdetailsvo.setZgxtxmqxfw(getCellValue(cel252));
					}
				}
				
				XSSFRow row27 = sheet.getRow(27);
				XSSFCell cel27= row27.getCell(2);
				bioneproductdetailsvo.setNfxhclsj(getCellValue(cel27));
				
				XSSFRow row28 = sheet.getRow(28);
				XSSFCell cel28= row28.getCell(2);
				bioneproductdetailsvo.setWtrjzjly(getCellValue(cel28));
				
				XSSFRow row29 = sheet.getRow(29);
				XSSFCell cel29= row29.getCell(2);
				bioneproductdetailsvo.setSytzrq(getCellValue(cel29));
				//保管标识
				XSSFRow row30 = sheet.getRow(30);
				XSSFCell cel30= row30.getCell(2);
				bioneproductdetailsvo.setBgbs(getCellValue(cel30));
				
				XSSFRow row31 = sheet.getRow(31);
				XSSFCell cel31= row31.getCell(2);
				bioneproductdetailsvo.setXtzjbgyh(getCellValue(cel31));
				
				XSSFRow row32 = sheet.getRow(32);
				XSSFCell cel32= row32.getCell(2);
				bioneproductdetailsvo.setXtbcl(getCellValue(cel32));
				
				//合同收益率类型
				XSSFRow row33 = sheet.getRow(33);
				XSSFCell cel33= row33.getCell(2);
				bioneproductdetailsvo.setSyrsyllx(getCellValue(cel33));
				if(getCellValue(cel33)!=null&&getCellValue(cel33)!="") {
					//信托合同约定基准收益率范围：
					if(getCellValue(cel33).equals("基准收益率")||getCellValue(cel33).equals("基准+浮动")) {
						//2个必有一个填写
						XSSFRow row34 = sheet.getRow(34);
						XSSFCell cel34= row34.getCell(2);
						bioneproductdetailsvo.setSyryqsylqjZg(getCellValue(cel34));
						XSSFRow row342 = sheet.getRow(34);
						XSSFCell cel342= row342.getCell(4);
						bioneproductdetailsvo.setSyryqsylqjZd(getCellValue(cel342));
					}
				}
				//项目来源
				XSSFRow row35 = sheet.getRow(35);
				XSSFCell cel35= row35.getCell(2);
				bioneproductdetailsvo.setXmly(getCellValue(cel35));
				//信托财产管理方式
				XSSFRow row352 = sheet.getRow(35);
				XSSFCell cel352= row352.getCell(4);
				bioneproductdetailsvo.setXmglfs(getCellValue(cel352));
				
				XSSFRow row36 = sheet.getRow(36);
				XSSFCell cel36 =row36.getCell(2);
				bioneproductdetailsvo.setXmtjjg(getCellValue(cel36));
				
				XSSFRow row37 = sheet.getRow(37);
				XSSFCell cel37 =row37.getCell(2);
				bioneproductdetailsvo.setJydsmc(getCellValue(cel37));
				
				XSSFRow row38 = sheet.getRow(38);
				XSSFCell cel38 =row38.getCell(2);
				bioneproductdetailsvo.setJydsxx(getCellValue(cel38));
				
				XSSFRow row39 = sheet.getRow(39);
				XSSFCell cel39 =row39.getCell(2);
				bioneproductdetailsvo.setXtcctxhyyfs(getCellValue(cel39));
				
				XSSFRow row40 = sheet.getRow(40);
				XSSFCell cel40 =row40.getCell(2);
				bioneproductdetailsvo.setJyjg(getCellValue(cel40));
				
				XSSFRow row41 = sheet.getRow(41);
				XSSFCell cel41=row41.getCell(2);
				bioneproductdetailsvo.setFxkzcs(getCellValue(cel41));
				
				XSSFRow row42 = sheet.getRow(42);
				XSSFCell cel42=row42.getCell(2);
				bioneproductdetailsvo.setYjhklyjtcfs(getCellValue(cel42));
				
				XSSFRow row43 = sheet.getRow(43);
				XSSFCell cel43=row43.getCell(2);
				bioneproductdetailsvo.setFxyasm(getCellValue(cel43));
				
				XSSFRow row44 = sheet.getRow(44);
				XSSFCell cel44=row44.getCell(2);
				bioneproductdetailsvo.setGshfhgyj(getCellValue(cel44));
				
				XSSFRow row45 = sheet.getRow(45);
				XSSFCell cel45=row45.getCell(2);
				bioneproductdetailsvo.setXtjlxm(getCellValue(cel45));
				XSSFRow row452= sheet.getRow(45);
				XSSFCell cel452=row452.getCell(4);
				bioneproductdetailsvo.setXtjldh(getCellValue(cel452));
				
				XSSFRow row46= sheet.getRow(46);
				XSSFCell cel46=row46.getCell(2);
				bioneproductdetailsvo.setFggjglry(getCellValue(cel46));
				
				//根据报告业务类型 判定要读取的数据范围	  
				/***************************************** 关联交易补充要素START**********************************************/
				if(getCellValue(cel14).indexOf("信托业务关联交易报告")!=-1) {
					//关联交易类型
					XSSFRow row47= sheet.getRow(47);
					XSSFCell cel47=row47.getCell(2);
					bioneproductdetailsvo.setGljylx(getCellValue(cel47));
					
					XSSFRow row48= sheet.getRow(48);
					XSSFCell cel48=row48.getCell(2);
					bioneproductdetailsvo.setQtgljylx(getCellValue(cel48));
					
					XSSFRow row49= sheet.getRow(49);
					XSSFCell cel49=row49.getCell(2);
					bioneproductdetailsvo.setGlfqkyglgx(getCellValue(cel49));
					
					XSSFRow row50= sheet.getRow(50);
					XSSFCell cel50=row50.getCell(2);
					bioneproductdetailsvo.setGljymd(getCellValue(cel50));
					
					XSSFRow row51= sheet.getRow(51);
					XSSFCell cel51=row51.getCell(2);
					bioneproductdetailsvo.setGljydj(getCellValue(cel51));
					
					XSSFRow row52= sheet.getRow(52);
					XSSFCell cel52=row52.getCell(2);
					bioneproductdetailsvo.setSctlywdjqk(getCellValue(cel52));
					
					
				}
				/***********************************房地产信托业务补充要素*******************************************/
				if(getCellValue(cel14).indexOf("房地产信托业务")!=-1) {
					
					//项目类型     多选
					XSSFRow row53= sheet.getRow(53);
					XSSFCell cel53=row53.getCell(2);
					bioneproductdetailsvo.setXmlx(getCellValue(cel53));
					//业务类型 单选
					XSSFRow row54= sheet.getRow(54);
					XSSFCell cel54=row54.getCell(2);
					bioneproductdetailsvo.setYwlx(getCellValue(cel54));
					XSSFRow row55= sheet.getRow(55);
					XSSFCell cel55=row55.getCell(2);
					bioneproductdetailsvo.setXmszd(getCellValue(cel55));
					//是否四证齐全 单选
					XSSFRow row56= sheet.getRow(56);
					XSSFCell cel56=row56.getCell(2);
					bioneproductdetailsvo.setSfszqq(getCellValue(cel56));
					XSSFRow row57= sheet.getRow(57);
					XSSFCell cel57=row57.getCell(2);
					bioneproductdetailsvo.setXyzjbh(getCellValue(cel57));
					XSSFRow row58= sheet.getRow(58);
					XSSFCell cel58=row58.getCell(2);
					bioneproductdetailsvo.setZbjblqk(getCellValue(cel58));
					XSSFRow row59= sheet.getRow(59);
					XSSFCell cel59=row59.getCell(2);
					bioneproductdetailsvo.setKfshqkggdzzqk(getCellValue(cel59));
					XSSFRow row60= sheet.getRow(60);
					XSSFCell cel60=row60.getCell(2);
					bioneproductdetailsvo.setQtsm(getCellValue(cel60));
				}
				/************************************异地推介补充要素***********************************************/
				if(getCellValue(cel14).indexOf("异地推介")!=-1) {
					XSSFRow row61= sheet.getRow(61);
					XSSFCell cel61=row61.getCell(2);
//					bionePreregistList bionePreregistFactorVO
					int count=0;
					for (int j = 0; j < Integer.parseInt(getCellValue(cel61)); j++) {
						
						BionePreregistFactorVO bionePreregistFactorVO=new BionePreregistFactorVO();
						
						XSSFRow row612= sheet.getRow(61);
						XSSFCell cel612=row612.getCell(4);
						bionePreregistFactorVO.setSfqgtj(getCellValue(cel612));
						
						XSSFRow row62= sheet.getRow(62+count);
						XSSFCell cel62=row62.getCell(2);
						bionePreregistFactorVO.setTjd(getCellValue(cel62));
						XSSFRow row621= sheet.getRow(62+count);
						XSSFCell cel621=row621.getCell(3);
						bionePreregistFactorVO.setTjdP(getCellValue(cel621));
						XSSFRow row622= sheet.getRow(62+count);
						XSSFCell cel622=row622.getCell(4);
						bionePreregistFactorVO.setTjdC(getCellValue(cel622));
						
						XSSFRow row63= sheet.getRow(63+count);
						XSSFCell cel63=row63.getCell(2);
						bionePreregistFactorVO.setTjdA(getCellValue(cel63));
						
						XSSFRow row64= sheet.getRow(64+count);
						XSSFCell cel64=row64.getCell(2);
						bionePreregistFactorVO.setTjjg(getCellValue(cel64));
						XSSFRow row641= sheet.getRow(64+count);
						XSSFCell cel641=row641.getCell(4);
						bionePreregistFactorVO.setTjfl(getCellValue(cel641));
						
						XSSFRow row65= sheet.getRow(65+count);
						XSSFCell cel65=row65.getCell(2);
						bionePreregistFactorVO.setTjq(getCellValue(cel65));
						XSSFRow row651= sheet.getRow(65+count);
						XSSFCell cel651=row651.getCell(2);
						bionePreregistFactorVO.setJhtjgm(getCellValue(cel651));
						
						XSSFRow row66= sheet.getRow(66+count);
						XSSFCell cel66=row66.getCell(2);
						bionePreregistFactorVO.setTjfshtjgl(getCellValue(cel66));
						
						XSSFRow row67= sheet.getRow(67+count);
						XSSFCell cel67=row67.getCell(2);
						bionePreregistFactorVO.setTjfzrmc(getCellValue(cel67));
						XSSFRow row672= sheet.getRow(67+count);
						XSSFCell cel672=row672.getCell(4);
						bionePreregistFactorVO.setTjfzrdh(getCellValue(cel672));
						count+=6;
						bionePreregistList.add(bionePreregistFactorVO);
					}
				}
				/***********商业银行理财资金投资权益类金融产品或权益类特征的金融产品且聘请第三方投资顾问补充要素********/
				if(getCellValue(cel14).indexOf("商业银行理财资金投资权益类金融产品或权益类特征的金融产品且聘请第三方投资顾问")!=-1) {
					XSSFRow row302= sheet.getRow(302);
					XSSFCell cel302=row302.getCell(2);
					bioneproductdetailsvo.setZjly(getCellValue(cel302));
					//是否结构化信托  单
					XSSFRow row303= sheet.getRow(303);
					XSSFCell cel303=row303.getCell(2);
					bioneproductdetailsvo.setSfjghxt(getCellValue(cel303));
					if(getCellValue(cel303)!=null&&getCellValue(cel303)!="") {
						if(getCellValue(cel303).equals("是")) {
							XSSFRow row304= sheet.getRow(304);
							XSSFCell cel304=row304.getCell(2);
							bioneproductdetailsvo.setYxlhbl(getCellValue(cel304));
						}
					}
					XSSFRow row305= sheet.getRow(305);
					XSSFCell cel305=row305.getCell(2);
					bioneproductdetailsvo.setTzfw(getCellValue(cel305));
					XSSFRow row306= sheet.getRow(306);
					XSSFCell cel306=row306.getCell(2);
					bioneproductdetailsvo.setTzgwqk(getCellValue(cel306));
					//投资顾问是否信托公司关联方 单
					XSSFRow row307= sheet.getRow(307);
					XSSFCell cel307=row307.getCell(2);
					bioneproductdetailsvo.setTgsfglf(getCellValue(cel307));
				}
//				JSONObject json = JSONObject.fromObject(bioneproductdetailsvo);
//				JSONArray jsonList = JSONArray.fromObject(bionePreregistList);
//				
//				 System.out.println("strJson:"+json);
//				 System.out.println("jsonList:"+jsonList);
			}else {
				System.out.println("模板有误");
			}
		}
	}
	public static String getCellValue(Cell cell) {  
        String cellValue = "";  
        DecimalFormat df = new DecimalFormat("#");  
        switch (cell.getCellType()) {  
        case HSSFCell.CELL_TYPE_STRING:  
            cellValue = cell.getRichStringCellValue().getString().trim();  
            break;  
        case HSSFCell.CELL_TYPE_NUMERIC:  
        	if (HSSFDateUtil.isCellDateFormatted(cell)) {// 处理日期格式、时间格式
				SimpleDateFormat sdf = null;
				// 验证short值
				if (cell.getCellStyle().getDataFormat() == 14) {
					sdf = new SimpleDateFormat("yyyy/MM/dd");
					Date date = cell.getDateCellValue();
					cellValue = sdf.format(date);
				} else if (cell.getCellStyle().getDataFormat() == 21) {
					sdf = new SimpleDateFormat("HH:mm:ss");
					Date date = cell.getDateCellValue();
					cellValue = sdf.format(date);
				} else if (cell.getCellStyle().getDataFormat() == 22) {
					sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					Date date = cell.getDateCellValue();
					cellValue = sdf.format(date);
				} else if(cell.toString().contains("-") && checkDate(cell.toString())){
					//定义一个新的字符串
		        	//设置日期格式
		        	cellValue =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(cell.getDateCellValue());
		        	cellValue=cellValue.toString();			
				}else{
					throw new RuntimeException("日期格式错误!!!");
				}
			}else {
				cellValue = df.format(cell.getNumericCellValue()).toString();  
			}
            break;  
        case HSSFCell.CELL_TYPE_BOOLEAN:  
            cellValue = String.valueOf(cell.getBooleanCellValue()).trim();  
            break;  
        case HSSFCell.CELL_TYPE_FORMULA:  
            cellValue = cell.getCellFormula();  
            break;  
        default:  
            cellValue = "";  
        }  
        return cellValue;  
    }
	
    /**
     * 判断是否是“02-十一月-2018”格式的日期类型
     */
	private static boolean checkDate(String str){
	      String[] dataArr =str.split("-");
	      try {
	          if(dataArr.length == 3){
	              int x = Integer.parseInt(dataArr[0]);
	              String y =  dataArr[1];
	              int z = Integer.parseInt(dataArr[2]);
	             if(x>0 && x<32 && z>0 && z< 10000 && y.endsWith("月")){
	                  return true;
	              }
	         }
	     } catch (Exception e) {
	          return false;
	     }
	     return false;
	}
	private static 	StringBuffer failMessage=new StringBuffer() ;
	/**
	 * 
	 * @param rowNum 行号
	 * @param value 值
	 * @param proName 字段名称
	 */
	@SuppressWarnings("unused")
	private static boolean isEmptyReg(Integer rowNum,String value,String proName){
		if(value.isEmpty()) {
			failMessage.append("第"+rowNum+"行"+proName+"不能为空！");
			return true;
		}else {
			return false;
		}
	}
//	public static String getCellValue(Cell cell) {
//		String cellValue = "";
//		if (cell == null) {
//			return cellValue;
//		}
//		// 判断数据的类型
//		switch (cell.getCellType()) {
//		case Cell.CELL_TYPE_NUMERIC: // 数字
//			// short s = cell.getCellStyle().getDataFormat();
//			if (HSSFDateUtil.isCellDateFormatted(cell)) {// 处理日期格式、时间格式
//				SimpleDateFormat sdf = null;
//				// 验证short值
//				if (cell.getCellStyle().getDataFormat() == 14) {
//					sdf = new SimpleDateFormat("yyyy/MM/dd");
//				} else if (cell.getCellStyle().getDataFormat() == 21) {
//					sdf = new SimpleDateFormat("HH:mm:ss");
//				} else if (cell.getCellStyle().getDataFormat() == 22) {
//					sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//				} else {
//					throw new RuntimeException("日期格式错误!!!");
//				}
//				Date date = cell.getDateCellValue();
//				cellValue = sdf.format(date);
//			} else if (cell.getCellStyle().getDataFormat() == 0||cell.getCellStyle().getDataFormat() == 176) {// 处理数值格式
//				cell.setCellType(Cell.CELL_TYPE_STRING);
//				cellValue = String.valueOf(cell.getRichStringCellValue().getString());
//			}
//			break;
//		case Cell.CELL_TYPE_STRING: // 字符串
//			cellValue = String.valueOf(cell.getStringCellValue());
//			break;
//		case Cell.CELL_TYPE_BOOLEAN: // Boolean
//			cellValue = String.valueOf(cell.getBooleanCellValue());
//			break;
//		case Cell.CELL_TYPE_FORMULA: // 公式
//			cellValue = String.valueOf(cell.getCellFormula());
//			break;
//		case Cell.CELL_TYPE_BLANK: // 空值
//			cellValue = null;
//			break;
//		case Cell.CELL_TYPE_ERROR: // 故障
//			cellValue = "非法字符";
//			break;
//		default:
//			cellValue = "未知类型";
//			break;
//		}
//		return cellValue;
//	}
}
