package OddOccurrencesInArray;

import java.util.LinkedList;
import java.util.List;

class Solution {
    int solution(int[] A) {

        List<Integer> linkedListOfNumbers = new LinkedList<>();

        for (int number : A) {
            linkedListOfNumbers.add(number);
        }

        while(linkedListOfNumbers.size() > 0) {
            int number = linkedListOfNumbers.get(0);
            int firstIndex = linkedListOfNumbers.indexOf(number);
            int lastIndex = linkedListOfNumbers.lastIndexOf(number);

            if (firstIndex == lastIndex) {
                return linkedListOfNumbers.get(firstIndex);
            }

            linkedListOfNumbers.remove(lastIndex);
            linkedListOfNumbers.remove(firstIndex);
        }
        return 0;
    }
}
