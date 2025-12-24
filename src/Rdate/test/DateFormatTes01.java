package Rdate.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTes01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] df = new DateFormat[2];
        df[0] = DateFormat.getInstance();
        System.out.println(df[0].format(c.getTime()));
    }
}
