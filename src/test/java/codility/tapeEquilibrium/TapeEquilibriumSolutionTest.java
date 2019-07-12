package codility.tapeEquilibrium;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class TapeEquilibriumSolutionTest {
    private static TapeEquilibriumSolution solver = new TapeEquilibriumSolution();

    @Test
    public void TapeEquilibrium_getMinimalDifferenceForArray3_1_2_4_3_Result1() {
        int[] arrayOfNumbers = {3, 1, 2, 4, 3};

        //P = 1, difference = |3 − 10| = 7
        //P = 2, difference = |4 − 9| = 5
        //P = 3, difference = |6 − 7| = 1
        //P = 4, difference = |10 − 3| = 7

        int expectedMinimalDifference = 1;

        //Act
        int minimalDifference = solver.solution(arrayOfNumbers);

        //Assert
        Assert.assertThat(minimalDifference, is(equalTo(expectedMinimalDifference)));
    }

}
