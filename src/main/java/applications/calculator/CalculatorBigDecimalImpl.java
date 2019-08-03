package applications.calculator;

import java.math.BigDecimal;

class CalculatorBigDecimalImpl extends Calculator{
    private BigDecimal result;

    CalculatorBigDecimalImpl() {
        this.result = new BigDecimal("0");
    }

    @Override
    public String getResult() {
        return result.toString();
    }
}
