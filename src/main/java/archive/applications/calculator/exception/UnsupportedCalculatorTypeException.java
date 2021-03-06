package archive.applications.calculator.exception;

import archive.applications.calculator.CalculatorType;

public class UnsupportedCalculatorTypeException extends Throwable {
    public UnsupportedCalculatorTypeException(CalculatorType calculatorType) {
        super(String.format("Calculator type: %s not supported", calculatorType));
    }

    public UnsupportedCalculatorTypeException(final String message) {
        super(message);
    }
}
