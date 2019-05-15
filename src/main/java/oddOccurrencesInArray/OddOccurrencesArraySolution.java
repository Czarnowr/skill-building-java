package oddOccurrencesInArray;

import java.util.LinkedList;
import java.util.List;

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
