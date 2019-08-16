package demo;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;

public class poiWord {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap();
        map.put("number","月报");
        map.put("pdf","2018-5-28");
        map.put("json","岁的法国大使馆的风格");
        getBuild("static/doc/ar_template.doc",map,"C:\\Users\\admin\\Desktop\\S上传文件\\doc.docx");
    }

    public static void getBuild(String  tmpFile, Map<String, String> contentMap, String exportFile){

        InputStream inputStream = poiWord.class.getClassLoader().getResourceAsStream(tmpFile);
//        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(tmpFile);
        HWPFDocument document = null;
        try {
            document = new HWPFDocument(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 读取文本内容
        Range bodyRange = document.getRange();
        // 替换内容
        for (Map.Entry<String, String> entry : contentMap.entrySet()) {
            bodyRange.replaceText("${" + entry.getKey() + "}", entry.getValue());
        }

        //导出到文件
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            document.write(byteArrayOutputStream);
            OutputStream outputStream = new FileOutputStream(exportFile);
            outputStream.write(byteArrayOutputStream.toByteArray());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
