package liang.chapter9_objectsAndClasses.task_9_1;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * 9.1 (The Rectangle class) Following the example of the Circle class in Section 9.2,
 * design a class named Rectangle to represent a rectangle. The class contains:
 * ■ Two double data fields named width and height that specify the width and
 * height of the rectangle. The default values are 1 for both width and height.
 * ■ A no-arg constructor that creates a default rectangle.
 * ■ A constructor that creates a rectangle with the specified width and height.
 * ■ A method named getArea() that returns the area of this rectangle.
 * ■ A method named getPerimeter() that returns the perimeter.
 * <p>
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates two Rectangle objects—one with width 4 and height 40
 * and the other with width 3.5 and height 35.9. Display the width, height, area,
 * and perimeter of each rectangle in this order.
 */

public class RectangleTest {

    @Test
    public void Rectangle_createWithDefaultConstructor_width1 (){
        //Arrange
        Rectangle rectangle = new Rectangle();

        //Act
        double width = rectangle.getWidth();

        //Assert
        Assert.assertThat(width, is(equalTo(1.0)));
    }

    @Test
    public void Rectangle_createWithDefaultConstructor_height1 (){
        //Arrange
        Rectangle rectangle = new Rectangle();

        //Act
        double height = rectangle.getHeight();

        //Assert
        Assert.assertThat(height, is(equalTo(1.0)));
    }

    @Test
    public void Rectangle_createWithDefaultConstructor_area1 (){
        //Arrange
        Rectangle rectangle = new Rectangle();

        //Act
        double area = rectangle.getArea();

        //Assert
        Assert.assertThat(area, is(closeTo(1.0,0.1)));
    }

    @Test
    public void Rectangle_createWithDefaultConstructor_perimeter4 (){
        //Arrange
        Rectangle rectangle = new Rectangle();

        //Act
        double perimeter = rectangle.getPerimeter();

        //Assert
        Assert.assertThat(perimeter, is(closeTo(4.0,0.1)));
    }

    @Test
    public void Rectangle_createWidth4Height40_width4 (){
        //Arrange
        Rectangle rectangle = new Rectangle(4, 40);

        //Act
        double width = rectangle.getWidth();

        //Assert
        Assert.assertThat(width, is(equalTo(4.0)));
    }

    @Test
    public void Rectangle_createWidth4Height40_height40 (){
        //Arrange
        Rectangle rectangle = new Rectangle(4, 40);

        //Act
        double height = rectangle.getHeight();

        //Assert
        Assert.assertThat(height, is(equalTo(40.0)));
    }

    @Test
    public void Rectangle_createWidth4Height40_area160 (){
        //Arrange
        Rectangle rectangle = new Rectangle(4, 40);

        //Act
        double area = rectangle.getArea();

        //Assert
        Assert.assertThat(area, is(closeTo(160.0,0.1)));
    }

    @Test
    public void Rectangle_createWidth4Height40_perimeter88 (){
        //Arrange
        Rectangle rectangle = new Rectangle(4, 40);

        //Act
        double perimeter = rectangle.getPerimeter();

        //Assert
        Assert.assertThat(perimeter, is(closeTo(88.0,0.1)));
    }

    @Test
    public void Rectangle_createWidth3Point5Height35Point9_width3Point5 (){
        //Arrange
        Rectangle rectangle = new Rectangle(3.5, 35.9);

        //Act
        double width = rectangle.getWidth();

        //Assert
        Assert.assertThat(width, is(equalTo(3.5)));
    }

    @Test
    public void Rectangle_createWidth3Point5Height35Point9_height35Point9 (){
        //Arrange
        Rectangle rectangle = new Rectangle(3.5, 35.9);

        //Act
        double height = rectangle.getHeight();

        //Assert
        Assert.assertThat(height, is(equalTo(35.9)));
    }

    @Test
    public void Rectangle_createWidth3Point5Height35Point9_area125Point65 (){
        //Arrange
        Rectangle rectangle = new Rectangle(3.5, 35.9);

        //Act
        double area = rectangle.getArea();

        //Assert
        Assert.assertThat(area, is(closeTo(125.65, 0.1)));
    }

    @Test
    public void Rectangle_createWidth3Point5Height35Point9_perimeter78Point8 (){
        //Arrange
        Rectangle rectangle = new Rectangle(3.5, 35.9);

        //Act
        double perimeter = rectangle.getPerimeter();

        //Assert
        Assert.assertThat(perimeter, is(closeTo(78.8,0.1)));
    }
}
