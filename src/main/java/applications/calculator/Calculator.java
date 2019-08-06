package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;

abstract class Calculator implements IBasicFunctionality, ICalculations {
    private boolean on;

    Calculator() {
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        if (!on) {
            on = true;
        }
    }

    public void turnOff() {
        if (on) {
            on = false;
        }
    }

    public abstract String getResult() throws CalculatorIsOffException;

    public abstract void add(double number) throws CalculatorIsOffException;

    public abstract void subtract(double number) throws CalculatorIsOffException;

    public abstract void multiplyBy(double number) throws CalculatorIsOffException;
}
