package liang.chapter9_objectsAndClasses.task_9_6;

import lombok.Getter;

/**
 * *9.6 (Stopwatch) Design a class named StopWatch. The class contains:
 *  ■ Private data fields startTime and endTime with getter methods.
 *  ■ A no-arg constructor that initializes startTime with the current time.
 *  ■ A method named start() that resets the startTime to the current time.
 *  ■ A method named stop() that sets the endTime to the current time.
 *  ■ A method named getElapsedTime() that returns the elapsed time for the
 *    stopwatch in milliseconds.
 *
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that measures the execution time of sorting 100,000 numbers using
 * selection sort.
 */

@SuppressWarnings("WeakerAccess")
class Stopwatch {

    @Getter
    private long startTime;
    @Getter
    private long endTime;

    public Stopwatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTimeInMilliseconds(){
        return endTime - startTime;
    }
}
