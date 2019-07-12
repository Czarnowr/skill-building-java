package codility.lesson2_arrays.oddOccurrencesInArray;

import java.util.LinkedList;
import java.util.List;

/**
 * OddOccurrencesInArray
 *
 * https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 *
 * A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
 *
 * For example, in array A such that:
 *
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 * the elements at indexes 0 and 2 have value 9,
 * the elements at indexes 1 and 3 have value 3,
 * the elements at indexes 4 and 6 have value 9,
 * the element at index 5 has value 7 and is unpaired.
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 * the function should return 7, as explained in the example above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an odd integer within the range [1..1,000,000];
 * each element of array A is an integer within the range [1..1,000,000,000];
 * all but one of the values in A occur an even number of times.
 */

class OddOccurrencesArraySolution {
    int solution(int[] A) {
        //linked list to hold numbers
        List<Integer> linkedListOfNumbers = new LinkedList<>();

        // transferring numbers to a linked list
        for (int number : A) {
            linkedListOfNumbers.add(number);
        }

        // take a number, find the first and last index the number is on
        while(linkedListOfNumbers.size() > 0) {
            int number = linkedListOfNumbers.get(0);
            int firstIndex = linkedListOfNumbers.indexOf(number);
            int lastIndex = linkedListOfNumbers.lastIndexOf(number);

            // if the indexes are the same = odd number
            if (firstIndex == lastIndex) {
                return linkedListOfNumbers.get(firstIndex);
            }

            //remove numbers on those indexes
            linkedListOfNumbers.remove(lastIndex);
            linkedListOfNumbers.remove(firstIndex);
        }
        return 0;
    }
}
