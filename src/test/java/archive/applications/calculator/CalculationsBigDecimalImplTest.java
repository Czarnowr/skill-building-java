package archive.applications.calculator;

import archive.applications.calculator.exception.CalculatorIsOffException;
import archive.applications.calculator.exception.DividingByZeroException;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculationsBigDecimalImplTest {

    private Calculations calculations;

    @Mock
    private Power power;

    @Before
    public void setup() {
        calculations = new CalculationsBigDecimalImpl(power);
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
        Assertions.assertThat(getResult1).isEqualTo("0.056393718375706047");
        Assertions.assertThat(getResult2).isEqualTo("0.044501605941327862248738432");
        Assertions.assertThat(getResult3).isEqualTo("0.43952203399391735627659289163564672");
        Assertions.assertThat(getResult4).isEqualTo("2.8758893061318155047268718244511204186043264");
        Assertions.assertThat(getResult5).isEqualTo("9.260008508450710891278313695137161012579050117862656");
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
        Assertions.assertThat(getResult1).isEqualTo("0.056393718375706047");
        Assertions.assertThat(getResult2).isEqualTo("-0.044501605941327862248738432");
        Assertions.assertThat(getResult3).isEqualTo("0.43952203399391735627659289163564672");
        Assertions.assertThat(getResult4).isEqualTo("-2.8758893061318155047268718244511204186043264");
        Assertions.assertThat(getResult5).isEqualTo("9.260008508450710891278313695137161012579050117862656");
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
        Assertions.assertThat(getResult1).isEqualTo("1");
        Assertions.assertThat(getResult2).isEqualTo("0.2");
        Assertions.assertThat(getResult3).isEqualTo("0.1620000014742");
        Assertions.assertThat(getResult4).isEqualTo("0.03546494286253");
        Assertions.assertThat(getResult5).isEqualTo("0.004494219832509");
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
        Assertions.assertThat(getResult1).isEqualTo("-1");
        Assertions.assertThat(getResult2).isEqualTo("0.2");
        Assertions.assertThat(getResult3).isEqualTo("-0.1620000014742");
        Assertions.assertThat(getResult4).isEqualTo("0.03546494286253");
        Assertions.assertThat(getResult5).isEqualTo("-0.004494219832509");
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
        Assertions.assertThat(getResult5).isEqualTo("4294967296");
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
        Assertions.assertThat(getResult5).isEqualTo("4294967296");
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
        Assertions.assertThat(getResult4).isEqualTo("0.0000152587890625");
        Assertions.assertThat(getResult5).isEqualTo("2.3283064365386962890625E-1");
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
        Assertions.assertThat(getResult4).isEqualTo("0.0000152587890625");
        Assertions.assertThat(getResult5).isEqualTo("2.3283064365386962890625E-1");
    }
}