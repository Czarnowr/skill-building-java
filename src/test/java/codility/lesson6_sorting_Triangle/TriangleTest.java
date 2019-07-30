package codility.lesson6_sorting_Triangle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TriangleTest {
    private static Triangle solver = new Triangle();

    @Test
    public void Triangle_arrayWithValidTriplet_1() {
        //Arrange
        int[] testedArrayOfNumbers = {10, 2, 5, 1, 8, 20};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    public void Triangle_arrayWithoutValidTriplet_0() {
        //Arrange
        int[] testedArrayOfNumbers = {10, 50, 5, 1};

        //Act
        int actual = solver.solution(testedArrayOfNumbers);

        //Assert
        Assertions.assertThat(actual).isEqualTo(0);
    }
}