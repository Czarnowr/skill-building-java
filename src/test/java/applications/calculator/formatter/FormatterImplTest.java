package applications.calculator.formatter;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class FormatterImplTest {

    private Formatter formatter;

    @Before
    public void setup() {
        formatter = new FormatterImpl();
    }

    @Test
    public void replaceNegativeZeroWithZero_ShouldReturnZero_WhenNegativeZero() {
        //Arrange

        //Act
        double formattedNumber = formatter.replaceNegativeZeroWithZero(-0);

        //Assert
        Assertions.assertThat(formattedNumber).isEqualTo(0);
    }

    @Test
    public void replaceNegativeZeroWithZero_ShouldReturnZero_WhenPositiveZero() {
        //Arrange

        //Act
        double formattedNumber = formatter.replaceNegativeZeroWithZero(0);

        //Assert
        Assertions.assertThat(formattedNumber).isEqualTo(0);
    }

    @Test
    public void replaceNegativeZeroWithZero_ShouldReturnSameNumber_WhenPositiveNumber() {
        //Arrange

        //Act
        double formattedNumber1 = formatter.replaceNegativeZeroWithZero(1);
        double formattedNumber2 = formatter.replaceNegativeZeroWithZero(5);
        double formattedNumber3 = formatter.replaceNegativeZeroWithZero(10);
        double formattedNumber4 = formatter.replaceNegativeZeroWithZero(1.5);
        double formattedNumber5 = formatter.replaceNegativeZeroWithZero(1.23456789);

        //Assert
        Assertions.assertThat(formattedNumber1).isEqualTo(1);
        Assertions.assertThat(formattedNumber2).isEqualTo(5);
        Assertions.assertThat(formattedNumber3).isEqualTo(10);
        Assertions.assertThat(formattedNumber4).isEqualTo(1.5);
        Assertions.assertThat(formattedNumber5).isEqualTo(1.23456789);
    }

    @Test
    public void replaceNegativeZeroWithZero_ShouldReturnSameNumber_WhenNegativeNumber() {
        //Arrange

        //Act
        double formattedNumber1 = formatter.replaceNegativeZeroWithZero(-1);
        double formattedNumber2 = formatter.replaceNegativeZeroWithZero(-5);
        double formattedNumber3 = formatter.replaceNegativeZeroWithZero(-10);
        double formattedNumber4 = formatter.replaceNegativeZeroWithZero(-1.5);
        double formattedNumber5 = formatter.replaceNegativeZeroWithZero(-1.23456789);

        //Assert
        Assertions.assertThat(formattedNumber1).isEqualTo(-1);
        Assertions.assertThat(formattedNumber2).isEqualTo(-5);
        Assertions.assertThat(formattedNumber3).isEqualTo(-10);
        Assertions.assertThat(formattedNumber4).isEqualTo(-1.5);
        Assertions.assertThat(formattedNumber5).isEqualTo(-1.23456789);
    }
}