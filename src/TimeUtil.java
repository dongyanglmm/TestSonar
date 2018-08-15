
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {

	public static String getPastDate(int pastDay) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - pastDay + 1);
		Date today = calendar.getTime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String result = simpleDateFormat.format(today);
		return result;
	}

	public static String getOneHoursAgoTime(String formatter) {
		String oneHoursAgoTime = "";
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) - 1);// 把时间设置为当前时间-1小时，同理，也可以设置其他时间
		//cal.set(Calendar.MONTH, Calendar.MONTH - 1); // 当前月前一月

		oneHoursAgoTime = new SimpleDateFormat(formatter).format(cal.getTime());// 获取到完整的时间

		return oneHoursAgoTime;
	}

	public static void main(String[] args) {
		System.out.println(TimeUtil.getPastDate(7));
		System.out.println(TimeUtil.getOneHoursAgoTime("HH"));
		
	}

}
