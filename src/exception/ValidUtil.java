package exception;

import org.apache.commons.lang.StringUtils;

public class ValidUtil {

	/** 用户姓名正则表达式 */
	private static final String USERNAME_PATTERN = "^[a-zA-Z]{3,40}$";

	/** 手机号码校验：08开头，10-13位的数字 */
	private static final String MOBILE_PATTERN = "^08[\\d]{8,11}$";

	/** 银行卡正则表达式：10-16位的数字 */
	private static final String BANKCARD_PATTERN = "^[\\d]{10,16}$";

	/** 身份证号正则表达式:16位数字 */
	private static final String IDCARD_PATTERN = "^[\\d]{16}$";

	/**
	 * 用户姓名规则校验
	 *
	 * @param userName
	 * @return
	 */
	public static boolean validUserName(String userName) {
		boolean flag = false;
		if (StringUtils.isBlank(userName)) {
			return false;
		}
		userName = userName.replaceAll(" ", "").replaceAll("\\.", "");
		// 1.印尼人的姓名只包括字母,3个字母以上，最多40个字母
		if (userName.matches(USERNAME_PATTERN)) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 印尼手机号规则校验
	 *
	 * @param mobile
	 * @return
	 */
	public static boolean validMobile(String mobile) {
		boolean flag = false;
		// 1.手机号不能多于13个，也不能小于10个, 必须是08开头
		if (StringUtils.isNotBlank(mobile) && mobile.matches(MOBILE_PATTERN)) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 银行卡号规则校验
	 *
	 * @param bankCard
	 * @return
	 */
	public static boolean validBankCard(String bankCard) {
		boolean flag = false;
		// 1.只有数字，不包含字母，10到16位
		if (StringUtils.isNotBlank(bankCard) && bankCard.matches(BANKCARD_PATTERN)) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 身份证号规则校验
	 * 
	 * @param idCard
	 * @return
	 */
	public static boolean validIdCard(String idCard) {
		boolean flag = false;
		// 1.身份证号唯独16位数字
		if (StringUtils.isNotBlank(idCard) && idCard.matches(IDCARD_PATTERN)) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		String userName = " Dainty.susanto ";
		System.out.println(ValidUtil.validUserName(userName));

		String bankCard = "1790020851";
		System.out.println(ValidUtil.validBankCard(bankCard));

		String mobile = "081317873989";
		System.out.println(ValidUtil.validMobile(mobile));

		String idCard = "3173044612910003";
		System.out.println(ValidUtil.validIdCard(idCard));

	}

}
