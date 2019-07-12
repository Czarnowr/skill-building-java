package codility.permMissingElem;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class PermMissingElemSolutionTest {
    private static PermMissingElemSolution solver = new PermMissingElemSolution();

    @Test
    public void FrogJmpSolution_getMinimalNumberOfJumpsForStart10End85Distance30_3() {
        int[] arrayOfNumbers = {2, 3, 1, 5};

        int expectedMissingNumber = 4;

        //Act
        int missingNumber = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(missingNumber, is(equalTo(expectedMissingNumber)));
    }
}
