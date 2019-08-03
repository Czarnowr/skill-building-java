package applications.calculator;

class CalculatorDecimalImpl extends Calculator {
    private double result;

    CalculatorDecimalImpl() {
        this.result = 0;
    }

    @Override
    public String getResult() {
        String printedResult = String.valueOf(result);

        if (result == 0.0) {
            printedResult = printedResult.substring(0, 1);
        }

        return printedResult;
    }
}
