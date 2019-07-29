package codility.lesson4_countingElements_permCheck;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class PermCheckSolutionTest {
    private static PermCheckSolution solver = new PermCheckSolution();

    @Test
    public void PermCheckTest_checkIfArray4_1_3_2IsAPermutation_Result1() {
        int[] arrayOfNumbers = {4, 1, 3, 2};

        int expectedResult = 1;

        //Act
        int isPermutation = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(isPermutation, is(equalTo(expectedResult)));
    }

    @Test
    public void PermCheckTest_checkIfArray4_1_3IsAPermutation_Result0() {
        int[] arrayOfNumbers = {4, 1, 3};

        int expectedResult = 0;

        //Act
        int isPermutation = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(isPermutation, is(equalTo(expectedResult)));
    }

    @Test
    public void PermCheckTest_checkIfArray4IsAPermutation_Result0() {
        int[] arrayOfNumbers = {4};

        int expectedResult = 0;

        //Act
        int isPermutation = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(isPermutation, is(equalTo(expectedResult)));
    }

    @Test
    public void PermCheckTest_checkIfArray1IsAPermutation_Result1() {
        int[] arrayOfNumbers = {1};

        int expectedResult = 1;

        //Act
        int isPermutation = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(isPermutation, is(equalTo(expectedResult)));
    }

    @Test
    public void PermCheckTest_checkIfArray4_3IsAPermutation_Result0() {
        int[] arrayOfNumbers = {4, 3};

        int expectedResult = 0;

        //Act
        int isPermutation = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(isPermutation, is(equalTo(expectedResult)));
    }

    @Test
    public void PermCheckTest_checkIfArray1_2IsAPermutation_Result1() {
        int[] arrayOfNumbers = {1, 2};

        int expectedResult = 1;

        //Act
        int isPermutation = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(isPermutation, is(equalTo(expectedResult)));
    }

    @Test
    public void PermCheckTest_checkIfArray4_6IsAPermutation_Result0() {
        int[] arrayOfNumbers = {4, 6};

        int expectedResult = 0;

        //Act
        int isPermutation = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(isPermutation, is(equalTo(expectedResult)));
    }

    @Test
    public void PermCheckTest_checkIfArray1_3IsAPermutation_Result0() {
        int[] arrayOfNumbers = {1, 3};

        int expectedResult = 0;

        //Act
        int isPermutation = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(isPermutation, is(equalTo(expectedResult)));
    }
}
