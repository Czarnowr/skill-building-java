package archive.codility.lesson4_countingElements_maxCounters;

/**
 * MaxCounters
 *
 * https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
 *
 * You are given N counters, initially set to 0, and you have two possible operations on them:
 *
 * increase(X) − counter X is increased by 1,
 * max counter − all counters are set to the maximum value of any counter.
 * A non-empty array A of M integers is given. This array represents consecutive operations:
 *
 * if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 * if A[K] = N + 1 then operation K is max counter.
 * For example, given integer N = 5 and array A such that:
 *
 *     A[0] = 3
 *     A[1] = 4
 *     A[2] = 4
 *     A[3] = 6
 *     A[4] = 1
 *     A[5] = 4
 *     A[6] = 4
 * the values of the counters after each consecutive operation will be:
 *
 *     (0, 0, 1, 0, 0)
 *     (0, 0, 1, 1, 0)
 *     (0, 0, 1, 2, 0)
 *     (2, 2, 2, 2, 2)
 *     (3, 2, 2, 2, 2)
 *     (3, 2, 2, 3, 2)
 *     (3, 2, 2, 4, 2)
 * The goal is to calculate the value of every counter after all operations.
 *
 * Write a function:
 *
 * class Solution { public int[] solution(int N, int[] A); }
 *
 * that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.
 *
 * Result array should be returned as an array of integers.
 *
 * For example, given:
 *
 *     A[0] = 3
 *     A[1] = 4
 *     A[2] = 4
 *     A[3] = 6
 *     A[4] = 1
 *     A[5] = 4
 *     A[6] = 4
 * the function should return [3, 2, 2, 4, 2], as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N and M are integers within the range [1..100,000];
 * each element of array A is an integer within the range [1..N + 1].
 */

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