package archive.applications.calculator.exception;

public class DividingByZeroException extends Throwable {
    public DividingByZeroException() {
        super("Division by zero not allowed!");
    }

    public DividingByZeroException(final String message) {
        super(message);
    }
}
