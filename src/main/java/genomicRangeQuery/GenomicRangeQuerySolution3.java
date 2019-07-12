package genomicRangeQuery;

class GenomicRangeQuerySolution3 {
    int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];

        int[] factor1Occurrences = new int[S.length()];
        int[] factor2Occurrences = new int[S.length()];
        int[] factor3Occurrences = new int[S.length()];

        int currentFactor1Sum = 0;
        int currentFactor2Sum = 0;
        int currentFactor3Sum = 0;

        // populates arrays with the number of occurrences of each factor on a given index
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case 'A':
                    currentFactor1Sum++;
                    break;
                case 'C':
                    currentFactor2Sum++;
                    break;
                case 'G':
                    currentFactor3Sum++;
                    break;
                default:
                    break;
            }
            factor1Occurrences[i] = currentFactor1Sum;
            factor2Occurrences[i] = currentFactor2Sum;
            factor3Occurrences[i] = currentFactor3Sum;
        }

        for (int i = 0; i < P.length; i++) {
            int startIndex = P[i];
            int endIndex = Q[i];

            // if the starting point is '0', then the result is simply the presence of the factor.
            if (startIndex == 0) {
                if (factor1Occurrences[endIndex] > 0) {
                    result[i] = 1;
                } else if (factor2Occurrences[endIndex] > 0) {
                    result[i] = 2;
                } else if (factor3Occurrences[endIndex] > 0) {
                    result[i] = 3;
                } else {
                    result[i] = 4;
                }
            } else {
                // if checking range, then the change in number of occurrences is the answer.
                // [startIndex-1] because change in number of occurrences is calculated by comparing to previous value.
                if (factor1Occurrences[endIndex] > factor1Occurrences[startIndex- 1]) {
                    result[i] = 1;
                } else if (factor2Occurrences[endIndex] > factor2Occurrences[startIndex - 1]) {
                    result[i] = 2;
                } else if (factor3Occurrences[endIndex] > factor3Occurrences[startIndex- 1]) {
                    result[i] = 3;
                } else {
                    result[i] = 4;
                }
            }
        }
        return result;
    }
}
