package json;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * 
 * @author admin
 *
 */


//json格式 {key:"value"}
public class JsonToSQ预登记 {
	private static final String PATH = "C:\\Users\\admin\\Desktop\\newJson\\1.预登记";

	public static void main(String[] args) throws Exception {
		File file = new File(PATH);
		File[] tempList = file.listFiles();
		System.out.println("该目录下对象个数：" + tempList.length);
		for (int i =0; i < tempList.length; i++) {
			if (tempList[i].isFile()) {
				System.out.println(i+"-----------"+tempList[i].toString());
				String readToString = readToString(tempList[i].toString());
				String json = readToString.substring(33, readToString.length());
				jsonToExcel(json);
			}
		}
	}
	private static void jsonToExcel(String value) throws Exception {
		
		 BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\admin\\Desktop\\newJson\\jsonyu.sql", true));
		
		
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObject = (JsonObject) jsonParser.parse(value);//{....}
		JsonElement features = jsonObject.get("projectList");//[{....}]
		JsonElement jsonElement = features.getAsJsonArray().get(0);//{...}
		JsonObject jsonObject1 = (JsonObject) jsonParser.parse(jsonElement.toString());//toString
		JsonElement jsonElement2 = jsonObject1.get("preregist");
		JsonObject jsonObject2 = (JsonObject) jsonParser.parse(jsonElement2.toString()).getAsJsonObject();		
		
		
		// xtjgmc
		JsonElement xtjgmc = jsonObject2.get("xtjgmc");
		String replace = replace(xtjgmc);
		// zcdz
		JsonElement zcdz = jsonObject2.get("zcdz");
		String replace1 = replace(zcdz).trim();
		// symjzc
		JsonElement symjzc = jsonObject2.get("symjzc");
		String replace2 = replace(symjzc).trim();
		// sjmjzc
		JsonElement sjmjzc = jsonObject2.get("sjmjzc");
		String replace3 = replace(sjmjzc).trim();
		// symxtzzc
		JsonElement symxtzzc = jsonObject2.get("symxtzzc");
		String replace4 = replace(symxtzzc).trim();
//		// sjmfxzb
		JsonElement sjmfxzb = jsonObject2.get("sjmfxzb");
		String replace5 = replace(sjmfxzb).trim();
		// ydjlx
		JsonElement ydjlx = jsonObject2.get("ydjlx");
		String replace6 = replace(ydjlx).trim();
		if(replace6.equals("0")) {//预登记
			replace6="1";
		}else if(replace6.equals("5")){//重新
			replace6="5";
		}
		//csxtcclx
		JsonElement csxtcclx = jsonObject2.get("csxtcclx");
		String replace7 = replace(csxtcclx).trim();
		//ccqxtcfzr
		
		
		//dyjhbz
		JsonElement dyjhbz = jsonObject2.get("dyjhbz");
		String replace8 = replace(dyjhbz).trim();
		//xtgn
		JsonElement xtgn = jsonObject2.get("xtgn");
		String replace9 = replace(xtgn).trim();
		//bgywlx
		JsonElement bgywlx = jsonObject2.get("bgywlx");
		String replace10 = replace(bgywlx).trim();
		//qtbgywlx
		JsonElement qtbgywlx = jsonObject2.get("qtbgywlx");
		String replace11 = replace(qtbgywlx).trim();
		//xtxmmc
		JsonElement xtxmmc = jsonObject2.get("xtxmmc");
		String replace12 = replace(xtxmmc).trim();
		//nfxclzgmlx
		JsonElement nfxclzgmlx = jsonObject2.get("nfxclzgmlx");
		String replace13 = replace(nfxclzgmlx).trim();
		//zdgdgmzfw
		JsonElement zdgdgmzfw = jsonObject2.get("zdgdgmzfw");
		String replace14 = replace(zdgdgmzfw).trim();
		//zggdgmzfw
		JsonElement zggdgmzfw = jsonObject2.get("zggdgmzfw");
		String replace15 = replace(zggdgmzfw).trim();
		//xtxmzqxlx
		JsonElement xtxmzqxlx = jsonObject2.get("xtxmzqxlx");
		String replace16 = replace(xtxmzqxlx).trim();
		//zdgdqxzfw
		JsonElement zdgdqxzfw = jsonObject2.get("zdgdqxzfw");
		String replace17="";
		if(null!=zdgdqxzfw) {
			replace17= replace(zdgdqxzfw).trim();
		}
		//zggdqxzfw
		JsonElement zggdqxzfw = jsonObject2.get("zggdqxzfw");
		String replace18="";
		if(null!=zggdqxzfw) {
			 replace18 = replace(zggdqxzfw).trim();
		}
		//yjxtxmgm
		JsonElement yjxtxmgm = jsonObject2.get("yjxtxmgm");
		String replace19 = replace(yjxtxmgm).trim();
		//zdxtxmgmfw
		JsonElement zdxtxmgmfw = jsonObject2.get("zdxtxmgmfw");
		String replace20 = replace(zdxtxmgmfw).trim();
		//zgxtxmgmfw
		JsonElement zgxtxmgmfw = jsonObject2.get("zgxtxmgmfw");
		String replace21 = replace(zgxtxmgmfw).trim();
		//xtxmqxlx
		JsonElement xtxmqxlx = jsonObject2.get("xtxmqxlx");
		String replace22 = replace(xtxmqxlx).trim();
		//zdxtxmqxfw
		JsonElement zdxtxmqxfw = jsonObject2.get("zdxtxmqxfw");
		String replace23="";
		if(null!=zdxtxmqxfw) {
			replace23 = replace(zdxtxmqxfw).trim();	
		}
		//zgxtxmqxfw
		JsonElement zgxtxmqxfw = jsonObject2.get("zgxtxmqxfw");
		String replace24 ="";
		if(null!=zgxtxmqxfw) {
			replace24 = replace(zgxtxmqxfw).trim();
		}
		//nfxhclsj
		JsonElement nfxhclsj = jsonObject2.get("nfxhclsj");
		String replace25 = replace(nfxhclsj).trim();
		//wtrjzjly
		JsonElement wtrjzjly = jsonObject2.get("wtrjzjly");
		String replace26 = replace(wtrjzjly).trim();		
		//sytzrq
		JsonElement sytzrq = jsonObject2.get("sytzrq");
		String replace27 = replace(sytzrq).trim();	
		//bgbs
		JsonElement bgbs = jsonObject2.get("bgbs");
		String replace28 = replace(bgbs).trim();
		//xtzjbgyh
		JsonElement xtzjbgyh = jsonObject2.get("xtzjbgyh");
		String replace29 = replace(xtzjbgyh).trim();
		//xtbcl
		JsonElement xtbcl = jsonObject2.get("xtbcl");
		String replace30 = replace(xtbcl).trim();
		//syrsyllx
		JsonElement syrsyllx = jsonObject2.get("syrsyllx");
		String replace31 = replace(syrsyllx).trim();		
		//syryqsylqj_zd
		JsonElement syryqsylqj_zd = jsonObject2.get("syryqsylqj_zd");
		String replace32 = "";
		if(null!=syryqsylqj_zd) {
			replace32 = replace(syryqsylqj_zd).trim();	
		}
		//syryqsylqj_zg
		JsonElement syryqsylqj_zg = jsonObject2.get("syryqsylqj_zg");
		String replace33 = "";
		if(null!=syryqsylqj_zg) {
			replace33 = replace(syryqsylqj_zg).trim();
		}
		//xmly
		JsonElement xmly = jsonObject2.get("xmly");
		String replace34 = replace(xmly).trim();
		//xmglfs
		JsonElement xmglfs = jsonObject2.get("xmglfs");
		String replace35 = replace(xmglfs).trim();
		//xmtjjg  ???
		JsonElement xmtjjg = jsonObject2.get("xmtjjg");
		String replace36="";
		if(null!=xmtjjg) {
			replace36 = replace(xmtjjg).trim();	
		}
		//jydsmc
		JsonElement jydsmc = jsonObject2.get("jydsmc");
		String replace37 = replace(jydsmc).trim();	
		//jydsxx
		JsonElement jydsxx = jsonObject2.get("jydsxx");
		String replace38 = replace(jydsxx).trim();
		//xtcctxhyyfs
		JsonElement xtcctxhyyfs = jsonObject2.get("xtcctxhyyfs");
		String replace39 = replace(xtcctxhyyfs).trim();
		//jyjg
		JsonElement jyjg = jsonObject2.get("jyjg");
		String replace40 = replace(jyjg).trim();	
		//fxkzcs
		JsonElement fxkzcs = jsonObject2.get("fxkzcs");
		String replace41 = replace(fxkzcs).trim();
		//yjhklyjtcfs
		JsonElement yjhklyjtcfs = jsonObject2.get("yjhklyjtcfs");
		String replace42 = replace(yjhklyjtcfs).trim();		
		//fxyasm
		JsonElement fxyasm = jsonObject2.get("fxyasm");
		String replace43 = replace(fxyasm).trim();	
		//gshfhgyj
		JsonElement gshfhgyj = jsonObject2.get("gshfhgyj");
		String replace44 = replace(gshfhgyj).trim();
		//xtjlxm
		JsonElement xtjlxm = jsonObject2.get("xtjlxm");
		String replace45 = replace(xtjlxm).trim();
		//xtjldh
		JsonElement xtjldh = jsonObject2.get("xtjldh");
		String replace46 = replace(xtjldh).trim();
		//fggjglry
		JsonElement fggjglry = jsonObject2.get("fggjglry");
		String replace47 = replace(fggjglry).trim();
		
		/*
		 * //xmlx JsonElement xmlx = jsonObject2.get("xmlx"); String replace48 =
		 * replace(xmlx).trim(); //ywlx JsonElement ywlx = jsonObject2.get("ywlx");
		 * String replace49 = replace(ywlx).trim(); //xmszd JsonElement xmszd =
		 * jsonObject2.get("xmszd"); String replace50 = replace(xmszd).trim(); //sfszqq
		 * JsonElement sfszqq = jsonObject2.get("sfszqq"); String replace51 =
		 * replace(sfszqq).trim(); //xyzjbh JsonElement xyzjbh =
		 * jsonObject2.get("xyzjbh"); String replace52 = replace(xyzjbh).trim();
		 * //zbjblqk JsonElement zbjblqk = jsonObject2.get("zbjblqk"); String replace53
		 * = replace(zbjblqk).trim(); //kfshqkggdzzqk JsonElement kfshqkggdzzqk =
		 * jsonObject2.get("kfshqkggdzzqk"); String replace54 =
		 * replace(kfshqkggdzzqk).trim(); //qtsm JsonElement qtsm =
		 * jsonObject2.get("qtsm"); String replace55 = replace(qtsm).trim();
		 */
		
		
		
		 //sfqgtj 
			JsonElement sfqgtj = jsonObject2.get("sfqgtj"); String replace56
		 =""; if(null!=sfqgtj) { replace56 = replace(sfqgtj).trim(); }
		String uuid = UUID.randomUUID().toString().replace("-", "");
		String sql = "insert into bione_product_details_his(pro_id,xtjgmc,zcdz,symjzc,sjmjzc,symxtzzc,sjmfxzb,ydjlx,csxtcclx,dyjhbz,xtgn,bgywlx,qtbgywlx"
				+ ",xtxmmc,nfxclzgmlx,zdgdgmzfw,zggdgmzfw,xtxmzqxlx,zdgdqxzfw,zggdqxzfw,yjxtxmgm,zdxtxmgmfw,zgxtxmgmfw,xtxmqxlx"
				+ ",zdxtxmqxfw,zgxtxmqxfw,nfxhclsj,wtrjzjly,sytzrq,bgbs,xtzjbgyh,xtbcl,syrsyllx,syryqsylqj_zg,syryqsylqj_zd,xmly"
				+ ",xmglfs,xmtjjg,jydsmc,jydsxx,xtcctxhyyfs,jyjg,fxkzcs,yjhklyjtcfs,fxyasm,gshfhgyj,xtjlxm,xtjldh,fggjglry"
				+ ") "
				+ "values('"+uuid+"',"
				+ "'" + replace + "','"+replace1+"','"+replace2+"','"+replace3+"','"+replace4+"','"+replace5+"','"+replace6+"'"
				+ ",'"+replace7+"','"+replace8+"','"+replace9+"','"+replace10+"','"+replace11+"','"+replace12+"','"+replace13+"'"
				+ ",'"+replace14+"','"+replace15+"','"+replace16+"','"+replace17+"','"+replace18+"','"+replace19+"','"+replace20+"'"
				+ ",'"+replace21+"','"+replace22+"','"+replace23+"','"+replace24+"','"+replace25+"','"+replace26+"','"+replace27+"'"
				+ ",'"+replace28+"','"+replace29+"','"+replace30+"','"+replace31+"','"+replace32+"','"+replace33+"','"+replace34+"'"
				+ ",'"+replace35+"','"+replace36+"','"+replace37+"','"+replace38+"','"+replace39+"','"+replace40+"','"+replace41+"'"
				+ ",'"+replace42+"','"+replace43+"','"+replace44+"','"+replace45+"','"+replace46+"','"+replace47+"'"
			
				+ ");";
		
		System.out.println(sql);
		bw.write(sql+"\r\n");
		
		//---		
		JsonElement features1 = jsonObject2.get("preregist_factor_romotion");//[{....}]
//		JsonElement jsonElement1 = features1.getAsJsonArray().get(0);//{...}
//		JsonObject jsonObjectt1 = (JsonObject) jsonParser.parse(jsonElement1.toString());//toString
		if(replace56!="") {
			JsonArray asJsonArray = features1.getAsJsonArray();
			for (int i = 0; i < asJsonArray.size(); i++) {
				JsonObject jsonObjectt1 = (JsonObject) jsonParser.parse(asJsonArray.get(i).toString());//toString
				//tjjg 
				JsonElement tjjg = jsonObjectt1.get("tjjg"); 
				String replace57 = replace(tjjg).trim(); 
				//tjfl 
				JsonElement tjfl = jsonObjectt1.get("tjfl");
				String replace58 = replace(tjfl).trim(); 
				//tjq 
				JsonElement tjq = jsonObjectt1.get("tjq"); 
				String replace59 = replace(tjq).trim(); 
				//jhtjgm
				JsonElement jhtjgm = jsonObjectt1.get("jhtjgm"); 
				String replace60 = replace(jhtjgm).trim(); 
				//tjfshtjgl 
				JsonElement tjfshtjgl = jsonObjectt1.get("tjfshtjgl"); 
				String replace61 = replace(tjfshtjgl).trim();
				//tjfzrmc 
				JsonElement tjfzrmc = jsonObjectt1.get("tjfzrmc"); 
				String replace62 = replace(tjfzrmc).trim(); 
				//tjfzrdh 
				JsonElement tjfzrdh = jsonObjectt1.get("tjfzrdh"); 
				String replace63 = replace(tjfzrdh).trim();
				String uuidF = UUID.randomUUID().toString().replace("-", "");
				String sql1="insert into BIONE_PREREGIST_FACTOR_his(ID,PRO_ID,tjjg,tjfl,tjq,jhtjgm,tjfshtjgl,tjfzrmc,tjfzrdh) values('"+uuidF+"','"+uuid+"',"
						+ "'" + replace57 +
						"','"+replace58+"','"+replace59+"','"+replace60+"','"+replace61+"','"+
						replace62+"','"+replace63+"'" + ");";
				System.out.println(sql1); 
				bw.write(sql1+"\r\n");
			}
		}
		bw.close();
	}

	public static String replace(JsonElement value) {
		String replace="";
		if(null!=value) {
			replace= value.toString().replace("\\", "").replace("\"", "");
		}
		return replace;
	}

	public static String readToString(String fileName) {
		String encoding = "UTF-8";
		File file = new File(fileName);
		Long filelength = file.length();
		byte[] filecontent = new byte[filelength.intValue()];
		try {
			FileInputStream in = new FileInputStream(file);
			in.read(filecontent);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			return new String(filecontent, encoding);
		} catch (UnsupportedEncodingException e) {
			System.err.println("The OS does not support " + encoding);
			e.printStackTrace();
			return null;
		}
	}
}