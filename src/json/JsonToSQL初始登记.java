
package json;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * @author admin
 */

//json格式 {key:"value"}
public class JsonToSQL初始登记 {
    private static final String PATH = "C:\\Users\\admin\\Desktop\\newJson\\2.初始";

    public static void main(String[] args) throws Exception {
        File file = new File(PATH);
        File[] tempList = file.listFiles();
        int a = tempList.length;
        System.out.println("该目录下对象个数：" + tempList.length);
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                System.out.println(i+"-----"+tempList[i].toString());
                String readToString = readToString(tempList[i].toString());
                String json = readToString.substring(33, readToString.length());
                jsonToExcel(json);
            }
        }
    }

    private static void jsonToExcel(String value) throws Exception {

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\admin\\Desktop\\newJson\\chushijson.sql", true));

        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject) jsonParser.parse(value);// {....}
        JsonElement features = jsonObject.get("projectList");// [{....}]
        JsonElement jsonElement = features.getAsJsonArray().get(0);// {...}
        JsonObject jsonObject1 = (JsonObject) jsonParser.parse(jsonElement.toString());// toString
        JsonElement jsonElement2 = jsonObject1.get("projectFactor");
        JsonObject jsonObject2 = (JsonObject) jsonParser.parse(jsonElement2.toString()).getAsJsonObject();
        // djlx
        JsonElement djlx = jsonObject2.get("djlx");
        String replace = replace(djlx);
        // xtjgmc
        JsonElement xtjgmc = jsonObject2.get("xtjgmc");
        String replace1 = replace(xtjgmc).trim();
        // cpqc
        JsonElement cpqc = jsonObject2.get("cpqc");
        String replace2 = replace(cpqc).trim();
        // djcpbh
        JsonElement djcpbh = jsonObject2.get("djcpbh");
        String replace3 = "";
        if (null != djcpbh) {
            replace3 = replace(djcpbh).trim();
        }
        // gscpbh
        JsonElement gscpbh = jsonObject2.get("gscpbh");
        String replace4 = replace(gscpbh).trim();
//		// sfxtzcp
        JsonElement sfxtzcp = jsonObject2.get("sfxtzcp");
        String replace5 = replace(sfxtzcp).trim();
        // sdbs
        JsonElement sdbs = jsonObject2.get("sdbs");
        String replace6 = "";
        if (null != sdbs) {
            replace6 = replace(sdbs).trim();
        }
        // xtccxz
        JsonElement xtccxz = jsonObject2.get("xtccxz");
        String replace7 = replace(xtccxz).trim();
        // dyjhbz
        JsonElement dyjhbz = jsonObject2.get("dyjhbz");
        String replace8 = replace(dyjhbz).trim();
        // ccqxtcfzr
        JsonElement ccqxtcfzr = jsonObject2.get("ccqxtcfzr");
        String replace9 = "";
        if (null != ccqxtcfzr) {
            replace9 = replace(ccqxtcfzr).trim();
        }
        // stzz
        JsonElement stzz = jsonObject2.get("stzz");
        String replace10 = replace(stzz).trim();
        // xtgn
        JsonElement xtgn = jsonObject2.get("xtgn");
        String replace11 = replace(xtgn).trim();
        // yxfs
        JsonElement yxfs = jsonObject2.get("yxfs");
        String replace12 = replace(yxfs).trim();
        // kffbbs
        JsonElement kffbbs = jsonObject2.get("kffbbs");
        String replace13 = replace(kffbbs).trim();
        // xtsyfs
        JsonElement xtsyfs = jsonObject2.get("xtsyfs");
        String replace14 = replace(xtsyfs).trim();
        // syfssm
        JsonElement syfssm = jsonObject2.get("syfssm");
        String replace15 = "";
        if (null != syfssm) {
            replace15 = replace(syfssm).trim();
        }
        // jghbs
        JsonElement jghbs = jsonObject2.get("jghbs");
        String replace16 = replace(jghbs).trim();
        // zjcbs
        JsonElement zjcbs = jsonObject2.get("zjcbs");
        String replace17 = replace(zjcbs).trim();
        // totbs
        JsonElement totbs = jsonObject2.get("totbs");
        String replace18 = replace(totbs).trim();

       /* // xycxtcpgs
        JsonElement xycxtcpgs = jsonObject2.get("xycxtcpgs");
        String replace19 = "";
        if (null != xycxtcpgs) {
            replace19 = replace(xycxtcpgs).trim();
        }*/

        /*// xycxtcpdjptcpbm
        JsonElement xycxtcpdjptcpbm = jsonObject2.get("xycxtcpdjptcpbm");
        String replace20 = "";
        if (null != xycxtcpdjptcpbm) {
            replace20 = replace(xycxtcpdjptcpbm).trim();
        }*/
        // csmjje
        JsonElement csmjje = jsonObject2.get("csmjje");
        String replace21 = "";
        if (null != csmjje) {
            replace21 = replace(csmjje).trim();
        }
        // csmjfe
        JsonElement csmjfe = jsonObject2.get("csmjfe");
        String replace22 = "";
        if (null != csmjfe) {
            replace22 = replace(csmjfe).trim();
        }
        // zjjsbz
        JsonElement zjjsbz = jsonObject2.get("zjjsbz");
        String replace23 = replace(zjjsbz).trim();
        // yqmjzje
        JsonElement yqmjzje = jsonObject2.get("yqmjzje");
        String replace24 = "";
        if (null != yqmjzje) {
            replace24 = replace(yqmjzje).trim();
        }
        // yqmjzfe
        JsonElement yqmjzfe = jsonObject2.get("yqmjzfe");
        String replace25 = "";
        if (null != yqmjzfe) {
            replace25 = replace(yqmjzfe).trim();
        }
        // yqmjzebz
        JsonElement yqmjzebz = jsonObject2.get("yqmjzebz");
        String replace26 = "";
        if (null != yqmjzebz) {
            replace26 = replace(yqmjzebz).trim();
        }
        // zyyyly_ctq
        JsonElement zyyyly_ctq = jsonObject2.get("zyyyly_ctq");
        String replace27 = replace(zyyyly_ctq).trim();
        // zytxhy_ctq
        JsonElement zytxhy_ctq = jsonObject2.get("zytxhy_ctq");
        String replace28 = replace(zytxhy_ctq).trim();
        // ccglyyfs
        JsonElement ccglyyfs = jsonObject2.get("ccglyyfs");
        String replace29 = "";
        if (null != ccglyyfs) {
            replace29 = replace(ccglyyfs).trim();
        }

        // xdzcjsyq
        JsonElement xdzcjsyq = jsonObject2.get("xdzcjsyq");
        String replace30 = "";
        if (null != xdzcjsyq) {
            replace30 = replace(xdzcjsyq).trim();
        }
        // zczqhbs
        JsonElement zczqhbs = jsonObject2.get("zczqhbs");
        String replace31 = "";
        if (null != zczqhbs) {
            replace31 = replace(zczqhbs).trim();
        }
        // tsyw
        JsonElement tsyw = jsonObject2.get("tsyw");
        String replace32 = replace(tsyw).trim();
        // ywxism
        JsonElement ywxism = jsonObject2.get("ywxism");
        String replace33 = "";
        if (null != ywxism) {
            replace31 = replace(ywxism).trim();
        }

        // syllx
        JsonElement syllx = jsonObject2.get("syllx");
        String replace34 = replace(syllx).trim();

        // zdyqsyl
        JsonElement zdyqsyl = jsonObject2.get("zdyqsyl");
        String replace35 = "";
        if (null != zdyqsyl) {
            replace35 = replace(zdyqsyl).trim();
        }
        // zgyqsyl
        JsonElement zgyqsyl = jsonObject2.get("zgyqsyl");
        String replace36 = replace(zgyqsyl).trim();
        // xtbclx
        JsonElement xtbclx = jsonObject2.get("xtbclx");
        String replace37 = replace(xtbclx).trim();
        // xtbcl
        JsonElement xtbcl = jsonObject2.get("xtbcl");
        String replace38 = "";
        if (null != xtbcl) {
            replace38 = replace(xtbcl).trim();
        }
        // xtbc
        JsonElement xtbc = jsonObject2.get("xtbc");
        String replace39 = "";
        if (null != xtbc) {
            replace39 = replace(xtbc).trim();
        }
        // htydbcsm
        JsonElement htydbcsm = jsonObject2.get("htydbcsm");
        String replace40 = "";
        if (null != htydbcsm) {
            replace40 = replace(htydbcsm).trim();
        }
        // fxxmbs
        JsonElement fxxmbs = jsonObject2.get("fxxmbs");
        String replace41 = replace(fxxmbs).trim();
        // fxhscs
        JsonElement fxhscs = jsonObject2.get("fxhscs");
        String replace42 = "";
        if (null != fxhscs) {
            replace42 = replace(fxhscs).trim();
        }
        // sfgdqxcp
        JsonElement sfgdqxcp = jsonObject2.get("sfgdqxcp");
        String replace43 = "";
        if (null != sfgdqxcp) {
            replace43 = replace(sfgdqxcp).trim();
        }
        // xtcpsjclrq
        JsonElement xtcpsjclrq = jsonObject2.get("xtcpsjclrq");
        String replace44 = replace(xtcpsjclrq).trim();
        // cpjhdqr
        JsonElement cpjhdqr = jsonObject2.get("cpjhdqr");
        String replace45 = replace(cpjhdqr).trim();
        // kfpd
        JsonElement kfpd = jsonObject2.get("kfpd");
        String replace46 = "";
        if (null != kfpd) {
            replace46 = replace(kfpd).trim();
        }
        // shdxzxtj
        JsonElement shdxzxtj = jsonObject2.get("shdxzxtj");
        String replace47 = replace(shdxzxtj).trim();
        // ktqshbs
        JsonElement ktqshbs = jsonObject2.get("ktqshbs");
        String replace48 = replace(ktqshbs).trim();
        // tjfs
        JsonElement tjfs = jsonObject2.get("tjfs");
        String replace49 = replace(tjfs).trim();
        // tjmj
        JsonElement tjmj = jsonObject2.get("tjmj");
        String replace50 = replace(tjmj).trim();
        // ydtjbs
        JsonElement ydtjbs = jsonObject2.get("ydtjbs");
        String replace51 = replace(ydtjbs).trim();
        // xmtjf
        JsonElement xmtjf = jsonObject2.get("xmtjf");
        String replace52 = replace(xmtjf).trim();
        // sfgz
        JsonElement sfgz = jsonObject2.get("sfgz");
        String replace53 = "";
        if (null != sfgz) {
            replace53 = replace(sfgz).trim();
        }
        // jzpgpd
        JsonElement jzpgpd = jsonObject2.get("jzpgpd");
        String replace54 = "";
        if (null != jzpgpd) {
            replace54 = replace(jzpgpd).trim();
        }

        // jntgjg
        JsonElement jntgjg = jsonObject2.get("jntgjg");
        String replace55 = replace(jntgjg).trim();
        // jwtgdljg
        JsonElement jwtgdljg = jsonObject2.get("jwtgdljg");
        String replace56 = "";
        if (null != jwtgdljg) {
            replace56 = replace(jwtgdljg).trim();
        }
        // jwtgdljggb
        JsonElement jwtgdljggb = jsonObject2.get("jwtgdljggb");
        String replace57 = replace(jwtgdljggb).trim();
        // tzgwbs
        JsonElement tzgwbs = jsonObject2.get("tzgwbs");
        String replace58 = replace(tzgwbs).trim();
        // gljybs
        JsonElement gljybs = jsonObject2.get("gljybs");
        String replace59 = replace(gljybs).trim();
        // gljybcsm
        JsonElement gljybcsm = jsonObject2.get("gljybcsm");
        String replace60 = "";
        if (null != gljybcsm) {
            replace60 = replace(gljybcsm).trim();
        }
        // jzplpd
        JsonElement jzplpd = jsonObject2.get("jzplpd");
        String replace61 = "";
        if (null != jzplpd) {
            replace61 = replace(jzplpd).trim();
        }

        // zcglbgpd
        JsonElement zcglbgpd = jsonObject2.get("zcglbgpd");
        String replace62 = replace(zcglbgpd).trim();
        // qsbgplbs
        JsonElement qsbgplbs = jsonObject2.get("qsbgplbs");
        String replace63 = replace(qsbgplbs).trim();
        // xtcpssbm
        JsonElement xtcpssbm = jsonObject2.get("xtcpssbm");
        String replace64 = replace(xtcpssbm).trim();
        // xtjlxm
        JsonElement xtjlxm = jsonObject2.get("xtjlxm");
        String replace65 = replace(xtjlxm).trim();
        // fggjglry
        JsonElement fggjglry = jsonObject2.get("fggjglry");
        String replace66 = replace(fggjglry).trim();
        // lxdh
        JsonElement lxdh = jsonObject2.get("lxdh");
        String replace67 = replace(lxdh).trim();

        // fqzcpnbbh
        JsonElement fqzcpnbbh = jsonObject2.get("fqzcpnbbh");
        String replace68 = "";
        if (null != fqzcpnbbh) {
            replace68 = replace(fqzcpnbbh).trim();
        }
        // gljylx
        JsonElement gljylx = jsonObject2.get("gljylx");
        String replace69 = "";
        if (null != gljylx) {
            replace69 = replace(gljylx).trim();
        }
        // gllx
        JsonElement gllx = jsonObject2.get("gllx");
        String replace70 = "";
        if (null != gllx) {
            replace70 = replace(gllx).trim();
        }
        // gljymd
        JsonElement gljymd = jsonObject2.get("gljymd");
        String replace71 = "";
        if (null != gljymd) {
            replace71 = replace(gljymd).trim();
        }
        // gljydj
        JsonElement gljydj = jsonObject2.get("gljydj");
        String replace72 = "";
        if (null != gljydj) {
            replace72 = replace(gljydj).trim();
        }

        // ccglyyfs_ccq
        JsonElement ccglyyfs_ccq = jsonObject2.get("ccglyyfs_ccq");
        String replace77 = "";
        if (null != ccglyyfs_ccq) {
            replace77 = replace(ccglyyfs_ccq).trim();
        }
        String uuid = UUID.randomUUID().toString().replace("-", "");
        JsonElement replace99=jsonObject2.get("grjgbs");
        String replace999="";
        if(replace99!=null) {
        	 String trim = replace(replace99).trim();
             if(trim!=null&&!"".equals(trim)) {
            	 replace999=trim;
            
             JsonElement jsonElement7 = jsonObject2.get("counterParty");//[{...}]
             if(jsonElement7!=null) {
             	for (int i = 0; i < jsonElement7.getAsJsonArray().size(); i++) {
                     JsonElement jsonElementt7 = jsonElement7.getAsJsonArray().get(i);//{...}
                     JsonObject jsonObject7 = (JsonObject)
                     jsonParser.parse(jsonElementt7.toString()).getAsJsonObject();
                     // jydsjgzzjgdm
                     JsonElement jydsjgzzjgdm = jsonObject7.get("jydsjgzzjgdm");
                     String replace78 = replace(jydsjgzzjgdm).trim();
                     // jydsjglx
                     JsonElement jydsjglx = jsonObject7.get("jydsjglx");
                     String replace79 = replace(jydsjglx).trim();
                     // jydsjgzclb
                     JsonElement jydsjgzclb = jsonObject7.get("jydsjgzclb");
                     String replace80 = replace(jydsjgzclb).trim();
                     
                     String uuid1 = UUID.randomUUID().toString().replace("-", "");
                     String sql7 = "insert into BIONE_COUNTER_PARTY_his(p_id,proo_id,jydsjgzzjgdm,jydsjglx,jydsjgzclb,cpbm) values ('"+uuid1+"','"+uuid+"','"+replace78+"','"+replace79+"','"+replace80+"','"+replace4+"')";
                     
                     System.out.println(sql7);
                     bw.write(sql7 + "\r\n");
             	}
             }
             }
        }else {
        	replace999="";
        }
       

      
        String sql = "insert into BIONE_PRODUCT_FACTOR_HIS(pro_id,djlx,xtjgmc,cpqc,djcpbh,gscpbh,sfxtzcp,sdbs,xtccxz,dyjhbz,ccqxtcfzr,stzz,xtgn,yxfs,kffbbs,xtsyfs,syfssm,jghbs,zjcbs,totbs,csmjje,csmjfe,"
        		+ "zjjsbz,yqmjzje,yqmjzfe,yqmjzebz,zyyyly_ctq,zytxhy_ctq,ccglyyfs,xdzcjsyq,zczqhbs,tsyw,ywxism,"
        		+ "syllx,zdyqsyl,zgyqsyl,xtbclx,xtbcl,xtbc,htydbcsm,fxxmbs,fxhscs,sfgdqxcp,xtcpsjclrq,"
        		+ "cpjhdqr,kfpd,shdxzxtj,ktqshbs,tjfs,tjmj,ydtjbs,xmtjf,sfgz,jzpgpd,jntgjg,jwtgdljg,"
        		+ "jwtgdljggb,tzgwbs,gljybs,gljybcsm,jzplpd,zcglbgpd,qsbgplbs,xtcpssbm,xtjlxm,fggjglry,lxdh,fqzcpnbbh,gljylx,gllx,gljymd,gljydj,ccglyyfs_ccq,grjgbs) " 
        + "values('"+uuid+"'," + "'"
                + replace + "','" + replace1 + "','" + replace2 + "','" + replace3 + "','" + replace4 + "','" + replace5
                + "','" + replace6 + "','" + replace7 + "','" + replace8 + "','" + replace9 + "','" + replace10
                + "','" + replace11 + "','" + replace12 + "','" + replace13 + "','" + replace14 + "','" + replace15
                + "','" + replace16 + "','" + replace17 + "','" + replace18
                + "','" + replace21 + "','" + replace22 + "','" + replace23 + "','" + replace24 + "','" + replace25
                + "','" + replace26 + "','" + replace27 + "'" + ",'" + replace28 + "','" + replace29 + "','" + replace30
                + "','" + replace31 + "','" + replace32 + "','" + replace33 + "','" + replace34 + "','" + replace35
                + "','" + replace36 + "','" + replace37 + "','" + replace38 + "','" + replace39 + "','" + replace40
                + "','" + replace41 + "','" + replace42 + "','" + replace43 + "','" + replace44 + "','" + replace45
                + "','" + replace46 + "','" + replace47 + "','" + replace48 + "','" + replace49 + "','" + replace50
                + "','" + replace51 + "','" + replace52 + "','" + replace53 + "','" + replace54 + "','" + replace55
                + "','" + replace56 + "','" + replace57 + "','" + replace58 + "','" + replace59
                + "','" + replace60 + "','" + replace61 + "','" + replace62 + "','" + replace63
                + "','" + replace64 + "','" + replace65 + "','" + replace66 + "','" + replace67
                + "','" + replace68 + "','" + replace69 + "','" + replace70 + "','" + replace71 + "','" + replace72
                + "','" + replace77 
                + "','"+replace999+"');";
        System.out.println(sql);
        bw.write(sql + "\r\n");
//---		

//		JsonElement features1 = jsonObject2.get("preregist_factor_romotion");//[{....}]
//		JsonElement jsonElement1 = features1.getAsJsonArray().get(0);//{...}
//		JsonObject jsonObjectt1 = (JsonObject) jsonParser.parse(jsonElement1.toString());//toString
        /*
         * if(replace48!="") { JsonArray asJsonArray = features1.getAsJsonArray(); for
         * (int i = 0; i < asJsonArray.size(); i++) { JsonObject jsonObjectt1 =
         * (JsonObject) jsonParser.parse(asJsonArray.get(i).toString());//toString
         * //tjjg JsonElement tjjg = jsonObjectt1.get("tjjg"); String replace49 =
         * replace(tjjg).trim(); //tjfl JsonElement tjfl = jsonObjectt1.get("tjfl");
         * String replace50 = replace(tjfl).trim(); //tjq JsonElement tjq =
         * jsonObjectt1.get("tjq"); String replace51 = replace(tjq).trim(); //jhtjgm
         * JsonElement jhtjgm = jsonObjectt1.get("jhtjgm"); String replace52 =
         * replace(jhtjgm).trim(); //tjfshtjgl JsonElement tjfshtjgl =
         * jsonObjectt1.get("tjfshtjgl"); String replace53 = replace(tjfshtjgl).trim();
         * //tjfzrmc JsonElement tjfzrmc = jsonObjectt1.get("tjfzrmc"); String replace54
         * = replace(tjfzrmc).trim(); //tjfzrdh JsonElement tjfzrdh =
         * jsonObjectt1.get("tjfzrdh"); String replace55 = replace(tjfzrdh).trim();
         * String
         * sql1="insert into table2(tjjg,tjfl,tjq,jhtjgm,tjfshtjgl,tjfzrmc,tjfzrdh) values("
         * + "'" + replace49 +
         * "','"+replace50+"','"+replace51+"','"+replace52+"','"+replace53+"','"+
         * replace54+"','"+replace55+"'" + ");"; System.out.println(sql1); }
         *
         * }
         */
        

        


        JsonElement jsonElement3 = jsonObject1.get("profitStructure");//[{...}]
        for (int i = 0; i < jsonElement3.getAsJsonArray().size(); i++) {
            JsonElement jsonElementt3 = jsonElement3.getAsJsonArray().get(i);//{...}
            JsonObject jsonObject3 = (JsonObject)
            jsonParser.parse(jsonElementt3.toString()).getAsJsonObject();
            // syqxh
            JsonElement syqxh = jsonObject3.get("syqxh");
            String replace01 = replace(syqxh).trim();
            /*// syqmc
            JsonElement syqmc = jsonObject3.get("syqmc");
            String replace02 = replace(syqmc).trim();*/
            // syqdm
            JsonElement syqdm = jsonObject3.get("syqdm");
            String replace03 = replace(syqdm).trim();
            // syqlx
            JsonElement syqlx = jsonObject3.get("syqlx");
            String replace04 = replace(syqlx).trim();
            // fpsx
            JsonElement fpsx = jsonObject3.get("fpsx");
            String replace05 = replace(fpsx).trim();
            // syqsyllx
            JsonElement syqsyllx = jsonObject3.get("syqsyllx");
            String replace06 = replace(syqsyllx).trim();
            // syqyqsyl
            JsonElement syqyqsyl = jsonObject3.get("syqyqsyl");
            String replace07 = replace(syqyqsyl).trim();
            // yqsylsm
            JsonElement yqsylsm = jsonObject3.get("yqsylsm");
            String replace08 = replace(yqsylsm).trim();
            // fhfs
            JsonElement fhfs = jsonObject3.get("fhfs");
            String replace09 = replace(fhfs).trim();
            // fpfs
            JsonElement fpfs = jsonObject3.get("fpfs");
            String replace010 = replace(fpfs).trim();
            // fppl
            JsonElement fppl = jsonObject3.get("fppl");
            String replace011 = replace(fppl).trim();

            String uuid1 = UUID.randomUUID().toString().replaceAll("-", "");

            String sql1 = "insert into BIONE_BENEFIT_FACTOR_HIS(pro_id,id,syqxh,syqdm,syqlx,fpsx,syqsyllx,syqyqsyl,yqsylsm,fhfs,fpfs,fppl)"
                    + " values('"+uuid+"','" + uuid1 + "','"
                    + replace01 + "','" + replace03 + "','" + replace04 + "','" + replace05
                    + "','" + replace06 + "'" + ",'" + replace07 + "','" + replace08 + "','" + replace09 + "','" + replace010
                    + "','" + replace011 + "');";
            System.out.println(sql1);
            bw.write(sql1 + "\r\n");
        }


        JsonElement jsonElement4 = jsonObject1.get("trustContract");//[{...}]
        for (int i = 0; i < jsonElement4.getAsJsonArray().size(); i++) {
            JsonElement jsonElementt4 = jsonElement4.getAsJsonArray().get(i);//{...}
            JsonObject jsonObject4 = (JsonObject)
            jsonParser.parse(jsonElementt4.toString()).getAsJsonObject();
            // zytabs
            JsonElement zytabs = jsonObject4.get("zytabs");
            String replace012 = replace(zytabs).trim();
            /*// xtcpfqbh
            JsonElement xtcpfqbh = jsonObject2.get("xtcpfqbh");
            String replace013 = "";
            if (null != xtcpfqbh) {
                replace013 = replace(xtcpfqbh).trim();
            }*/
            /*// xtcpfqmc
            JsonElement xtcpfqmc = jsonObject2.get("xtcpfqmc");
            String replace014 = "";
            if (null != xtcpfqmc) {
                replace014 = replace(xtcpfqmc).trim();
            }*/
            // xthtbh
            JsonElement xthtbh = jsonObject4.get("xthtbh");
            String replace015 = replace(xthtbh).trim();
            // htjz
            JsonElement htjz = jsonObject4.get("htjz");
            String replace016 = replace(htjz).trim();
            // wtrqc
            JsonElement wtrqc = jsonObject4.get("wtrqc");
            String replace017 = replace(wtrqc).trim();
            // wtrlx
            JsonElement wtrlx = jsonObject4.get("wtrlx");
            String replace018 = replace(wtrlx).trim();
            // lxxq_wtr
            JsonElement lxxq_wtr = jsonObject4.get("lxxq_wtr");
            String replace019 = "";
            if (null != lxxq_wtr) {
                replace019 = replace(lxxq_wtr).trim();
            }

            // wtrzjlx
            JsonElement wtrzjlx = jsonObject4.get("wtrzjlx");
            String replace020 = replace(wtrzjlx).trim();
            // wtrzjhm
            JsonElement wtrzjhm = jsonObject4.get("wtrzjhm");
            String replace021 = replace(wtrzjhm).trim();
            // htcszje
            JsonElement htcszje = jsonObject4.get("htcszje");
            String replace022 = replace(htcszje).trim();
            // htcszfe
            JsonElement htcszfe = jsonObject4.get("htcszfe");
            String replace023 = replace(htcszfe).trim();
            /*// htcsfesxrq
            JsonElement htcsfesxrq = jsonObject2.get("htcsfesxrq");
            String replace024 = "";
            if (null != htcsfesxrq) {
                replace024 = replace(htcsfesxrq).trim();
            }*/
            // xtccxz
            JsonElement xtccxz2 = jsonObject4.get("xtccxz");
            String replace025 = replace(xtccxz2).trim();
            // zjjsbz
            JsonElement zjjsbz2 = jsonObject4.get("zjjsbz");
            String replace026 = replace(zjjsbz2).trim();
            // wtzjje
            JsonElement wtzjje = jsonObject4.get("wtzjje");
            String replace027 = replace(wtzjje).trim();
            // wtccdyje
            JsonElement wtccdyje = jsonObject4.get("wtccdyje");
            String replace028 = replace(wtccdyje).trim();
            // wtcccclx
            JsonElement wtcccclx = jsonObject4.get("wtcccclx");
            String replace029 = replace(wtcccclx).trim();
           /* // qdrq
            JsonElement qdrq = jsonObject2.get("qdrq");
            String replace030 = "";
            if (null != qdrq) {
                replace030 = replace(qdrq).trim();
            }*/
            // syrxh
            JsonElement syrxh = jsonObject4.get("syrxh");
            String replace031 = replace(syrxh).trim();
            // syrmc
            JsonElement syrmc = jsonObject4.get("syrmc");
            String replace032 = replace(syrmc).trim();
            // syrlx
            JsonElement syrlx = jsonObject4.get("syrlx");
            String replace033 = replace(syrlx).trim();
            // lxxq_syr
            JsonElement lxxq_syr = jsonObject4.get("lxxq_syr");
            String replace034 = "";
            if (null != lxxq_syr) {
                replace034 = replace(lxxq_syr).trim();
            }

            // syrzjlx
            JsonElement syrzjlx = jsonObject4.get("syrzjlx");
            String replace035 = replace(syrzjlx).trim();
            // syrzjhm
            JsonElement syrzjhm = jsonObject4.get("syrzjhm");
            String replace036 = replace(syrzjhm).trim();
            // syqdm
            JsonElement syqdm = jsonObject4.get("syqdm");
            String replace037 = replace(syqdm).trim();
            /*// syqmc
            JsonElement syqmc = jsonObject4.get("syqmc");
            String replace034 = replace(syqmc).trim();*/
            // syqcsfe
            JsonElement syqcsfe = jsonObject4.get("syqcsfe");
            String replace038 = replace(syqcsfe).trim();
            // syqcsje
            JsonElement syqcsje = jsonObject4.get("syqcsje");
            String replace039 = "";
            if (null != syqcsje) {
                replace039 = replace(syqcsje).trim();
            }
            // syqqsr
            JsonElement syqqsr = jsonObject4.get("syqqsr");
            String replace040 = "";
            if (null != syqqsr) {
                replace040 = replace(syqqsr).trim();
            }
            // syqjhdqr
            JsonElement syqjhdqr = jsonObject4.get("syqjhdqr");
            String replace041 = "";
            if (null != syqjhdqr) {
                replace041 = replace(syqjhdqr).trim();
            }
            // qksm
            JsonElement qksm = jsonObject4.get("qksm");
            String replace042 = "";
            if (null != qksm) {
                replace042 = replace(qksm).trim();
            }
            /*// syrsl
            JsonElement syrsl = jsonObject2.get("syrsl");
            String replace043 = "";
            if (null != syrsl) {
                replace043 = replace(syrsl).trim();
            }*/
            /*// syqmc
            JsonElement syqmc = jsonObject2.get("syqmc");
            String replace044 = "";
            if (null != syqmc) {
                replace044 = replace(syqmc).trim();
            }*/

            String uuid2 = UUID.randomUUID().toString().replaceAll("-", "");

            String sql2 = "insert into BIONE_PACT_FACTOR_HIS(pro_id,id,zytabs,xthtbh,htjz,wtrqc,wtrlx,lxxq_wtr,wtrzjlx,wtrzjhm,htcszje,htcszfe,xtccxz,zjjsbz,wtzjje,wtccdyje,wtcccclx,syrxh,syrmc,syrlx,lxxq_syr,syrzjlx,syrzjhm,syqdm,syqcsfe,syqcsje,syqqsr,syqjhdqr,qksm)"
                    + " values('"+uuid+"','" + uuid2 + "','"
                    + replace012 + "','" + replace015 + "','" + replace016
                    + "','" + replace017 + "'" + ",'" + replace018 + "','" + replace019 + "','" + replace020 + "','" + replace021
                    + "','" + replace022 + "'" + ",'" + replace023 + "','" + replace025 + "','" + replace026
                    + "','" + replace027 + "'" + ",'" + replace028 + "','" + replace029 + "','" + replace031
                    + "','" + replace032 + "'" + ",'" + replace033 + "','"+ replace034 + "','" + replace035 + "','" + replace036
                    + "','" + replace037 + "'" + ",'" + replace038 + "','" + replace039 + "','" + replace040 + "','" + replace041 + "','" + replace042
                     + "');";
            System.out.println(sql2);
            bw.write(sql2 + "\r\n");
        }
        
        JsonElement jsonElement5 = jsonObject1.get("bankAccount");//[{...}]
        for (int i = 0; i < jsonElement5.getAsJsonArray().size(); i++) {
            JsonElement jsonElementt5 = jsonElement5.getAsJsonArray().get(i);//{...}
            JsonObject jsonObject5 = (JsonObject)
                    jsonParser.parse(jsonElementt5.toString()).getAsJsonObject();
/*
        JsonElement jsonElement5 = jsonObject1.get("bankAccount");//[{...}]
        JsonElement jsonElementt5 = jsonElement5.getAsJsonArray().get(0);//{...}
        JsonObject jsonObject5 = (JsonObject)
                jsonParser.parse(jsonElementt5.toString()).getAsJsonObject();*/
        // yxzhlx
        JsonElement yxzhlx = jsonObject5.get("yxzhlx");
        String replace040 = replace(yxzhlx).trim();
        // yxzhhm
        JsonElement yxzhhm = jsonObject5.get("yxzhhm");
        String replace041 = replace(yxzhhm).trim();
        // yxzhkhyxzxqc
        JsonElement yxzhkhyxzxqc = jsonObject5.get("yxzhkhyxzxqc");
        String replace042 = replace(yxzhkhyxzxqc).trim();
        // yxzhkhxqc
        JsonElement yxzhkhxqc = jsonObject5.get("yxzhkhxqc");
        String replace043 = replace(yxzhkhxqc).trim();
        // yxzhzh
        JsonElement yxzhzh = jsonObject5.get("yxzhzh");
        String replace044 = replace(yxzhzh).trim();
        // bz
        JsonElement bz = jsonObject5.get("bz");
        String replace045 = replace(bz).trim();
        // khrq
        JsonElement khrq = jsonObject5.get("khrq");
        String replace046 = replace(khrq).trim();

        String uuid3 = UUID.randomUUID().toString().replaceAll("-", "");

        String sql3 = "insert into bione_bank_account_HIS(pro_id,id,yxzhlx,yxzhhm,yxzhkhyxzxqc,yxzhkhxqc,yxzhzh,bz,khrq) values('"+uuid+"',"
                + "'" + uuid3 + "','" + replace040 + "','" + replace041 + "','" + replace042 + "','" + replace043 + "'"
                + ",'" + replace044 + "','" + replace045 + "','" + replace046 + "');";
        System.out.println(sql3);
        bw.write(sql3 + "\r\n");
        
        }
        JsonElement jsonElement6 = jsonObject1.get("stockAccount");//[{...}]
        for (int j = 0; j < jsonElement6.getAsJsonArray().size(); j++) {
            JsonElement jsonElementt6 = jsonElement6.getAsJsonArray().get(j);//{...}
            JsonObject jsonObject6 = (JsonObject)
                    jsonParser.parse(jsonElementt6.toString()).getAsJsonObject();
        
/*
        JsonElement jsonElement6 = jsonObject1.get("stockAccount");//[{...}]
        JsonElement jsonElementt6 = jsonElement6.getAsJsonArray().get(0);//{...}
        JsonObject jsonObject6 = (JsonObject)
                jsonParser.parse(jsonElementt6.toString()).getAsJsonObject();*/
        // sfklzqzh
        JsonElement sfklzqzh = jsonObject6.get("sfklzqzh");
        String replace047 = replace(sfklzqzh).trim();
        // zqzjzhzh
        JsonElement zqzjzhzh = jsonObject6.get("zqzjzhzh");
        String replace048 = replace(zqzjzhzh).trim();
        // zqgsmc
        JsonElement zqgsmc = jsonObject6.get("zqgsmc");
        String replace049 = replace(zqgsmc).trim();
        // zqgskhyyb
        JsonElement zqgskhyyb = jsonObject6.get("zqgskhyyb");
        String replace050 = replace(zqgskhyyb).trim();
        // zqjyxtlx
        JsonElement zqjyxtlx = jsonObject6.get("zqjyxtlx");
        String replace051 = replace(zqjyxtlx).trim();
        // wgzqjyxtcs
        JsonElement wgzqjyxtcs = jsonObject6.get("wgzqjyxtcs");
        String replace052 = replace(wgzqjyxtcs).trim();
        // zqzjzhkhrq
        JsonElement zqzjzhkhrq = jsonObject6.get("zqzjzhkhrq");
        String replace053 = replace(zqzjzhkhrq).trim();
/*        // sfklzqzh
        JsonElement sfklzqzh1 = jsonObject6.get("sfklzqzh");
        String replace054 = replace(sfklzqzh).trim();*/
        // sfklqhjyzjzh
        JsonElement sfklqhjyzjzh = jsonObject6.get("sfklqhjyzjzh");
        String replace055 = replace(sfklqhjyzjzh).trim();
        // qhjyzjzhhm
        JsonElement qhjyzjzhhm = jsonObject6.get("qhjyzjzhhm");
        String replace056 = replace(qhjyzjzhhm).trim();
        // qhjyzjzhzh
        JsonElement qhjyzjzhzh = jsonObject6.get("qhjyzjzhzh");
        String replace057 = replace(qhjyzjzhzh).trim();
        // gzqhjybm_tj
        JsonElement gzqhjybm_tj = jsonObject6.get("gzqhjybm_tj");
        String replace058 = replace(gzqhjybm_tj).trim();
        // gzqhjybm_tqbz
        JsonElement gzqhjybm_tqbz = jsonObject6.get("gzqhjybm_tqbz");
        String replace059 = replace(gzqhjybm_tqbz).trim();
        // gzqhjybm_tl
        JsonElement gzqhjybm_tl = jsonObject6.get("gzqhjybm_tl");
        String replace060 = replace(gzqhjybm_tl).trim();
        // qhgsqc
        JsonElement qhgsqc = jsonObject6.get("qhgsqc");
        String replace061 = replace(qhgsqc).trim();
        // khyyb
        JsonElement khyyb = jsonObject6.get("khyyb");
        String replace062 = replace(khyyb).trim();
        // qhjyzhkhrq
        JsonElement qhjyzhkhrq = jsonObject6.get("qhjyzhkhrq");
        String replace063 = replace(qhjyzhkhrq).trim();
        // sfklyxjjyzhzh
        JsonElement sfklyxjjyzhzh = jsonObject6.get("sfklyxjjyzhzh");
        String replace064 = replace(sfklyxjjyzhzh).trim();
        // zqzhhu_sqs
        JsonElement zqzhhu_sqs = jsonObject6.get("zqzhhu_sqs");
        String replace065 = replace(zqzhhu_sqs).trim();
        // zqzhzh_sqs
        JsonElement zqzhzh_sqs = jsonObject6.get("zqzhzh_sqs");
        String replace066 = replace(zqzhzh_sqs).trim();
        // sfdvpjs_sqs
        JsonElement sfdvpjs_sqs = jsonObject6.get("sfdvpjs_sqs");
        String replace067 = replace(sfdvpjs_sqs).trim();
        // yhjzqzhkhrq_sqs
        JsonElement yhjzqzhkhrq_sqs = jsonObject6.get("yhjzqzhkhrq_sqs");
        String replace068 = replace(yhjzqzhkhrq_sqs).trim();
        // zqzhhu_zzd
        JsonElement zqzhhu_zzd = jsonObject6.get("zqzhhu_zzd");
        String replace069 = replace(zqzhhu_zzd).trim();
        // zqzhzh_zzd
        JsonElement zqzhzh_zzd = jsonObject6.get("zqzhzh_zzd");
        String replace070 = replace(zqzhzh_zzd).trim();
        // sfdvpjs_zzd
        JsonElement sfdvpjs_zzd = jsonObject6.get("sfdvpjs_zzd");
        String replace071 = replace(sfdvpjs_zzd).trim();
        // yhjzqzhkhrq_zzd
        JsonElement yhjzqzhkhrq_zzd = jsonObject6.get("yhjzqzhkhrq_zzd");
        String replace072 = replace(yhjzqzhkhrq_zzd).trim();

        String uuid4 = UUID.randomUUID().toString().replaceAll("-", "");

        String sql4 = "insert into BIONE_SECURITY_TYPE_HIS(pro_id,id,sfklzqzh,zqzjzhzh,zqgsmc,zqgskhyyb,zqjyxtlx,wgzqjyxtcs,zqzjzhkhrq,sfklqhjyzjzh,qhjyzjzhhm,qhjyzjzhzh,gzqhjybm_tj,gzqhjybm_tqbz,gzqhjybm_tl,qhgsqc,khyyb,qhjyzhkhrq,sfklyxjjyzhzh,zqzhhu_sqs,zqzhzh_sqs,sfdvpjs_sqs,yhjzqzhkhrq_sqs,zqzhhu_zzd,zqzhzh_zzd,sfdvpjs_zzd,yhjzqzhkhrq_zzd) " + "values("
        		+ "'"+uuid+"','"  
                + uuid4 + "','" + replace047 + "','" + replace048 + "','" + replace049 + "','" + replace050 + "','" + replace051 + "','" + replace052
                + "','" + replace053 + "','" + replace055 + "','" + replace056 + "','" + replace057
                + "','" + replace058 + "','" + replace059 + "','" + replace060 + "'" + ",'" + replace061 + "','" + replace062
                + "','" + replace063 + "','" + replace064 + "','" + replace065 + "','" + replace066 + "','" + replace067
                + "'" + ",'" + replace068 + "','" + replace069 + "','" + replace070 + "','" + replace071 + "','" + replace072
                + "');";
        System.out.println(sql4);
        bw.write(sql4 + "\r\n");
        }
        bw.close();
    }

    public static String replace(JsonElement value) {
        String replace = value.toString().replace("\\", "").replace("\"", "");
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