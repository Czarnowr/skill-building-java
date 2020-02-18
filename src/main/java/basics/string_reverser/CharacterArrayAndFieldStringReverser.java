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
        char temp;

        for (int i = 0; i < letters.length / 2; i++) {
            int mirroredIndex = letters.length - 1 - i;

            temp = letters[mirroredIndex];
            letters[mirroredIndex] = letters[i];
            letters[i] = temp;
        }

        return letters;
    }
}
