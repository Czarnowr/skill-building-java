package applications.calculator;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class PowerImplTest {
    private Power power;

    @Before
    public void setup() {
        power = new PowerImpl();
    }

    @Test
    public void isOn_ShouldBeFalse_WhenCalculatorCreated() {
        // Arrange

        // Act
        boolean isOn = power.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }

    @Test
    public void turnOn_ShouldChangeIsOnToTrue_WhenCalled() {
        // Arrange

        // Act
        power.turnOn();
        boolean isOn = power.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(true);
    }

    @Test
    public void turnOn_ShouldNotChangeIsOn_WhenIsOnIsTrue() {
        // Arrange
        power.turnOn();

        // Act
        power.turnOn();
        boolean isOn = power.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(true);
    }

    @Test
    public void turnOff_ShouldChangeIsOnToFalse_WhenCalled() {
        // Arrange
        power.turnOn();

        // Act
        power.turnOff();
        boolean isOn = power.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }

    @Test
    public void turnOff_ShouldNotChangeIsOff_WhenIsOffIsFalse() {
        // Arrange

        // Act
        power.turnOff();
        boolean isOn = power.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }
}
