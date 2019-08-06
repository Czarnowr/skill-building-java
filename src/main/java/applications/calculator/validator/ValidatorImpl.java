package applications.calculator.validator;

import applications.calculator.exception.CalculatorIsOffException;

public class ValidatorImpl implements Validator {

    @Override
    public void checkIfCalculatorIsOn(boolean isOn) throws CalculatorIsOffException {
        if (!isOn) {
            throw new CalculatorIsOffException();
        }
    }

    @Override
    public double replaceNegativeZeroWithZero(final double number) {
        return (number == -0 ? 0 : number);
    }
}
