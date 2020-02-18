package archive.applications.calculator;

import archive.applications.calculator.exception.CalculatorIsOffException;
import archive.applications.calculator.exception.DividingByZeroException;

public interface Calculations {
    String getResult()throws CalculatorIsOffException;

    void add(double number) throws CalculatorIsOffException;

    void subtract(double number) throws CalculatorIsOffException;

    void multiplyBy(double number) throws CalculatorIsOffException;

    void divideBy(double number) throws CalculatorIsOffException, DividingByZeroException;

    void square()throws CalculatorIsOffException;
}
