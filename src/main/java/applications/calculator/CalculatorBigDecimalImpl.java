package applications.calculator;

import java.math.BigDecimal;

class CalculatorBigDecimalImpl extends Calculator{
    private BigDecimal result;

    CalculatorBigDecimalImpl() {
        this.result = new BigDecimal("0");
    }

    @Override
    public String getResult() {
        String printedResult = result.toString();
        return resultWithoutTrailingZeros(printedResult);
    }

    private String resultWithoutTrailingZeros(final String printedResult) {
        return printedResult.contains(".") ? printedResult.replaceAll("0*$","").replaceAll("\\.$","") : printedResult;
    }

    @Override
    public String add(final double number) {
        result = result.add(BigDecimal.valueOf(number));
        return result.toString();
    }

    @Override
    public String subtract(final double number) {
        result = result.subtract(BigDecimal.valueOf(number));
        return result.toString();
    }
}
