package applications.calculator;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorDecimalImplTest {
    @Test
    public void isOn_ShouldBeFalse_WhenCalculatorCreated() {
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }

    @Test
    public void turnOn_ShouldChangeIsOnToTrue_WhenCalled(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        calculator.turnOn();
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(true);
    }

    @Test
    public void turnOn_ShouldNotChangeIsOn_WhenIsOnIsTrue(){
        // Arrange
        Calculator calculator = new CalculatorBigDecimalImpl();
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
        Calculator calculator = new CalculatorDecimalImpl();
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
        Calculator calculator = new CalculatorBigDecimalImpl();

        // Act
        calculator.turnOff();
        boolean isOn = calculator.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }

    @Test
    public void getResult_ShouldBe0_WhenCalculatorCreated(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void add_ShouldBe0_WhenAdding0(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        calculator.add(0);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void add_ShouldGiveCorrectResult_WhenAddingPositiveNumber(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        calculator.add(10);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("10");
    }

    @Test
    public void add_ShouldGiveCorrectResult_WhenAddingMultiplePositiveNumbers(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        calculator.add(5);
        calculator.add(10);
        calculator.add(15);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("30");
    }

    @Test
    public void add_ShouldGiveCorrectResult_WhenAddingNegativeNumber(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        calculator.add(-10);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("-10");
    }

    @Test
    public void add_ShouldGiveCorrectResult_WhenAddingMultipleNegativeNumbers(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        calculator.add(-5);
        calculator.add(-10);
        calculator.add(-15);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("-30");
    }

    @Test
    public void add_ShouldBe0_WhenSubtracting0(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        calculator.subtract(0);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("0");
    }

    @Test
    public void add_ShouldGiveCorrectResult_WhenSubtractingPositiveNumber(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        calculator.subtract(10);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("-10");
    }

    @Test
    public void add_ShouldGiveCorrectResult_WhenSubtractingMultiplePositiveNumbers(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        calculator.subtract(5);
        calculator.subtract(10);
        calculator.subtract(15);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("-30");
    }

    @Test
    public void add_ShouldGiveCorrectResult_WhenSubtractingNegativeNumber(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        calculator.subtract(-10);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("10");
    }

    @Test
    public void add_ShouldGiveCorrectResult_WhenSubtractingMultipleNegativeNumbers(){
        // Arrange
        Calculator calculator = new CalculatorDecimalImpl();

        // Act
        calculator.subtract(-5);
        calculator.subtract(-10);
        calculator.subtract(-15);
        String getResult = calculator.getResult();

        // Assert
        Assertions.assertThat(getResult).isEqualTo("30");
    }
}