package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * 
 * @author admin
 *
 */
public class JsonToSQL {
	private static final String PATH = "C:\\Users\\admin\\Desktop\\json";

	public static void main(String[] args) throws Exception {
		File file = new File(PATH);
		File[] tempList = file.listFiles();
		System.out.println("该目录下对象个数：" + tempList.length);
		for (int i = 0; i < tempList.length; i++) {
			if (tempList[i].isFile()) {
				String readToString = readToString(tempList[i].toString());
				String json = readToString.substring(33, readToString.length());
				jsonToExcel(json);
			}
		}
	}

	private static void jsonToExcel(String value) throws Exception {
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObject = (JsonObject) jsonParser.parse(value);
		JsonElement features = jsonObject.get("projectList");
		JsonElement jsonElement = features.getAsJsonArray().get(0);
		JsonObject jsonObject1 = (JsonObject) jsonParser.parse(jsonElement.toString());
		JsonElement jsonElement2 = jsonObject1.get("preregist");
		JsonObject jsonObject2 = (JsonObject) jsonParser.parse(jsonElement2.toString()).getAsJsonObject();
		// xtjgmc
		JsonElement xtjgmc = jsonObject2.get("xtjgmc");
		String replace = replace(xtjgmc);
		String sql = "insert into table(id) values(" + replace + ");";
		System.out.println(sql);
	}

	public static String replace(JsonElement value) {
		String replace = value.toString().replace("\"", "");
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