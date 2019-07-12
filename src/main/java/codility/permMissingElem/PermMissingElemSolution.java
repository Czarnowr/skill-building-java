package codility.permMissingElem;

import java.util.Arrays;

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
