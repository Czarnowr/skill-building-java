package genomicRangeQuery;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class GenomicRangeQuerySolution3Test {
    private static GenomicRangeQuerySolution3 solver = new GenomicRangeQuerySolution3();

    @Test
    public void GenomicRangeQuerySolution_7MixedLetters3Requests_Return2_4_1 (){
        //Arrange
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] expectedQueryAnswers = {2, 4, 1};

        //Act
        int[] actualQueryAnswers = solver.solution(S, P, Q);

        //Assert
        Assert.assertThat(actualQueryAnswers, is(equalTo(expectedQueryAnswers)));
    }

    @Test
    public void GenomicRangeQuerySolution_7ALetters3Requests_Return1_1_1 (){
        //Arrange
        String S = "AAAAAAA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] expectedQueryAnswers = {1, 1, 1};

        //Act
        int[] actualQueryAnswers = solver.solution(S, P, Q);

        //Assert
        Assert.assertThat(actualQueryAnswers, is(equalTo(expectedQueryAnswers)));
    }

    @Test
    public void GenomicRangeQuerySolution_7CLetters3Requests_Return2_2_2 (){
        //Arrange
        String S = "CCCCCCC";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] expectedQueryAnswers = {2, 2, 2};

        //Act
        int[] actualQueryAnswers = solver.solution(S, P, Q);

        //Assert
        Assert.assertThat(actualQueryAnswers, is(equalTo(expectedQueryAnswers)));
    }

    @Test
    public void GenomicRangeQuerySolution_7GLetters3Requests_Return3_3_3 (){
        //Arrange
        String S = "GGGGGGG";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] expectedQueryAnswers = {3, 3, 3};

        //Act
        int[] actualQueryAnswers = solver.solution(S, P, Q);

        //Assert
        Assert.assertThat(actualQueryAnswers, is(equalTo(expectedQueryAnswers)));
    }

    @Test
    public void GenomicRangeQuerySolution_7TLetters3Requests_Return4_4_4 (){
        //Arrange
        String S = "TTTTTTT";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] expectedQueryAnswers = {4, 4, 4};

        //Act
        int[] actualQueryAnswers = solver.solution(S, P, Q);

        //Assert
        Assert.assertThat(actualQueryAnswers, is(equalTo(expectedQueryAnswers)));
    }

    @Test
    public void GenomicRangeQuerySolution_7TLetters3Requests06_Return1_1_1 (){
        //Arrange
        String S = "AAAAAAA";
        int[] P = {0, 0, 0};
        int[] Q = {6, 6, 6};
        int[] expectedQueryAnswers = {1, 1, 1};

        //Act
        int[] actualQueryAnswers = solver.solution(S, P, Q);

        //Assert
        Assert.assertThat(actualQueryAnswers, is(equalTo(expectedQueryAnswers)));
    }

    @Test
    public void GenomicRangeQuerySolution_7TLetters3Requests66_Return1_1_1 (){
        //Arrange
        String S = "AAAAAAA";
        int[] P = {6, 6, 6};
        int[] Q = {6, 6, 6};
        int[] expectedQueryAnswers = {1, 1, 1};

        //Act
        int[] actualQueryAnswers = solver.solution(S, P, Q);

        //Assert
        Assert.assertThat(actualQueryAnswers, is(equalTo(expectedQueryAnswers)));
    }

    @Test
    public void GenomicRangeQuerySolution_7TLetters3Requests01_Return1_1_1 (){
        //Arrange
        String S = "AAAAAAA";
        int[] P = {0, 0, 0};
        int[] Q = {1, 1, 1};
        int[] expectedQueryAnswers = {1, 1, 1};

        //Act
        int[] actualQueryAnswers = solver.solution(S, P, Q);

        //Assert
        Assert.assertThat(actualQueryAnswers, is(equalTo(expectedQueryAnswers)));
    }

    @Test
    public void GenomicRangeQuerySolution_1TLetter1Request00_Return1 (){
        //Arrange
        String S = "A";
        int[] P = {0};
        int[] Q = {0};
        int[] expectedQueryAnswers = {1};

        //Act
        int[] actualQueryAnswers = solver.solution(S, P, Q);

        //Assert
        Assert.assertThat(actualQueryAnswers, is(equalTo(expectedQueryAnswers)));
    }
}
