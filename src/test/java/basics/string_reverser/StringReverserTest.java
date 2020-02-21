package basics.string_reverser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

abstract class StringReverserTest {

    private StringReverser reverser;

    protected abstract StringReverser createInstance();

    @BeforeEach
    void setUp() {
        reverser = createInstance();
    }

    @Test
    void throwsNullPointerExceptionIfPassedNull() {
        assertThatNullPointerException().isThrownBy(() -> reverser.reverseString(null));
    }

    @Test
    void returnsEmptyStringIfEmptyStringPassed() {
        assertThat(reverser.reverseString("")).isEqualTo("");
    }

    @ParameterizedTest
    @CsvSource(value = {
            "a:a", "A:A",
            "aaaaaa:aaaaaa", "AAAAAA:AAAAAA",
            "ab:ba", "AB:BA",
            "abcdef:fedcba", "ABCDEF:FEDCBA",
            "aBcDeF:FeDcBa", "AbCdEf:fEdCbA",
            "a b c d e f:f e d c b a", "A B C D E F:F E D C B A"
    }, delimiter = ':')
    void stringContainingLettersReversedCorrectly(String toReverse, String expected) {
        assertThat(reverser.reverseString(toReverse)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1:1", "1111:1111",
            "12:21", "21:12",
            "12345:54321", "54321:12345",
            "1 2 3 4 5:5 4 3 2 1", "5 4 3 2 1:1 2 3 4 5"
    }, delimiter = ':')
    void stringContainingNumbersReversedCorrectly(String toReverse, String expected) {
        assertThat(reverser.reverseString(toReverse)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "$:$",
            "a!1:1!a",
            "ZAQ!2wsx:xsw2!QAZ",
            "Z A Q ! 2 w s x:x s w 2 ! Q A Z"}, delimiter = ':')
    void stringContainingMixedCharacterTypesReversedCorrectly(String toReverse, String expected) {
        assertThat(reverser.reverseString(toReverse)).isEqualTo(expected);
    }
}