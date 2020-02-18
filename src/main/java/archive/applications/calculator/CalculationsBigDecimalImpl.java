package archive.applications.calculator;

import archive.applications.calculator.exception.CalculatorIsOffException;
import archive.applications.calculator.exception.DividingByZeroException;
import archive.applications.calculator.formatter.Formatter;
import archive.applications.calculator.formatter.FormatterImpl;
import archive.applications.calculator.validator.Validator;
import archive.applications.calculator.validator.ValidatorImpl;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CalculationsBigDecimalImpl implements Calculations {
    private Power power;
    private Validator validator;
    private Formatter formatter;
    private BigDecimal result;

    CalculationsBigDecimalImpl(final Power power) {
        this.power = power;
        this.validator = new ValidatorImpl();
        this.formatter = new FormatterImpl();
        this.result = new BigDecimal("0");
    }

    @Override
    public String getResult() throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(power.isOn());

        String printedResult = result.toString();
        return formatter.resultWithoutTrailingZeros(printedResult);
    }

    @Override
    public void add(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(power.isOn());

        result = result.add(BigDecimal.valueOf(number));
    }

    @Override
    public void subtract(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(power.isOn());

        result = result.subtract(BigDecimal.valueOf(number));
    }

    @Override
    public void multiplyBy(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(power.isOn());

        result = result.multiply(BigDecimal.valueOf(number));
    }

    @Override
    public void divideBy(final double number) throws CalculatorIsOffException, DividingByZeroException {
        validator.checkIfCalculatorIsOn(power.isOn());
        validator.checkIfDividingByZero(number);

        result = formatter.formatCorrectlyIfZero(result.divide(BigDecimal.valueOf(number), 15, RoundingMode.HALF_UP));
    }

    @Override
    public void square() throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(power.isOn());

        result = result.multiply(result);
    }
}
