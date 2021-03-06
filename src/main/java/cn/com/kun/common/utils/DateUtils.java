package cn.com.kun.common.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {

    public static String PATTERN_ONE = "yyyy-MM-dd HH:mm:ss";
    public static String PATTERN_TWO = "yyyy-MM-dd HH:mm:ss.SSS";

    /**
     * 获取date对象
     * @param sourceStr 2021-06-01 14:07:02.100
     * @param pattern yyyy-MM-dd HH:mm:ss.SSS
     * @return
     */
    public static Date toDate(String sourceStr, String pattern){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.parse(sourceStr, dateTimeFormatter);
        Date date =
                Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        return date;
    }

    public static String now(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTimeFormatter.format(now);
    }

    public static String nowWithNoSymbol(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return dateTimeFormatter.format(now);
    }

    public static void main(String[] args) {
        System.out.println(toDate("2021-06-01 14:07:02.100", "yyyy-MM-dd HH:mm:ss.SSS"));
    }
}
