package archive.codility.lesson6_sorting_MaxProductOfThree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MaxProductOfThreeTest {
    private static MaxProductOfThree solver = new MaxProductOfThree();

    @Test
    public void MaxProductOfThree_resultProducedFromPositiveNumbers_60() {
        //Arrange
        int[]testedArrayOfNumbers = {-3, 1, 2, -2, 5, 6};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(60);
    }

    @Test
    public void MaxProductOfThree_resultProducedFromPositiveAndNegativeNumbers_60() {
        //Arrange
        int[]testedArrayOfNumbers = {-3, 1, 2, 2, -5, -6};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(60);
    }

    @Test
    public void MaxProductOfThree_three0s_0() {
        //Arrange
        int[]testedArrayOfNumbers = {0, 0, 0};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    public void MaxProductOfThree_twoNumbersAnd0_0() {
        //Arrange
        int[]testedArrayOfNumbers = {1, 1, 0};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    public void MaxProductOfThree_threeNegativeNumbers_negative1() {
        //Arrange
        int[]testedArrayOfNumbers = {-1, -1, -1};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(-1);
    }

    @Test
    public void MaxProductOfThree_codilityTest_negative1() {
        //Arrange
        int[]testedArrayOfNumbers = {-5, 5, -5, 4};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(125);
    }
}