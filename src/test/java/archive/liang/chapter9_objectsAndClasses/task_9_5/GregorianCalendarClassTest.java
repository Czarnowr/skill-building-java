package archive.liang.chapter9_objectsAndClasses.task_9_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.Matchers.containsString;

public class GregorianCalendarClassTest {

    @Test
    public void GregorianCalendarClass_getCurrentDate_dateIsCorrect(){
        //Arrange
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        String currentDay = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        String currentMonth = String.valueOf(calendar.get(Calendar.MONTH));
        String currentYear = String.valueOf(calendar.get(Calendar.YEAR));

        //Act
        String date = GregorianCalendarClass.getCurrentDate();

        //Assert
        Assert.assertThat(date, containsString(currentDay));
        Assert.assertThat(date, containsString(currentMonth));
        Assert.assertThat(date, containsString(currentYear));
    }

    @Test
    public void GregorianCalendarClass_getDateForMillis1234567898765_dateIsCorrect(){
        //Arrange
        long timeInMillis = 1234567898765L;
        //Data from an external provider for comparison
        String expectedDate = "2009-1-14";

        //Act
        String date = GregorianCalendarClass.getDateBasedOnTimeInMillis(timeInMillis);

        //Assert
        Assert.assertThat(date, containsString(expectedDate));
    }
}