package ch02.projects;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarClass {
    public static void main(String[] args) {

        GregorianCalendar dragonsBirthday = new GregorianCalendar(1968, Calendar.JUNE, 17);

        // This is a terrible way of printing this out, but I can't be bothered
        System.out.println(dragonsBirthday.get(Calendar.DAY_OF_MONTH) + ", " + dragonsBirthday.get(Calendar.MONTH) + ", " + dragonsBirthday.get(Calendar.YEAR));

        // Print 100 days from dragonsBirthday
        GregorianCalendar cal = new GregorianCalendar(1968, Calendar.JUNE, 17);
        cal.add(Calendar.DAY_OF_YEAR, 100);
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // Outputs 269

        // Print 10000 days from dragonsBirthday
        cal.add(Calendar.DAY_OF_YEAR, 10000);
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // Outputs 42

    }
}
