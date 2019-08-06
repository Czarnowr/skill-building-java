package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;

public interface ICalculations {
    void add(double number) throws CalculatorIsOffException;

    void subtract(double number) throws CalculatorIsOffException;
}
