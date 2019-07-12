package codility.maxCounters;

public class MaxCountersSolutionOptimised {
    private static int[] counters;
    private static int currentMin = 0;
    private static int currentMax = 0;

    public int[] solution(int X, int[] A) {
        counters = new int[X];

        // execute the instructions from the Array
        for (int counterNumber : A) {
            //condition for increasing the counter value
            if (counterNumber >= 1 && counterNumber <= X) {
                int index = counterNumber - 1;
                increaseCounter(index);

                //condition for maxing counters
            } else if (counterNumber == X + 1) {
                // set the new baseline value
                currentMin = currentMax;
            }
        }

        // final check for all numbers - if below last 'max numbers' value, overwrite
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < currentMin) {
                counters[i] = currentMin;
            }
        }

        // tearDown for tests
        teardown();

        // return result when instructions end
        return counters;
    }

    private void teardown() {
        currentMin = 0;
        currentMax = 0;
    }

    private void increaseCounter(int index) {
        // check if the minimum was set through 'max numbers'
        if (counters[index] < currentMin) {
            counters[index] = currentMin;
        }
        // increase the counter value
        counters[index]++;
        // set the new maximum value for 'max numbers'
        if (counters[index] > currentMax) {
            currentMax = counters[index];
        }
    }
}