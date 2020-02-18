package archive.liang.chapter9_objectsAndClasses.task_9_1;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.number.IsCloseTo.closeTo;

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
