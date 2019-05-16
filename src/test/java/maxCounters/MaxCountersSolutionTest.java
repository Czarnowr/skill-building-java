package maxCounters;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class MaxCountersSolutionTest {
    private static MaxCountersSolution solver = new MaxCountersSolution();

    @Test
    public void MaxCountersSolution_processCountersOnArray3_4_4_6_1_4_4ResultArray3_2_2_4_2() {
        int[] arrayOfNumbers = {3, 4, 4, 6, 1, 4, 4};
        int numberOfCounters = 5;

        int[] expectedArrayOfCounters = {3, 2, 2, 4, 2};

        //Act
        int[] arrayOfCounters = solver.solution(numberOfCounters, arrayOfNumbers);

        //Assert
        Assert.assertThat(arrayOfCounters, is(equalTo(expectedArrayOfCounters)));
    }
}
