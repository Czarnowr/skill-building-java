package applications.calculator.validator;

import applications.calculator.exception.CalculatorIsOffException;

public interface Validator {
    void checkIfCalculatorIsOn(boolean isOn) throws CalculatorIsOffException;

    double checkIfNegativeZero(double number);
}
