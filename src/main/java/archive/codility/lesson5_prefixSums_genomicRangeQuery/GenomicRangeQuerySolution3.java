package archive.codility.lesson5_prefixSums_genomicRangeQuery;

/**
 * GenomicRangeQuery
 *
 * https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
 *
 * A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively. You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?
 *
 * The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters. There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers. The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).
 *
 * For example, consider string S = CAGCCTA and arrays P, Q such that:
 *
 *     P[0] = 2    Q[0] = 4
 *     P[1] = 5    Q[1] = 5
 *     P[2] = 0    Q[2] = 6
 * The answers to these M = 3 queries are as follows:
 *
 * The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
 * The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
 * The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose impact factor is 1, so the answer is 1.
 * Write a function:
 *
 * class Solution { public int[] solution(String S, int[] P, int[] Q); }
 *
 * that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M integers specifying the consecutive answers to all queries.
 *
 * Result array should be returned as an array of integers.
 *
 * For example, given the string S = CAGCCTA and arrays P, Q such that:
 *
 *     P[0] = 2    Q[0] = 4
 *     P[1] = 5    Q[1] = 5
 *     P[2] = 0    Q[2] = 6
 * the function should return the values [2, 4, 1], as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * M is an integer within the range [1..50,000];
 * each element of arrays P, Q is an integer within the range [0..N − 1];
 * P[K] ≤ Q[K], where 0 ≤ K < M;
 * string S consists only of upper-case English letters A, C, G, T.
 */

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
