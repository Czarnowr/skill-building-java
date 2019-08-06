package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;

public interface ICalculations {
    String add(double number) throws CalculatorIsOffException;

    String subtract(double number) throws CalculatorIsOffException;
}
