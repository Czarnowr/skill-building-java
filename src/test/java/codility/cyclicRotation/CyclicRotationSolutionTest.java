package codility.cyclicRotation;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class CyclicRotationSolutionTest {
    private static CyclicRotationSolution solver = new CyclicRotationSolution();

    @Test
    public void Solution_rotateArray3_8_9_7_6ByOnePlace_ArrayOfIntegers6_3_8_9_7 (){
        //Arrange
        int[] testedArrayOfNumbers = {3, 8, 9, 7, 6};
        int[] expectedArrayOfNumbers = {6, 3, 8, 9, 7};
        int placesToRotate = 1;

        //Act
        int[] rotatedArray = solver.solution(testedArrayOfNumbers, placesToRotate);

        //Assert
        Assert.assertThat(rotatedArray, is(equalTo(expectedArrayOfNumbers)));
    }

    @Test
    public void Solution_rotateArray3_8_9_7_6By3Places_ArrayOfIntegers9_7_6_3_8 (){
        //Arrange
        int[] testedArrayOfNumbers = {3, 8, 9, 7, 6};
        int[] expectedArrayOfNumbers = {9, 7, 6, 3, 8};
        int placesToRotate = 3;

        //Act
        int[] rotatedArray = solver.solution(testedArrayOfNumbers, placesToRotate);

        //Assert
        Assert.assertThat(rotatedArray, is(equalTo(expectedArrayOfNumbers)));
    }

    @Test
    public void Solution_rotateArray0_0_0By1Place_ArrayOfIntegers0_0_0 (){
        //Arrange
        int[] testedArrayOfNumbers = {0, 0, 0};
        int[] expectedArrayOfNumbers = {0, 0, 0};
        int placesToRotate = 1;

        //Act
        int[] rotatedArray = solver.solution(testedArrayOfNumbers, placesToRotate);

        //Assert
        Assert.assertThat(rotatedArray, is(equalTo(expectedArrayOfNumbers)));
    }

    @Test
    public void Solution_rotateArray1_2_3_4By4Places_ArrayOfIntegers1_2_3_4 (){
        //Arrange
        int[] testedArrayOfNumbers = {1, 2, 3, 4};
        int[] expectedArrayOfNumbers = {1, 2, 3, 4};
        int placesToRotate = 4;

        //Act
        int[] rotatedArray = solver.solution(testedArrayOfNumbers, placesToRotate);

        //Assert
        Assert.assertThat(rotatedArray, is(equalTo(expectedArrayOfNumbers)));
    }
}
