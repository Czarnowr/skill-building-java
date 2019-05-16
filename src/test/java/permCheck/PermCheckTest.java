package permCheck;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

class PermCheckTest {
    private static PermCheck solver = new PermCheck();

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
}
