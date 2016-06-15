package com.visionarysoftwaresolutions.textjustify;

/**
 * Ways a string can be justified.
 */
public interface JustificationStrategy {
    /**
     * justifies a string according to the implementation.
     * @param toJustify the string to justify.
     * @param desiredLength the desired length.
     * @return the justification applied
     */
    String justify(String toJustify, int desiredLength);
}
