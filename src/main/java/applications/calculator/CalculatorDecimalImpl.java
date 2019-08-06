package applications.calculator;

class CalculatorDecimalImpl extends Calculator {
    private double result;

    CalculatorDecimalImpl() {
        this.result = 0;
    }

    @Override
    public String getResult() {
        String printedResult = String.valueOf(result);

        return resultWithoutTrailingZeros(printedResult);
    }

    private String resultWithoutTrailingZeros(final String printedResult) {
        return printedResult.contains(".") ? printedResult.replaceAll("0*$","").replaceAll("\\.$","") : printedResult;
    }

    @Override
    public String add(final double number) {
        result = result + number;
        return String.valueOf(result);
    }
}
