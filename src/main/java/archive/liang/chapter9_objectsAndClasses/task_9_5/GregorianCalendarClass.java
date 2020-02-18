package archive.liang.chapter9_objectsAndClasses.task_9_5;

import java.util.GregorianCalendar;

/**
 * (Use the GregorianCalendar class) Java API has the GregorianCalendar class
 * in the java.util package, which you can use to obtain the year, month, and day of a
 * date. The no-arg constructor constructs an instance for the current date, and the methods
 * get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
 * and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.
 * Write a program to perform two tasks:
 * ■ Display the current year, month, and day.
 * ■ The GregorianCalendar class has the setTimeInMillis(long), which
 * can be used to set a specified elapsed time since January 1, 1970. Set the value
 * to 1234567898765L and display the year, month, and day.
 */

class GregorianCalendarClass {
    static String getCurrentDate() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        return getDateString(gregorianCalendar);
    }

    static String getDateBasedOnTimeInMillis(long timeInMillis) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(timeInMillis);

        return getDateString(gregorianCalendar);
    }

    private static String getDateString(GregorianCalendar gregorianCalendar){
        int currentYear = gregorianCalendar.get(GregorianCalendar.YEAR);
        int currentMonth = gregorianCalendar.get(GregorianCalendar.MONTH);
        int currentDay = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        return String.format("%s-%s-%s", currentYear, currentMonth, currentDay);
    }
}
