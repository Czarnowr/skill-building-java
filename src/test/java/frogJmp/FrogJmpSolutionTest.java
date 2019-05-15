package frogJmp;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class FrogJmpSolutionTest {
    private static FrogJmpSolution solver = new FrogJmpSolution();

    @Test
    public void FrogJmpSolution_getMinimalNumberOfJumpsForStart10End85Distance30_3() {
        int initialPosition = 10;
        int targetPosition = 85;
        int frogJumpDistance = 30;
        int expectedMinimalNumberOfJumps = 3;

        //Act
        int minimalNumberOfJumps = solver.solution(initialPosition, targetPosition, frogJumpDistance);

        //Assert
        Assert.assertThat(minimalNumberOfJumps, is(equalTo(expectedMinimalNumberOfJumps)));
    }

    @Test
    public void FrogJmpSolution_getMinimalNumberOfJumpsForStart0End0Distance30_0() {
        int initialPosition = 0;
        int targetPosition = 0;
        int frogJumpDistance = 30;
        int expectedMinimalNumberOfJumps = 0;

        //Act
        int minimalNumberOfJumps = solver.solution(initialPosition, targetPosition, frogJumpDistance);

        //Assert
        Assert.assertThat(minimalNumberOfJumps, is(equalTo(expectedMinimalNumberOfJumps)));
    }
}
