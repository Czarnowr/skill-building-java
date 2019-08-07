package applications.calculator.validator;

import applications.calculator.exception.CalculatorIsOffException;
import applications.calculator.exception.DividingByZeroException;

public interface Validator {
    void checkIfCalculatorIsOn(boolean isOn) throws CalculatorIsOffException;

    void checkIfDividingByZero(double number) throws DividingByZeroException;
}
