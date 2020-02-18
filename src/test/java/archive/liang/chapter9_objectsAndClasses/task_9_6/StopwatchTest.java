package archive.liang.chapter9_objectsAndClasses.task_9_6;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class StopwatchTest {

    @Test
    public void Stopwatch_createWithDefaultConstructor_startAndEndTimeCorrectlyInitialized() {
        //Arrange
        Stopwatch stopwatch = new Stopwatch();

        //Act
        Long startTime = stopwatch.getStartTime();
        Long endTime = stopwatch.getEndTime();

        //Assert
        assertThat(startTime).isNotNull();
        assertThat(endTime).isEqualTo(0L);
    }

    @Test
    public void Stopwatch_startStopwatch_differentTimeFromInitialInitialization() {
        //Arrange
        Stopwatch stopwatch = new Stopwatch();

        //Act
        Long startTime1 = stopwatch.getStartTime();
        stopwatch.start();
        Long startTime2 = stopwatch.getStartTime();

        Long endTime = stopwatch.getEndTime();

        //Assert
        assertThat(startTime1).isEqualTo(startTime2);
        assertThat(endTime).isEqualTo(0L);
    }

    @Test
    public void Stopwatch_createWithDefaultConstructorAndStop_manuallyCalculatedTImeDifferenceIsPositive() throws InterruptedException {
        //Arrange
        Stopwatch stopwatch = new Stopwatch();

        //Act
        Long startTime = stopwatch.getStartTime();
        Thread.sleep(1);
        stopwatch.stop();
        Long endTime = stopwatch.getEndTime();

        //Assert
        assertThat(endTime - startTime).isPositive();
    }

    @Test
    public void Stopwatch_startAndStopStopwatch_manuallyCalculatedTImeDifferenceIsPositive() throws InterruptedException {
        //Arrange
        Stopwatch stopwatch = new Stopwatch();

        //Act
        stopwatch.start();
        Long startTime = stopwatch.getStartTime();
        Thread.sleep(1);
        stopwatch.stop();
        Long endTime = stopwatch.getEndTime();

        //Assert
        assertThat(endTime - startTime).isPositive();
    }

    @Test
    public void Stopwatch_createWithDefaultConstructorAndStop_getTImeDifferenceIsPositive() throws InterruptedException {
        //Arrange
        Stopwatch stopwatch = new Stopwatch();

        //Act
        Thread.sleep(1);
        stopwatch.stop();
        Long timeDifference = stopwatch.getElapsedTimeInMilliseconds();

        //Assert
        assertThat(timeDifference).isPositive();
    }

    @Test
    public void Stopwatch_startAndStopStopwatch_getTImeDifferenceIsPositive() throws InterruptedException {
        //Arrange
        Stopwatch stopwatch = new Stopwatch();

        //Act
        stopwatch.start();
        Thread.sleep(1);
        stopwatch.stop();
        Long timeDifference = stopwatch.getElapsedTimeInMilliseconds();

        //Assert
        assertThat(timeDifference).isPositive();
    }
}