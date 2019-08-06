package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;

interface IBasicFunctionality {
    boolean isOn();

    void turnOn();

    void turnOff();

    String getResult() throws CalculatorIsOffException;
}
