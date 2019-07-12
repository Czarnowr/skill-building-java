package liang.chapter9_objectsAndClasses.task_9_1;

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

@SuppressWarnings("WeakerAccess")
public class Rectangle {

    private double width;
    private double height;

    public Rectangle(final double width, final double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(1, 1);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.height;
    }
}
