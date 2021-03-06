package archive.codility.lesson5_prefixSums_minAvgTwoSlice;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MinAvgTwoSliceTest {
    private static MinAvgTwoSlice solver = new MinAvgTwoSlice();

    @Test
    public void MinAvgTwoSlice_positiveNumbersSliceOf2_correctResult() {
        //Arrange
        int[] testedArrayOfNumbers = {4, 2, 2, 5, 1, 5, 8};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    public void MinAvgTwoSlice_positiveNumbersSliceOf3_correctResult() {
        //Arrange
        int[] testedArrayOfNumbers = {4, 5, 1, 2, 5, 1, 2, 1};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(5);
    }

    @Test
    public void MinAvgTwoSlice_negativeNumbersSliceOf2_correctResult() {
        //Arrange
        int[] testedArrayOfNumbers = {-3, -5, -8, -12, -10};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    public void MinAvgTwoSlice_negativeNumbersSliceOf3_correctResult() {
        //Arrange
        int[] testedArrayOfNumbers = {-3, -5, -8, -4, -10};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(2);
    }
}