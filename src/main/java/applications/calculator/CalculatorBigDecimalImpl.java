package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;
import applications.calculator.validator.Validator;
import applications.calculator.validator.ValidatorImpl;

import java.math.BigDecimal;

class CalculatorBigDecimalImpl extends Calculator{
    private Validator validator = new ValidatorImpl();
    private BigDecimal result;

    CalculatorBigDecimalImpl() {
        this.result = new BigDecimal("0");
    }

    @Override
    public String getResult() throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(isOn());

        String printedResult = result.toString();
        return resultWithoutTrailingZeros(printedResult);
    }

    private String resultWithoutTrailingZeros(final String printedResult) {
        return printedResult.contains(".") ? printedResult.replaceAll("0*$","").replaceAll("\\.$","") : printedResult;
    }

    @Override
    public String add(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(isOn());

        result = result.add(BigDecimal.valueOf(number));

        return result.toString();
    }

    @Override
    public String subtract(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(isOn());

        result = result.subtract(BigDecimal.valueOf(number));

        return result.toString();
    }
}
