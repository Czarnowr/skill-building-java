package cyclicRotation;

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
