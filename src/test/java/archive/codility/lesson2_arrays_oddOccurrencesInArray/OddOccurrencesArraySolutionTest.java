package archive.codility.lesson2_arrays_oddOccurrencesInArray;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class OddOccurrencesArraySolutionTest {
    private static OddOccurrencesArraySolution solver = new OddOccurrencesArraySolution();

    @Test
    public void Solution_findValueOfUnpairedElement_7 (){
        //Arrange
        int[] testedArrayOfNumbers = {9, 3, 9, 3, 9, 7, 9};
        int expectedUnpairedElement = 7;

        //Act
        int unpairedElement = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(unpairedElement, is(equalTo(expectedUnpairedElement)));
    }
}
