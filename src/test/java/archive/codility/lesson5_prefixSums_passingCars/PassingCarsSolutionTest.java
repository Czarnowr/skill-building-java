package archive.codility.lesson5_prefixSums_passingCars;

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

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray0_Return0 (){
        //Arrange
        int[] testedArrayOfNumbers = {0};
        int expectedPairsOfPassingCars = 0;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray1_Return0 (){
        //Arrange
        int[] testedArrayOfNumbers = {1};
        int expectedPairsOfPassingCars = 0;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray0_0_0_0_0Return0 (){
        //Arrange
        int[] testedArrayOfNumbers = {0, 0, 0, 0, 0};
        int expectedPairsOfPassingCars = 0;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray1_1_1_1_1Return0 (){
        //Arrange
        int[] testedArrayOfNumbers = {1, 1, 1, 1, 1};
        int expectedPairsOfPassingCars = 0;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray0_1_1_1_1Return4 (){
        //Arrange
        int[] testedArrayOfNumbers = {0, 1, 1, 1, 1};
        int expectedPairsOfPassingCars = 4;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray1_0_0_0_0Return0 (){
        //Arrange
        int[] testedArrayOfNumbers = {1, 0, 0, 0, 0};
        int expectedPairsOfPassingCars = 0;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray1_0_1_1_1Return3 (){
        //Arrange
        int[] testedArrayOfNumbers = {1, 0, 1, 1, 1};
        int expectedPairsOfPassingCars = 3;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray0_1_0_0_0Return1 (){
        //Arrange
        int[] testedArrayOfNumbers = {0, 1, 0, 0, 0};
        int expectedPairsOfPassingCars = 1;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray1_1_0_1_1Return2 (){
        //Arrange
        int[] testedArrayOfNumbers = {1, 1, 0, 1, 1};
        int expectedPairsOfPassingCars = 2;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray0_0_1_0_0Return2 (){
        //Arrange
        int[] testedArrayOfNumbers = {0, 0, 1, 0, 0};
        int expectedPairsOfPassingCars = 2;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray1_1_1_0_1Return2 (){
        //Arrange
        int[] testedArrayOfNumbers = {1, 1, 1, 0, 1};
        int expectedPairsOfPassingCars = 1;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray0_0_0_1_0Return3 (){
        //Arrange
        int[] testedArrayOfNumbers = {0, 0, 0, 1, 0};
        int expectedPairsOfPassingCars = 3;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray1_1_1_1_0Return1 (){
        //Arrange
        int[] testedArrayOfNumbers = {1, 1, 1, 1, 0};
        int expectedPairsOfPassingCars = 0;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }

    @Test
    public void PassingCarsSolution_findPairsOfPassingCarsInArray0_0_0_0_1Return4 (){
        //Arrange
        int[] testedArrayOfNumbers = {0, 0, 0, 0, 1};
        int expectedPairsOfPassingCars = 4;
        //Act
        int actualPairsOfPassingCars = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(actualPairsOfPassingCars, is(equalTo(expectedPairsOfPassingCars)));
    }
}
