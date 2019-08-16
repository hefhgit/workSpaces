package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class sysdate {

	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		System.out.println(sdf.format(new Date()));
	}
}
