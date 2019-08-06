package applications.calculator.exception;

public class CalculatorIsOffException extends Throwable {
    public CalculatorIsOffException() {
        super("Turn calculator on before use!");
    }

    public CalculatorIsOffException(final String message) {
        super(message);
    }
}
