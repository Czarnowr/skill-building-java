package codility.lesson1_iterations.binaryGap;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class BinaryGapSolutionTest {
    private static BinaryGapSolution solver = new BinaryGapSolution();

    @Test
    public void Solution_findLongestBinaryGapForInteger9_2 (){
        //Arrange
        int testedNumber = 9;
        int expectedBinaryGap = 2;

        //Act
        int binaryGap = solver.solution(testedNumber);

        //Assert
        Assert.assertThat(binaryGap, is(equalTo(expectedBinaryGap)));
    }

    @Test
    public void Solution_findLongestBinaryGapForInteger20_1 (){
        //Arrange
        int testedNumber = 20;
        int expectedBinaryGap = 1;

        //Act
        int binaryGap = solver.solution(testedNumber);

        //Assert
        Assert.assertThat(binaryGap, is(equalTo(expectedBinaryGap)));
    }

    @Test
    public void Solution_findLongestBinaryGapForInteger32_0 (){
        //Arrange
        int testedNumber = 32;
        int expectedBinaryGap = 0;

        //Act
        int binaryGap = solver.solution(testedNumber);

        //Assert
        Assert.assertThat(binaryGap, is(equalTo(expectedBinaryGap)));
    }

    @Test
    public void Solution_findLongestBinaryGapForInteger529_4 (){
        //Arrange
        int testedNumber = 529;
        int expectedBinaryGap = 4;

        //Act
        int binaryGap = solver.solution(testedNumber);

        //Assert
        Assert.assertThat(binaryGap, is(equalTo(expectedBinaryGap)));
    }

    @Test
    public void Solution_findLongestBinaryGapForInteger1041_5 (){
        //Arrange
        int testedNumber = 1041;
        int expectedBinaryGap = 5;

        //Act
        int binaryGap = solver.solution(testedNumber);

        //Assert
        Assert.assertThat(binaryGap, is(equalTo(expectedBinaryGap)));
    }

    @Test
    public void Solution_findLongestBinaryGapForInteger2147483647_0 (){
        //Arrange
        int testedNumber = 2147483647;
        int expectedBinaryGap = 0;

        //Act
        int binaryGap = solver.solution(testedNumber);

        //Assert
        Assert.assertThat(binaryGap, is(equalTo(expectedBinaryGap)));
    }
}
