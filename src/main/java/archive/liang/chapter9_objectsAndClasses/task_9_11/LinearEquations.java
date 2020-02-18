package archive.liang.chapter9_objectsAndClasses.task_9_11;

import lombok.Getter;

/**
 * *9.11 (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
 * 2 * 2 system of linear equations:
 * <p>
 * ax + by = e
 * cx + dy = f
 * <p>
 * x = (ed - bf) / (ad - bc)
 * y = (af - ec) / (ad - bc)
 * <p>
 * The class contains:
 * ■ Private data fields a, b, c, d, e, and f.
 * ■ A constructor with the arguments for a, b, c, d, e, and f.
 * ■ Six getter methods for a, b, c, d, e, and f.
 * ■ A method named isSolvable() that returns true if ad - bc is not 0.
 * ■ Methods getX() and getY() that return the solution for the equation.
 * <p>
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that prompts the user to enter a, b, c, d, e, and f and displays the result.
 * If ad - bc is 0, report that “The equation has no solution.” See Programming
 * Exercise 3.3 for sample runs.
 */

@SuppressWarnings("WeakerAccess")
@Getter
class LinearEquations {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquations(final double a, final double b, final double c, final double d, final double e, final double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public String getSolution() {
        String result;

        if (!isSolvable()) {
            result = "The equation has no solution.";
        } else {
            result = String.format("X: %s, Y: %s", getX(), getY());
        }

        return result;
    }

    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}
