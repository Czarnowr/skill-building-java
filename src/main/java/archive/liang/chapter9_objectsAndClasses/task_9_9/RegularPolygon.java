package archive.liang.chapter9_objectsAndClasses.task_9_9;

import lombok.Getter;
import lombok.Setter;

/**
 * **9.9 (RegularPolygon: n-sided regular polygon) In an n-sided regular polygon, all sides
 * have the same length and all angles have the same degree (i.e., the polygon is
 * both equilateral and equiangular). Design a class named RegularPolygon that
 * contains:
 * ■ A private int data field named n that defines the number of sides in the polygon
 * with default value 3.
 * ■ A private double data field named side that stores the length of the side with
 * default value 1.
 * ■ A private double data field named x that defines the x-coordinate of the polygon’s
 * center with default value 0.
 * ■ A private double data field named y that defines the y-coordinate of the polygon’s
 * center with default value 0.
 * ■ A no-arg constructor that creates a regular polygon with default values.
 * ■ A constructor that creates a regular polygon with the specified number of sides
 * and length of side, centered at (0, 0).
 * ■ A constructor that creates a regular polygon with the specified number of sides,
 * length of side, and x- and y-coordinates.
 * ■ The accessor and mutator methods for all data fields.
 * ■ The method getPerimeter() that returns the perimeter of the polygon.
 * ■ The method getArea() that returns the area of the polygon. The formula for
 * <p>
 * computing the area of a regular polygon is Area = (n * s2) / (4 * tan(PI/n))
 * <p>
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates three RegularPolygon objects, created using the no-arg
 * constructor, using RegularPolygon(6, 4), and using RegularPolygon(10,
 * 4, 5.6, 7.8). For each object, display its perimeter and area.
 */

@SuppressWarnings("WeakerAccess")
@Getter
@Setter
class RegularPolygon {

    private int numberOfSides;
    private double sideLength;
    private double centerCoordinateX;
    private double centerCoordinateY;

    public RegularPolygon() {
        this.numberOfSides = 3;
        this.sideLength = 1;
        this.centerCoordinateX = 0;
        this.centerCoordinateY = 0;
    }

    public RegularPolygon(final int numberOfSides, final double sideLength) {
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
        this.centerCoordinateX = 0;
        this.centerCoordinateY = 0;
    }

    public RegularPolygon(final int numberOfSides, final double sideLength, final double centerCoordinateX, final double centerCoordinateY) {
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
        this.centerCoordinateX = centerCoordinateX;
        this.centerCoordinateY = centerCoordinateY;
    }

    public double getPerimeter() {
        return numberOfSides * sideLength;
    }

    public double getArea() {
        double dividend = numberOfSides * Math.pow(sideLength, 2);
        double divisor = 4 * Math.tan(Math.PI / numberOfSides);
        return dividend / divisor;
    }
}
