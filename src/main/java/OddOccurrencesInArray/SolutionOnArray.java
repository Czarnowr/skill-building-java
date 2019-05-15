package OddOccurrencesInArray;

import java.util.Arrays;

public class SolutionOnArray {
    int solution(int[] A) {

        if (A.length == 1) {
            return A[0];
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] != A[i + 1]) {
                return A[i];
            } else if (i == A.length - 3) {
                return A[A.length - 1];
            } else {
                i = i + 1;
            }
        }
        return 0;
    }
}

