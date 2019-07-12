package codility.binaryGap;

/**
 * BinaryGap
 *
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 *
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
 *
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 *
 * Write a function:
 *
 * class Solution { public int solution(int N); }
 *
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 *
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..2,147,483,647].
 */

class BinaryGapSolutionString {
    int solution(int N){
        int result = 0;

        // change number to binary format
        String binaryRepresentation = Integer.toBinaryString(N);

        //run loop while the size is larger than 2 (at least 3 elements are needed for a gap to exist, e.g. 101)
        while (binaryRepresentation.length() > 2) {
            // location of the first '1'
            int indexOfFirstOne = binaryRepresentation.indexOf('1');

            // -1 means there are no more '1' elements left and the loop  can end
            if (indexOfFirstOne == -1) {
                return result;
            }

            // all the elements up to (and including) the index of the first '1' are removed
            binaryRepresentation = binaryRepresentation.substring(indexOfFirstOne + 1);
            int indexOfSecondOne = binaryRepresentation.indexOf("1");

            // -1 means there are no more '1' elements left and the loop  can end
            if (indexOfSecondOne == -1) {
                return result;
            }

            // if two '1' elements are found, the difference between their indexes is the gap
            int temp = indexOfSecondOne - indexOfFirstOne;

            // if gap is found for the first time or larger than the previously found gap, overwrite previous result
            if (temp > result) {
                result = temp;
            }

            // all the elements up to (and including) the index of the first '1' are removed
            binaryRepresentation = binaryRepresentation.substring(indexOfSecondOne);
        }
        return result;
    }
}
