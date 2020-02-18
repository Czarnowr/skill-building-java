package archive.liang.chapter9_objectsAndClasses.task_9_4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class RandomClassTest {
    @Test
    public void RandomClass_getRandomIntegersFromSeed1000Once_correctFirst50Values (){
        //Arrange
        int seed = 1000;
        int numberOfIntegers = 50;
        int maxIntegerValue = 100;

        //Act
        List<Integer> integerList = RandomClass.getRandomIntegersFromSeed(seed, numberOfIntegers, maxIntegerValue);

        //Assert
        Assert.assertThat(integerList, is(Arrays.asList(87, 35, 76, 24, 92, 49, 41, 45, 64, 50, 79, 59, 72, 83, 36, 75, 46, 2, 23, 41, 22, 71, 89, 2, 93, 42, 49, 42, 35, 76, 32, 0, 52, 95, 87, 31, 99, 18, 79, 2, 91, 5, 55, 84, 71, 95, 58, 87, 77, 38)));
    }

    @Test
    public void RandomClass_getRandomIntegersFromSeed1000Twice_first50ValuesUnchanged (){
        //Arrange
        int seed = 1000;
        int numberOfIntegers = 50;
        int maxIntegerValue = 100;

        //Act
        List<Integer> integerList1 = RandomClass.getRandomIntegersFromSeed(seed, numberOfIntegers, maxIntegerValue);
        List<Integer> integerList2 = RandomClass.getRandomIntegersFromSeed(seed, numberOfIntegers, maxIntegerValue);

        //Assert
        Assert.assertThat(integerList1, is(Arrays.asList(87, 35, 76, 24, 92, 49, 41, 45, 64, 50, 79, 59, 72, 83, 36, 75, 46, 2, 23, 41, 22, 71, 89, 2, 93, 42, 49, 42, 35, 76, 32, 0, 52, 95, 87, 31, 99, 18, 79, 2, 91, 5, 55, 84, 71, 95, 58, 87, 77, 38)));
        Assert.assertThat(integerList2, is(Arrays.asList(87, 35, 76, 24, 92, 49, 41, 45, 64, 50, 79, 59, 72, 83, 36, 75, 46, 2, 23, 41, 22, 71, 89, 2, 93, 42, 49, 42, 35, 76, 32, 0, 52, 95, 87, 31, 99, 18, 79, 2, 91, 5, 55, 84, 71, 95, 58, 87, 77, 38)));
    }
}