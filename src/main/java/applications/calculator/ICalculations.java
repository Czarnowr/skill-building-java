package applications.calculator;

import applications.calculator.exception.CalculatorIsOffException;
import applications.calculator.exception.DividingByZeroException;

public interface ICalculations {
    void add(double number) throws CalculatorIsOffException;

    void subtract(double number) throws CalculatorIsOffException;

    void multiplyBy(double number) throws CalculatorIsOffException;

    void divideBy(double number) throws CalculatorIsOffException, DividingByZeroException;

    void square()throws CalculatorIsOffException;
}
