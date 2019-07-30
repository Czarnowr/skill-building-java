package codility.lesson6_sorting_Triangle;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        if (A.length < 3) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            if (isValidTriplet(A[i], A[i + 1], A[i + 2])) {
                return 1;
            }
        }

        return 0;
    }

    private boolean isValidTriplet(final int sideA, final int sideB, final int sideC) {
        boolean combinationOne = (long) sideA + (long) sideB > (long) sideC;
        boolean combinationTwo = (long) sideB + (long) sideC > (long) sideA;
        boolean combinationThree = (long) sideC + (long) sideA > (long) sideB;

        return combinationOne && combinationTwo && combinationThree;
    }
}
