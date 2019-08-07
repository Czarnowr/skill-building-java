package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;
import applications.calculator.exception.DividingByZeroException;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CalculatorDecimalImplTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new CalculatorDecimalImpl();
    }

    @Test
    public void isOn_ShouldBeFalse_WhenCalculatorCreated() {
        // Arrange

        // Act
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }

    @Test
    public void turnOn_ShouldChangeIsOnToTrue_WhenCalled() {
        // Arrange

        // Act
        calculator.turnOn();
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(true);
    }

    @Test
    public void turnOn_ShouldNotChangeIsOn_WhenIsOnIsTrue() {
        // Arrange
        calculator.turnOn();

        // Act
        calculator.turnOn();
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(true);
    }

    @Test
    public void turnOff_ShouldChangeIsOnToFalse_WhenCalled() {
        // Arrange
        calculator.turnOn();

        // Act
        calculator.turnOff();
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }

    @Test
    public void turnOff_ShouldNotChangeIsOff_WhenIsOffIsFalse() {
        // Arrange

        // Act
        calculator.turnOff();
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }

    @Test(expected = CalculatorIsOffException.class)
    public void getResult_ShouldThrowException_WhenIsOffIsTrueAndGetResultCalled() throws CalculatorIsOffException {
        // Arrange

        // Act
        calculator.getResult();

        // Assert
    }

    @Test
    public void getResult_ShouldBe0_WhenCalculatorCreated() throws CalculatorIsOffException {
        // Arrange
        calculator.turnOn();

        // Act
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void add_ShouldBe0_WhenAdding0() throws CalculatorIsOffException {
        // Arrange
        calculator.turnOn();

        // Act
        calculator.add(0);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void add_ShouldGiveCorrectResult_WhenAddingPositiveNumbers() throws CalculatorIsOffException {
        // Arrange
        calculator.turnOn();

        // Act
        calculator.add(10);
        String getResult1 = calculator.getResult();

        calculator.add(5);
        String getResult2 = calculator.getResult();

        calculator.add(1.5);
        String getResult3 = calculator.getResult();

        calculator.add(8.5);
        String getResult4 = calculator.getResult();

        calculator.add(1.234556789);
        String getResult5 = calculator.getResult();

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
        calculator.turnOn();

        // Act
        calculator.add(-10);
        String getResult1 = calculator.getResult();

        calculator.add(-5);
        String getResult2 = calculator.getResult();

        calculator.add(-1.5);
        String getResult3 = calculator.getResult();

        calculator.add(-8.5);
        String getResult4 = calculator.getResult();

        calculator.add(-1.234556789);
        String getResult5 = calculator.getResult();

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
        calculator.turnOn();

        // Act
        calculator.subtract(0);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void subtract_ShouldGiveCorrectResult_WhenSubtractingPositiveNumbers() throws CalculatorIsOffException {
        // Arrange
        calculator.turnOn();

        // Act
        calculator.subtract(10);
        String getResult1 = calculator.getResult();

        calculator.subtract(5);
        String getResult2 = calculator.getResult();

        calculator.subtract(1.5);
        String getResult3 = calculator.getResult();

        calculator.subtract(8.5);
        String getResult4 = calculator.getResult();

        calculator.subtract(1.234556789);
        String getResult5 = calculator.getResult();

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
        calculator.turnOn();

        // Act
        calculator.subtract(-10);
        String getResult1 = calculator.getResult();

        calculator.subtract(-5);
        String getResult2 = calculator.getResult();

        calculator.subtract(-1.5);
        String getResult3 = calculator.getResult();

        calculator.subtract(-8.5);
        String getResult4 = calculator.getResult();

        calculator.subtract(-1.234556789);
        String getResult5 = calculator.getResult();

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
        calculator.turnOn();

        // Act
        calculator.multiplyBy(0);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void multiply_ShouldBe0_WhenMultiplyingPositiveNumberBy0() throws CalculatorIsOffException {
        // Arrange
        calculator.turnOn();
        calculator.add(5);

        // Act
        calculator.multiplyBy(0);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void multiply_ShouldBe0_WhenMultiplyingNegativeNumberBy0() throws CalculatorIsOffException {
        // Arrange
        calculator.turnOn();
        calculator.add(-5);

        // Act
        calculator.multiplyBy(0);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void multiply_ShouldGiveCorrectResult_WhenMultiplyingPositiveNumbers() throws CalculatorIsOffException {
        // Arrange
        calculator.turnOn();
        calculator.add(1);

        // Act
        calculator.multiplyBy(1);
        String getResult1 = calculator.getResult();

        calculator.multiplyBy(5);
        String getResult2 = calculator.getResult();

        calculator.multiplyBy(10);
        String getResult3 = calculator.getResult();

        calculator.multiplyBy(1.5);
        String getResult4 = calculator.getResult();

        calculator.multiplyBy(1.23456789);
        String getResult5 = calculator.getResult();

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
        calculator.turnOn();
        calculator.add(-1);

        // Act
        calculator.multiplyBy(-1);
        String getResult1 = calculator.getResult();

        calculator.multiplyBy(-5);
        String getResult2 = calculator.getResult();

        calculator.multiplyBy(-10);
        String getResult3 = calculator.getResult();

        calculator.multiplyBy(-1.5);
        String getResult4 = calculator.getResult();

        calculator.multiplyBy(-1.23456789);
        String getResult5 = calculator.getResult();

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
        calculator.turnOn();
        calculator.add(0.123456789);

        // Act
        calculator.multiplyBy(0.456789123);
        String getResult1 = calculator.getResult();

        calculator.multiplyBy(0.789123456);
        String getResult2 = calculator.getResult();

        calculator.multiplyBy(9.87654321);
        String getResult3 = calculator.getResult();

        calculator.multiplyBy(6.54321987);
        String getResult4 = calculator.getResult();

        calculator.multiplyBy(3.21987654);
        String getResult5 = calculator.getResult();

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
        calculator.turnOn();
        calculator.add(-0.123456789);

        // Act
        calculator.multiplyBy(-0.456789123);
        String getResult1 = calculator.getResult();

        calculator.multiplyBy(-0.789123456);
        String getResult2 = calculator.getResult();

        calculator.multiplyBy(-9.87654321);
        String getResult3 = calculator.getResult();

        calculator.multiplyBy(-6.54321987);
        String getResult4 = calculator.getResult();

        calculator.multiplyBy(-3.21987654);
        String getResult5 = calculator.getResult();

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
        calculator.turnOn();

        // Act
        calculator.divideBy(0);

        // Assert
    }

    @Test
    public void divide_ShouldBe0_WhenDividing0ByPositiveNumbers() throws CalculatorIsOffException, DividingByZeroException {
        // Arrange
        calculator.turnOn();

        // Act
        calculator.divideBy(1);
        String getResult1 = calculator.getResult();

        calculator.divideBy(5);
        String getResult2 = calculator.getResult();

        calculator.divideBy(1.23456789);
        String getResult3 = calculator.getResult();

        calculator.divideBy(4.56789123);
        String getResult4 = calculator.getResult();

        calculator.divideBy(7.89123456);
        String getResult5 = calculator.getResult();

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
        calculator.turnOn();

        // Act
        calculator.divideBy(-1);
        String getResult1 = calculator.getResult();

        calculator.divideBy(-5);
        String getResult2 = calculator.getResult();

        calculator.divideBy(-1.23456789);
        String getResult3 = calculator.getResult();

        calculator.divideBy(-4.56789123);
        String getResult4 = calculator.getResult();

        calculator.divideBy(-7.89123456);
        String getResult5 = calculator.getResult();

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
        calculator.turnOn();
        calculator.add(1);

        // Act
        calculator.divideBy(1);
        String getResult1 = calculator.getResult();

        calculator.divideBy(5);
        String getResult2 = calculator.getResult();

        calculator.divideBy(1.23456789);
        String getResult3 = calculator.getResult();

        calculator.divideBy(4.56789123);
        String getResult4 = calculator.getResult();

        calculator.divideBy(7.89123456);
        String getResult5 = calculator.getResult();

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
        calculator.turnOn();
        calculator.add(1);

        // Act
        calculator.divideBy(-1);
        String getResult1 = calculator.getResult();

        calculator.divideBy(-5);
        String getResult2 = calculator.getResult();

        calculator.divideBy(-1.23456789);
        String getResult3 = calculator.getResult();

        calculator.divideBy(-4.56789123);
        String getResult4 = calculator.getResult();

        calculator.divideBy(-7.89123456);
        String getResult5 = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult1).startsWith("-1");
        Assertions.assertThat(getResult2).startsWith("0.2");
        Assertions.assertThat(getResult3).startsWith("-0.1620000014742");
        Assertions.assertThat(getResult4).startsWith("0.0354649428625");
        Assertions.assertThat(getResult5).startsWith("-0.0044942198325");
    }
}