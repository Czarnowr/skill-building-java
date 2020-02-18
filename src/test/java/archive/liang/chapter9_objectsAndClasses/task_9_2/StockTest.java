package archive.liang.chapter9_objectsAndClasses.task_9_2;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class StockTest {

    @Test
    public void Stock_createStockWithSymbolORCL_correctSymbol (){
        //Arrange
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        //Act
        String symbol = stock.getSymbol();

        //Assert
        Assert.assertThat(symbol, is(equalTo("ORCL")));
    }

    @Test
    public void Stock_createStockWithNameOracleCorporation_correctName (){
        //Arrange
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        //Act
        String name = stock.getName();

        //Assert
        Assert.assertThat(name, is(equalTo("Oracle Corporation")));
    }

    @Test
    public void Stock_setCurrentPrice34Point5_currentPrice34Point5 (){
        //Arrange
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setCurrentPrice(34.5);

        //Act
        Double currentPrice = stock.getCurrentPrice();

        //Assert
        Assert.assertThat(currentPrice, is(equalTo(34.5)));
    }

    @Test
    public void Stock_setCurrentPriceTwice_correctCurrentPrice (){
        //Arrange
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setCurrentPrice(34.5);
        stock.setCurrentPrice(34.35);

        //Act
        Double currentPrice = stock.getCurrentPrice();

        //Assert
        Assert.assertThat(currentPrice, is(equalTo(34.35)));
    }

    @Test
    public void Stock_setCurrentPriceTwice_correctPreviousClosingPrice (){
        //Arrange
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setCurrentPrice(34.5);
        stock.setCurrentPrice(34.35);

        //Act
        double previousClosingPrice = stock.getPreviousClosingPrice();

        //Assert
        Assert.assertThat(previousClosingPrice, is(equalTo(34.5)));
    }

    @Test
    public void Stock_setCurrentPriceTwice_correctChangePercent (){
        //Arrange
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setCurrentPrice(34.5);
        stock.setCurrentPrice(34.35);

        //Act
        Double changePercent = stock.getChangePercent();

        //Assert
        Assert.assertThat(changePercent, is(closeTo(-0.43, 0.01)));
    }
}