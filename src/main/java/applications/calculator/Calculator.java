package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;
import applications.calculator.exception.DividingByZeroException;
import applications.calculator.exception.UnsupportedCalculatorTypeException;

class Calculator implements BasicFunctionality, Calculations{
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

    @Override
    public boolean isOn() {
        return basicFunctionality.isOn();
    }

    @Override
    public void turnOn() {
        basicFunctionality.turnOn();
    }

    @Override
    public void turnOff() {
        basicFunctionality.turnOff();
    }

    @Override
    public String getResult() throws CalculatorIsOffException {
        return calculations.getResult();
    }

    @Override
    public void add(final double number) throws CalculatorIsOffException {
        calculations.add(number);
    }

    @Override
    public void subtract(final double number) throws CalculatorIsOffException {
        calculations.subtract(number);
    }

    @Override
    public void multiplyBy(final double number) throws CalculatorIsOffException {
        calculations.multiplyBy(number);
    }

    @Override
    public void divideBy(final double number) throws CalculatorIsOffException, DividingByZeroException {
        calculations.divideBy(number);
    }

    @Override
    public void square() throws CalculatorIsOffException {
        calculations.square();
    }
}
