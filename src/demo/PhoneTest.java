/**
 * 验证固定电话号码的合法性
 * @author jy
 */
package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneTest {

	public static boolean isPhone1(String str) {
		Pattern p1 = null, p2 = null;
		Matcher m = null;
		boolean isPhone = false;
		p1 = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证带区号的
		p2 = Pattern.compile("^[0][1-9]{2,3}-[0-9]{5,10}$"); // 验证没有区号的
		if (str.length() > 9) {
			m = p1.matcher(str);
			isPhone = m.matches();
		} else {
			m = p2.matcher(str);
			isPhone = m.matches();
		}
		return isPhone;
	}

	public static void main(String[] args) {

		String phone = "010-2629026";
		if (isPhone(phone)) {
			System.out.println(phone + "是符合的电话号码");
		} else {
			System.out.println(phone + "不符合");
		}
	}

	public static boolean isMobile2(final String str) {
		Pattern p = null;
		Matcher m = null;
		boolean b = false;
		p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
		m = p.matcher(str);
		b = m.matches();
		return b;
	}

	public static boolean isPhone(final String str) {
		Pattern p1 = null, p2 = null;
		Matcher m = null;
		boolean b = false;
		p1 = Pattern.compile("^[0][0-9]{1,3}-[0-9]{5,10}$"); // 验证带区号的
		p2 = Pattern.compile("^[1-9]{1}[0-9]{5,8}$"); // 验证没有区号的
		if (str.length() > 9) {
			m = p1.matcher(str);
			b = m.matches();
		} else {
			m = p2.matcher(str);
			b = m.matches();
		}
		return b;
	}
}