package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;
import applications.calculator.exception.DividingByZeroException;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculationsDecimalImplTest {

    private Calculations calculations;

    @Mock
    private Power power;

    @Before
    public void setup() {
        calculations = new CalculationsDecimalImpl(power);
    }

    @Test(expected = CalculatorIsOffException.class)
    public void getResult_ShouldThrowException_WhenIsOffIsTrueAndGetResultCalled() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(false);

        // Act
        calculations.getResult();

        // Assert
    }

    @Test
    public void getResult_ShouldBe0_WhenCalculatorCreated() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        String getResult = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void add_ShouldBe0_WhenAdding0() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        calculations.add(0);
        String getResult = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void add_ShouldGiveCorrectResult_WhenAddingPositiveNumbers() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        calculations.add(10);
        String getResult1 = calculations.getResult();

        calculations.add(5);
        String getResult2 = calculations.getResult();

        calculations.add(1.5);
        String getResult3 = calculations.getResult();

        calculations.add(8.5);
        String getResult4 = calculations.getResult();

        calculations.add(1.234556789);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("10");
        Assertions.assertThat(getResult2).isEqualTo("15");
        Assertions.assertThat(getResult3).isEqualTo("16.5");
        Assertions.assertThat(getResult4).isEqualTo("25");
        Assertions.assertThat(getResult5).isEqualTo("26.234556789");
    }

    @Test
    public void add_ShouldGiveCorrectResult_WhenAddingNegativeNumbers() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        calculations.add(-10);
        String getResult1 = calculations.getResult();

        calculations.add(-5);
        String getResult2 = calculations.getResult();

        calculations.add(-1.5);
        String getResult3 = calculations.getResult();

        calculations.add(-8.5);
        String getResult4 = calculations.getResult();

        calculations.add(-1.234556789);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("-10");
        Assertions.assertThat(getResult2).isEqualTo("-15");
        Assertions.assertThat(getResult3).isEqualTo("-16.5");
        Assertions.assertThat(getResult4).isEqualTo("-25");
        Assertions.assertThat(getResult5).isEqualTo("-26.234556789");
    }

    @Test
    public void subtract_ShouldBe0_WhenSubtracting0() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        calculations.subtract(0);
        String getResult = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void subtract_ShouldGiveCorrectResult_WhenSubtractingPositiveNumbers() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        calculations.subtract(10);
        String getResult1 = calculations.getResult();

        calculations.subtract(5);
        String getResult2 = calculations.getResult();

        calculations.subtract(1.5);
        String getResult3 = calculations.getResult();

        calculations.subtract(8.5);
        String getResult4 = calculations.getResult();

        calculations.subtract(1.234556789);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("-10");
        Assertions.assertThat(getResult2).isEqualTo("-15");
        Assertions.assertThat(getResult3).isEqualTo("-16.5");
        Assertions.assertThat(getResult4).isEqualTo("-25");
        Assertions.assertThat(getResult5).isEqualTo("-26.234556789");
    }

    @Test
    public void subtract_ShouldGiveCorrectResult_WhenSubtractingNegativeNumbers() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        calculations.subtract(-10);
        String getResult1 = calculations.getResult();

        calculations.subtract(-5);
        String getResult2 = calculations.getResult();

        calculations.subtract(-1.5);
        String getResult3 = calculations.getResult();

        calculations.subtract(-8.5);
        String getResult4 = calculations.getResult();

        calculations.subtract(-1.234556789);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("10");
        Assertions.assertThat(getResult2).isEqualTo("15");
        Assertions.assertThat(getResult3).isEqualTo("16.5");
        Assertions.assertThat(getResult4).isEqualTo("25");
        Assertions.assertThat(getResult5).isEqualTo("26.234556789");
    }

    @Test
    public void multiply_ShouldBe0_WhenMultiplying0By0() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        calculations.multiplyBy(0);
        String getResult = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void multiply_ShouldBe0_WhenMultiplyingPositiveNumberBy0() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(5);

        // Act
        calculations.multiplyBy(0);
        String getResult = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void multiply_ShouldBe0_WhenMultiplyingNegativeNumberBy0() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(-5);

        // Act
        calculations.multiplyBy(0);
        String getResult = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void multiply_ShouldGiveCorrectResult_WhenMultiplyingPositiveNumbers() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(1);

        // Act
        calculations.multiplyBy(1);
        String getResult1 = calculations.getResult();

        calculations.multiplyBy(5);
        String getResult2 = calculations.getResult();

        calculations.multiplyBy(10);
        String getResult3 = calculations.getResult();

        calculations.multiplyBy(1.5);
        String getResult4 = calculations.getResult();

        calculations.multiplyBy(1.23456789);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("1");
        Assertions.assertThat(getResult2).isEqualTo("5");
        Assertions.assertThat(getResult3).isEqualTo("50");
        Assertions.assertThat(getResult4).isEqualTo("75");
        Assertions.assertThat(getResult5).isEqualTo("92.59259175");
    }

    @Test
    public void multiply_ShouldGiveCorrectResult_WhenMultiplyingNegativeNumbers() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(-1);

        // Act
        calculations.multiplyBy(-1);
        String getResult1 = calculations.getResult();

        calculations.multiplyBy(-5);
        String getResult2 = calculations.getResult();

        calculations.multiplyBy(-10);
        String getResult3 = calculations.getResult();

        calculations.multiplyBy(-1.5);
        String getResult4 = calculations.getResult();

        calculations.multiplyBy(-1.23456789);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("1");
        Assertions.assertThat(getResult2).isEqualTo("-5");
        Assertions.assertThat(getResult3).isEqualTo("50");
        Assertions.assertThat(getResult4).isEqualTo("-75");
        Assertions.assertThat(getResult5).isEqualTo("92.59259175");
    }

    @Test
    public void multiply_ShouldGiveCorrectResult_WhenMultiplyingPositiveFractions() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(0.123456789);

        // Act
        calculations.multiplyBy(0.456789123);
        String getResult1 = calculations.getResult();

        calculations.multiplyBy(0.789123456);
        String getResult2 = calculations.getResult();

        calculations.multiplyBy(9.87654321);
        String getResult3 = calculations.getResult();

        calculations.multiplyBy(6.54321987);
        String getResult4 = calculations.getResult();

        calculations.multiplyBy(3.21987654);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).startsWith("0.0563937183757");
        Assertions.assertThat(getResult2).startsWith("0.0445016059413");
        Assertions.assertThat(getResult3).startsWith("0.4395220339939");
        Assertions.assertThat(getResult4).startsWith("2.8758893061318");
        Assertions.assertThat(getResult5).startsWith("9.2600085084507");
    }

    @Test
    public void multiply_ShouldGiveCorrectResult_WhenMultiplyingNegativeFractions() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(-0.123456789);

        // Act
        calculations.multiplyBy(-0.456789123);
        String getResult1 = calculations.getResult();

        calculations.multiplyBy(-0.789123456);
        String getResult2 = calculations.getResult();

        calculations.multiplyBy(-9.87654321);
        String getResult3 = calculations.getResult();

        calculations.multiplyBy(-6.54321987);
        String getResult4 = calculations.getResult();

        calculations.multiplyBy(-3.21987654);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).startsWith("0.0563937183757");
        Assertions.assertThat(getResult2).startsWith("-0.0445016059413");
        Assertions.assertThat(getResult3).startsWith("0.4395220339939");
        Assertions.assertThat(getResult4).startsWith("-2.8758893061318");
        Assertions.assertThat(getResult5).startsWith("9.2600085084507");
    }

    @Test(expected = DividingByZeroException.class)
    public void divide_ShouldThrowException_WhenDividingByZero() throws CalculatorIsOffException, DividingByZeroException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        calculations.divideBy(0);

        // Assert
    }

    @Test
    public void divide_ShouldBe0_WhenDividing0ByPositiveNumbers() throws CalculatorIsOffException, DividingByZeroException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        calculations.divideBy(1);
        String getResult1 = calculations.getResult();

        calculations.divideBy(5);
        String getResult2 = calculations.getResult();

        calculations.divideBy(1.23456789);
        String getResult3 = calculations.getResult();

        calculations.divideBy(4.56789123);
        String getResult4 = calculations.getResult();

        calculations.divideBy(7.89123456);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("0");
        Assertions.assertThat(getResult2).isEqualTo("0");
        Assertions.assertThat(getResult3).isEqualTo("0");
        Assertions.assertThat(getResult4).isEqualTo("0");
        Assertions.assertThat(getResult5).isEqualTo("0");
    }

    @Test
    public void divide_ShouldBe0_WhenDividing0ByNegativeNumbers() throws CalculatorIsOffException, DividingByZeroException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        calculations.divideBy(-1);
        String getResult1 = calculations.getResult();

        calculations.divideBy(-5);
        String getResult2 = calculations.getResult();

        calculations.divideBy(-1.23456789);
        String getResult3 = calculations.getResult();

        calculations.divideBy(-4.56789123);
        String getResult4 = calculations.getResult();

        calculations.divideBy(-7.89123456);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("0");
        Assertions.assertThat(getResult2).isEqualTo("0");
        Assertions.assertThat(getResult3).isEqualTo("0");
        Assertions.assertThat(getResult4).isEqualTo("0");
        Assertions.assertThat(getResult5).isEqualTo("0");
    }

    @Test
    public void divide_ShouldGiveCorrectResult_WhenDividingByPositiveNumbers() throws CalculatorIsOffException, DividingByZeroException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(1);

        // Act
        calculations.divideBy(1);
        String getResult1 = calculations.getResult();

        calculations.divideBy(5);
        String getResult2 = calculations.getResult();

        calculations.divideBy(1.23456789);
        String getResult3 = calculations.getResult();

        calculations.divideBy(4.56789123);
        String getResult4 = calculations.getResult();

        calculations.divideBy(7.89123456);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).startsWith("1");
        Assertions.assertThat(getResult2).startsWith("0.2");
        Assertions.assertThat(getResult3).startsWith("0.1620000014742");
        Assertions.assertThat(getResult4).startsWith("0.0354649428625");
        Assertions.assertThat(getResult5).startsWith("0.0044942198325");
    }

    @Test
    public void divide_ShouldGiveCorrectResult_WhenDividingByNegativeNumbers() throws CalculatorIsOffException, DividingByZeroException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(1);

        // Act
        calculations.divideBy(-1);
        String getResult1 = calculations.getResult();

        calculations.divideBy(-5);
        String getResult2 = calculations.getResult();

        calculations.divideBy(-1.23456789);
        String getResult3 = calculations.getResult();

        calculations.divideBy(-4.56789123);
        String getResult4 = calculations.getResult();

        calculations.divideBy(-7.89123456);
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).startsWith("-1");
        Assertions.assertThat(getResult2).startsWith("0.2");
        Assertions.assertThat(getResult3).startsWith("-0.1620000014742");
        Assertions.assertThat(getResult4).startsWith("0.0354649428625");
        Assertions.assertThat(getResult5).startsWith("-0.0044942198325");
    }

    @Test
    public void square_ShouldBe0_WhenSquaring0() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        // Act
        calculations.square();
        String getResult = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void square_ShouldGiveCorrectResult_WhenSquaringPositiveNumbers() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(2);

        // Act
        calculations.square();
        String getResult1 = calculations.getResult();

        calculations.square();
        String getResult2 = calculations.getResult();

        calculations.square();
        String getResult3 = calculations.getResult();

        calculations.square();
        String getResult4 = calculations.getResult();

        calculations.square();
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("4");
        Assertions.assertThat(getResult2).isEqualTo("16");
        Assertions.assertThat(getResult3).isEqualTo("256");
        Assertions.assertThat(getResult4).isEqualTo("65536");
        Assertions.assertThat(getResult5).isEqualTo("4.294967296E9");
    }

    @Test
    public void square_ShouldGiveCorrectResult_WhenSquaringNegativeNumbers() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(-2);

        // Act
        calculations.square();
        String getResult1 = calculations.getResult();

        calculations.square();
        String getResult2 = calculations.getResult();

        calculations.square();
        String getResult3 = calculations.getResult();

        calculations.square();
        String getResult4 = calculations.getResult();

        calculations.square();
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("4");
        Assertions.assertThat(getResult2).isEqualTo("16");
        Assertions.assertThat(getResult3).isEqualTo("256");
        Assertions.assertThat(getResult4).isEqualTo("65536");
        Assertions.assertThat(getResult5).isEqualTo("4.294967296E9");
    }

    @Test
    public void square_ShouldGiveCorrectResult_WhenSquaringPositiveFractions() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(0.5);

        // Act
        calculations.square();
        String getResult1 = calculations.getResult();

        calculations.square();
        String getResult2 = calculations.getResult();

        calculations.square();
        String getResult3 = calculations.getResult();

        calculations.square();
        String getResult4 = calculations.getResult();

        calculations.square();
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("0.25");
        Assertions.assertThat(getResult2).isEqualTo("0.0625");
        Assertions.assertThat(getResult3).isEqualTo("0.00390625");
        Assertions.assertThat(getResult4).isEqualTo("1.52587890625E-5");
        Assertions.assertThat(getResult5).isEqualTo("2.3283064365386963E-1");
    }

    @Test
    public void square_ShouldGiveCorrectResult_WhenSquaringNegativeFractions() throws CalculatorIsOffException {
        // Arrange
        Mockito.when(power.isOn()).thenReturn(true);

        calculations.add(-0.5);

        // Act
        calculations.square();
        String getResult1 = calculations.getResult();

        calculations.square();
        String getResult2 = calculations.getResult();

        calculations.square();
        String getResult3 = calculations.getResult();

        calculations.square();
        String getResult4 = calculations.getResult();

        calculations.square();
        String getResult5 = calculations.getResult();

        // Assert
        Assertions.assertThat(getResult1).isEqualTo("0.25");
        Assertions.assertThat(getResult2).isEqualTo("0.0625");
        Assertions.assertThat(getResult3).isEqualTo("0.00390625");
        Assertions.assertThat(getResult4).isEqualTo("1.52587890625E-5");
        Assertions.assertThat(getResult5).isEqualTo("2.3283064365386963E-1");
    }
}