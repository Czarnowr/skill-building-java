package liang.chapter9_objectsAndClasses.task_9_10;

/**
 * *9.10 (Algebra: quadratic equations) Design a class named QuadraticEquation for
 * a quadratic equation a * Math.pow(x, 2) + bx + x = 0. The class contains:
 * ■ Private data fields a, b, and c that represent three coefficients.
 * ■ A constructor for the arguments for a, b, and c.
 * ■ Three getter methods for a, b, and c.
 * ■ A method named getDiscriminant() that returns the discriminant, which is
 * Math.pow(b, 2) - 4ac.
 * ■ The methods named getRoot1() and getRoot2() for returning two roots of
 * the equation:
 * <p>
 * r1 = (-b + Math.pow(Math.pow(b, 2) -4ac), 0.5)) / 2a
 * r2 = (-b - Math.pow(Math.pow(b, 2) -4ac), 0.5)) / 2a
 * <p>
 * These methods are useful only if the discriminant is nonnegative. Let these methods
 * return 0 if the discriminant is negative.
 * <p>
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that prompts the user to enter values for a, b, and c and displays the result
 * based on the discriminant. If the discriminant is positive, display the two roots. If
 * the discriminant is 0, display the one root. Otherwise, display “The equation has
 * no roots.” See Programming Exercise 3.1 for sample runs.
 */

@SuppressWarnings("WeakerAccess")
class QuadraticEquation {

    private double coefficientA;
    private double coefficientB;
    private double coefficientC;

    public QuadraticEquation(final double coefficientA, final double coefficientB, final double coefficientC) {
        this.coefficientA = coefficientA;
        this.coefficientB = coefficientB;
        this.coefficientC = coefficientC;
    }

    public String getSolution() {
        String result;

        if (getDiscriminant() < 0) {
            result = "The equation has no roots";
        } else if (getDiscriminant() == 0){
            result = String.format("The equation has one root: %s", getRoot1());
        } else {
            result = String.format("The equation has two roots: %s and %s", getRoot1(), getRoot2());
        }

        return result;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }

        double dividend = -coefficientB + Math.pow(Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC, 0.5);
        double divisor = 2 * coefficientA;

        return dividend / divisor;

    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }

        double dividend = -coefficientB - Math.pow(Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC, 0.5);
        double divisor = 2 * coefficientA;

        return dividend / divisor;
    }

    public double getDiscriminant() {
        return Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;
    }
}
