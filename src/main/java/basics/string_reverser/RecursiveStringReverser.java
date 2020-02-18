package basics.string_reverser;

public class RecursiveStringReverser implements StringReverser {

    public String reverseString(String stringToReverse) {
        if (stringToReverse.isEmpty()) {
            return "";
        }

        char[] letters = stringToReverse.toCharArray();

        return new String(reverseLetters(letters, 0));
    }

    private char[] reverseLetters(char[] letters, int index) {
        if (index >= letters.length / 2) {
            return letters;
        }

        swapLetters(letters, index);

        return reverseLetters(letters, index + 1);
    }

    private void swapLetters(char[] letters, int index) {
        int mirroredIndex = letters.length - 1 - index;

        char temp = letters[mirroredIndex];
        letters[mirroredIndex] = letters[index];
        letters[index] = temp;
    }
}

