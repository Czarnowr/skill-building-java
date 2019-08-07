package applications.calculator.formatter;

import java.math.BigDecimal;

public class FormatterImpl implements Formatter {

    @Override
    public double replaceNegativeZeroWithZero(final double number) {
        return (number == -0 ? 0 : number);
    }

    @Override
    public BigDecimal formatCorrectlyIfZero(final BigDecimal number) {
        return (number.doubleValue() == 0 ? BigDecimal.valueOf(0) : number);
    }
}
