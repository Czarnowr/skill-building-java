package archive.liang.chapter9_objectsAndClasses.task_9_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * *9.4 (Use the Random class) Write a program that creates a Random object with seed
 * 1000 and displays the first 50 random integers between 0 and 100 using the
 * nextInt(100) method.
 */

class RandomClass {
    static List<Integer> getRandomIntegersFromSeed(int seed, int numberOfIntegers, int maxIntegerValue) {
        List<Integer> integerList = new ArrayList<>();
        Random randomGenerator = new Random(seed);

        for (int i = 0; i < numberOfIntegers; i++) {
            integerList.add(randomGenerator.nextInt(maxIntegerValue));
        }

        return integerList;
    }

}
