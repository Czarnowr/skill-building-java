package permCheck;

import java.util.Arrays;

class PermCheck {
    public int solution(int[] A) {
        // if only contains '1' return 1
        if (A.length == 1 && A[0] == 1) {
            return 1;
        }

        // sort the Array
        Arrays.sort(A);

        // if the first element is not '1' return 0
        if (A[0] != 1) {
            return 0;
        }

        // for each pair of numbers check if the second one is larger than the first one by 1, if not, return 0
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] + 1 != A[i + 1]) {
                return 0;
            }
        }

        return 1;
    }
}
