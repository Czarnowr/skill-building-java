package basics.string_reverser;

public class TwoCharacterArraysStringReverser implements StringReverser {

    public String reverseString(String stringToReverse) {

        if (stringToReverse.isEmpty()) {
            return "";
        }

        char[] letters = stringToReverse.toCharArray();

        return new String(reverseLetters(letters));
    }

    private char[] reverseLetters(char[] letters) {

        char[] reversedLetters = new char[letters.length];

        for (int i = 0; i < letters.length; i++) {
            int mirroredIndex = letters.length - 1 - i;

            reversedLetters[mirroredIndex] = letters[i];
        }

        return reversedLetters;
    }
}
