package archive.liang.chapter9_objectsAndClasses.task_9_10;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.within;

public class QuadraticEquationTest {

    @Test
    public void QuadraticEquation_sampleQuadraticEquation1_Discriminant961TwoRoots(){
        //Arrange
        QuadraticEquation quadraticEquation = new QuadraticEquation(6, 11, -35);

        //Act
        double discriminant = quadraticEquation.getDiscriminant();
        String result = quadraticEquation.getSolution();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();

        //Assert
        Assertions.assertThat(discriminant).isEqualTo(961);
        Assertions.assertThat(result).contains("The equation has two roots:");
        Assertions.assertThat(root1).isCloseTo(1.667, within(0.01));
        Assertions.assertThat(root2).isCloseTo(-3.5, within(0.01));
    }

    @Test
    public void QuadraticEquation_sampleQuadraticEquation2_Discriminant32TwoRoots(){
        //Arrange
        QuadraticEquation quadraticEquation = new QuadraticEquation(2, 4, -2);

        //Act
        double discriminant = quadraticEquation.getDiscriminant();
        String result = quadraticEquation.getSolution();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();

        //Assert
        Assertions.assertThat(discriminant).isEqualTo(32);
        Assertions.assertThat(result).contains("The equation has two roots:");
        Assertions.assertThat(root1).isCloseTo(0.414214, within(0.01));
        Assertions.assertThat(root2).isCloseTo(-2.414214, within(0.01));
    }

    @Test
    public void QuadraticEquation_sampleQuadraticEquation3_Discriminant0OneRoot(){
        //Arrange
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 4, 4);

        //Act
        double discriminant = quadraticEquation.getDiscriminant();
        String result = quadraticEquation.getSolution();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();

        //Assert
        Assertions.assertThat(discriminant).isEqualTo(0);
        Assertions.assertThat(result).contains("The equation has one root");
        Assertions.assertThat(root1).isCloseTo(-2, within(0.01));
        Assertions.assertThat(root2).isCloseTo(-2, within(0.01));
    }

    @Test
    public void QuadraticEquation_sampleQuadraticEquation4_Discriminant0OneRoot(){
        //Arrange
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, -6, 9);

        //Act
        double discriminant = quadraticEquation.getDiscriminant();
        String result = quadraticEquation.getSolution();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();

        //Assert
        Assertions.assertThat(discriminant).isEqualTo(0);
        Assertions.assertThat(result).contains("The equation has one root");
        Assertions.assertThat(root1).isCloseTo(3, within(0.01));
        Assertions.assertThat(root2).isCloseTo(3, within(0.01));
    }

    @Test
    public void QuadraticEquation_sampleQuadraticEquation5_DiscriminantNeg3NoRoots(){
        //Arrange
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 1, 1);

        //Act
        double discriminant = quadraticEquation.getDiscriminant();
        String result = quadraticEquation.getSolution();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();

        //Assert
        Assertions.assertThat(discriminant).isEqualTo(-3);
        Assertions.assertThat(result).contains("The equation has no roots");
        Assertions.assertThat(root1).isCloseTo(0, within(0.01));
        Assertions.assertThat(root2).isCloseTo(0, within(0.01));
    }

    @Test
    public void QuadraticEquation_sampleQuadraticEquation6_DiscriminantNeg47NoRoots(){
        //Arrange
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 1, 12);

        //Act
        double discriminant = quadraticEquation.getDiscriminant();
        String result = quadraticEquation.getSolution();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();

        //Assert
        Assertions.assertThat(discriminant).isEqualTo(-47);
        Assertions.assertThat(result).contains("The equation has no roots");
        Assertions.assertThat(root1).isCloseTo(0, within(0.01));
        Assertions.assertThat(root2).isCloseTo(0, within(0.01));
    }
}