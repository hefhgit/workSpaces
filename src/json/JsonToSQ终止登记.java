package json;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.util.UUID;

public class JsonToSQ终止登记 {
	 private static final String PATH = "C:\\Users\\admin\\Desktop\\newJson\\3.终止";

    public static void main(String[] args) throws Exception {
        File file = new File(PATH);
        File[] tempList = file.listFiles();
        System.out.println("该目录下对象个数：" + tempList.length);
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                System.out.println(i+"-----------"+tempList[i].toString());
                String readToString = readToString(tempList[i].toString());
                String json = readToString.substring(33, readToString.length());
                jsonToExcel(json);
            }
        }
    }
    private static void jsonToExcel(String value) throws Exception {

        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\admin\\Desktop\\newJson\\jsonZzdj.sql",true));
        //终止登记

        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject) jsonParser.parse(value);//{....}
        JsonElement features = jsonObject.get("projectList");//[{....}]
        JsonElement jsonElement = features.getAsJsonArray().get(0);//{...}
        JsonObject jsonObject1 = (JsonObject) jsonParser.parse(jsonElement.toString());//toString
        JsonElement jsonElement2 = jsonObject1.get("fundEnd");
        JsonObject jsonObject2 = (JsonObject) jsonParser.parse(jsonElement2.toString()).getAsJsonObject();


        // xtjgmc
        JsonElement xtjgmc = jsonObject2.get("xtjgmc");
        String replace = replace(xtjgmc);
        // djcpbh
        JsonElement djcpbh = jsonObject2.get("djcpbh");
        String replace1 = replace(djcpbh).trim();
        // gscpbh
        JsonElement gscpbh = jsonObject2.get("gscpbh");
        String replace2 = replace(gscpbh).trim();
        // cpqc
        JsonElement cpqc = jsonObject2.get("cpqc");
        String replace3 = replace(cpqc).trim();
        // qsrq
        JsonElement qsrq = jsonObject2.get("qsrq");
        String replace4 = replace(qsrq).trim();
//		// sfaydrqqs
        JsonElement sfaydrqqs = jsonObject2.get("sfaydrqqs");
        String replace5 = replace(sfaydrqqs).trim();
        // ssxtje
        JsonElement ssxtje = jsonObject2.get("ssxtje");
        String replace6 = replace(ssxtje).trim();
        //xtbjljgfe
        JsonElement xtbjljgfe = jsonObject2.get("xtbjljgfe");
        String replace7 = replace(xtbjljgfe).trim();
        //ccqxtcfzr


        //xtsyljfpe
        JsonElement xtsyljfpe = jsonObject2.get("xtsyljfpe");
        String replace8 = replace(xtsyljfpe).trim();
        //tgljgdbc
        JsonElement tgljgdbc = jsonObject2.get("tgljgdbc");
        String replace9 = replace(tgljgdbc).trim();
        //tgljyjbc
        JsonElement tgljyjbc = jsonObject2.get("tgljyjbc");
        String replace10 = replace(tgljyjbc).trim();
        //strljgdbc
        JsonElement strljgdbc = jsonObject2.get("strljgdbc");
        String replace11 = replace(strljgdbc).trim();
        //strljyjbc
        JsonElement strljyjbc = jsonObject2.get("strljyjbc");
        String replace12 = replace(strljyjbc).trim();
        //sjxtbcl
        JsonElement sjxtbcl = jsonObject2.get("sjxtbcl");
        String replace13 = replace(sjxtbcl).trim();
        //xtfyze
        JsonElement xtfyze = jsonObject2.get("xtfyze");
        String replace14 = replace(xtfyze).trim();
        //xtfyl
        JsonElement xtfyl = jsonObject2.get("xtfyl");
        String replace15 = replace(xtfyl).trim();
        //xtbgfl
        JsonElement xtbgfl = jsonObject2.get("xtbgfl");
        String replace16 = replace(xtbgfl).trim();
        //sjsy
        JsonElement sjsy = jsonObject2.get("sjsy");
        String replace17= replace(sjsy).trim();

        //sjsyl
        JsonElement sjsyl = jsonObject2.get("sjsyl");
        String replace18= replace(sjsyl).trim();

        //sshje
        JsonElement sshje = jsonObject2.get("sshje");
        String replace19 = replace(sshje).trim();
        //shsje
        JsonElement shsje = jsonObject2.get("shsje");
        String replace20 = replace(shsje).trim();
        //pfje
        JsonElement pfje = jsonObject2.get("pfje");
        String replace21 = replace(pfje).trim();
        //ywxxsm
        JsonElement ywxxsm = jsonObject2.get("ywxxsm");
        String replace22 = replace(ywxxsm).trim();


        String uuid1 = UUID.randomUUID().toString().replaceAll("-", "");
        String sql = "insert into bione_stop_reg_HIS(gscpbh,STOP_REG_ID,xtjgmc,djcpbh,cpqc,qsrq,sfaydrqqs,ssxtje,xtbjljgfe,xtsyljfpe,tgljgdbc,tgljyjbc,strljgdbc,strljyjbc,sjxtbcl,xtfyze,xtfyl,xtbgfl,sjsy,sjsyl,sshje,shsje,pfje,ywxxsm) "
                + "values('"+replace2+"','"
                + uuid1 +"','" + replace + "','"+replace1+"','"+replace3+"',to_date('"+replace4+"','YYYY/MM/DD'),'"+replace5+"','"+replace6+"'"
                + ",'"+replace7+"','"+replace8+"','"+replace9+"','"+replace10+"','"+replace11+"','"+replace12+"','"+replace13+"'"
                + ",'"+replace14+"','"+replace15+"','"+replace16+"','"+replace17+"','"+replace18+"','"+replace19+"','"+replace20+"'"
                + ",'"+replace21+"','"+replace22+"'"

                + ");";

        System.out.println(sql);
        bw.write(sql+"\r\n");

        //---
        JsonElement features1 = jsonObject2.get("preregist_factor_romotion");//[{....}]
//		JsonElement jsonElement1 = features1.getAsJsonArray().get(0);//{...}
//		JsonObject jsonObjectt1 = (JsonObject) jsonParser.parse(jsonElement1.toString());//toString
        /*
         * if(replace22!="") { JsonArray asJsonArray = features1.getAsJsonArray(); for
         * (int i = 0; i < asJsonArray.size(); i++) { JsonObject jsonObjectt1 =
         * (JsonObject) jsonParser.parse(asJsonArray.get(i).toString());//toString
         * //tjjg JsonElement tjjg = jsonObjectt1.get("tjjg"); String replace57 =
         * replace(tjjg).trim(); //tjfl JsonElement tjfl = jsonObjectt1.get("tjfl");
         * String replace58 = replace(tjfl).trim(); //tjq JsonElement tjq =
         * jsonObjectt1.get("tjq"); String replace59 = replace(tjq).trim(); //jhtjgm
         * JsonElement jhtjgm = jsonObjectt1.get("jhtjgm"); String replace60 =
         * replace(jhtjgm).trim(); //tjfshtjgl JsonElement tjfshtjgl =
         * jsonObjectt1.get("tjfshtjgl"); String replace61 = replace(tjfshtjgl).trim();
         * //tjfzrmc JsonElement tjfzrmc = jsonObjectt1.get("tjfzrmc"); String replace62
         * = replace(tjfzrmc).trim(); //tjfzrdh JsonElement tjfzrdh =
         * jsonObjectt1.get("tjfzrdh"); String replace63 = replace(tjfzrdh).trim();
         * String
         * sql1="insert into BIONE_PREREGIST_FACTOR_his(tjjg,tjfl,tjq,jhtjgm,tjfshtjgl,tjfzrmc,tjfzrdh) values("
         * + "'" + replace57 +
         * "','"+replace58+"','"+replace59+"','"+replace60+"','"+replace61+"','"+
         * replace62+"','"+replace63+"'" + ");"; System.out.println(sql1);
         * bw.write(sql1+"\r\n"); } }
         */
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
