package applications.calculator;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorDecimalImplTest {
    @Test
    public void isOn_ShouldBeFalse_WhenCalculatorCreated() {
        Calculator calculator = new CalculatorDecimalImpl();

        boolean actual = calculator.isOn();

        Assertions.assertThat(actual).isEqualTo(false);
    }
}