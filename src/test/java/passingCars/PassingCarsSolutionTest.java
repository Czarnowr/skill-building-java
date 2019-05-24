package passingCars;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class PassingCarsSolutionTest {
    private static PassingCarsSolution solver = new PassingCarsSolution();

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray0_1_0_1_1_Return5 (){
        //Arrange
        int[] testedArrayOfNumbers = {0, 1, 0, 1, 1};
        int expectedPairsOfPassingCars = 5;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }
}
