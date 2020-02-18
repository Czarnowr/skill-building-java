package archive.codility.lesson6_sorting_Distinct;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DistinctTest {
    private static Distinct solver = new Distinct();

    @Test
    public void Distinct_oneUniqueNumberInRangeOfOne_1() {
        //Arrange
        int[] testedArrayOfNumbers = {1};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    public void Distinct_oneUniqueNumberInRangeOfTwo_1() {
        //Arrange
        int[] testedArrayOfNumbers = {1, 1};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    public void Distinct_twoUniqueNumbersInRangeOfTwo_2() {
        //Arrange
        int[] testedArrayOfNumbers = {1, 2};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    public void Distinct_oneUniqueNumberInRangeOfThree_3() {
        //Arrange
        int[] testedArrayOfNumbers = {5, 5, 5};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    public void Distinct_twoUniqueNumbersInRangeOfThree_3() {
        //Arrange
        int[] testedArrayOfNumbers = {5, 5, 6};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    public void Distinct_threeUniqueNumbersInRangeOfThree_3() {
        //Arrange
        int[] testedArrayOfNumbers = {4, 5, 6};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    public void Distinct_threeUniqueNumbersInRangeOfSix_3() {
        //Arrange
        int[] testedArrayOfNumbers = {2, 1, 1, 2, 3, 1};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(3);
    }
}