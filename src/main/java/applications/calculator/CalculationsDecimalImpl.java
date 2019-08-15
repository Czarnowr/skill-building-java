package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;
import applications.calculator.exception.DividingByZeroException;
import applications.calculator.formatter.Formatter;
import applications.calculator.formatter.FormatterImpl;
import applications.calculator.validator.Validator;
import applications.calculator.validator.ValidatorImpl;

class CalculationsDecimalImpl implements Calculations {
    private Power power;
    private Validator validator;
    private Formatter formatter;
    private double result;

    CalculationsDecimalImpl(final Power power) {
        this.power = power;
        this.validator = new ValidatorImpl();
        this.formatter = new FormatterImpl();
        this.result = 0;
    }

    @Override
    public String getResult() throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(power.isOn());

        String printedResult = String.valueOf(result);

        return formatter.resultWithoutTrailingZeros(printedResult);
    }

    @Override
    public void add(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(power.isOn());

        result = formatter.replaceNegativeZeroWithZero(result + number);
    }

    @Override
    public void subtract(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(power.isOn());

        result = formatter.replaceNegativeZeroWithZero(result - number);
    }

    @Override
    public void multiplyBy(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(power.isOn());

        result = formatter.replaceNegativeZeroWithZero(result * number);
    }

    @Override
    public void divideBy(final double number) throws CalculatorIsOffException, DividingByZeroException {
        validator.checkIfCalculatorIsOn(power.isOn());
        validator.checkIfDividingByZero(number);

        result = formatter.replaceNegativeZeroWithZero(result / number);
    }

    @Override
    public void square() throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(power.isOn());

        result = result * result;
    }
}
