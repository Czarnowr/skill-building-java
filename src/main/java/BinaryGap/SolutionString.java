package BinaryGap;

class SolutionString {
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
