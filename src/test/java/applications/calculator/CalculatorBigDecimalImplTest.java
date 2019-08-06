package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CalculatorBigDecimalImplTest {

    private Calculator calculator;

    @Before
    public void setup(){
        calculator = new CalculatorBigDecimalImpl();
    }

    @Test
    public void isOn_ShouldBeFalse_WhenCalculatorCreated(){
        // Arrange

        // Act
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }

    @Test
    public void turnOn_ShouldChangeIsOnToTrue_WhenCalled(){
        // Arrange

        // Act
        calculator.turnOn();
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(true);
    }

    @Test
    public void turnOn_ShouldNotChangeIsOn_WhenIsOnIsTrue(){
        // Arrange
        calculator.turnOn();

        // Act
        calculator.turnOn();
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(true);
    }

    @Test
    public void turnOff_ShouldChangeIsOnToFalse_WhenCalled(){
        // Arrange
        calculator.turnOn();

        // Act
        calculator.turnOff();
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }

    @Test
    public void turnOff_ShouldNotChangeIsOff_WhenIsOffIsFalse(){
        // Arrange

        // Act
        calculator.turnOff();
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
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
}