package applications.calculator;

import applications.calculator.exception.UnsupportedCalculatorTypeException;

class Calculator {
    private BasicFunctionality basicFunctionality;
    private Calculations calculations;

    Calculator(CalculatorType calculatorType) throws UnsupportedCalculatorTypeException {
        this.basicFunctionality = new BasicFunctionalityImpl();
        this.calculations = assignCalculationsObject(calculatorType);
    }

    private Calculations assignCalculationsObject(CalculatorType calculatorType) throws UnsupportedCalculatorTypeException {
        Calculations calculations;

        if (calculatorType == CalculatorType.DECIMAL) {
            calculations = new CalculationsDecimalImpl(basicFunctionality);
        } else if (calculatorType == CalculatorType.BIG_DECIMAL) {
            calculations = new CalculationsBigDecimalImpl(basicFunctionality);
        } else {
            throw new UnsupportedCalculatorTypeException(calculatorType);
        }

        return calculations;
    }
}
