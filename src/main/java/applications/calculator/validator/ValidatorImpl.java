package applications.calculator.validator;

import applications.calculator.exception.CalculatorIsOffException;
import applications.calculator.exception.DividingByZeroException;

public class ValidatorImpl implements Validator {

    @Override
    public void checkIfCalculatorIsOn(boolean isOn) throws CalculatorIsOffException {
        if (!isOn) {
            throw new CalculatorIsOffException();
        }
    }

    @Override
    public void checkIfDividingByZero(double number) throws DividingByZeroException {
        if (number == 0) {
            throw new DividingByZeroException();
        }
    }
}
