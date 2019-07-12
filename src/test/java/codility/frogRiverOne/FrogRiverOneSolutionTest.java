package codility.frogRiverOne;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class FrogRiverOneSolutionTest {
    private static FrogRiverOneSolution solver = new FrogRiverOneSolution();

    @Test
    public void FrogRiverOneSolutionTest_getEarliestJumpTimeForDistance5Array1_3_1_4_2_4_5_4_Result6() {
        int[] arrayOfNumbers = {1, 3, 1, 4, 2, 3, 5, 4};
        int distance = 5;

        int expectedEarliestTimeToJump = 6;

        //Act
        int earliestTimeToJump = solver.solution(distance, arrayOfNumbers);

        //Assert
        Assert.assertThat(earliestTimeToJump, is(equalTo(expectedEarliestTimeToJump)));
    }

    @Test
    public void FrogRiverOneSolutionTest_getEarliestJumpTimeForDistance5Array1_1_1_1ResultNegative1() {
        int[] arrayOfNumbers = {1, 1, 1, 1};
        int distance = 2;

        int expectedEarliestTimeToJump = -1;

        //Act
        int earliestTimeToJump = solver.solution(distance, arrayOfNumbers);

        //Assert
        Assert.assertThat(earliestTimeToJump, is(equalTo(expectedEarliestTimeToJump)));
    }
}
