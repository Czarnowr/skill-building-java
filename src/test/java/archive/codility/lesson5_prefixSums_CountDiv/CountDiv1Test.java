package archive.codility.lesson5_prefixSums_CountDiv;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CountDiv1Test {
    private static CountDiv1 solver = new CountDiv1();

    @Test
    public void CountDiv1_numbers6To11DivisibleBy2_3() {
        //Arrange
        int A = 6;
        int B = 11;
        int K = 2;

        //Act
        int actual = solver.solution(A, B, K);

        //Assert
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    public void CountDiv1_numbers5To10DivisibleBy2_3() {
        //Arrange
        int A = 5;
        int B = 10;
        int K = 2;

        //Act
        int actual = solver.solution(A, B, K);

        //Assert
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    public void CountDiv1_numbers0To0DivisibleBy2_1() {
        //Arrange
        int A = 0;
        int B = 0;
        int K = 2;

        //Act
        int actual = solver.solution(A, B, K);

        //Assert
        Assertions.assertThat(actual).isEqualTo(1);
    }
}