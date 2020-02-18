package archive.liang.chapter9_objectsAndClasses.task_9_9;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.within;

public class RegularPolygonTest {

    @Test
    public void RegularPolygon_defaultConstructor_correctPerimeter() {
        //Arrange
        RegularPolygon regularPolygon = new RegularPolygon();

        //Act
        double perimeter = regularPolygon.getPerimeter();

        //Assert
        Assertions.assertThat(perimeter).isEqualTo(3);
    }

    @Test
    public void RegularPolygon_defaultConstructor_correctArea() {
        //Arrange
        RegularPolygon regularPolygon = new RegularPolygon();

        //Act
        double area = regularPolygon.getArea();

        //Assert
        // target values obtained from independent source
        Assertions.assertThat(area).isCloseTo(0.433013, within(0.000001));
    }

    @Test
    public void RegularPolygon_Sides6Length4_correctPerimeter() {
        //Arrange
        RegularPolygon regularPolygon = new RegularPolygon(6, 4);

        //Act
        double perimeter = regularPolygon.getPerimeter();

        //Assert
        Assertions.assertThat(perimeter).isEqualTo(24);
    }

    @Test
    public void RegularPolygon_Sides6Length4_correctArea() {
        //Arrange
        RegularPolygon regularPolygon = new RegularPolygon(6, 4);

        //Act
        double area = regularPolygon.getArea();

        //Assert
        // target values obtained from independent source
        Assertions.assertThat(area).isCloseTo(41.569219, within(0.000001));
    }

    @Test
    public void RegularPolygon_Sides10Length4CoordinateX5Point6CoordinateY7Point8_correctPerimeter() {
        //Arrange
        RegularPolygon regularPolygon = new RegularPolygon(10, 4, 5.6, 7.8);

        //Act
        double perimeter = regularPolygon.getPerimeter();

        //Assert
        Assertions.assertThat(perimeter).isEqualTo(40);
    }

    @Test
    public void RegularPolygon_Sides10Length4CoordinateX5Point6CoordinateY7Point8_correctArea() {
        //Arrange
        RegularPolygon regularPolygon = new RegularPolygon(10, 4, 5.6, 7.8);

        //Act
        double area = regularPolygon.getArea();

        //Assert
        // target values obtained from independent source
        Assertions.assertThat(area).isCloseTo(123.107341, within(0.000001));
    }
}