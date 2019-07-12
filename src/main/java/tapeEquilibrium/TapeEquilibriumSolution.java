package tapeEquilibrium;

class TapeEquilibriumSolution {
    private static int result = 0;
    private static boolean firstRun = true;

    public int solution(int[] A) {
        int divisionPoint = 1;

        // checking every possible division point
        while (divisionPoint < A.length) {
            int leftSide = 0;
            int rightSide = 0;

            // calculate left side
            for (int i = 0; i < divisionPoint; i++) {
                leftSide += A[i];
            }
            // calculate right side
            for (int i = divisionPoint; i < A.length; i++) {
                rightSide += A[i];
            }
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
