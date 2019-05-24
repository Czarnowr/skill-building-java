package genomicRangeQuery;

class GenomicRangeQuerySolution2 {
    int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int lowestResult = 4;

        // for every instruction set
        for (int i = 0; i < P.length; i++) {
            // iterate through a substring
            for (int j = P[i]; j <= Q[i]; j++) {
                if (S.charAt(j) == 'A') {
                    result[i] = 1;
                    break;
                }

                if (S.charAt(j) == 'C') {
                    if (lowestResult > 2) {
                        lowestResult = 2;
                    }
                } else if (S.charAt(j) == 'G') {
                    if (lowestResult > 3) {
                        lowestResult = 3;
                    }
                }
                result[i] = lowestResult;
            }
            lowestResult = 4;
        }
        return result;
    }
}
