package OddOccurrencesInArray;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class SolutionTest {
    private static Solution solver = new Solution();

    @Test
    public void Solution_findValueOfUnpairedElement_7 (){
        //Arrange
        int[] testedArrayOfNumbers = {9, 3, 9, 3, 9, 7, 9};
        int expectedUnpairedElement = 7;

        //Act
        int binaryGap = solver.solution(testedArrayOfNumbers);

        //Assert
        Assert.assertThat(binaryGap, is(equalTo(expectedUnpairedElement)));
    }
}
