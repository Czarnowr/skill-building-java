package archive.liang.chapter9_objectsAndClasses.task_9_11;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.within;

public class LinearEquationsTest {

    @Test
    public void LinearEquations_sampleSolvableEquation1_correctResults() {
        //Arrange
        LinearEquations linearEquations = new LinearEquations(0.5, 3, -2, -4, 2, -3);

        //Act
        boolean isSolvable = linearEquations.isSolvable();
        double x = linearEquations.getX();
        double y = linearEquations.getY();

        //Assert
        Assertions.assertThat(isSolvable).isEqualTo(true);
        // target values obtained from independent source
        Assertions.assertThat(x).isCloseTo(0.25, within(0.001));
        Assertions.assertThat(y).isCloseTo(0.625, within(0.001));
    }

    @Test
    public void LinearEquations_sampleSolvableEquation2_correctResults() {
        //Arrange
        LinearEquations linearEquations = new LinearEquations(0.758, -0.25, 0.7745, 2, 8.95, 5);

        //Act
        boolean isSolvable = linearEquations.isSolvable();
        double x = linearEquations.getX();
        double y = linearEquations.getY();

        //Assert
        Assertions.assertThat(isSolvable).isEqualTo(true);
        // target values obtained from independent source
        Assertions.assertThat(x).isCloseTo(11.201, within(0.001));
        Assertions.assertThat(y).isCloseTo(-1.837, within(0.001));
    }

    @Test
    public void LinearEquations_sampleSolvableEquation3_correctResults() {
        //Arrange
        LinearEquations linearEquations = new LinearEquations(2, 7, 5, -7, -5, 12);

        //Act
        boolean isSolvable = linearEquations.isSolvable();
        double x = linearEquations.getX();
        double y = linearEquations.getY();

        //Assert
        Assertions.assertThat(isSolvable).isEqualTo(true);
        // target values obtained from independent source
        Assertions.assertThat(x).isCloseTo(1, within(0.001));
        Assertions.assertThat(y).isCloseTo(-1, within(0.001));
    }

    @Test
    public void LinearEquations_sampleNonSolvableEquation1_correctResults() {
        //Arrange
        LinearEquations linearEquations = new LinearEquations(2, 5, 2, 5, -5, -1);

        //Act
        boolean isSolvable = linearEquations.isSolvable();
        String result = linearEquations.getSolution();

        //Assert
        Assertions.assertThat(isSolvable).isEqualTo(false);
        Assertions.assertThat(result).contains("The equation has no solution.");
    }

    @Test
    public void LinearEquations_sampleNonSolvableEquation2_correctResults() {
        //Arrange
        LinearEquations linearEquations = new LinearEquations(4, 2, 8, 4, -52, 21);

        //Act
        boolean isSolvable = linearEquations.isSolvable();
        String result = linearEquations.getSolution();

        //Assert
        Assertions.assertThat(isSolvable).isEqualTo(false);
        Assertions.assertThat(result).contains("The equation has no solution.");
    }

    @Test
    public void LinearEquations_sampleNonSolvableEquation3_correctResults() {
        //Arrange
        LinearEquations linearEquations = new LinearEquations(-5, 4, -10, 8, 1, 221);

        //Act
        boolean isSolvable = linearEquations.isSolvable();
        String result = linearEquations.getSolution();

        //Assert
        Assertions.assertThat(isSolvable).isEqualTo(false);
        Assertions.assertThat(result).contains("The equation has no solution.");
    }
}