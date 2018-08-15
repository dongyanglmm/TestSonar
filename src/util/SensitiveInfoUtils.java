package util;

import org.apache.commons.lang.StringUtils;

public class SensitiveInfoUtils {
	
	
	/**
     * 手机号码脱敏 只保留前3后4，例187****8966
     *
     * @param mobile
     * @return
     */
    public static String mobileDesensitizate(String mobile) {
        if (StringUtils.isBlank(mobile)) {
            return "";
        }
        return StringUtils.left(mobile, 3).concat(StringUtils.removeStart(StringUtils.leftPad(StringUtils.right(mobile, 4), StringUtils.length(mobile), "*"), "***"));
    }

    /**
     * 固定电话脱敏，只保留后4位，例 ****1730
     * @param fixPhome
     * @return
     */
    public static String fixPhoneDesensitizate(String fixPhome) {
        if (StringUtils.isBlank(fixPhome)) {
           return "";
        }
        return StringUtils.leftPad(StringUtils.right(fixPhome, 4), StringUtils.length(fixPhome), "*");
    }

    /**
     * 姓名脱敏，只保留姓：例董*
     * @param fullName
     * @return
     */
    public static String chineseName(String fullName) {
        if (StringUtils.isBlank(fullName)) {
            return "";
        }
        String name = StringUtils.left(fullName, 1);
        return StringUtils.rightPad(name, StringUtils.length(fullName), "*");
    }
    
    public static String idCardNumDesensitive(String idCardNum) {
        if (StringUtils.isBlank(idCardNum)) {
            return "";
        }
        String num = StringUtils.right(idCardNum, 4);
        return StringUtils.leftPad(num, StringUtils.length(idCardNum), "*");
    }
    
    public static String bankCardDesensitive(String bankCard) {
        if (StringUtils.isBlank(bankCard)) {
            return "";
        }
        return StringUtils.left(bankCard, 4).concat(StringUtils.removeStart(StringUtils.leftPad(StringUtils.right(bankCard, 4), StringUtils.length(bankCard), "*"), "******"));
    }
    
    /**手机号码校验：09、08开头，10位的数字 01开头，11位的数字*/
    private static final String MOBILE_PATTERN = "^(08|09)[\\d]{8}$|^(01)[\\d]{9}$";

//    /**手机号码校验：01开头，11位的数字*/
//    private static final String MOBILE_PATTERN_2 = "^(01)[\\d]{9}$";
    
    public static boolean validMobile(String mobile) {
        boolean flag = false;
        //1.09、08开头，10位数字 01开头，11位数字
        if (StringUtils.isNotBlank(mobile) && mobile.matches(MOBILE_PATTERN)) {
            flag = true;
        }
        return flag;
    }
    
    /**身份证号正则表达式:9或者12位数字*/
    private static final String IDCARD_PATTERN = "^\\d{9}$|^\\d{12}$";
    
    public static boolean validIdCard(String idCard) {
        boolean flag = false;
        //1.身份证号唯独16位数字
        if (StringUtils.isNotBlank(idCard) && idCard.matches(IDCARD_PATTERN)) {
            flag = true;
        }
        return flag;
    }
    
    /**银行卡正则表达式:16或者19位数字*/
    private static final String BANKCARD_PATTERN = "^\\d{16}$|^\\d{19}$";
    
    public static boolean validBankCard(String bankCard) {
        boolean flag = false;
        //1.只有数字，16或者19位数字
        if (StringUtils.isNotBlank(bankCard) && bankCard.matches(BANKCARD_PATTERN)) {
            flag = true;
        }
        return flag;
    }

	public static void main(String[] args) {
		
		System.out.println(validMobile("0911111111"));
		System.out.println(validIdCard("123456789"));
		System.out.println(validBankCard("1234567890000000000"));
		
//		System.out.println(mobileDesensitizate("18795968966"));
//		System.out.println(fixPhoneDesensitizate("88511730"));
//		System.out.println(chineseName("董阳"));
//		System.out.println(idCardNumDesensitive("320723199112042810"));
//		System.out.println(bankCardDesensitive("6214850212343667"));
		
		int m = 10 % 3;
		System.out.println(m);
	}

}
