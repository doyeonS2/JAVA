package 정적멤버와메소드;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public final static String DomainName = "http:://192.168.0.14/index";
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdt = new SimpleDateFormat(fmt);
        return sdt.format(new Date());
    }
}
