import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	public static String getPastDate(int pastDay, String formatter) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - pastDay + 1);
        Date today = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatter);
        String result = simpleDateFormat.format(today);
        return result;
    }
	
	public static String getOneHoursAgoTime(String formatter) {

        String oneHoursAgoTime = "";
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) - 1);// 把时间设置为当前时间-1小时，同理，也可以设置其他时间
        oneHoursAgoTime = new SimpleDateFormat(formatter).format(cal.getTime());// 获取到完整的时间

        return oneHoursAgoTime;
    }
	
	public static String getDateFormat(Date date, String formatStr) {
		return new SimpleDateFormat(formatStr).format(date);
    }

	public static void main(String[] args) {
		
		System.out.println(Test.getPastDate(2,"yyyyMMdd"));
		
		List<String> list1 =new ArrayList<String>();
		list1.add("A");
		list1.add("B");

		List<String> list2 =new ArrayList<String>();
		list2.add("B");
		list2.add("C");
		
		list1.removeAll(list2);
		Iterator<String> it=list1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(System.currentTimeMillis());
		Date nowDate = new Date();
		String timeFormat = "yyyy-MM-dd-HH";
        String hourFormat = "HH";
        String nowDateHour = Test.getDateFormat(nowDate,timeFormat);
        String nowHour = Test.getDateFormat(nowDate,hourFormat);
        System.out.println("nowDateHour = " + nowDateHour);
        System.out.println("nowHour = " + nowHour);
        
        Calendar cale = null;
        cale = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String firstday, lastday;
        // 获取前月的第一天
        cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        firstday = format.format(cale.getTime());
        System.out.println("the first day = " + firstday);
        
        List<String> products = null;
        if (products.isEmpty()) {
        	System.out.println("111");
        }
        
	}

}
