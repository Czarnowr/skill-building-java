package codility.lesson5_prefixSums_minAvgTwoSlice;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MinAvgTwoSliceTest {
    private static MinAvgTwoSlice solver = new MinAvgTwoSlice();

    @Test
    public void LinearEquations_sampleSolvableEquation1_correctResults() {
        //Arrange
        int[] testedArrayOfNumbers = {4, 2, 2, 5, 1, 5, 8};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(1);
    }
}