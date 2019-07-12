package frogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOneSolution {
    public int solution(int X, int[] A) {
        Set<Integer> numbers = new HashSet<>(X);
        // fill the set with searched parameters
        for (int i = 1; i <= X; i++) {
            numbers.add(i);
        }

        // one by one compare the Array elements to those in the set
        for (int j = 0; j < A.length; j++) {
            // if match found
            if (numbers.contains(A[j])) {
                // remove element
                numbers.remove(A[j]);
                // when empty, return how many operations so far
                if (numbers.isEmpty()) {
                    return j;
                }
            }
        }
        // if set never empties return -1
        return -1;
    }
}
