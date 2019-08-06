package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;
import applications.calculator.validator.Validator;
import applications.calculator.validator.ValidatorImpl;

class CalculatorDecimalImpl extends Calculator {
    private Validator validator = new ValidatorImpl();
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
        return printedResult.contains(".") ? printedResult.replaceAll("0*$","").replaceAll("\\.$","") : printedResult;
    }

    @Override
    public String add(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(isOn());

        result = result + number;

        return String.valueOf(result);
    }

    @Override
    public String subtract(final double number) throws CalculatorIsOffException {
        validator.checkIfCalculatorIsOn(isOn());

        result = result - number;

        return String.valueOf(result);
    }
}
