package liang.chapter9_objectsAndClasses.task_9_3;

/**
 * *9.3 (Use the Date class) Write a program that creates a Date object, sets its elapsed
 * time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
 * 10000000000, and 100000000000, and displays the date and time using the
 * toString() method, respectively.
 */



@SuppressWarnings("WeakerAccess")
public class Date {

    static String getDateAndTime (Long milliseconds){
        java.util.Date date = new java.util.Date(milliseconds);
        return date.toString();
    }
}
