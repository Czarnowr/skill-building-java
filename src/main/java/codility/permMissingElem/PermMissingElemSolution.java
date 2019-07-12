package codility.permMissingElem;

import java.util.Arrays;

/**
 * PermMissingElem
 *
 * https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 *
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * the function should return 4, as it is the missing element.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 */

public class PermMissingElemSolution {
    public int solution(int[] A) {
        // if the Array is empty, return '1'
        if (A.length == 0) {
            return 1;
        }

        // sort the Array
        Arrays.sort(A);

        // if the first number is missing, return '1'
        if (A[0] != 1) {
            return 1;
        // if there is only one number in the Array, return the next number
        } else if (A.length == 1) {
            return A[0] + 1;
        }

        // check numbers in pairs
        for (int i = 0; i < A.length - 1; i++) {
            // if the second number in the pair does not equal the first number +1, return the missing number
            if (A[i] + 1 != A[i + 1]) {
                return A[i] + 1;
            }
        }
        // if all numbers match, return the last number + 1
        return A[A.length - 1] + 1;
    }
}
