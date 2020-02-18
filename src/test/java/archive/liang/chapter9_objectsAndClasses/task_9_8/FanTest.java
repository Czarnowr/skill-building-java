package archive.liang.chapter9_objectsAndClasses.task_9_8;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FanTest {

    @Test
    public void Fan_createWithDefaultConstructor_fieldsInitializedCorrectly(){
        //Arrange
        Fan fan = new Fan();

        //Act
        int speed = fan.getSpeed();
        boolean on = fan.isOn();
        double radius = fan.getRadius();
        String color = fan.getColor();

        //Assert
        Assertions.assertThat(speed).isEqualTo(1);
        Assertions.assertThat(on).isEqualTo(false);
        Assertions.assertThat(radius).isEqualTo(5);
        Assertions.assertThat(color).isEqualTo("blue");
    }

    @Test
    public void Fan_onSpeedFastRadius10ColorYellow_correctToString(){
        //Arrange
        Fan fan = new Fan();
        fan.setOn(true);
        fan.setSpeed(Speed.FAST);
        fan.setRadius(10);
        fan.setColor("yellow");

        //Act
        String fanToString = fan.toString();

        //Assert
        Assertions.assertThat(fanToString).contains("speed = 3");
        Assertions.assertThat(fanToString).contains("radius = 10");
        Assertions.assertThat(fanToString).contains("color = yellow");
    }

    @Test
    public void Fan_offSpeedMediumRadius5ColorBlue_correctToString(){
        //Arrange
        Fan fan = new Fan();
        fan.setOn(false);
        fan.setSpeed(Speed.MEDIUM);
        fan.setRadius(5);
        fan.setColor("blue");

        //Act
        String fanToString = fan.toString();

        //Assert
        Assertions.assertThat(fanToString).contains("radius = 5");
        Assertions.assertThat(fanToString).contains("color = blue");
        Assertions.assertThat(fanToString).contains("fan is off");
    }
}