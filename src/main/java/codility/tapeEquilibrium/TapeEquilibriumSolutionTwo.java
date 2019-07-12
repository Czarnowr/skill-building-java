package codility.tapeEquilibrium;

class TapeEquilibriumSolutionTwo {
    private static int result = 0;
    private static boolean firstRun = true;

    public int solution(int[] A) {
        int divisionPoint = 2;
        int leftSide = A[0];
        int rightSide = 0;

        // calculate initial right side
        for (int i = 1; i < A.length; i++) {
            rightSide += A[i];
        }

        updateResultIfSmallerOrForTheFirstTime(leftSide, rightSide);

        // checking every possible division point
        while (divisionPoint < A.length) {

            // adjust left side
            leftSide = leftSide + A[divisionPoint - 1];
            // adjust right side
            rightSide = rightSide - A[divisionPoint - 1];

            // updating the result
            updateResultIfSmallerOrForTheFirstTime(leftSide, rightSide);

            divisionPoint++;
        }
        return result;
    }

    private static void updateResultIfSmallerOrForTheFirstTime(int leftSide, int rightSide) {
        int difference;
        if (leftSide > rightSide) {
            difference = leftSide - rightSide;
            if (firstRun) {
                result = difference;
                firstRun = false;
            } else if (difference < result) {
                result = difference;
            }
        } else {
            difference = rightSide - leftSide;
            if (firstRun) {
                result = difference;
                firstRun = false;
            } else if (difference < result) {
                result = difference;
            }
        }
    }
}
