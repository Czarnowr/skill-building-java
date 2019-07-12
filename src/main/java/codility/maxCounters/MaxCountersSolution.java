package codility.maxCounters;

public class MaxCountersSolution {
    private static int[] counters;
    private static int highestCounterValue = 0;

    public int[] solution(int X, int[] A) {
        counters = new int[X];

        // execute the instructions from the Array
        for (int number : A) {
            if (number >= 1 && number <= X) {
                increase(number);
            } else if (number == X + 1) {
                maxCounters();
            }
        }
        // return result when instructions end
        return counters;
    }

    private static void increase(int X) {
        //increase given counter
        counters[X - 1]++;
        // update current highest counter value
        if (counters[X - 1] > highestCounterValue) {
            highestCounterValue = counters[X - 1];
        }
    }

    // assign the max current value to all counters
    private static void maxCounters() {
        for (int i = 0; i < counters.length; i++) {
            counters[i] = highestCounterValue;
        }
    }
}
