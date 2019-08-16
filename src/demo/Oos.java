package demo;

import com.hundsun.security.signature.MessageProcessor;

public class Oos {

	public static void main(String[] args) throws Exception {
		String string="{\"timestamp\":\"20190724102535\",\"projectList\":[{\"trustContract\":[{\"htcszfe\":\"3333333\",\"htcszje\":\"3\",\"htjz\":\"0\",\"lxxq_syr\":\"M01\",\"lxxq_wtr\":\"M00\",\"qksm\":\"333\",\"syqcsfe\":\"3\",\"syqcsje\":\"33\",\"syqdm\":\"333\",\"syqjhdqr\":\"2011/12/12\",\"syqqsr\":\"2010/12/13\",\"syrlx\":\"0\",\"syrmc\":\"34\",\"syrxh\":\"333\",\"syryxlhbs\":\"1\",\"syrzjhm\":\"3\",\"syrzjlx\":\"00\",\"wtcccclx\":\"0\",\"wtccdyje\":\"3\",\"wtrlx\":\"2\",\"wtrqc\":\"34\",\"wtrzjhm\":\"33333333\",\"wtrzjlx\":\"01\",\"xtccxz\":\"1\",\"xthtbh\":\"333\",\"zytabs\":\"0\"}],\"projectFactor\":{\"ccglyyfs\":\"b\",\"cpjhdqr\":\"2020/02/27\",\"cpqc\":\"五矿信托-启信2号单一资金信托\",\"csmjfe\":\"3\",\"csmjje\":\"3\",\"djcpbh\":\"ZXD32W201907001000670\",\"djlx\":\"1\",\"dyjhbz\":\"1\",\"fggjglry\":\"佟京晶\",\"fxczcsbhbcsm\":\"无\",\"fxhscs\":\"a,b,c,d\",\"fxxmbs\":\"0\",\"gljybs\":\"0\",\"glmxt\":\"33333333\",\"grjgbs\":\"0\",\"gscpbh\":\"P2019M11A-QX02-001\",\"htydbcsm\":\"信托报酬为0.345%。\",\"jggs\":\"0\",\"jghbs\":\"0\",\"jghyxlhbl\":\"33333\",\"jntgjg\":\"3\",\"jzpgpd\":\"9\",\"jzplpd\":\"7\",\"kffbbs\":\"0\",\"ktqshbs\":\"0\",\"lxdh\":\"010-59837912\",\"qsbgplbs\":\"0\",\"sfgdqxcp\":\"0\",\"sfxtzcp\":\"0\",\"shdxzxtj\":\"无\",\"stzz\":\"0\",\"syfssm\":\"333\",\"syllx\":\"0\",\"tjfs\":\"1\",\"tjmj\":\"0\",\"totbs\":\"2\",\"tsyw\":\"8\",\"tzgwbs\":\"0\",\"xdzcjsyq\":\"0\",\"xmtjf\":\"1\",\"xtbc\":\"0\",\"xtbcl\":\"0.0\",\"xtbclx\":\"0\",\"xtccxz\":\"0\",\"xtcpsjclrq\":\"2019/02/27\",\"xtcpssbm\":\"宋泓霖团队\",\"xtgn\":\"1\",\"xtjgmc\":\"32W\",\"xtjlxm\":\"宋泓霖\",\"xtsyfs\":\"0\",\"ydtjbs\":\"0\",\"ywxism\":\"3\",\"yxfs\":\"1\",\"zcglbgpd\":\"0\",\"zczqhbs\":\"0\",\"zdyqsyl\":\"0.079\",\"zgyqsyl\":\"0.079\",\"zjcbs\":\"0\",\"zjjsbz\":\"CNY\",\"zytxhy_ctq\":\"21\",\"zyyyly_ctq\":\"6\"},\"stockAccount\":[{\"sfklqhjyzjzh\":\"0\",\"sfklyxjjyzhzh\":\"0\",\"sfklzqzh\":\"0\"}],\"bankAccount\":[{\"bz\":\"CNY\",\"khrq\":\"2019/02/22\",\"yxzhhm\":\"五矿国际信托有限公司\",\"yxzhkhxqc\":\"中国建设银行股份有限公司杭州西湖支行\",\"yxzhkhyxzxqc\":\"中国建设银行股份有限公司杭州西湖支行\",\"yxzhlx\":\"1\",\"yxzhzh\":\"33050161963509999902\"},{\"bz\":\"CNY\",\"khrq\":\"2019/01/17\",\"yxzhhm\":\"五矿国际信托有限公司\",\"yxzhkhxqc\":\"浙江网商银行股份有限公司\",\"yxzhkhyxzxqc\":\"浙江网商银行股份有限公司\",\"yxzhlx\":\"1\",\"yxzhzh\":\"8888886100278920\"}]}],\"merid\":\"32W\",\"serialid\":\"20190724102510001162\",\"version\":\"2.0.0\",\"function\":\"0002\"}" + 
				"";
		String header = "001";
		String result = MessageProcessor.INSTANCE.assembleMsg(header, string);
		System.out.println(result);
	}
}
