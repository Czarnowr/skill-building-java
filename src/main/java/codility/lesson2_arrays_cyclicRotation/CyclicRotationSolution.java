package codility.lesson2_arrays_cyclicRotation;

/**
 * CyclicRotation
 *
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 *
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 *
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 *
 * Write a function:
 *
 * class Solution { public int[] solution(int[] A, int K); }
 *
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 *
 * For example, given
 *
 *     A = [3, 8, 9, 7, 6]
 *     K = 3
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 *
 *     [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
 *     [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
 *     [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 * For another example, given
 *
 *     A = [0, 0, 0]
 *     K = 1
 * the function should return [0, 0, 0]
 *
 * Given
 *
 *     A = [1, 2, 3, 4]
 *     K = 4
 * the function should return [1, 2, 3, 4]
 *
 * Assume that:
 *
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */

public class CyclicRotationSolution {
    public int[] solution(int[] A, int K) {

        // if Array contains one number, or the number of moves is the same as its size, return unchanged Array
        if (A.length == 1 || A.length == K) {
            return A;
        }

        // if all numbers in the Array are the same, return unchanged Array
        if (allNumbersInArrayAreTheSame(A)) {
            return A;
        }

        // protects from 'overturning' the Array
        int optimisedNumberOfTurns = K % A.length;

        // counter of turns done
        int counter = 0;

        // repeat as needed
        while (counter < optimisedNumberOfTurns) {
            // save last value
            int lastValue = A[A.length - 1];
            // copy content except last value and move it by one to the right
            System.arraycopy(A, 0, A, 1, A.length - 1);
            // copy saved last value to first position
            A[0] = lastValue;
            counter++;
        }


        return A;
    }

    // checks if all values in the Array are equal
    private static boolean allNumbersInArrayAreTheSame(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
