package applications.calculator.formatter;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

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

    @Test
    public void formatCorrectlyIfZero_ShouldReturnZero_WhenZeroWithTrailingZeros() {
        //Arrange

        //Act
        BigDecimal formattedNumber1 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(0.0000000));
        BigDecimal formattedNumber2 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(0E-15));

        //Assert
        Assertions.assertThat(formattedNumber1).isEqualTo(BigDecimal.valueOf(0));
        Assertions.assertThat(formattedNumber2).isEqualTo(BigDecimal.valueOf(0));
    }

    @Test
    public void formatCorrectlyIfZero_ShouldReturnZero_WhenNegativeZeroWithTrailingZeros() {
        //Arrange

        //Act
        BigDecimal formattedNumber1 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(-0.0000000));
        BigDecimal formattedNumber2 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(-0E-15));

        //Assert
        Assertions.assertThat(formattedNumber1).isEqualTo(BigDecimal.valueOf(0));
        Assertions.assertThat(formattedNumber2).isEqualTo(BigDecimal.valueOf(0));
    }

    @Test
    public void formatCorrectlyIfZero_ShouldReturnSameNumber_WhenPositiveNumber() {
        //Arrange

        //Act
        BigDecimal formattedNumber1 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(1));
        BigDecimal formattedNumber2 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(5));
        BigDecimal formattedNumber3 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(10));
        BigDecimal formattedNumber4 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(1.5));
        BigDecimal formattedNumber5 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(1.23456789));

        //Assert
        Assertions.assertThat(formattedNumber1).isEqualTo(BigDecimal.valueOf(1));
        Assertions.assertThat(formattedNumber2).isEqualTo(BigDecimal.valueOf(5));
        Assertions.assertThat(formattedNumber3).isEqualTo(BigDecimal.valueOf(10));
        Assertions.assertThat(formattedNumber4).isEqualTo(BigDecimal.valueOf(1.5));
        Assertions.assertThat(formattedNumber5).isEqualTo(BigDecimal.valueOf(1.23456789));
    }

    @Test
    public void formatCorrectlyIfZero_ShouldReturnSameNumber_WhenNegativeNumber() {
        //Arrange

        //Act
        BigDecimal formattedNumber1 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(-1));
        BigDecimal formattedNumber2 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(-5));
        BigDecimal formattedNumber3 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(-10));
        BigDecimal formattedNumber4 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(-1.5));
        BigDecimal formattedNumber5 = formatter.formatCorrectlyIfZero(BigDecimal.valueOf(-1.23456789));

        //Assert
        Assertions.assertThat(formattedNumber1).isEqualTo(BigDecimal.valueOf(-1));
        Assertions.assertThat(formattedNumber2).isEqualTo(BigDecimal.valueOf(-5));
        Assertions.assertThat(formattedNumber3).isEqualTo(BigDecimal.valueOf(-10));
        Assertions.assertThat(formattedNumber4).isEqualTo(BigDecimal.valueOf(-1.5));
        Assertions.assertThat(formattedNumber5).isEqualTo(BigDecimal.valueOf(-1.23456789));
    }

    @Test
    public void resultWithoutTrailingZeros_ShouldReturnZeroWithoutTrailingZeros_WhenZeroWithTrailingZeros() {
        //Arrange

        //Act
        String formattedNumber = formatter.resultWithoutTrailingZeros("0.0000000");

        //Assert
        Assertions.assertThat(formattedNumber).isEqualTo("0");
    }

    @Test
    public void resultWithoutTrailingZeros_ShouldReturnSameNumberWithoutTrailingZeros_WhenPositiveNumberWithTrailingZeros() {
        //Arrange

        //Act
        String formattedNumber1 = formatter.resultWithoutTrailingZeros("1.0000000");
        String formattedNumber2 = formatter.resultWithoutTrailingZeros("5.0000000");
        String formattedNumber3 = formatter.resultWithoutTrailingZeros("10.0000000");
        String formattedNumber4 = formatter.resultWithoutTrailingZeros("1.50000000");
        String formattedNumber5 = formatter.resultWithoutTrailingZeros("1.234567890000000");

        //Assert
        Assertions.assertThat(formattedNumber1).isEqualTo("1");
        Assertions.assertThat(formattedNumber2).isEqualTo("5");
        Assertions.assertThat(formattedNumber3).isEqualTo("10");
        Assertions.assertThat(formattedNumber4).isEqualTo("1.5");
        Assertions.assertThat(formattedNumber5).isEqualTo("1.23456789");
    }

    @Test
    public void resultWithoutTrailingZeros_ShouldReturnSameNumberWithoutTrailingZeros_WhenNegativeNumberWithTrailingZeros() {
        //Arrange

        //Act
        String formattedNumber1 = formatter.resultWithoutTrailingZeros("-1.0000000");
        String formattedNumber2 = formatter.resultWithoutTrailingZeros("-5.0000000");
        String formattedNumber3 = formatter.resultWithoutTrailingZeros("-10.0000000");
        String formattedNumber4 = formatter.resultWithoutTrailingZeros("-1.50000000");
        String formattedNumber5 = formatter.resultWithoutTrailingZeros("-1.234567890000000");

        //Assert
        Assertions.assertThat(formattedNumber1).isEqualTo("-1");
        Assertions.assertThat(formattedNumber2).isEqualTo("-5");
        Assertions.assertThat(formattedNumber3).isEqualTo("-10");
        Assertions.assertThat(formattedNumber4).isEqualTo("-1.5");
        Assertions.assertThat(formattedNumber5).isEqualTo("-1.23456789");
    }
}