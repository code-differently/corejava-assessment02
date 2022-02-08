package com.codedifferently.assessment02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsPart2Test {



    @Test
    public void getFirstWordTest() {
        // Given
        String inputString = "Quick Brown Fox";
        String expected = "Quick";

        // When
        String actual = StringUtilsPart2.getFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getFirstWordTest2() {
        // Given
        String inputString = "She sells sea shells";
        String expected = "She";

        // When
        String actual = StringUtilsPart2.getFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void reverseFirstWordTest() {
        // Given
        String inputString = "Yats Hunter";
        String expected = "staY Ready";

        // When
        String actual = StringUtilsPart2.reverseFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseFirstWordTest2() {
        // Given
        String inputString = "Adjunct professor";
        String expected = "tcnujdA professor";

        // When
        String actual = StringUtilsPart2.reverseFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseFirstWordThenCamelCaseTest() {
        // Given
        String inputString = "yats Hunter";
        String expected = "StayReady";

        // When
        String actual = StringUtilsPart2.reverseFirstWordThenCamelCase(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseFirstWordThenCamelCaseTest2() {
        // Given
        String inputString = "Adjunct professor";
        String expected = "TcnujdaProfessor";

        // When
        String actual = StringUtilsPart2.reverseFirstWordThenCamelCase(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterAtIndexTest() {
        // Given
        String inputString = "Jumping";
        Integer characterIndex = 2;
        String expected = "Juping";

        // When
        String actual = StringUtilsPart2.removeCharacterAtIndex(inputString, characterIndex);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterAtIndexTest2() {
        // Given
        String inputString = "Tower";
        Integer characterIndex = 4;
        String expected = "Towe";

        // When
        String actual = StringUtilsPart2.removeCharacterAtIndex(inputString, characterIndex);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
