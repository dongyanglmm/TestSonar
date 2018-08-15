package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
	
	public static Date addAndSubtractDays(Date dateTime ,int n){
        //注意这里一定要转换成Long类型，要不n超过25时会出现范围溢出，从而得不到想要的日期值
        return new Date(dateTime.getTime() + n * 24 * 60 * 60 * 1000L);
    }
	
	public static String formatToStrDateSimple(Date date) {
        if(null == date) {
            return "";
        }
        SimpleDateFormat st = new SimpleDateFormat("yyyyMMdd");
        return st.format(date);
    }

	public static void main(String[] args) {
		String dateStr = TimeUtil.formatToStrDateSimple(TimeUtil.addAndSubtractDays(new Date(), -2));
		System.out.println("dataStr = " + dateStr);
	}

}
