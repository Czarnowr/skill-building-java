package archive.applications.calculator.validator;

import archive.applications.calculator.exception.CalculatorIsOffException;
import archive.applications.calculator.exception.DividingByZeroException;

public interface Validator {
    void checkIfCalculatorIsOn(boolean isOn) throws CalculatorIsOffException;

    void checkIfDividingByZero(double number) throws DividingByZeroException;
}
