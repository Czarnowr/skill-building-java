package basics.string_reverser;

public class CharacterArrayAndFieldStringReverser implements StringReverser {

    public String reverseString(String stringToReverse) {
        if (stringToReverse.isEmpty()) {
            return "";
        }

        char[] letters = stringToReverse.toCharArray();

        return new String(reverseLetters(letters));
    }

    private char[] reverseLetters(char[] letters) {

        for (int i = 0; i < letters.length / 2; i++) {
            swapLetters(letters, i);
        }

        return letters;
    }

    private void swapLetters(char[] letters, int index) {
        int mirroredIndex = letters.length - 1 - index;

        char temp = letters[mirroredIndex];
        letters[mirroredIndex] = letters[index];
        letters[index] = temp;
    }
}
