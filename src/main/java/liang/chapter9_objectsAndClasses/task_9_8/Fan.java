package liang.chapter9_objectsAndClasses.task_9_8;

import com.sun.javafx.binding.StringFormatter;
import lombok.Getter;
import lombok.Setter;

/**
 * 9.8 (The Fan class) Design a class named Fan to represent a fan. The class contains:
 * ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
 * denote the fan value.
 * ■ A private int data field named value that specifies the value of the fan (the
 * default is SLOW).
 * ■ A private boolean data field named on that specifies whether the fan is on (the
 * default is false).
 * ■ A private double data field named radius that specifies the radius of the fan
 * (the default is 5).
 * ■ A string data field named color that specifies the color of the fan (the default
 * is blue).
 * ■ The accessor and mutator methods for all four data fields.
 * ■ A no-arg constructor that creates a default fan.
 * ■ A method named toString() that returns a string description for the fan. If
 * the fan is on, the method returns the fan value, color, and radius in one combined
 * string. If the fan is not on, the method returns the fan color and radius
 * along with the string “fan is off” in one combined string.
 * <p>
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates two Fan objects. Assign maximum value, radius 10, color
 * yellow, and turn it on to the first object. Assign medium value, radius 5, color
 * blue, and turn it off to the second object. Display the objects by invoking their
 * toString method.
 */

@SuppressWarnings("WeakerAccess")
@Getter
@Setter
public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public String toString() {
        if (on) {
            return StringFormatter.format("speed = %s, color = %s, radius = %s", speed, color, radius).getValue();
        } else {
            return StringFormatter.format("color = %s, radius = %s, fan is off", color, radius).getValue();
        }
    }

    public void setSpeed(final Speed speed) {
        this.speed = speed.value;
    }
}
