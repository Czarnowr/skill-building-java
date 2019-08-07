package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;
import applications.calculator.exception.DividingByZeroException;
import applications.calculator.formatter.Formatter;
import applications.calculator.formatter.FormatterImpl;
import applications.calculator.validator.Validator;
import applications.calculator.validator.ValidatorImpl;

class CalculatorDecimalImpl extends Calculator {
    private Validator validator = new ValidatorImpl();
    private Formatter formatter = new FormatterImpl();
    private double result;

    CalculatorDecimalImpl() {
        this.result = 0;
    }

    @Override
    public String getResult() throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(isOn());

        String printedResult = String.valueOf(result);

        return resultWithoutTrailingZeros(printedResult);
    }

    private String resultWithoutTrailingZeros(final String printedResult) {
        return printedResult.contains(".") ? printedResult.replaceAll("0*$", "").replaceAll("\\.$", "") : printedResult;
    }

    @Override
    public void add(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(isOn());

        result = formatter.replaceNegativeZeroWithZero(result + number);
    }

    @Override
    public void subtract(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(isOn());

        result = formatter.replaceNegativeZeroWithZero(result - number);
    }

    @Override
    public void multiplyBy(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(isOn());

        result = formatter.replaceNegativeZeroWithZero(result * number);
    }

    @Override
    public void divideBy(final double number) throws CalculatorIsOffException, DividingByZeroException {
        validator.checkIfCalculatorIsOn(isOn());
        validator.checkIfDividingByZero(number);

        result = formatter.replaceNegativeZeroWithZero(result / number);
    }
}
