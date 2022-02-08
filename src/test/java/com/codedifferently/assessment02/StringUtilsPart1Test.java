package com.codedifferently.assessment02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsPart1Test {
    @Test
    public void camelCaseTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "She Sells Sea Shells";

        // When
        String actual = StringUtilsPart1.camelCase(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "sllehs aes slles ehs";

        // When
        String actual = StringUtilsPart1.reverse(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseWordsTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "ehs slles aes sllehs";

        // When
        String actual = StringUtilsPart1.reverseWords(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void reverseThenCamelCaseTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "Sllehs Aes Slles Ehs";

        // When
        String actual = StringUtilsPart1.reverseThenCamelCase(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invertCasingTest1() {
        // Given
        String input = "shE sells SEA sHeLlS";
        String expected = "SHe SELLS sea ShElLs";

        // When
        String actual = StringUtilsPart1.invertCasing(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invertCasingTest2() {
        // Given
        String expected = "sHE sELls SEa sHeLlS";

        // When
        String actual = StringUtilsPart1.invertCasing(StringUtilsPart1.invertCasing(expected));

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
