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
}