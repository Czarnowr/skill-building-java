package applications.calculator;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class BasicFunctionalityImplTest {
    private BasicFunctionality basicFunctionality;

    @Before
    public void setup() {
        basicFunctionality = new BasicFunctionalityImpl();
    }

    @Test
    public void isOn_ShouldBeFalse_WhenCalculatorCreated() {
        // Arrange

        // Act
        boolean isOn = basicFunctionality.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }

    @Test
    public void turnOn_ShouldChangeIsOnToTrue_WhenCalled() {
        // Arrange

        // Act
        basicFunctionality.turnOn();
        boolean isOn = basicFunctionality.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(true);
    }

    @Test
    public void turnOn_ShouldNotChangeIsOn_WhenIsOnIsTrue() {
        // Arrange
        basicFunctionality.turnOn();

        // Act
        basicFunctionality.turnOn();
        boolean isOn = basicFunctionality.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(true);
    }

    @Test
    public void turnOff_ShouldChangeIsOnToFalse_WhenCalled() {
        // Arrange
        basicFunctionality.turnOn();

        // Act
        basicFunctionality.turnOff();
        boolean isOn = basicFunctionality.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }

    @Test
    public void turnOff_ShouldNotChangeIsOff_WhenIsOffIsFalse() {
        // Arrange

        // Act
        basicFunctionality.turnOff();
        boolean isOn = basicFunctionality.isOn();

        // Assert
        Assertions.assertThat(isOn).isEqualTo(false);
    }
}
