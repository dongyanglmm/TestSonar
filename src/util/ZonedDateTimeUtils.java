package util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class ZonedDateTimeUtils {
	
	//印尼时区
    public static final ZoneId GLOBLE_ZONEID = ZoneId.of("UTC+7");
    public static final String GLOBLE_ZONEID_STR = "+07:00";//反序列化使用

    public static final String FORMAT_STR_MONTH = "yyyy-MM";
    public static final String FORMAT_STR_DATE = "yyyy-MM-dd";
    public static final String FORMAT_STR_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_STR_MONTH_SIMPLE = "yyyyMM";
    public static final String FORMAT_STR_DATE_SIMPLE = "yyyyMMdd";
    public static final String FORMAT_STR_DATE_TIME_SIMPLE = "yyyyMMddHHmmss";

    /**
     * 获取当天0点的时间戳(时区为GLOBLE_ZONEID)
     */
    public static long getTodayStartTimeStampOfLong() {
        return  ZonedDateTime.now(GLOBLE_ZONEID).withHour(0).withMinute(0).withSecond(0).withNano(0).toInstant().toEpochMilli();
    }

    /**
     * 获取次日0点的时间戳(时区为GLOBLE_ZONEID)
     */
    public static long getTomorrowStartTimeStampOfLong() {
        return  ZonedDateTime.now(GLOBLE_ZONEID).withHour(0).withMinute(0).withSecond(0).withNano(0).plusDays(1).toInstant().toEpochMilli();
    }

    /**
     * 获取当天23点59分59秒的时间戳(时区为GLOBLE_ZONEID)
     */
    public static long getTodayEndTimeStampOfLong() {
        return  ZonedDateTime.now(GLOBLE_ZONEID).withHour(23).withMinute(59).withSecond(59).withNano(0).toInstant().toEpochMilli();
    }

    /**
     * 获取当前时间时间戳
     */
    public static long getCurrentTimeStampOfLong() {
        return Instant.now().toEpochMilli();
    }

    /**
     * 获取当前时间的ZonedDateTime对象(时区为GLOBLE_ZONEID)
     */
    public static ZonedDateTime getCurrentZonedDateTime() {
        return ZonedDateTime.now(GLOBLE_ZONEID);
    }

    /**
     * 格式化时间（时区和ZonedDateTime有关）
     */
    public static String formatTimeByFormatStr(ZonedDateTime input, String formatStr) {
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(formatStr);
        return dtf2.format(input);
    }

    /**
     * ***反序列化时间 --- 入参全部要求传时间戳  不允许传字符串***
     * //yyyy-MM-dd HH:mm:ss (时区为GLOBLE_ZONEID)
     */
    public static ZonedDateTime parseTimeByFormatStr(String timeStr, String formatStr) {
        DateTimeFormatterBuilder dfb = new DateTimeFormatterBuilder();
        DateTimeFormatter dtf2 = dfb.appendPattern(formatStr).appendOffsetId().toFormatter();
        return dtf2.parse(timeStr + GLOBLE_ZONEID_STR, ZonedDateTime::from);
    }

    /**
     * 毫秒数转ZonedDateTime(时区为GLOBLE_ZONEID)
     */
    public static ZonedDateTime parseZonedDateTimeByMillSecond(Long millTimeStamp) {
        Instant instant = Instant.ofEpochMilli(millTimeStamp);
        ZonedDateTime date = ZonedDateTime.ofInstant(instant, GLOBLE_ZONEID);
        return date;
    }

    /**
     * ZonedDateTime转毫秒数(时间戳)(时区为GLOBLE_ZONEID)
     */
    public static Long parseMillSecondByZonedDateTime(ZonedDateTime zonedDateTime) {
        return zonedDateTime.toInstant().toEpochMilli();
    }


    //////////************************以上为基础方法，以下为封装的方法*********************************////////


    /**
     * 将时间戳转成具体格式的时间(时区为GLOBLE_ZONEID)
     * @param millTimeStamp
     * @param formatStr
     * @return
     */
    public static String parseByMillSecond(Long millTimeStamp, String formatStr) {
        Instant instant = Instant.ofEpochMilli(millTimeStamp);
        ZonedDateTime date = ZonedDateTime.ofInstant(instant, GLOBLE_ZONEID);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(formatStr);
        return dtf2.format(date);
    }

}
