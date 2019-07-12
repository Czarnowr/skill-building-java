package codility.oddOccurrencesInArray;

import java.util.Arrays;

public class OddOccurrencesSolutionOnArray {
    int solution(int[] A) {

        // if Array consists of one number - return number
        if (A.length == 1) {
            return A[0];
        }

        // sort the array
        Arrays.sort(A);

        // go through the Array two numbers at a time and compare them
        for (int i = 0; i < A.length - 1; i = i + 2) {
            // compare a pair of numbers, if the pair does not match, return the first number
            if (A[i] != A[i + 1]) {
                return A[i];
            // if all pairs have been checked and only one number remains, return it
            } else if (i == A.length - 3) {
                return A[A.length - 1];
            }
        }
        return -1;
    }
}

