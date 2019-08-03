package applications.calculator;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorBigDecimalImplTest {
    @Test
    public void isOn_ShouldBeFalse_WhenCalculatorCreated(){
        Calculator calculator = new CalculatorBigDecimalImpl();

        boolean actual = calculator.isOn();

        Assertions.assertThat(actual).isEqualTo(false);
    }
}