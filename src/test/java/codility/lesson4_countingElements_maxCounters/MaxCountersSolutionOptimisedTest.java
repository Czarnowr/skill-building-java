package codility.lesson4_countingElements_maxCounters;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class MaxCountersSolutionOptimisedTest {

    @Test
    public void MaxCountersSolution_processCountersOnArray3_4_4_6_1_4_4ResultArray3_2_2_4_2() {
        MaxCountersSolutionOptimised solver = new MaxCountersSolutionOptimised();

        int[] arrayOfNumbers = {3, 4, 4, 6, 1, 4, 4};
        int numberOfCounters = 5;

        int[] expectedArrayOfCounters = {3, 2, 2, 4, 2};

        //Act
        int[] arrayOfCounters1 = solver.solution(numberOfCounters, arrayOfNumbers);

        //Assert
        Assert.assertThat(arrayOfCounters1, is(equalTo(expectedArrayOfCounters)));
    }

    @Test
    public void MaxCountersSolution_processCountersOnArray2_1_1_2_1ResultArray3() {
        MaxCountersSolutionOptimised solver = new MaxCountersSolutionOptimised();

        int[] arrayOfNumbers = {2, 1, 1, 2, 1};
        int numberOfCounters = 1;

        int[] expectedArrayOfCounters = {3};

        //Act
        int[] arrayOfCounters2 = solver.solution(numberOfCounters, arrayOfNumbers);

        //Assert
        Assert.assertThat(arrayOfCounters2, is(equalTo(expectedArrayOfCounters)));
    }

    @Test
    public void MaxCountersSolution_processCountersOnArray1_1_1_2_2_2_2_2_1_2ResultArray4() {
        MaxCountersSolutionOptimised solver = new MaxCountersSolutionOptimised();

        int[] arrayOfNumbers = {1, 1, 1, 2, 2, 2, 2, 2, 1, 2};
        int numberOfCounters = 1;

        int[] expectedArrayOfCounters = {4};

        //Act
        int[] arrayOfCounters2 = solver.solution(numberOfCounters, arrayOfNumbers);

        //Assert
        Assert.assertThat(arrayOfCounters2, is(equalTo(expectedArrayOfCounters)));
    }
}
