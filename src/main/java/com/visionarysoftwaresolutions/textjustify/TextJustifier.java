package com.visionarysoftwaresolutions.textjustify;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * Cute little utility class for text justification.
 */
final class TextJustifier {
    /**
     * private constructor for well-formed utility class.
     */
    private TextJustifier() {}

    /**
     * full justifies a sentence to the length by padding.
     * Algorithm shamelessly ripped from http://forums.anandtech.com/showthread.php?t=1001858
     * @param sentence a sentence to justify.
     * @param length the desired length.
     * @return a new string containing the characters fully justified.
     */
    static String justify(final String sentence, final int length) {
        final String[] words = sentence.split(" ");
        final int totalCharacters = Arrays.stream(words).mapToInt(String::length).sum();
        final int numSpaces = (length - totalCharacters) /  (words.length - 1);
        return StringUtils.join(words, StringUtils.repeat(' ', numSpaces));
    }
}
