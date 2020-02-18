package archive.codility.lesson4_countingElements_missingInteger;

import java.util.Arrays;

/**
 * MissingInteger
 *
 * https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 *
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class MissingIntegerSolution {
    public int solution(int[] A) {
        Arrays.sort(A);

        // all negative numbers case
        if (A[A.length - 1] < 0) {
            return 1;
        }

        // one element cases
        if (A.length == 1) {
            // if equals 1, return 2
            if (A[0] == 1) {
                return 2;
                // if less than 0 or larger than 1, return 1
            } else {
                return 1;
            }
        }

        // only the last element is positive cases
        if (A[A.length - 2] < 0 && A[A.length - 1] >= 0) {
            // if equals 1, return 2
            if (A[A.length - 1] == 1) {
                return 2;
                // if less than 0 or larger than 1, return 1
            } else {
                return 1;
            }
        }

        boolean firstPositiveNumber = true;
        // remaining cases
        for (int i = 0; i < A.length - 1; i++) {
            // only consider positive numbers
            if (A[i] > 0) {
                // if the first positive number is not 1, return 1
                if (A[i] != 1 && firstPositiveNumber) {
                    return 1;
                    // for each pair of numbers:
                    // if numbers are not equal &&
                    // if the first number is not equal to the second -1 (e.g. 1, 2)
                    // return the second number
                } else if (A[i] != A[i + 1] && A[i] != A[i + 1] - 1) {
                    return A[i] + 1;
                }
                firstPositiveNumber = false;
            }
        }
        // ultimately, return the last number + 1
        return A[A.length - 1] + 1;
    }
}
