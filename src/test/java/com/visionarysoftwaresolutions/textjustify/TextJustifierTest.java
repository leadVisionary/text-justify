package com.visionarysoftwaresolutions.textjustify;

import org.junit.Assert;
import org.junit.Test;

public class TextJustifierTest {
    @Test
    public void canJustifyAccordingToSpec() {
        // Given: A sentence to be justified
        final String sentence = "The quick brown fox jumps over the lazy dog.";
        // And: A length to justify to
        final int length = 52;
        // When: I try to justify the text
        final String result = TextJustifier.FULL.justify(sentence, length);
        // Then: I get back the expected result
        final String expected = "The  quick  brown  fox  jumps  over  the  lazy  dog.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void canLeftJustify() {
        // Given: A sentence to be justified
        final String sentence = "The quick brown fox jumps over the lazy dog.";
        // And: A length to justify to
        final int length = 52;
        // When: I try to justify the text
        final String result = TextJustifier.LEFT.justify(sentence, length);
        // Then: I get back the expected result
        final String expected = "The quick brown fox jumps over the lazy dog.        ";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void canRightJustify() {
        // Given: A sentence to be justified
        final String sentence = "The quick brown fox jumps over the lazy dog.";
        // And: A length to justify to
        final int length = 52;
        // When: I try to justify the text
        final String result = TextJustifier.RIGHT.justify(sentence, length);
        // Then: I get back the expected result
        final String expected = "        The quick brown fox jumps over the lazy dog.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void canCenterJustify() {
        // Given: A sentence to be justified
        final String sentence = "The quick brown fox jumps over the lazy dog.";
        // And: A length to justify to
        final int length = 52;
        // When: I try to justify the text
        final String result = TextJustifier.CENTER.justify(sentence, length);
        // Then: I get back the expected result
        final String expected = "    The quick brown fox jumps over the lazy dog.    ";
        Assert.assertEquals(expected, result);
    }
}
