package archive.applications.calculator.formatter;

import java.math.BigDecimal;

public interface Formatter {
    double replaceNegativeZeroWithZero(double number);

    BigDecimal formatCorrectlyIfZero(final BigDecimal number);

    String resultWithoutTrailingZeros(final String printedResult);
}
