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
}