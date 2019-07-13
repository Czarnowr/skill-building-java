package liang.chapter9_objectsAndClasses.task_9_3;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class DateClassTest {

    @Test
    public void DateClass_createDateFromMilliseconds10000_correctDate (){
        //Arrange
        Long milliseconds = 10000L;

        //Act
        String date = DateClass.getDateAndTime(milliseconds);

        //Assert
        //Data from an external provider for comparison
        Assert.assertThat(date, containsString("Thu Jan 01"));
        Assert.assertThat(date, containsString("1970"));
        Assert.assertThat(date, containsString("01:00:10"));
        Assert.assertThat(date, containsString("CET"));
    }

    @Test
    public void DateClass_createDateFromMilliseconds100000_correctDate (){
        //Arrange
        Long milliseconds = 100000L;

        //Act
        String date = DateClass.getDateAndTime(milliseconds);

        //Assert
        //Data from an external provider for comparison
        Assert.assertThat(date, containsString("Thu Jan 01"));
        Assert.assertThat(date, containsString("1970"));
        Assert.assertThat(date, containsString("01:01:40"));
        Assert.assertThat(date, containsString("CET"));
    }

    @Test
    public void DateClass_createDateFromMilliseconds1000000_correctDate (){
        //Arrange
        Long milliseconds = 1000000L;

        //Act
        String date = DateClass.getDateAndTime(milliseconds);

        //Assert
        //Data from an external provider for comparison
        Assert.assertThat(date, containsString("Thu Jan 01"));
        Assert.assertThat(date, containsString("1970"));
        Assert.assertThat(date, containsString("01:16:40"));
        Assert.assertThat(date, containsString("CET"));
    }

    @Test
    public void DateClass_createDateFromMilliseconds10000000_correctDate (){
        //Arrange
        Long milliseconds = 10000000L;

        //Act
        String date = DateClass.getDateAndTime(milliseconds);

        //Assert
        //Data from an external provider for comparison
        Assert.assertThat(date, containsString("Thu Jan 01"));
        Assert.assertThat(date, containsString("1970"));
        Assert.assertThat(date, containsString("03:46:40"));
        Assert.assertThat(date, containsString("CET"));
    }

    @Test
    public void DateClass_createDateFromMilliseconds100000000_correctDate (){
        //Arrange
        Long milliseconds = 100000000L;

        //Act
        String date = DateClass.getDateAndTime(milliseconds);

        //Assert
        //Data from an external provider for comparison
        Assert.assertThat(date, containsString("Fri Jan 02"));
        Assert.assertThat(date, containsString("1970"));
        Assert.assertThat(date, containsString("04:46:40"));
        Assert.assertThat(date, containsString("CET"));
    }

    @Test
    public void DateClass_createDateFromMilliseconds1000000000_correctDate (){
        //Arrange
        Long milliseconds = 1000000000L;

        //Act
        String date = DateClass.getDateAndTime(milliseconds);

        //Assert
        //Data from an external provider for comparison
        Assert.assertThat(date, containsString("Mon Jan 12"));
        Assert.assertThat(date, containsString("1970"));
        Assert.assertThat(date, containsString("14:46:40"));
        Assert.assertThat(date, containsString("CET"));
    }

    @Test
    public void DateClass_createDateFromMilliseconds10000000000_correctDate (){
        //Arrange
        Long milliseconds = 10000000000L;

        //Act
        String date = DateClass.getDateAndTime(milliseconds);

        //Assert
        //Data from an external provider for comparison
        Assert.assertThat(date, containsString("Sun Apr 26"));
        Assert.assertThat(date, containsString("1970"));
        Assert.assertThat(date, containsString("18:46:40"));
        Assert.assertThat(date, containsString("CET"));
    }

    @Test
    public void DateClass_createDateFromMilliseconds100000000000_correctDate (){
        //Arrange
        Long milliseconds = 100000000000L;

        //Act
        String date = DateClass.getDateAndTime(milliseconds);

        //Assert
        //Data from an external provider for comparison
        Assert.assertThat(date, containsString("Sat Mar 03"));
        Assert.assertThat(date, containsString("1973"));
        Assert.assertThat(date, containsString("10:46:40"));
        Assert.assertThat(date, containsString("CET"));
    }
}