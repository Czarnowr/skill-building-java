package archive.applications.calculator;

import archive.applications.calculator.exception.CalculatorIsOffException;
import archive.applications.calculator.exception.DividingByZeroException;
import archive.applications.calculator.exception.UnsupportedCalculatorTypeException;

class Calculator implements Power, Calculations{
    private Power power;
    private Calculations calculations;

    Calculator(CalculatorType calculatorType) throws UnsupportedCalculatorTypeException {
        this.power = new PowerImpl();
        this.calculations = assignCalculationsObject(calculatorType);
    }

    private Calculations assignCalculationsObject(CalculatorType calculatorType) throws UnsupportedCalculatorTypeException {
        Calculations calculations;

        if (calculatorType == CalculatorType.DECIMAL) {
            calculations = new CalculationsDecimalImpl(power);
        } else if (calculatorType == CalculatorType.BIG_DECIMAL) {
            calculations = new CalculationsBigDecimalImpl(power);
        } else {
            throw new UnsupportedCalculatorTypeException(calculatorType);
        }

        return calculations;
    }

    @Override
    public boolean isOn() {
        return power.isOn();
    }

    @Override
    public void turnOn() {
        power.turnOn();
    }

    @Override
    public void turnOff() {
        power.turnOff();
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
