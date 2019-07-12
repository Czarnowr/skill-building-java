package missingInteger;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class MissingIntegerSolutionTest {

    @Test
    public void MissingIntegerSolution_processArray1_3_6_4_1_2Result5() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {1, 3, 6, 4, 1, 2};

        int expectedSmallestPositiveMissingInteger = 5;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArray4_5_6_2Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {4, 5, 6, 2};

        int expectedSmallestPositiveMissingInteger = 1;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArray1_2_3Result4() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {1, 2, 3};

        int expectedSmallestPositiveMissingInteger = 4;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArrayNeg1_Neg3Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {-1, -3};

        int expectedSmallestPositiveMissingInteger = 1;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArrayNeg1000000_1000000Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {-1000000, 1000000};

        int expectedSmallestPositiveMissingInteger = 1;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArrayNeg1000000_Neg1000000_1000000Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {-1000000, -1000000, 1000000};

        int expectedSmallestPositiveMissingInteger = 1;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArrayNeg1_1Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {-1, 1};

        int expectedSmallestPositiveMissingInteger = 2;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArrayNeg1_2Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {-1, 2};

        int expectedSmallestPositiveMissingInteger = 1;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArrayNeg1_0Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {-1, 0};

        int expectedSmallestPositiveMissingInteger = 1;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArray0_0Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {0, 0};

        int expectedSmallestPositiveMissingInteger = 1;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArray0_0_0_0_0Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {0, 0, 0, 0, 0};

        int expectedSmallestPositiveMissingInteger = 1;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArrayNeg1Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {-1};

        int expectedSmallestPositiveMissingInteger = 1;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArray0Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {0};

        int expectedSmallestPositiveMissingInteger = 1;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArray1Result2() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {1};

        int expectedSmallestPositiveMissingInteger = 2;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }

    @Test
    public void MissingIntegerSolution_processArray5Result1() {
        MissingIntegerSolution solver = new MissingIntegerSolution();

        int[] arrayOfNumbers = {5};

        int expectedSmallestPositiveMissingInteger = 1;

        //Act
        int smallestPositiveMissingInteger = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(smallestPositiveMissingInteger, is(equalTo(expectedSmallestPositiveMissingInteger)));
    }
}
