package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {
    public static void oldMethods() {
        System.out.println(System.currentTimeMillis()); // milliseconds since 1970 (Long var)
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365); // current year

        Date d = new Date(); // current time
        System.out.println(d);
        System.out.println(new Date("1/1/1980"));
        System.out.println(d.getMonth());
    }

    public static void calendar() {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
    }
}
